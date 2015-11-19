// Generated from Pancakes.g4 by ANTLR 4.5.1
package main.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PancakesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, BOOLEAN=16, 
		T_FLOAT=17, T_INT=18, T_BOOL=19, T_STRING=20, T_VOID=21, ADD=22, MINUS=23, 
		MULT=24, DIV=25, ID=26, INT=27, FLOAT=28, STRING=29, WS=30, SL_COMMENT=31;
	public static final int
		RULE_pancakes = 0, RULE_var_declare = 1, RULE_type = 2, RULE_fun_declare = 3, 
		RULE_fun_params = 4, RULE_fun_param = 5, RULE_block = 6, RULE_statement = 7, 
		RULE_if_statement = 8, RULE_expr = 9, RULE_arguments = 10;
	public static final String[] ruleNames = {
		"pancakes", "var_declare", "type", "fun_declare", "fun_params", "fun_param", 
		"block", "statement", "if_statement", "expr", "arguments"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "';'", "'('", "')'", "','", "'{'", "'}'", "'return'", "'if'", 
		"'else'", "'['", "']'", "'!'", "'//'", "'=='", null, "'float'", "'int'", 
		"'boolean'", "'string'", "'void'", "'+'", "'-'", "'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "BOOLEAN", "T_FLOAT", "T_INT", "T_BOOL", "T_STRING", 
		"T_VOID", "ADD", "MINUS", "MULT", "DIV", "ID", "INT", "FLOAT", "STRING", 
		"WS", "SL_COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Pancakes.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PancakesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PancakesContext extends ParserRuleContext {
		public List<Fun_declareContext> fun_declare() {
			return getRuleContexts(Fun_declareContext.class);
		}
		public Fun_declareContext fun_declare(int i) {
			return getRuleContext(Fun_declareContext.class,i);
		}
		public List<Var_declareContext> var_declare() {
			return getRuleContexts(Var_declareContext.class);
		}
		public Var_declareContext var_declare(int i) {
			return getRuleContext(Var_declareContext.class,i);
		}
		public PancakesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pancakes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).enterPancakes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).exitPancakes(this);
		}
	}

	public final PancakesContext pancakes() throws RecognitionException {
		PancakesContext _localctx = new PancakesContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_pancakes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(24);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(22);
					fun_declare();
					}
					break;
				case 2:
					{
					setState(23);
					var_declare();
					}
					break;
				}
				}
				setState(26); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_FLOAT) | (1L << T_INT) | (1L << T_BOOL) | (1L << T_STRING) | (1L << T_VOID))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_declareContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(PancakesParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Var_declareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_declare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).enterVar_declare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).exitVar_declare(this);
		}
	}

	public final Var_declareContext var_declare() throws RecognitionException {
		Var_declareContext _localctx = new Var_declareContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_var_declare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			type();
			setState(29);
			match(ID);
			setState(32);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(30);
				match(T__0);
				setState(31);
				expr(0);
				}
			}

			setState(34);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode T_FLOAT() { return getToken(PancakesParser.T_FLOAT, 0); }
		public TerminalNode T_INT() { return getToken(PancakesParser.T_INT, 0); }
		public TerminalNode T_BOOL() { return getToken(PancakesParser.T_BOOL, 0); }
		public TerminalNode T_STRING() { return getToken(PancakesParser.T_STRING, 0); }
		public TerminalNode T_VOID() { return getToken(PancakesParser.T_VOID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_FLOAT) | (1L << T_INT) | (1L << T_BOOL) | (1L << T_STRING) | (1L << T_VOID))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fun_declareContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(PancakesParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Fun_paramsContext fun_params() {
			return getRuleContext(Fun_paramsContext.class,0);
		}
		public Fun_declareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun_declare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).enterFun_declare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).exitFun_declare(this);
		}
	}

	public final Fun_declareContext fun_declare() throws RecognitionException {
		Fun_declareContext _localctx = new Fun_declareContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fun_declare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			type();
			setState(39);
			match(ID);
			setState(40);
			match(T__2);
			setState(42);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_FLOAT) | (1L << T_INT) | (1L << T_BOOL) | (1L << T_STRING) | (1L << T_VOID))) != 0)) {
				{
				setState(41);
				fun_params();
				}
			}

			setState(44);
			match(T__3);
			setState(45);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fun_paramsContext extends ParserRuleContext {
		public List<Fun_paramContext> fun_param() {
			return getRuleContexts(Fun_paramContext.class);
		}
		public Fun_paramContext fun_param(int i) {
			return getRuleContext(Fun_paramContext.class,i);
		}
		public Fun_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).enterFun_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).exitFun_params(this);
		}
	}

	public final Fun_paramsContext fun_params() throws RecognitionException {
		Fun_paramsContext _localctx = new Fun_paramsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fun_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			fun_param();
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(48);
				match(T__4);
				setState(49);
				fun_param();
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fun_paramContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(PancakesParser.ID, 0); }
		public Fun_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).enterFun_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).exitFun_param(this);
		}
	}

	public final Fun_paramContext fun_param() throws RecognitionException {
		Fun_paramContext _localctx = new Fun_paramContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fun_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			type();
			setState(56);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__5);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__7) | (1L << T__8) | (1L << T__12) | (1L << BOOLEAN) | (1L << T_FLOAT) | (1L << T_INT) | (1L << T_BOOL) | (1L << T_STRING) | (1L << T_VOID) | (1L << MINUS) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				{
				setState(59);
				statement();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Var_declareContext var_declare() {
			return getRuleContext(Var_declareContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		int _la;
		try {
			setState(83);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				var_declare();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				if_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(70);
				match(T__7);
				setState(72);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__12) | (1L << BOOLEAN) | (1L << MINUS) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
					{
					setState(71);
					expr(0);
					}
				}

				setState(74);
				match(T__1);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(75);
				expr(0);
				setState(76);
				match(T__0);
				setState(77);
				expr(0);
				setState(78);
				match(T__1);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(80);
				expr(0);
				setState(81);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).exitIf_statement(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(T__8);
			setState(86);
			match(T__2);
			setState(87);
			expr(0);
			setState(88);
			match(T__3);
			setState(89);
			match(T__5);
			setState(90);
			statement();
			setState(91);
			match(T__6);
			setState(97);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(92);
				match(T__9);
				setState(93);
				match(T__5);
				setState(94);
				statement();
				setState(95);
				match(T__6);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnaryNegateContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnaryNegateContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).enterUnaryNegate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).exitUnaryNegate(this);
		}
	}
	public static class FloatConstContext extends ExprContext {
		public TerminalNode FLOAT() { return getToken(PancakesParser.FLOAT, 0); }
		public FloatConstContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).enterFloatConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).exitFloatConst(this);
		}
	}
	public static class FunCallContext extends ExprContext {
		public TerminalNode ID() { return getToken(PancakesParser.ID, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public FunCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).enterFunCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).exitFunCall(this);
		}
	}
	public static class AddSubContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(PancakesParser.ADD, 0); }
		public TerminalNode MINUS() { return getToken(PancakesParser.MINUS, 0); }
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).exitAddSub(this);
		}
	}
	public static class VarRefContext extends ExprContext {
		public TerminalNode ID() { return getToken(PancakesParser.ID, 0); }
		public VarRefContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).enterVarRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).exitVarRef(this);
		}
	}
	public static class IntdivContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public IntdivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).enterIntdiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).exitIntdiv(this);
		}
	}
	public static class BoolConstContext extends ExprContext {
		public TerminalNode BOOLEAN() { return getToken(PancakesParser.BOOLEAN, 0); }
		public BoolConstContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).enterBoolConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).exitBoolConst(this);
		}
	}
	public static class ParenContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).enterParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).exitParen(this);
		}
	}
	public static class MultDivContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(PancakesParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(PancakesParser.DIV, 0); }
		public MultDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).enterMultDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).exitMultDiv(this);
		}
	}
	public static class StringConstContext extends ExprContext {
		public TerminalNode STRING() { return getToken(PancakesParser.STRING, 0); }
		public StringConstContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).enterStringConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).exitStringConst(this);
		}
	}
	public static class UnaryNotContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnaryNotContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).enterUnaryNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).exitUnaryNot(this);
		}
	}
	public static class ArrayIndexContext extends ExprContext {
		public TerminalNode ID() { return getToken(PancakesParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArrayIndexContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).enterArrayIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).exitArrayIndex(this);
		}
	}
	public static class IntConstContext extends ExprContext {
		public TerminalNode INT() { return getToken(PancakesParser.INT, 0); }
		public IntConstContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).enterIntConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).exitIntConst(this);
		}
	}
	public static class EqualityContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public EqualityContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).enterEquality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).exitEquality(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryNegateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(100);
				match(MINUS);
				setState(101);
				expr(12);
				}
				break;
			case 2:
				{
				_localctx = new UnaryNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(102);
				match(T__12);
				setState(103);
				expr(11);
				}
				break;
			case 3:
				{
				_localctx = new FunCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(104);
				match(ID);
				setState(105);
				match(T__2);
				setState(107);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__12) | (1L << BOOLEAN) | (1L << MINUS) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
					{
					setState(106);
					arguments();
					}
				}

				setState(109);
				match(T__3);
				}
				break;
			case 4:
				{
				_localctx = new ArrayIndexContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(110);
				match(ID);
				setState(111);
				match(T__10);
				setState(112);
				expr(0);
				setState(113);
				match(T__11);
				}
				break;
			case 5:
				{
				_localctx = new VarRefContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(115);
				match(ID);
				}
				break;
			case 6:
				{
				_localctx = new IntConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(116);
				match(INT);
				}
				break;
			case 7:
				{
				_localctx = new FloatConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(117);
				match(FLOAT);
				}
				break;
			case 8:
				{
				_localctx = new BoolConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(118);
				match(BOOLEAN);
				}
				break;
			case 9:
				{
				_localctx = new StringConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(119);
				match(STRING);
				}
				break;
			case 10:
				{
				_localctx = new ParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(120);
				match(T__2);
				setState(121);
				expr(0);
				setState(122);
				match(T__3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(140);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(138);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(126);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(127);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(128);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new IntdivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(129);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						{
						setState(130);
						match(T__13);
						}
						setState(131);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(132);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(133);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(134);
						expr(9);
						}
						break;
					case 4:
						{
						_localctx = new EqualityContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(135);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(136);
						match(T__14);
						setState(137);
						expr(8);
						}
						break;
					}
					} 
				}
				setState(142);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			expr(0);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(144);
				match(T__4);
				setState(145);
				expr(0);
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3!\u009a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\6\2\33\n\2\r\2\16\2\34\3\3\3\3\3\3\3\3\5\3#\n\3\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\5\5-\n\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6\65"+
		"\n\6\f\6\16\68\13\6\3\7\3\7\3\7\3\b\3\b\7\b?\n\b\f\b\16\bB\13\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\5\tK\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\tV\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nd\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13n\n\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\177\n\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u008d\n\13"+
		"\f\13\16\13\u0090\13\13\3\f\3\f\3\f\7\f\u0095\n\f\f\f\16\f\u0098\13\f"+
		"\3\f\2\3\24\r\2\4\6\b\n\f\16\20\22\24\26\2\5\3\2\23\27\3\2\32\33\3\2\30"+
		"\31\u00aa\2\32\3\2\2\2\4\36\3\2\2\2\6&\3\2\2\2\b(\3\2\2\2\n\61\3\2\2\2"+
		"\f9\3\2\2\2\16<\3\2\2\2\20U\3\2\2\2\22W\3\2\2\2\24~\3\2\2\2\26\u0091\3"+
		"\2\2\2\30\33\5\b\5\2\31\33\5\4\3\2\32\30\3\2\2\2\32\31\3\2\2\2\33\34\3"+
		"\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\3\3\2\2\2\36\37\5\6\4\2\37\"\7\34"+
		"\2\2 !\7\3\2\2!#\5\24\13\2\" \3\2\2\2\"#\3\2\2\2#$\3\2\2\2$%\7\4\2\2%"+
		"\5\3\2\2\2&\'\t\2\2\2\'\7\3\2\2\2()\5\6\4\2)*\7\34\2\2*,\7\5\2\2+-\5\n"+
		"\6\2,+\3\2\2\2,-\3\2\2\2-.\3\2\2\2./\7\6\2\2/\60\5\16\b\2\60\t\3\2\2\2"+
		"\61\66\5\f\7\2\62\63\7\7\2\2\63\65\5\f\7\2\64\62\3\2\2\2\658\3\2\2\2\66"+
		"\64\3\2\2\2\66\67\3\2\2\2\67\13\3\2\2\28\66\3\2\2\29:\5\6\4\2:;\7\34\2"+
		"\2;\r\3\2\2\2<@\7\b\2\2=?\5\20\t\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2"+
		"\2\2AC\3\2\2\2B@\3\2\2\2CD\7\t\2\2D\17\3\2\2\2EV\5\16\b\2FV\5\4\3\2GV"+
		"\5\22\n\2HJ\7\n\2\2IK\5\24\13\2JI\3\2\2\2JK\3\2\2\2KL\3\2\2\2LV\7\4\2"+
		"\2MN\5\24\13\2NO\7\3\2\2OP\5\24\13\2PQ\7\4\2\2QV\3\2\2\2RS\5\24\13\2S"+
		"T\7\4\2\2TV\3\2\2\2UE\3\2\2\2UF\3\2\2\2UG\3\2\2\2UH\3\2\2\2UM\3\2\2\2"+
		"UR\3\2\2\2V\21\3\2\2\2WX\7\13\2\2XY\7\5\2\2YZ\5\24\13\2Z[\7\6\2\2[\\\7"+
		"\b\2\2\\]\5\20\t\2]c\7\t\2\2^_\7\f\2\2_`\7\b\2\2`a\5\20\t\2ab\7\t\2\2"+
		"bd\3\2\2\2c^\3\2\2\2cd\3\2\2\2d\23\3\2\2\2ef\b\13\1\2fg\7\31\2\2g\177"+
		"\5\24\13\16hi\7\17\2\2i\177\5\24\13\rjk\7\34\2\2km\7\5\2\2ln\5\26\f\2"+
		"ml\3\2\2\2mn\3\2\2\2no\3\2\2\2o\177\7\6\2\2pq\7\34\2\2qr\7\r\2\2rs\5\24"+
		"\13\2st\7\16\2\2t\177\3\2\2\2u\177\7\34\2\2v\177\7\35\2\2w\177\7\36\2"+
		"\2x\177\7\22\2\2y\177\7\37\2\2z{\7\5\2\2{|\5\24\13\2|}\7\6\2\2}\177\3"+
		"\2\2\2~e\3\2\2\2~h\3\2\2\2~j\3\2\2\2~p\3\2\2\2~u\3\2\2\2~v\3\2\2\2~w\3"+
		"\2\2\2~x\3\2\2\2~y\3\2\2\2~z\3\2\2\2\177\u008e\3\2\2\2\u0080\u0081\f\f"+
		"\2\2\u0081\u0082\t\3\2\2\u0082\u008d\5\24\13\r\u0083\u0084\f\13\2\2\u0084"+
		"\u0085\7\20\2\2\u0085\u008d\5\24\13\f\u0086\u0087\f\n\2\2\u0087\u0088"+
		"\t\4\2\2\u0088\u008d\5\24\13\13\u0089\u008a\f\t\2\2\u008a\u008b\7\21\2"+
		"\2\u008b\u008d\5\24\13\n\u008c\u0080\3\2\2\2\u008c\u0083\3\2\2\2\u008c"+
		"\u0086\3\2\2\2\u008c\u0089\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2"+
		"\2\2\u008e\u008f\3\2\2\2\u008f\25\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0096"+
		"\5\24\13\2\u0092\u0093\7\7\2\2\u0093\u0095\5\24\13\2\u0094\u0092\3\2\2"+
		"\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\27"+
		"\3\2\2\2\u0098\u0096\3\2\2\2\20\32\34\",\66@JUcm~\u008c\u008e\u0096";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}