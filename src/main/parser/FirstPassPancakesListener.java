package main.parser;

import com.sun.tools.javah.Util;
import main.pancakes.Main;
import main.parser.symbolTable.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.HashMap;

/**
 * Registers variables and functions in scopes.
 */
public class FirstPassPancakesListener extends PancakesBaseListener {


    private ParseTreeProperty <Scope> scopes = new ParseTreeProperty<>(); // todos los scopes
    private GlobalScope globals; //todo ???
    Scope currentScope;



    ////////////////
    // listeners ///
    ////////////////

    @Override
    public void enterPancakes(PancakesParser.PancakesContext ctx) {

        globals = new GlobalScope();


        currentScope = globals;


    }


    @Override
    public void exitVar_declare(PancakesParser.Var_declareContext ctx) {

        if( !defineVar(ctx.type(), ctx.ID().getSymbol())){
            Main.logError(ctx.ID().getSymbol(), "Error: Redefinition of variable: " +  ctx.ID().getText());
        }

    }


    @Override
    public void enterFun_declare(PancakesParser.Fun_declareContext ctx) {

        String name = ctx.ID().getText();

        int typeTokenType = ctx.type().start.getType();
        Symbol.Type type = Main.getType(typeTokenType);


        FunctionSymbol function = new FunctionSymbol(name,type,currentScope);
        if( !currentScope.isDefined(function)) {
            currentScope.define(function);
            scopes.put(ctx, function); //set function parent to ctx
            currentScope = function;
        } else{
            function = new FunctionSymbol(name + "#" + ctx.ID().getSymbol().getLine(),type,currentScope);
            currentScope.define(function);
            scopes.put(ctx, function); //set function parent to ctx
            currentScope = function;
            Main.logError(ctx.ID().getSymbol(), "Error: Function was already declared: " + name);

        }


    }


    @Override
    public void exitFun_declare(PancakesParser.Fun_declareContext ctx) {

        currentScope = currentScope.getEnclosingScope(); //pop pop
    }


    @Override
    public void exitFun_param(PancakesParser.Fun_paramContext ctx) {

        if( !defineVar(ctx.type(), ctx.ID().getSymbol())){
            Main.logError(ctx.ID().getSymbol(), "Error: Redefinition of variable: " + ctx.ID().getText());
        }


    }


    @Override
    public void enterBlock(PancakesParser.BlockContext ctx) {

        currentScope = new LocalScope(currentScope);
    }

    @Override
    public void exitBlock(PancakesParser.BlockContext ctx) {

        currentScope = currentScope.getEnclosingScope();
    }




    //






    ////////////////
    // functions ///
    ////////////////


    boolean defineVar(PancakesParser.TypeContext typeCtx, Token nameToken) {
        int typeTokenType = typeCtx.start.getType();
        Symbol.Type type = Main.getType(typeTokenType);
        VariableSymbol var = new VariableSymbol(nameToken.getText(), type);

        if( !currentScope.isDefined(var)) {
            currentScope.define(var);
            return true;
        }

        return false;
    }


    public ParseTreeProperty<Scope> getScopes() {
        return scopes;
    }

    public GlobalScope getGlobals() {
        return globals;
    }
}
