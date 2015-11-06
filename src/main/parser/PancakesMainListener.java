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
public class PancakesMainListener extends PancakesBaseListener {


    ParseTreeProperty <Scope> scopes = new ParseTreeProperty<>(); // todos los scopes
    GlobalScope globals; //todo ???
    Scope currentScope;

    @Override
    public void enterPancakes(PancakesParser.PancakesContext ctx) {

        globals = new GlobalScope();
        currentScope = globals;

    }

    @Override
    public void exitPancakes(PancakesParser.PancakesContext ctx) {

    }

    @Override
    public void enterVar_declare(PancakesParser.Var_declareContext ctx) {

    }

    @Override
    public void exitVar_declare(PancakesParser.Var_declareContext ctx) {

        defineVar(ctx.type(),ctx.ID().getSymbol());
    }

    @Override
    public void enterType(PancakesParser.TypeContext ctx) {

    }

    @Override
    public void exitType(PancakesParser.TypeContext ctx) {

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
    public void enterFun_params(PancakesParser.Fun_paramsContext ctx) {

    }

    @Override
    public void exitFun_params(PancakesParser.Fun_paramsContext ctx) {

    }

    @Override
    public void enterFun_param(PancakesParser.Fun_paramContext ctx) {

    }

    @Override
    public void exitFun_param(PancakesParser.Fun_paramContext ctx) {

        defineVar(ctx.type(),ctx.ID().getSymbol());


    }


    @Override
    public void enterBlock(PancakesParser.BlockContext ctx) {


        currentScope = new LocalScope(currentScope);
    }

    @Override
    public void exitBlock(PancakesParser.BlockContext ctx) {

        currentScope = currentScope.getEnclosingScope();
    }

    @Override
    public void enterStatement(PancakesParser.StatementContext ctx) {

    }

    @Override
    public void exitStatement(PancakesParser.StatementContext ctx) {

    }

    @Override
    public void enterIf_statement(PancakesParser.If_statementContext ctx) {

    }

    @Override
    public void exitIf_statement(PancakesParser.If_statementContext ctx) {

    }

    @Override
    public void enterExpr(PancakesParser.ExprContext ctx) {

    }

    @Override
    public void exitExpr(PancakesParser.ExprContext ctx) {

    }

    @Override
    public void enterArguments(PancakesParser.ArgumentsContext ctx) {

    }

    @Override
    public void exitArguments(PancakesParser.ArgumentsContext ctx) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {

    }


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
