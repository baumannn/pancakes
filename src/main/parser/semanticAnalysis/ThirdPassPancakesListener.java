package main.parser.semanticAnalysis;

import main.pancakes.Main;
import main.parser.generated.PancakesBaseListener;
import main.parser.generated.PancakesParser;
import main.parser.symbolTable.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by adrian on 11/15/15.
 */
public class ThirdPassPancakesListener extends PancakesBaseListener {

    public static enum Operand {oEquality, oMultiplication, oDivision, oIntdiv, oAddition, oSubtraction, oUnaryNot, oUnaryNegation, oLTGT, oArrayIndex};


    Symbol.Type[] types = {Symbol.Type.tSTRING, Symbol.Type.tINT, Symbol.Type.tBOOL, Symbol.Type.tFLOAT};
    ParseTreeProperty<Scope> scopes; // todos los scopes
    GlobalScope globals;
    Scope currentScope;
    public HashMap<ParserRuleContext, Symbol.Type> typeMap;
     HashMap<Symbol.Type,HashMap<Symbol.Type, HashMap<Operand, Symbol.Type>>> tesseract;

    public ThirdPassPancakesListener(GlobalScope globalScope, ParseTreeProperty<Scope> scopes) {

        globals = globalScope;
        this.scopes = scopes;
        typeMap = new HashMap<>();
        tesseract = new HashMap<>();


        //initialize cube
        for (Symbol.Type ty : types) {
            HashMap<Symbol.Type, HashMap<Operand, Symbol.Type>> cube = new HashMap<>();
            for (Symbol.Type t : types) {
                cube.put(t, new HashMap<Operand, Symbol.Type>());
            }
            tesseract.put(ty, cube);
        }


        addAll();
    }

    /*
     *****************
     * MANAGE SCOPES *
     *****************
     **/

    @Override
    public void enterPancakes(PancakesParser.PancakesContext ctx) {
        currentScope = globals;
    }

    @Override
    public void exitFun_declare(PancakesParser.Fun_declareContext ctx) {
        currentScope = currentScope.getEnclosingScope();
    }

    @Override
    public void enterFun_declare(PancakesParser.Fun_declareContext ctx) {
        currentScope = scopes.get(ctx);
    }

    @Override
    public void enterBlock(PancakesParser.BlockContext ctx) {
        currentScope = scopes.get(ctx);
    }

    @Override
    public void exitBlock(PancakesParser.BlockContext ctx) {
        currentScope = currentScope.getEnclosingScope();
    }

    

    /*
     ************************************
     * SEMANTICS OF OPERATIONS IN EXPR. *
     * References: semantic_cube.txt    *
     ************************************
     **/


    /*
     ************************************
     * Function Calls
     *
     ************************************
     **/


    @Override
    public void exitFunCall(PancakesParser.FunCallContext ctx) {
        FunctionSymbol referencedFunction = (FunctionSymbol) currentScope.resolve(ctx.ID().getSymbol().getText());


        Map<String, Symbol> args = referencedFunction.getArgs();
        List<PancakesParser.ExprContext> callParams = ctx.arguments().expr();


        int i = 0;
        for (String key : args.keySet()) {
            //System.out.println(ctx.arguments().expr(i).getText());
            Symbol.Type argType = args.get(key).getType();
            Symbol.Type paramType = typeMap.get(callParams.get(i));
            i++;
            if(paramType != argType){
                Main.logError(ctx.ID().getSymbol(),
                        "Argument type mismatch in argument number " + ( i ) + " in function "
                                + ctx.ID().getSymbol().getText()
                                + ", expected:"
                                + argType
                                + ", got:"
                                + paramType);


            }
        }

        typeMap.put(ctx.getParent(), referencedFunction.getType());

    }

    /*
     ************************************
     * Variable assignment
     *
     ************************************
     **/

