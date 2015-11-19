package main.parser;

import main.pancakes.Main;
import main.parser.symbolTable.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.HashMap;

/**
 * Created by adrian on 10/28/15.
 */
public class FirstPassPancakesListener extends PancakesBaseListener {


    ParseTreeProperty <Scope> scopes = new ParseTreeProperty<>(); // todos los scopes
    GlobalScope globals; //todo ???
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

        defineVar(ctx.type(),ctx.ID().getSymbol());
    }


    @Override
    public void enterFun_declare(PancakesParser.Fun_declareContext ctx) {

        String name = ctx.ID().getText();

        int typeTokenType = ctx.type().start.getType();
        Symbol.Type type = Main.getType(typeTokenType);


        FunctionSymbol function = new FunctionSymbol(name,type,currentScope);
        currentScope.define(function);
        scopes.put(ctx,function); //set function parent to ctx
        currentScope = function;

    }


    @Override
    public void exitFun_declare(PancakesParser.Fun_declareContext ctx) {

        currentScope = currentScope.getEnclosingScope(); //pop pop
    }


    @Override
    public void exitFun_param(PancakesParser.Fun_paramContext ctx) {

        defineVar(ctx.type(), ctx.ID().getSymbol());


    }


    @Override
    public void enterBlock(PancakesParser.BlockContext ctx) {

        currentScope = new LocalScope(currentScope);
    }

    @Override
    public void exitBlock(PancakesParser.BlockContext ctx) {

        currentScope = currentScope.getEnclosingScope();
    }


    ///CONSTANTS

    @Override
    public void exitFloatConst(PancakesParser.FloatConstContext ctx) {
        String name = ctx.FLOAT().getText();


        FunctionSymbol function = new  (name,type,currentScope);
        currentScope.define(function);
        scopes.put(ctx, new BuiltInTypeSymbol("float")); //set function parent to ctx
        currentScope = function;



    }

    @Override
    public void exitStringConst(PancakesParser.StringConstContext ctx) {

    }

    @Override
    public void exitBoolConst(PancakesParser.BoolConstContext ctx) {

    }

    @Override
    public void exitIntConst(PancakesParser.IntConstContext ctx) {

    }

    //




    ////////////////
    // functions ///
    ////////////////


    void defineVar(PancakesParser.TypeContext typeCtx, Token nameToken) {
        int typeTokenType = typeCtx.start.getType();
        Symbol.Type type = Main.getType(typeTokenType);
        VariableSymbol var = new VariableSymbol(nameToken.getText(), type);
        currentScope.define(var);
    }



}
