package main.parser;

import main.pancakes.Main;
import main.parser.symbolTable.*;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import sun.jvm.hotspot.debugger.cdbg.Sym;

import java.util.HashMap;

/**
 * Created by adrian on 11/15/15.
 */
public class ThirdPassPancakesListener extends PancakesBaseListener{

    public static enum Operand {oEquality, oMultiplication, oDivision, oIntdiv, oAddition, oSubtraction, oUnaryNot, oUnaryNegation, oArrayIndex};

    ParseTreeProperty<Scope> scopes; // todos los scopes
    GlobalScope globals;
    Scope currentScope;
    HashMap<PancakesParser.ExprContext, Symbol.Type> typeMap;

    public ThirdPassPancakesListener(GlobalScope globalScope, ParseTreeProperty<Scope> scopes) {

        globals = globalScope;
        this.scopes = scopes;
        typeMap = new HashMap<>();
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
    }

    /*
     ************************************
     * Array indexes
     *
     ************************************
     **/

    @Override
    public void exitArrayIndex(PancakesParser.ArrayIndexContext ctx) {
        if( typeMap.get(ctx.expr()) != Symbol.Type.tINT){
            System.err.printf("line %d:%d %s\n", ctx.start.getLine(), ctx.start.getCharPositionInLine(), "Array index is not an integer.");
        }

        String varName = ctx.ID().getSymbol().getText();
        Symbol vs = currentScope.resolve(varName);
        System.out.println(vs.getType());
        typeMap.put(ctx, vs.getType());


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
        System.out.println(vs.getType());
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

}
