package main.parser;

import main.pancakes.Main;
import main.parser.symbolTable.*;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.HashMap;

/**
 * Created by adrian on 11/15/15.
 */
public class ThirdPassPancakesListener extends PancakesBaseListener{


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
}
