package main.parser;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.HashMap;

/**
 * Created by adrian on 10/28/15.
 */
public class PancakesMainListener extends PancakesBaseListener {

    HashMap<String, String> currentContext;

    @Override
    public void enterPancakes(PancakesParser.PancakesContext ctx) {

    }

    @Override
    public void exitPancakes(PancakesParser.PancakesContext ctx) {

    }

    @Override
    public void enterVar_declare(PancakesParser.Var_declareContext ctx) {

    }

    @Override
    public void exitVar_declare(PancakesParser.Var_declareContext ctx) {

    }

    @Override
    public void enterType(PancakesParser.TypeContext ctx) {

    }

    @Override
    public void exitType(PancakesParser.TypeContext ctx) {

    }

    @Override
    public void enterFun_declare(PancakesParser.Fun_declareContext ctx) {

    }

    @Override
    public void exitFun_declare(PancakesParser.Fun_declareContext ctx) {

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

    }

    @Override
    public void enterBlock(PancakesParser.BlockContext ctx) {

    }

    @Override
    public void exitBlock(PancakesParser.BlockContext ctx) {

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
}
