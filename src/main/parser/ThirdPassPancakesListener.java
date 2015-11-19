package main.parser;

import main.pancakes.Main;
import main.parser.symbolTable.*;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.HashMap;

/**
 * Created by adrian on 11/15/15.
 */
public class ThirdPassPancakesListener extends PancakesBaseListener{

    public static enum Operand {oEquality, oMultiplication, oDivision, oIntdiv, oAddition, oSubtraction, oNot, oUnaryNegation, oArrayIndex};


    Symbol.Type[] types = {Symbol.Type.tSTRING, Symbol.Type.tINT, Symbol.Type.tBOOL, Symbol.Type.tFLOAT};
    ParseTreeProperty<Scope> scopes; // todos los scopes
    GlobalScope globals;
    Scope currentScope;
    HashMap<PancakesParser.ExprContext, Symbol.Type> typeMap;
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


//    @Override
//    public void exitMultDiv(PancakesParser.MultDivIntDivContext ctx) {
//       TypesMap tm;
//        //typesmap dice el tipo de una expr
//
//        Symbol.Type type1 = tm.lookUpType(ctx.expr(0));
//        Symbol.Type type2 = tm.lookUpType(ctx.expr(1));
//
//        if( !Main.areCompatibleTypes(type1, type2, "MultDivIntDiv")){
//            //error
//        }
//
//        ctx.
//
//        tm.put(ctx, Main.resolveType(type1, type2, "MultDivIntDiv"));
//    }




    //Equality

    @Override
    public void exitEquality(PancakesParser.EqualityContext ctx) {
        PancakesParser.ExprContext expr1 = ctx.expr(0);
        PancakesParser.ExprContext expr2 = ctx.expr(1);


        validStaticTypeCheck(expr1, expr2, Operand.oEquality);
    }


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

    //Parenthesis

    @Override
    public void exitParen(PancakesParser.ParenContext ctx) {
        typeMap.put(ctx, typeMap.get(ctx.expr()));
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
        addToTesseract(Operand.oNot, Symbol.Type.tSTRING, Symbol.Type.tSTRING, Symbol.Type.tINVALID);
        addToTesseract(Operand.oNot, Symbol.Type.tSTRING, Symbol.Type.tINT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oNot, Symbol.Type.tSTRING, Symbol.Type.tBOOL, Symbol.Type.tINVALID);
        addToTesseract(Operand.oNot, Symbol.Type.tSTRING, Symbol.Type.tFLOAT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oNot, Symbol.Type.tINT, Symbol.Type.tSTRING, Symbol.Type.tINVALID);
        addToTesseract(Operand.oNot, Symbol.Type.tINT, Symbol.Type.tINT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oNot, Symbol.Type.tINT, Symbol.Type.tBOOL, Symbol.Type.tINVALID);
        addToTesseract(Operand.oNot, Symbol.Type.tINT, Symbol.Type.tFLOAT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oNot, Symbol.Type.tBOOL, Symbol.Type.tSTRING, Symbol.Type.tINVALID);
        addToTesseract(Operand.oNot, Symbol.Type.tBOOL, Symbol.Type.tINT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oNot, Symbol.Type.tBOOL, Symbol.Type.tBOOL, Symbol.Type.tBOOL);
        addToTesseract(Operand.oNot, Symbol.Type.tBOOL, Symbol.Type.tFLOAT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oNot, Symbol.Type.tFLOAT, Symbol.Type.tSTRING, Symbol.Type.tINVALID);
        addToTesseract(Operand.oNot, Symbol.Type.tFLOAT, Symbol.Type.tINT, Symbol.Type.tINVALID);
        addToTesseract(Operand.oNot, Symbol.Type.tFLOAT, Symbol.Type.tBOOL, Symbol.Type.tINVALID);
        addToTesseract(Operand.oNot, Symbol.Type.tFLOAT, Symbol.Type.tFLOAT, Symbol.Type.tINVALID);
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




    }



}
