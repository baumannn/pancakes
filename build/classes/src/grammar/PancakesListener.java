// Generated from src/grammar/Pancakes.g4 by ANTLR 4.5.1
 
  package main.parser; 

import main.parser.generated.PancakesParser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PancakesParser}.
 */
public interface PancakesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PancakesParser#pancakes}.
	 * @param ctx the parse tree
	 */
	void enterPancakes(PancakesParser.PancakesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PancakesParser#pancakes}.
	 * @param ctx the parse tree
	 */
	void exitPancakes(PancakesParser.PancakesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PancakesParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PancakesParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PancakesParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PancakesParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PancakesParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(PancakesParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PancakesParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(PancakesParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PancakesParser#var_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVar_declaration(PancakesParser.Var_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PancakesParser#var_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVar_declaration(PancakesParser.Var_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PancakesParser#fun_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFun_declaration(PancakesParser.Fun_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PancakesParser#fun_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFun_declaration(PancakesParser.Fun_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PancakesParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(PancakesParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PancakesParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(PancakesParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PancakesParser#fun_arg}.
	 * @param ctx the parse tree
	 */
	void enterFun_arg(PancakesParser.Fun_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link PancakesParser#fun_arg}.
	 * @param ctx the parse tree
	 */
	void exitFun_arg(PancakesParser.Fun_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link PancakesParser#fun_call}.
	 * @param ctx the parse tree
	 */
	void enterFun_call(PancakesParser.Fun_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link PancakesParser#fun_call}.
	 * @param ctx the parse tree
	 */
	void exitFun_call(PancakesParser.Fun_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link PancakesParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(PancakesParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PancakesParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(PancakesParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PancakesParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(PancakesParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link PancakesParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(PancakesParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link PancakesParser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void enterClass_declaration(PancakesParser.Class_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PancakesParser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void exitClass_declaration(PancakesParser.Class_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PancakesParser#class_elements}.
	 * @param ctx the parse tree
	 */
	void enterClass_elements(PancakesParser.Class_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PancakesParser#class_elements}.
	 * @param ctx the parse tree
	 */
	void exitClass_elements(PancakesParser.Class_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PancakesParser#loops}.
	 * @param ctx the parse tree
	 */
	void enterLoops(PancakesParser.LoopsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PancakesParser#loops}.
	 * @param ctx the parse tree
	 */
	void exitLoops(PancakesParser.LoopsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PancakesParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(PancakesParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PancakesParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(PancakesParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link PancakesParser#loop_element}.
	 * @param ctx the parse tree
	 */
	void enterLoop_element(PancakesParser.Loop_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PancakesParser#loop_element}.
	 * @param ctx the parse tree
	 */
	void exitLoop_element(PancakesParser.Loop_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PancakesParser#do_while}.
	 * @param ctx the parse tree
	 */
	void enterDo_while(PancakesParser.Do_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link PancakesParser#do_while}.
	 * @param ctx the parse tree
	 */
	void exitDo_while(PancakesParser.Do_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link PancakesParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(PancakesParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PancakesParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(PancakesParser.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link PancakesParser#conditionals}.
	 * @param ctx the parse tree
	 */
	void enterConditionals(PancakesParser.ConditionalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PancakesParser#conditionals}.
	 * @param ctx the parse tree
	 */
	void exitConditionals(PancakesParser.ConditionalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PancakesParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PancakesParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PancakesParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PancakesParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PancakesParser#class_instantiation}.
	 * @param ctx the parse tree
	 */
	void enterClass_instantiation(PancakesParser.Class_instantiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PancakesParser#class_instantiation}.
	 * @param ctx the parse tree
	 */
	void exitClass_instantiation(PancakesParser.Class_instantiationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PancakesParser#assignments}.
	 * @param ctx the parse tree
	 */
	void enterAssignments(PancakesParser.AssignmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PancakesParser#assignments}.
	 * @param ctx the parse tree
	 */
	void exitAssignments(PancakesParser.AssignmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PancakesParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(PancakesParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PancakesParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(PancakesParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PancakesParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(PancakesParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PancakesParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(PancakesParser.ValueContext ctx);
}