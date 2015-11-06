// Generated from Pancakes.g4 by ANTLR 4.5.1
package main.parser;
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
	 * Enter a parse tree produced by {@link PancakesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(PancakesParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PancakesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(PancakesParser.ExprContext ctx);
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