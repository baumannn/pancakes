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
        super.enterPancakes(ctx);
    }

    @Override
    public void exitPancakes(PancakesParser.PancakesContext ctx) {
        super.exitPancakes(ctx);
    }

    @Override
    public void enterProgram(PancakesParser.ProgramContext ctx) {
        super.enterProgram(ctx);
    }

    @Override
    public void exitProgram(PancakesParser.ProgramContext ctx) {
        super.exitProgram(ctx);
    }

    @Override
    public void enterElement(PancakesParser.ElementContext ctx) {
        super.enterElement(ctx);
    }

    @Override
    public void exitElement(PancakesParser.ElementContext ctx) {
        super.exitElement(ctx);
    }

    @Override
    public void enterVar_declaration(PancakesParser.Var_declarationContext ctx) {
        super.enterVar_declaration(ctx);
    }

    @Override
    public void exitVar_declaration(PancakesParser.Var_declarationContext ctx) {
        super.exitVar_declaration(ctx);
    }

    @Override
    public void enterFun_declaration(PancakesParser.Fun_declarationContext ctx) {
        super.enterFun_declaration(ctx);
    }

    @Override
    public void exitFun_declaration(PancakesParser.Fun_declarationContext ctx) {
        super.exitFun_declaration(ctx);
    }

    @Override
    public void enterArgs(PancakesParser.ArgsContext ctx) {
        super.enterArgs(ctx);
    }

    @Override
    public void exitArgs(PancakesParser.ArgsContext ctx) {
        super.exitArgs(ctx);
    }

    @Override
    public void enterFun_arg(PancakesParser.Fun_argContext ctx) {
        super.enterFun_arg(ctx);
    }

    @Override
    public void exitFun_arg(PancakesParser.Fun_argContext ctx) {
        super.exitFun_arg(ctx);
    }

    @Override
    public void enterFun_call(PancakesParser.Fun_callContext ctx) {
        super.enterFun_call(ctx);
    }

    @Override
    public void exitFun_call(PancakesParser.Fun_callContext ctx) {
        super.exitFun_call(ctx);
    }

    @Override
    public void enterParams(PancakesParser.ParamsContext ctx) {
        super.enterParams(ctx);
    }

    @Override
    public void exitParams(PancakesParser.ParamsContext ctx) {
        super.exitParams(ctx);
    }

    @Override
    public void enterParam(PancakesParser.ParamContext ctx) {
        super.enterParam(ctx);
    }

    @Override
    public void exitParam(PancakesParser.ParamContext ctx) {
        super.exitParam(ctx);
    }

    @Override
    public void enterClass_declaration(PancakesParser.Class_declarationContext ctx) {
        super.enterClass_declaration(ctx);
    }

    @Override
    public void exitClass_declaration(PancakesParser.Class_declarationContext ctx) {
        super.exitClass_declaration(ctx);
    }

    @Override
    public void enterClass_elements(PancakesParser.Class_elementsContext ctx) {
        super.enterClass_elements(ctx);
    }

    @Override
    public void exitClass_elements(PancakesParser.Class_elementsContext ctx) {
        super.exitClass_elements(ctx);
    }

    @Override
    public void enterLoops(PancakesParser.LoopsContext ctx) {
        super.enterLoops(ctx);
    }

    @Override
    public void exitLoops(PancakesParser.LoopsContext ctx) {
        super.exitLoops(ctx);
    }

    @Override
    public void enterFor_loop(PancakesParser.For_loopContext ctx) {
        super.enterFor_loop(ctx);
    }

    @Override
    public void exitFor_loop(PancakesParser.For_loopContext ctx) {
        super.exitFor_loop(ctx);
    }

    @Override
    public void enterLoop_element(PancakesParser.Loop_elementContext ctx) {
        super.enterLoop_element(ctx);
    }

    @Override
    public void exitLoop_element(PancakesParser.Loop_elementContext ctx) {
        super.exitLoop_element(ctx);
    }

    @Override
    public void enterDo_while(PancakesParser.Do_whileContext ctx) {
        super.enterDo_while(ctx);
    }

    @Override
    public void exitDo_while(PancakesParser.Do_whileContext ctx) {
        super.exitDo_while(ctx);
    }

    @Override
    public void enterWhile_loop(PancakesParser.While_loopContext ctx) {
        super.enterWhile_loop(ctx);
    }

    @Override
    public void exitWhile_loop(PancakesParser.While_loopContext ctx) {
        super.exitWhile_loop(ctx);
    }

    @Override
    public void enterConditionals(PancakesParser.ConditionalsContext ctx) {
        super.enterConditionals(ctx);
    }

    @Override
    public void exitConditionals(PancakesParser.ConditionalsContext ctx) {
        super.exitConditionals(ctx);
    }

    @Override
    public void enterExpression(PancakesParser.ExpressionContext ctx) {
        super.enterExpression(ctx);
    }

    @Override
    public void exitExpression(PancakesParser.ExpressionContext ctx) {
        super.exitExpression(ctx);
    }

    @Override
    public void enterClass_instantiation(PancakesParser.Class_instantiationContext ctx) {
        super.enterClass_instantiation(ctx);
    }

    @Override
    public void exitClass_instantiation(PancakesParser.Class_instantiationContext ctx) {
        super.exitClass_instantiation(ctx);
    }

    @Override
    public void enterAssignments(PancakesParser.AssignmentsContext ctx) {
        super.enterAssignments(ctx);
    }

    @Override
    public void exitAssignments(PancakesParser.AssignmentsContext ctx) {
        super.exitAssignments(ctx);
    }

    @Override
    public void enterReturn_statement(PancakesParser.Return_statementContext ctx) {
        super.enterReturn_statement(ctx);
    }

    @Override
    public void exitReturn_statement(PancakesParser.Return_statementContext ctx) {
        super.exitReturn_statement(ctx);
    }

    @Override
    public void enterValue(PancakesParser.ValueContext ctx) {
        super.enterValue(ctx);
    }

    @Override
    public void exitValue(PancakesParser.ValueContext ctx) {
        super.exitValue(ctx);
    }

    @Override
    public void enterIndexes(PancakesParser.IndexesContext ctx) {
        super.enterIndexes(ctx);
    }

    @Override
    public void exitIndexes(PancakesParser.IndexesContext ctx) {
        super.exitIndexes(ctx);
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        super.enterEveryRule(ctx);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        super.exitEveryRule(ctx);
    }
}
