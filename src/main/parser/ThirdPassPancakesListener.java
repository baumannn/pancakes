package main.parser;

import main.pancakes.Main;
import main.parser.symbolTable.*;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

/**
 * Created by adrian on 11/15/15.
 */
public class ThirdPassPancakesListener extends PancakesBaseListener{


    ParseTreeProperty<Scope> scopes; // todos los scopes
    GlobalScope globals;
    Scope currentScope;

    public ThirdPassPancakesListener(GlobalScope globalScope, ParseTreeProperty<Scope> scopes) {

        globals = globalScope;
        this.scopes = scopes;

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


    @Override
    public void exitMultDivIntDiv(PancakesParser.MultDivIntDivContext ctx) {
        Symbol s1 = ctx.

    }
}
