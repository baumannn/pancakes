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
	 * Enter a parse tree produced by the {@code FunCall}
	 * labeled alternative in {@link PancakesParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunCall(PancakesParser.FunCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunCall}
	 * labeled alternative in {@link PancakesParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunCall(PancakesParser.FunCallContext ctx);
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