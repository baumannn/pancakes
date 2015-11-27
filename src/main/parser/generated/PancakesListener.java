// Generated from Pancakes.g4 by ANTLR 4.5.1
package main.parser.generated;
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
	 * Enter a parse tree produced by {@link PancakesParser#var_declare}.
	 * @param ctx the parse tree
	 */
	void enterVar_declare(PancakesParser.Var_declareContext ctx);
	/**
	 * Exit a parse tree produced by {@link PancakesParser#var_declare}.
	 * @param ctx the parse tree
	 */
	void exitVar_declare(PancakesParser.Var_declareContext ctx);
	/**
	 * Enter a parse tree produced by {@link PancakesParser#array_declare}.
	 * @param ctx the parse tree
	 */
	void enterArray_declare(PancakesParser.Array_declareContext ctx);
	/**
	 * Exit a parse tree produced by {@link PancakesParser#array_declare}.
	 * @param ctx the parse tree
	 */
	void exitArray_declare(PancakesParser.Array_declareContext ctx);
	/**
	 * Enter a parse tree produced by {@link PancakesParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(PancakesParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PancakesParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(PancakesParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PancakesParser#fun_declare}.
	 * @param ctx the parse tree
	 */
	void enterFun_declare(PancakesParser.Fun_declareContext ctx);
	/**
	 * Exit a parse tree produced by {@link PancakesParser#fun_declare}.
	 * @param ctx the parse tree
	 */
	void exitFun_declare(PancakesParser.Fun_declareContext ctx);
	/**
	 * Enter a parse tree produced by {@link PancakesParser#fun_params}.
	 * @param ctx the parse tree
	 */
	void enterFun_params(PancakesParser.Fun_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PancakesParser#fun_params}.
	 * @param ctx the parse tree
	 */
	void exitFun_params(PancakesParser.Fun_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PancakesParser#fun_param}.
	 * @param ctx the parse tree
	 */
	void enterFun_param(PancakesParser.Fun_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PancakesParser#fun_param}.
	 * @param ctx the parse tree
	 */
	void exitFun_param(PancakesParser.Fun_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PancakesParser#array_assignment}.
	 * @param ctx the parse tree
	 */
	void enterArray_assignment(PancakesParser.Array_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PancakesParser#array_assignment}.
	 * @param ctx the parse tree
	 */
	void exitArray_assignment(PancakesParser.Array_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PancakesParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(PancakesParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PancakesParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(PancakesParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PancakesParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(PancakesParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PancakesParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(PancakesParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PancakesParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PancakesParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PancakesParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PancakesParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintFunc}
	 * labeled alternative in {@link PancakesParser#built_in_function}.
	 * @param ctx the parse tree
	 */
	void enterPrintFunc(PancakesParser.PrintFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintFunc}
	 * labeled alternative in {@link PancakesParser#built_in_function}.
	 * @param ctx the parse tree
	 */
	void exitPrintFunc(PancakesParser.PrintFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DrawCircle}
	 * labeled alternative in {@link PancakesParser#built_in_function}.
	 * @param ctx the parse tree
	 */
	void enterDrawCircle(PancakesParser.DrawCircleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DrawCircle}
	 * labeled alternative in {@link PancakesParser#built_in_function}.
	 * @param ctx the parse tree
	 */
	void exitDrawCircle(PancakesParser.DrawCircleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DrawRectangle}
	 * labeled alternative in {@link PancakesParser#built_in_function}.
	 * @param ctx the parse tree
	 */
	void enterDrawRectangle(PancakesParser.DrawRectangleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DrawRectangle}
	 * labeled alternative in {@link PancakesParser#built_in_function}.
	 * @param ctx the parse tree
	 */
	void exitDrawRectangle(PancakesParser.DrawRectangleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DrawOval}
	 * labeled alternative in {@link PancakesParser#built_in_function}.
	 * @param ctx the parse tree
	 */
	void enterDrawOval(PancakesParser.DrawOvalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DrawOval}
	 * labeled alternative in {@link PancakesParser#built_in_function}.
	 * @param ctx the parse tree
	 */
	void exitDrawOval(PancakesParser.DrawOvalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DrawLine}
	 * labeled alternative in {@link PancakesParser#built_in_function}.
	 * @param ctx the parse tree
	 */
	void enterDrawLine(PancakesParser.DrawLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DrawLine}
	 * labeled alternative in {@link PancakesParser#built_in_function}.
	 * @param ctx the parse tree
	 */
	void exitDrawLine(PancakesParser.DrawLineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DrawString}
	 * labeled alternative in {@link PancakesParser#built_in_function}.
	 * @param ctx the parse tree
	 */
	void enterDrawString(PancakesParser.DrawStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DrawString}
	 * labeled alternative in {@link PancakesParser#built_in_function}.
	 * @param ctx the parse tree
	 */
	void exitDrawString(PancakesParser.DrawStringContext ctx);
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
	 * Enter a parse tree produced by {@link PancakesParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(PancakesParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PancakesParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(PancakesParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PancakesParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void enterElse_statement(PancakesParser.Else_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PancakesParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void exitElse_statement(PancakesParser.Else_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PancakesParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(PancakesParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PancakesParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(PancakesParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PancakesParser#do_while_statement}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_statement(PancakesParser.Do_while_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PancakesParser#do_while_statement}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_statement(PancakesParser.Do_while_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PancakesParser#if_expr}.
	 * @param ctx the parse tree
	 */
	void enterIf_expr(PancakesParser.If_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PancakesParser#if_expr}.
	 * @param ctx the parse tree
	 */
	void exitIf_expr(PancakesParser.If_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PancakesParser#do_if_expr}.
	 * @param ctx the parse tree
	 */
	void enterDo_if_expr(PancakesParser.Do_if_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PancakesParser#do_if_expr}.
	 * @param ctx the parse tree
	 */
	void exitDo_if_expr(PancakesParser.Do_if_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryNegate}
	 * labeled alternative in {@link PancakesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryNegate(PancakesParser.UnaryNegateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryNegate}
	 * labeled alternative in {@link PancakesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryNegate(PancakesParser.UnaryNegateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FloatConst}
	 * labeled alternative in {@link PancakesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFloatConst(PancakesParser.FloatConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FloatConst}
	 * labeled alternative in {@link PancakesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFloatConst(PancakesParser.FloatConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DontUseFunCall}
	 * labeled alternative in {@link PancakesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDontUseFunCall(PancakesParser.DontUseFunCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DontUseFunCall}
	 * labeled alternative in {@link PancakesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDontUseFunCall(PancakesParser.DontUseFunCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link PancakesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(PancakesParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link PancakesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(PancakesParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LTGT}
	 * labeled alternative in {@link PancakesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLTGT(PancakesParser.LTGTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LTGT}
	 * labeled alternative in {@link PancakesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLTGT(PancakesParser.LTGTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarRef}
	 * labeled alternative in {@link PancakesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVarRef(PancakesParser.VarRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarRef}
	 * labeled alternative in {@link PancakesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVarRef(PancakesParser.VarRefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Intdiv}
	 * labeled alternative in {@link PancakesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIntdiv(PancakesParser.IntdivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Intdiv}
	 * labeled alternative in {@link PancakesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIntdiv(PancakesParser.IntdivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolConst}
	 * labeled alternative in {@link PancakesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolConst(PancakesParser.BoolConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolConst}
	 * labeled alternative in {@link PancakesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolConst(PancakesParser.BoolConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link PancakesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParen(PancakesParser.ParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link PancakesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParen(PancakesParser.ParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultDiv}
	 * labeled alternative in {@link PancakesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultDiv(PancakesParser.MultDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultDiv}
	 * labeled alternative in {@link PancakesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultDiv(PancakesParser.MultDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringConst}
	 * labeled alternative in {@link PancakesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStringConst(PancakesParser.StringConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringConst}
	 * labeled alternative in {@link PancakesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStringConst(PancakesParser.StringConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryNot}
	 * labeled alternative in {@link PancakesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryNot(PancakesParser.UnaryNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryNot}
	 * labeled alternative in {@link PancakesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryNot(PancakesParser.UnaryNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayIndex}
	 * labeled alternative in {@link PancakesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArrayIndex(PancakesParser.ArrayIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayIndex}
	 * labeled alternative in {@link PancakesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArrayIndex(PancakesParser.ArrayIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntConst}
	 * labeled alternative in {@link PancakesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIntConst(PancakesParser.IntConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntConst}
	 * labeled alternative in {@link PancakesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIntConst(PancakesParser.IntConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Equality}
	 * labeled alternative in {@link PancakesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEquality(PancakesParser.EqualityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Equality}
	 * labeled alternative in {@link PancakesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEquality(PancakesParser.EqualityContext ctx);
	/**
	 * Enter a parse tree produced by {@link PancakesParser#close_bracket}.
	 * @param ctx the parse tree
	 */
	void enterClose_bracket(PancakesParser.Close_bracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link PancakesParser#close_bracket}.
	 * @param ctx the parse tree
	 */
	void exitClose_bracket(PancakesParser.Close_bracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link PancakesParser#funCall}.
	 * @param ctx the parse tree
	 */
	void enterFunCall(PancakesParser.FunCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PancakesParser#funCall}.
	 * @param ctx the parse tree
	 */
	void exitFunCall(PancakesParser.FunCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link PancakesParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(PancakesParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PancakesParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(PancakesParser.ArgumentsContext ctx);
}