    @Override
    public void exitAssignment(PancakesParser.AssignmentContext ctx) {

        Symbol.Type type = typeMap.get(ctx.expr());

        for(TerminalNode t: ctx.ID()){

            if(currentScope.resolve(t.getText()).getType() != type){
                System.err.printf("line %d:%d %s\n", ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Type mismatch in assignment.");

            }

        }

    }

    /*
     ************************************
     * Array indexes
     *
     ************************************
     **/

    @Override
    public void exitArrayIndex(PancakesParser.ArrayIndexContext ctx) {
//        if( typeMap.get(ctx.expr()) != Symbol.Type.tINT){
//            System.err.printf("line %d:%d %s\n", ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Array index is not an integer.");
//        }

        String varName = ctx.ID().getSymbol().getText();
        Symbol vs = currentScope.resolve(varName);
        typeMap.put(ctx, vs.getType());

        for (PancakesParser.ExprContext exprContext : ctx.expr()) {
            if(typeMap.get(exprContext) != Symbol.Type.tINT){
                System.err.printf("line %d:%d %s\n", ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Array index is not an integer.");
            }
        }


    }

    /*
     ************************************
     * Unary operations
     *
     ************************************
     **/

    @Override
    public void exitUnaryNegate(PancakesParser.UnaryNegateContext ctx) {
        checkValidityBinaryOperand(ctx, ctx.expr(), ctx.expr(), Operand.oUnaryNegation);
    }

    @Override
    public void exitUnaryNot(PancakesParser.UnaryNotContext ctx) {
        checkValidityBinaryOperand(ctx, ctx.expr(), ctx.expr(), Operand.oUnaryNot);
    }

    /*
     ************************************
     * Binary operations
     *
     ************************************
     **/


    @Override
    public void exitMultDiv(PancakesParser.MultDivContext ctx) {
        if(ctx.MULT() != null) {
            checkValidityBinaryOperand(ctx, ctx.expr(0), ctx.expr(1), Operand.oMultiplication);
        } else{
            checkValidityBinaryOperand(ctx, ctx.expr(0), ctx.expr(1), Operand.oDivision);
        }
    }

    @Override
    public void exitIntdiv(PancakesParser.IntdivContext ctx) {
        checkValidityBinaryOperand(ctx, ctx.expr(0), ctx.expr(1), Operand.oIntdiv);
    }

    //Add Sub
    @Override
    public void exitAddSub(PancakesParser.AddSubContext ctx) {
        if (ctx.ADD() != null){
            checkValidityBinaryOperand(ctx, ctx.expr(0), ctx.expr(1), Operand.oAddition);
        } else{
            checkValidityBinaryOperand(ctx, ctx.expr(0), ctx.expr(1), Operand.oSubtraction);
        }

    }





    //Equality

    @Override
    public void exitEquality(PancakesParser.EqualityContext ctx) {
        checkValidityBinaryOperand(ctx, ctx.expr(0), ctx.expr(1), Operand.oEquality);
    }

    @Override
    public void exitLTGT(PancakesParser.LTGTContext ctx) {
        checkValidityBinaryOperand(ctx, ctx.expr(0), ctx.expr(1), Operand.oLTGT);
    }


    /*
     ****************
     * References and constants
     *
     *****************
     */


    //VarRef

    @Override
    public void exitVarRef(PancakesParser.VarRefContext ctx) {
        String varName = ctx.ID().getSymbol().getText();
        Symbol vs = currentScope.resolve(varName);
        //System.out.println(vs.getType());
        typeMap.put(ctx, vs.getType());
    }

    //Constants

    @Override
    public void exitStringConst(PancakesParser.StringConstContext ctx) {
        typeMap.put(ctx, Symbol.Type.tSTRING);
    }

    @Override
    public void exitBoolConst(PancakesParser.BoolConstContext ctx) {
        typeMap.put(ctx, Symbol.Type.tBOOL);
    }

    @Override
    public void exitIntConst(PancakesParser.IntConstContext ctx) {
        typeMap.put(ctx, Symbol.Type.tINT);
    }

    @Override
    public void exitFloatConst(PancakesParser.FloatConstContext ctx) {
        typeMap.put(ctx, Symbol.Type.tFLOAT);
    }

    /*
     ************************************
     * Parenthesis
     *
     ************************************
     **/

    @Override
    public void exitParen(PancakesParser.ParenContext ctx) {
        typeMap.put(ctx, typeMap.get(ctx.expr()));
    }


    /*
     ************************************
     * Helper functions
     *
     ************************************
     **/

    private void checkValidityBinaryOperand(PancakesParser.ExprContext ctx, PancakesParser.ExprContext left, PancakesParser.ExprContext right, Operand op){
        Symbol.Type type = validStaticTypeCheck(left,  right, op);

        if( type != Symbol.Type.tINVALID){
            typeMap.put(ctx, type);
        } else{
            System.err.printf("line %d:%d %s\n", ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Types incompatible with operation.");
        }
    }

    private void addToTesseract(Operand o, Symbol.Type t1, Symbol.Type t2, Symbol.Type out){

        tesseract.get(t1).get(t2).put(o, out);

    }


    private Symbol.Type validStaticTypeCheck(PancakesParser.ExprContext e1, PancakesParser.ExprContext e2, Operand o) {


        return tesseract.get(typeMap.get(e1)).get(typeMap.get(e2)).get(o);


    }


    private void addAll(){

        addToTesseract(Operand.oEquality, Symbol.Type.tSTRING, Symbol.Type.tSTRING, Symbol.Type.tBOOL);
        addToTesseract(Operand.oEquality, Symbol.Type.tSTRING, Symbol.Type.tINT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oEquality, Symbol.Type.tSTRING, Symbol.Type.tBOOL, Symbol.Type.tINVALID);
        addToTesseract(Operand.oEquality, Symbol.Type.tSTRING, Symbol.Type.tFLOAT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oEquality, Symbol.Type.tINT, Symbol.Type.tSTRING, Symbol.Type.tINVALID);
        addToTesseract(Operand.oEquality, Symbol.Type.tINT, Symbol.Type.tINT, Symbol.Type.tBOOL);
        addToTesseract(Operand.oEquality, Symbol.Type.tINT, Symbol.Type.tBOOL, Symbol.Type.tINVALID);
        addToTesseract(Operand.oEquality, Symbol.Type.tINT, Symbol.Type.tFLOAT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oEquality, Symbol.Type.tBOOL, Symbol.Type.tSTRING, Symbol.Type.tINVALID);
        addToTesseract(Operand.oEquality, Symbol.Type.tBOOL, Symbol.Type.tINT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oEquality, Symbol.Type.tBOOL, Symbol.Type.tBOOL, Symbol.Type.tBOOL);
        addToTesseract(Operand.oEquality, Symbol.Type.tBOOL, Symbol.Type.tFLOAT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oEquality, Symbol.Type.tFLOAT, Symbol.Type.tSTRING, Symbol.Type.tINVALID);
        addToTesseract(Operand.oEquality, Symbol.Type.tFLOAT, Symbol.Type.tINT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oEquality, Symbol.Type.tFLOAT, Symbol.Type.tBOOL, Symbol.Type.tINVALID);
        addToTesseract(Operand.oEquality, Symbol.Type.tFLOAT, Symbol.Type.tFLOAT, Symbol.Type.tBOOL);
        addToTesseract(Operand.oMultiplication, Symbol.Type.tSTRING, Symbol.Type.tSTRING, Symbol.Type.tINVALID);
        addToTesseract(Operand.oMultiplication, Symbol.Type.tSTRING, Symbol.Type.tINT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oMultiplication, Symbol.Type.tSTRING, Symbol.Type.tBOOL, Symbol.Type.tINVALID);
        addToTesseract(Operand.oMultiplication, Symbol.Type.tSTRING, Symbol.Type.tFLOAT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oMultiplication, Symbol.Type.tINT, Symbol.Type.tSTRING, Symbol.Type.tINVALID);
        addToTesseract(Operand.oMultiplication, Symbol.Type.tINT, Symbol.Type.tINT, Symbol.Type.tINT);
        addToTesseract(Operand.oMultiplication, Symbol.Type.tINT, Symbol.Type.tBOOL, Symbol.Type.tINVALID);
        addToTesseract(Operand.oMultiplication, Symbol.Type.tINT, Symbol.Type.tFLOAT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oMultiplication, Symbol.Type.tBOOL, Symbol.Type.tSTRING, Symbol.Type.tINVALID);
        addToTesseract(Operand.oMultiplication, Symbol.Type.tBOOL, Symbol.Type.tINT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oMultiplication, Symbol.Type.tBOOL, Symbol.Type.tBOOL, Symbol.Type.tINVALID);
        addToTesseract(Operand.oMultiplication, Symbol.Type.tBOOL, Symbol.Type.tFLOAT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oMultiplication, Symbol.Type.tFLOAT, Symbol.Type.tSTRING, Symbol.Type.tINVALID);
        addToTesseract(Operand.oMultiplication, Symbol.Type.tFLOAT, Symbol.Type.tINT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oMultiplication, Symbol.Type.tFLOAT, Symbol.Type.tBOOL, Symbol.Type.tINVALID);
        addToTesseract(Operand.oMultiplication, Symbol.Type.tFLOAT, Symbol.Type.tFLOAT, Symbol.Type.tFLOAT);
        addToTesseract(Operand.oDivision, Symbol.Type.tSTRING, Symbol.Type.tSTRING, Symbol.Type.tINVALID);
        addToTesseract(Operand.oDivision, Symbol.Type.tSTRING, Symbol.Type.tINT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oDivision, Symbol.Type.tSTRING, Symbol.Type.tBOOL, Symbol.Type.tINVALID);
        addToTesseract(Operand.oDivision, Symbol.Type.tSTRING, Symbol.Type.tFLOAT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oDivision, Symbol.Type.tINT, Symbol.Type.tSTRING, Symbol.Type.tINVALID);
        addToTesseract(Operand.oDivision, Symbol.Type.tINT, Symbol.Type.tINT, Symbol.Type.tINT);
        addToTesseract(Operand.oDivision, Symbol.Type.tINT, Symbol.Type.tBOOL, Symbol.Type.tINVALID);
        addToTesseract(Operand.oDivision, Symbol.Type.tINT, Symbol.Type.tFLOAT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oDivision, Symbol.Type.tBOOL, Symbol.Type.tSTRING, Symbol.Type.tINVALID);
        addToTesseract(Operand.oDivision, Symbol.Type.tBOOL, Symbol.Type.tINT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oDivision, Symbol.Type.tBOOL, Symbol.Type.tBOOL, Symbol.Type.tINVALID);
        addToTesseract(Operand.oDivision, Symbol.Type.tBOOL, Symbol.Type.tFLOAT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oDivision, Symbol.Type.tFLOAT, Symbol.Type.tSTRING, Symbol.Type.tINVALID);
        addToTesseract(Operand.oDivision, Symbol.Type.tFLOAT, Symbol.Type.tINT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oDivision, Symbol.Type.tFLOAT, Symbol.Type.tBOOL, Symbol.Type.tINVALID);
        addToTesseract(Operand.oDivision, Symbol.Type.tFLOAT, Symbol.Type.tFLOAT, Symbol.Type.tFLOAT);
        addToTesseract(Operand.oIntdiv, Symbol.Type.tSTRING, Symbol.Type.tSTRING, Symbol.Type.tINVALID);
        addToTesseract(Operand.oIntdiv, Symbol.Type.tSTRING, Symbol.Type.tINT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oIntdiv, Symbol.Type.tSTRING, Symbol.Type.tBOOL, Symbol.Type.tINVALID);
        addToTesseract(Operand.oIntdiv, Symbol.Type.tSTRING, Symbol.Type.tFLOAT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oIntdiv, Symbol.Type.tINT, Symbol.Type.tSTRING, Symbol.Type.tINVALID);
        addToTesseract(Operand.oIntdiv, Symbol.Type.tINT, Symbol.Type.tINT, Symbol.Type.tINT);
        addToTesseract(Operand.oIntdiv, Symbol.Type.tINT, Symbol.Type.tBOOL, Symbol.Type.tINVALID);
        addToTesseract(Operand.oIntdiv, Symbol.Type.tINT, Symbol.Type.tFLOAT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oIntdiv, Symbol.Type.tBOOL, Symbol.Type.tSTRING, Symbol.Type.tINVALID);
        addToTesseract(Operand.oIntdiv, Symbol.Type.tBOOL, Symbol.Type.tINT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oIntdiv, Symbol.Type.tBOOL, Symbol.Type.tBOOL, Symbol.Type.tINVALID);
        addToTesseract(Operand.oIntdiv, Symbol.Type.tBOOL, Symbol.Type.tFLOAT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oIntdiv, Symbol.Type.tFLOAT, Symbol.Type.tSTRING, Symbol.Type.tINVALID);
        addToTesseract(Operand.oIntdiv, Symbol.Type.tFLOAT, Symbol.Type.tINT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oIntdiv, Symbol.Type.tFLOAT, Symbol.Type.tBOOL, Symbol.Type.tINVALID);
        addToTesseract(Operand.oIntdiv, Symbol.Type.tFLOAT, Symbol.Type.tFLOAT, Symbol.Type.tFLOAT);
        addToTesseract(Operand.oAddition, Symbol.Type.tSTRING, Symbol.Type.tSTRING, Symbol.Type.tINVALID);
        addToTesseract(Operand.oAddition, Symbol.Type.tSTRING, Symbol.Type.tINT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oAddition, Symbol.Type.tSTRING, Symbol.Type.tBOOL, Symbol.Type.tINVALID);
        addToTesseract(Operand.oAddition, Symbol.Type.tSTRING, Symbol.Type.tFLOAT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oAddition, Symbol.Type.tINT, Symbol.Type.tSTRING, Symbol.Type.tINVALID);
        addToTesseract(Operand.oAddition, Symbol.Type.tINT, Symbol.Type.tINT, Symbol.Type.tINT);
        addToTesseract(Operand.oAddition, Symbol.Type.tINT, Symbol.Type.tBOOL, Symbol.Type.tINVALID);
        addToTesseract(Operand.oAddition, Symbol.Type.tINT, Symbol.Type.tFLOAT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oAddition, Symbol.Type.tBOOL, Symbol.Type.tSTRING, Symbol.Type.tINVALID);
        addToTesseract(Operand.oAddition, Symbol.Type.tBOOL, Symbol.Type.tINT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oAddition, Symbol.Type.tBOOL, Symbol.Type.tBOOL, Symbol.Type.tINVALID);
        addToTesseract(Operand.oAddition, Symbol.Type.tBOOL, Symbol.Type.tFLOAT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oAddition, Symbol.Type.tFLOAT, Symbol.Type.tSTRING, Symbol.Type.tINVALID);
        addToTesseract(Operand.oAddition, Symbol.Type.tFLOAT, Symbol.Type.tINT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oAddition, Symbol.Type.tFLOAT, Symbol.Type.tBOOL, Symbol.Type.tINVALID);
        addToTesseract(Operand.oAddition, Symbol.Type.tFLOAT, Symbol.Type.tFLOAT, Symbol.Type.tFLOAT);
        addToTesseract(Operand.oSubtraction, Symbol.Type.tSTRING, Symbol.Type.tSTRING, Symbol.Type.tINVALID);
        addToTesseract(Operand.oSubtraction, Symbol.Type.tSTRING, Symbol.Type.tINT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oSubtraction, Symbol.Type.tSTRING, Symbol.Type.tBOOL, Symbol.Type.tINVALID);
        addToTesseract(Operand.oSubtraction, Symbol.Type.tSTRING, Symbol.Type.tFLOAT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oSubtraction, Symbol.Type.tINT, Symbol.Type.tSTRING, Symbol.Type.tINVALID);
        addToTesseract(Operand.oSubtraction, Symbol.Type.tINT, Symbol.Type.tINT, Symbol.Type.tINT);
        addToTesseract(Operand.oSubtraction, Symbol.Type.tINT, Symbol.Type.tBOOL, Symbol.Type.tINVALID);
        addToTesseract(Operand.oSubtraction, Symbol.Type.tINT, Symbol.Type.tFLOAT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oSubtraction, Symbol.Type.tBOOL, Symbol.Type.tSTRING, Symbol.Type.tINVALID);
        addToTesseract(Operand.oSubtraction, Symbol.Type.tBOOL, Symbol.Type.tINT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oSubtraction, Symbol.Type.tBOOL, Symbol.Type.tBOOL, Symbol.Type.tINVALID);
        addToTesseract(Operand.oSubtraction, Symbol.Type.tBOOL, Symbol.Type.tFLOAT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oSubtraction, Symbol.Type.tFLOAT, Symbol.Type.tSTRING, Symbol.Type.tINVALID);
        addToTesseract(Operand.oSubtraction, Symbol.Type.tFLOAT, Symbol.Type.tINT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oSubtraction, Symbol.Type.tFLOAT, Symbol.Type.tBOOL, Symbol.Type.tINVALID);
        addToTesseract(Operand.oSubtraction, Symbol.Type.tFLOAT, Symbol.Type.tFLOAT, Symbol.Type.tFLOAT);
        addToTesseract(Operand.oUnaryNot, Symbol.Type.tSTRING, Symbol.Type.tSTRING, Symbol.Type.tINVALID);
        addToTesseract(Operand.oUnaryNot, Symbol.Type.tSTRING, Symbol.Type.tINT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oUnaryNot, Symbol.Type.tSTRING, Symbol.Type.tBOOL, Symbol.Type.tINVALID);
        addToTesseract(Operand.oUnaryNot, Symbol.Type.tSTRING, Symbol.Type.tFLOAT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oUnaryNot, Symbol.Type.tINT, Symbol.Type.tSTRING, Symbol.Type.tINVALID);
        addToTesseract(Operand.oUnaryNot, Symbol.Type.tINT, Symbol.Type.tINT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oUnaryNot, Symbol.Type.tINT, Symbol.Type.tBOOL, Symbol.Type.tINVALID);
        addToTesseract(Operand.oUnaryNot, Symbol.Type.tINT, Symbol.Type.tFLOAT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oUnaryNot, Symbol.Type.tBOOL, Symbol.Type.tSTRING, Symbol.Type.tINVALID);
        addToTesseract(Operand.oUnaryNot, Symbol.Type.tBOOL, Symbol.Type.tINT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oUnaryNot, Symbol.Type.tBOOL, Symbol.Type.tBOOL, Symbol.Type.tBOOL);
        addToTesseract(Operand.oUnaryNot, Symbol.Type.tBOOL, Symbol.Type.tFLOAT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oUnaryNot, Symbol.Type.tFLOAT, Symbol.Type.tSTRING, Symbol.Type.tINVALID);
        addToTesseract(Operand.oUnaryNot, Symbol.Type.tFLOAT, Symbol.Type.tINT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oUnaryNot, Symbol.Type.tFLOAT, Symbol.Type.tBOOL, Symbol.Type.tINVALID);
        addToTesseract(Operand.oUnaryNot, Symbol.Type.tFLOAT, Symbol.Type.tFLOAT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oUnaryNegation, Symbol.Type.tSTRING, Symbol.Type.tSTRING, Symbol.Type.tINVALID);
        addToTesseract(Operand.oUnaryNegation, Symbol.Type.tSTRING, Symbol.Type.tINT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oUnaryNegation, Symbol.Type.tSTRING, Symbol.Type.tBOOL, Symbol.Type.tINVALID);
        addToTesseract(Operand.oUnaryNegation, Symbol.Type.tSTRING, Symbol.Type.tFLOAT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oUnaryNegation, Symbol.Type.tINT, Symbol.Type.tSTRING, Symbol.Type.tINVALID);
        addToTesseract(Operand.oUnaryNegation, Symbol.Type.tINT, Symbol.Type.tINT, Symbol.Type.tINT);
        addToTesseract(Operand.oUnaryNegation, Symbol.Type.tINT, Symbol.Type.tBOOL, Symbol.Type.tINVALID);
        addToTesseract(Operand.oUnaryNegation, Symbol.Type.tINT, Symbol.Type.tFLOAT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oUnaryNegation, Symbol.Type.tBOOL, Symbol.Type.tSTRING, Symbol.Type.tINVALID);
        addToTesseract(Operand.oUnaryNegation, Symbol.Type.tBOOL, Symbol.Type.tINT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oUnaryNegation, Symbol.Type.tBOOL, Symbol.Type.tBOOL, Symbol.Type.tINVALID);
        addToTesseract(Operand.oUnaryNegation, Symbol.Type.tBOOL, Symbol.Type.tFLOAT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oUnaryNegation, Symbol.Type.tFLOAT, Symbol.Type.tSTRING, Symbol.Type.tINVALID);
        addToTesseract(Operand.oUnaryNegation, Symbol.Type.tFLOAT, Symbol.Type.tINT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oUnaryNegation, Symbol.Type.tFLOAT, Symbol.Type.tBOOL, Symbol.Type.tINVALID);
        addToTesseract(Operand.oUnaryNegation, Symbol.Type.tFLOAT, Symbol.Type.tFLOAT, Symbol.Type.tFLOAT);
        addToTesseract(Operand.oLTGT, Symbol.Type.tSTRING, Symbol.Type.tSTRING, Symbol.Type.tINVALID);
        addToTesseract(Operand.oLTGT, Symbol.Type.tSTRING, Symbol.Type.tINT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oLTGT, Symbol.Type.tSTRING, Symbol.Type.tBOOL, Symbol.Type.tINVALID);
        addToTesseract(Operand.oLTGT, Symbol.Type.tSTRING, Symbol.Type.tFLOAT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oLTGT, Symbol.Type.tINT, Symbol.Type.tSTRING, Symbol.Type.tINVALID);
        addToTesseract(Operand.oLTGT, Symbol.Type.tINT, Symbol.Type.tINT, Symbol.Type.tINT);
        addToTesseract(Operand.oLTGT, Symbol.Type.tINT, Symbol.Type.tBOOL, Symbol.Type.tINVALID);
        addToTesseract(Operand.oLTGT, Symbol.Type.tINT, Symbol.Type.tFLOAT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oLTGT, Symbol.Type.tBOOL, Symbol.Type.tSTRING, Symbol.Type.tINVALID);
        addToTesseract(Operand.oLTGT, Symbol.Type.tBOOL, Symbol.Type.tINT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oLTGT, Symbol.Type.tBOOL, Symbol.Type.tBOOL, Symbol.Type.tINVALID);
        addToTesseract(Operand.oLTGT, Symbol.Type.tBOOL, Symbol.Type.tFLOAT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oLTGT, Symbol.Type.tFLOAT, Symbol.Type.tSTRING, Symbol.Type.tINVALID);
        addToTesseract(Operand.oLTGT, Symbol.Type.tFLOAT, Symbol.Type.tINT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oLTGT, Symbol.Type.tFLOAT, Symbol.Type.tBOOL, Symbol.Type.tINVALID);
        addToTesseract(Operand.oLTGT, Symbol.Type.tFLOAT, Symbol.Type.tFLOAT, Symbol.Type.tFLOAT);



    }


    public HashMap<ParserRuleContext, Symbol.Type> getTypeMap() {
        return typeMap;
    }
}
