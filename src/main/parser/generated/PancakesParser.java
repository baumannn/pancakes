// Generated from Pancakes.g4 by ANTLR 4.5.1
package main.parser.generated;
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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, PRINT=16, BOOLEAN=17, 
		T_FLOAT=18, T_INT=19, T_BOOL=20, T_STRING=21, T_VOID=22, EQUAL=23, ADD=24, 
		MINUS=25, MULT=26, DIV=27, ID=28, INT=29, FLOAT=30, STRING=31, WS=32, 
		SL_COMMENT=33;
	public static final int
		RULE_pancakes = 0, RULE_var_declare = 1, RULE_type = 2, RULE_fun_declare = 3, 
		RULE_fun_params = 4, RULE_fun_param = 5, RULE_block = 6, RULE_statement = 7, 
		RULE_built_in_function = 8, RULE_return_statement = 9, RULE_assignment = 10, 
		RULE_if_statement = 11, RULE_else_statement = 12, RULE_if_expr = 13, RULE_expr = 14, 
		RULE_funCall = 15, RULE_arguments = 16;
	public static final String[] ruleNames = {
		"pancakes", "var_declare", "type", "fun_declare", "fun_params", "fun_param", 
		"block", "statement", "built_in_function", "return_statement", "assignment", 
		"if_statement", "else_statement", "if_expr", "expr", "funCall", "arguments"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'('", "')'", "','", "'{'", "'}'", "'dummy'", "'return'", 
		"'if'", "'else'", "'['", "']'", "'!'", "'//'", "'=='", "'print'", null, 
		"'float'", "'int'", "'boolean'", "'string'", "'void'", "'='", "'+'", "'-'", 
		"'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "PRINT", "BOOLEAN", "T_FLOAT", "T_INT", "T_BOOL", 
		"T_STRING", "T_VOID", "EQUAL", "ADD", "MINUS", "MULT", "DIV", "ID", "INT", 
		"FLOAT", "STRING", "WS", "SL_COMMENT"
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
			setState(36); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(36);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(34);
					fun_declare();
					}
					break;
				case 2:
					{
					setState(35);
					statement();
					}
					break;
				}
				}
				setState(38); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << PRINT) | (1L << T_FLOAT) | (1L << T_INT) | (1L << T_BOOL) | (1L << T_STRING) | (1L << T_VOID) | (1L << ID))) != 0) );
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
		public TerminalNode EQUAL() { return getToken(PancakesParser.EQUAL, 0); }
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
			setState(40);
			type();
			setState(41);
			match(ID);
			setState(44);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(42);
				match(EQUAL);
				setState(43);
				expr(0);
				}
			}

			setState(46);
			match(T__0);
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
			setState(48);
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
			setState(50);
			type();
			setState(51);
			match(ID);
			setState(52);
			match(T__1);
			setState(54);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_FLOAT) | (1L << T_INT) | (1L << T_BOOL) | (1L << T_STRING) | (1L << T_VOID))) != 0)) {
				{
				setState(53);
				fun_params();
				}
			}

			setState(56);
			match(T__2);
			setState(57);
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
			setState(59);
			fun_param();
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(60);
				match(T__3);
				setState(61);
				fun_param();
				}
				}
				setState(66);
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
			setState(67);
			type();
			setState(68);
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
			setState(70);
			match(T__4);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << PRINT) | (1L << T_FLOAT) | (1L << T_INT) | (1L << T_BOOL) | (1L << T_STRING) | (1L << T_VOID) | (1L << ID))) != 0)) {
				{
				{
				setState(71);
				statement();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			match(T__5);
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
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public FunCallContext funCall() {
			return getRuleContext(FunCallContext.class,0);
		}
		public Built_in_functionContext built_in_function() {
			return getRuleContext(Built_in_functionContext.class,0);
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
		try {
			setState(94);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				var_declare();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				if_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
				return_statement();
				setState(83);
				match(T__0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(85);
				assignment();
				setState(86);
				match(T__0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(88);
				funCall();
				setState(89);
				match(T__0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(91);
				built_in_function();
				setState(92);
				match(T__0);
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

	public static class Built_in_functionContext extends ParserRuleContext {
		public Built_in_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_built_in_function; }
	 
		public Built_in_functionContext() { }
		public void copyFrom(Built_in_functionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DummyFuncContext extends Built_in_functionContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DummyFuncContext(Built_in_functionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).enterDummyFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).exitDummyFunc(this);
		}
	}
	public static class PrintFuncContext extends Built_in_functionContext {
		public TerminalNode PRINT() { return getToken(PancakesParser.PRINT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintFuncContext(Built_in_functionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).enterPrintFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).exitPrintFunc(this);
		}
	}

	public final Built_in_functionContext built_in_function() throws RecognitionException {
		Built_in_functionContext _localctx = new Built_in_functionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_built_in_function);
		try {
			setState(106);
			switch (_input.LA(1)) {
			case PRINT:
				_localctx = new PrintFuncContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(PRINT);
				setState(97);
				match(T__1);
				setState(98);
				expr(0);
				setState(99);
				match(T__2);
				}
				break;
			case T__6:
				_localctx = new DummyFuncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				match(T__6);
				setState(102);
				match(T__1);
				setState(103);
				expr(0);
				setState(104);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Return_statementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).exitReturn_statement(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_return_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__7);
			setState(110);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__12) | (1L << BOOLEAN) | (1L << MINUS) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				setState(109);
				expr(0);
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

	public static class AssignmentContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PancakesParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PancakesParser.ID, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(ID);
			setState(113);
			match(EQUAL);
			setState(118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(114);
					match(ID);
					setState(115);
					match(EQUAL);
					}
					} 
				}
				setState(120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(121);
			expr(0);
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
		public If_exprContext if_expr() {
			return getRuleContext(If_exprContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Else_statementContext else_statement() {
			return getRuleContext(Else_statementContext.class,0);
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
		enterRule(_localctx, 22, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__8);
			setState(124);
			match(T__1);
			setState(125);
			if_expr();
			setState(126);
			match(T__2);
			setState(127);
			match(T__4);
			setState(128);
			statement();
			setState(129);
			match(T__5);
			setState(131);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(130);
				else_statement();
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

	public static class Else_statementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Else_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).enterElse_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).exitElse_statement(this);
		}
	}

	public final Else_statementContext else_statement() throws RecognitionException {
		Else_statementContext _localctx = new Else_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_else_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__9);
			setState(134);
			match(T__4);
			setState(135);
			statement();
			setState(136);
			match(T__5);
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

	public static class If_exprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public If_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).enterIf_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).exitIf_expr(this);
		}
	}

	public final If_exprContext if_expr() throws RecognitionException {
		If_exprContext _localctx = new If_exprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_if_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			expr(0);
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
	public static class DontUseFunCallContext extends ExprContext {
		public FunCallContext funCall() {
			return getRuleContext(FunCallContext.class,0);
		}
		public DontUseFunCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).enterDontUseFunCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).exitDontUseFunCall(this);
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryNegateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(141);
				match(MINUS);
				setState(142);
				expr(12);
				}
				break;
			case 2:
				{
				_localctx = new UnaryNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(143);
				match(T__12);
				setState(144);
				expr(11);
				}
				break;
			case 3:
				{
				_localctx = new DontUseFunCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(145);
				funCall();
				}
				break;
			case 4:
				{
				_localctx = new ArrayIndexContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(146);
				match(ID);
				setState(147);
				match(T__10);
				setState(148);
				expr(0);
				setState(149);
				match(T__11);
				}
				break;
			case 5:
				{
				_localctx = new VarRefContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(151);
				match(ID);
				}
				break;
			case 6:
				{
				_localctx = new IntConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(152);
				match(INT);
				}
				break;
			case 7:
				{
				_localctx = new FloatConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153);
				match(FLOAT);
				}
				break;
			case 8:
				{
				_localctx = new BoolConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(154);
				match(BOOLEAN);
				}
				break;
			case 9:
				{
				_localctx = new StringConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(155);
				match(STRING);
				}
				break;
			case 10:
				{
				_localctx = new ParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(156);
				match(T__1);
				setState(157);
				expr(0);
				setState(158);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(176);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(174);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(162);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(163);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(164);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new IntdivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(165);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						{
						setState(166);
						match(T__13);
						}
						setState(167);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(168);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(169);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(170);
						expr(9);
						}
						break;
					case 4:
						{
						_localctx = new EqualityContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(171);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(172);
						match(T__14);
						setState(173);
						expr(8);
						}
						break;
					}
					} 
				}
				setState(178);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class FunCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PancakesParser.ID, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public FunCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).enterFunCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).exitFunCall(this);
		}
	}

	public final FunCallContext funCall() throws RecognitionException {
		FunCallContext _localctx = new FunCallContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_funCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(ID);
			setState(180);
			match(T__1);
			setState(182);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__12) | (1L << BOOLEAN) | (1L << MINUS) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				setState(181);
				arguments();
				}
			}

			setState(184);
			match(T__2);
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
		enterRule(_localctx, 32, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			expr(0);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(187);
				match(T__3);
				setState(188);
				expr(0);
				}
				}
				setState(193);
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
		case 14:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3#\u00c5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\6\2\'\n\2\r\2\16\2(\3\3\3\3\3\3\3\3\5\3/\n\3\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\5\59\n\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6A\n\6\f\6\16\6D\13"+
		"\6\3\7\3\7\3\7\3\b\3\b\7\bK\n\b\f\b\16\bN\13\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\ta\n\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\5\nm\n\n\3\13\3\13\5\13q\n\13\3\f\3\f\3\f\3\f"+
		"\7\fw\n\f\f\f\16\fz\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0086"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u00a3\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\7\20\u00b1\n\20\f\20\16\20\u00b4\13\20\3\21\3\21\3\21\5\21\u00b9"+
		"\n\21\3\21\3\21\3\22\3\22\3\22\7\22\u00c0\n\22\f\22\16\22\u00c3\13\22"+
		"\3\22\2\3\36\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\5\3\2\24\30"+
		"\3\2\34\35\3\2\32\33\u00d2\2&\3\2\2\2\4*\3\2\2\2\6\62\3\2\2\2\b\64\3\2"+
		"\2\2\n=\3\2\2\2\fE\3\2\2\2\16H\3\2\2\2\20`\3\2\2\2\22l\3\2\2\2\24n\3\2"+
		"\2\2\26r\3\2\2\2\30}\3\2\2\2\32\u0087\3\2\2\2\34\u008c\3\2\2\2\36\u00a2"+
		"\3\2\2\2 \u00b5\3\2\2\2\"\u00bc\3\2\2\2$\'\5\b\5\2%\'\5\20\t\2&$\3\2\2"+
		"\2&%\3\2\2\2\'(\3\2\2\2(&\3\2\2\2()\3\2\2\2)\3\3\2\2\2*+\5\6\4\2+.\7\36"+
		"\2\2,-\7\31\2\2-/\5\36\20\2.,\3\2\2\2./\3\2\2\2/\60\3\2\2\2\60\61\7\3"+
		"\2\2\61\5\3\2\2\2\62\63\t\2\2\2\63\7\3\2\2\2\64\65\5\6\4\2\65\66\7\36"+
		"\2\2\668\7\4\2\2\679\5\n\6\28\67\3\2\2\289\3\2\2\29:\3\2\2\2:;\7\5\2\2"+
		";<\5\16\b\2<\t\3\2\2\2=B\5\f\7\2>?\7\6\2\2?A\5\f\7\2@>\3\2\2\2AD\3\2\2"+
		"\2B@\3\2\2\2BC\3\2\2\2C\13\3\2\2\2DB\3\2\2\2EF\5\6\4\2FG\7\36\2\2G\r\3"+
		"\2\2\2HL\7\7\2\2IK\5\20\t\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO"+
		"\3\2\2\2NL\3\2\2\2OP\7\b\2\2P\17\3\2\2\2Qa\5\16\b\2Ra\5\4\3\2Sa\5\30\r"+
		"\2TU\5\24\13\2UV\7\3\2\2Va\3\2\2\2WX\5\26\f\2XY\7\3\2\2Ya\3\2\2\2Z[\5"+
		" \21\2[\\\7\3\2\2\\a\3\2\2\2]^\5\22\n\2^_\7\3\2\2_a\3\2\2\2`Q\3\2\2\2"+
		"`R\3\2\2\2`S\3\2\2\2`T\3\2\2\2`W\3\2\2\2`Z\3\2\2\2`]\3\2\2\2a\21\3\2\2"+
		"\2bc\7\22\2\2cd\7\4\2\2de\5\36\20\2ef\7\5\2\2fm\3\2\2\2gh\7\t\2\2hi\7"+
		"\4\2\2ij\5\36\20\2jk\7\5\2\2km\3\2\2\2lb\3\2\2\2lg\3\2\2\2m\23\3\2\2\2"+
		"np\7\n\2\2oq\5\36\20\2po\3\2\2\2pq\3\2\2\2q\25\3\2\2\2rs\7\36\2\2sx\7"+
		"\31\2\2tu\7\36\2\2uw\7\31\2\2vt\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2"+
		"y{\3\2\2\2zx\3\2\2\2{|\5\36\20\2|\27\3\2\2\2}~\7\13\2\2~\177\7\4\2\2\177"+
		"\u0080\5\34\17\2\u0080\u0081\7\5\2\2\u0081\u0082\7\7\2\2\u0082\u0083\5"+
		"\20\t\2\u0083\u0085\7\b\2\2\u0084\u0086\5\32\16\2\u0085\u0084\3\2\2\2"+
		"\u0085\u0086\3\2\2\2\u0086\31\3\2\2\2\u0087\u0088\7\f\2\2\u0088\u0089"+
		"\7\7\2\2\u0089\u008a\5\20\t\2\u008a\u008b\7\b\2\2\u008b\33\3\2\2\2\u008c"+
		"\u008d\5\36\20\2\u008d\35\3\2\2\2\u008e\u008f\b\20\1\2\u008f\u0090\7\33"+
		"\2\2\u0090\u00a3\5\36\20\16\u0091\u0092\7\17\2\2\u0092\u00a3\5\36\20\r"+
		"\u0093\u00a3\5 \21\2\u0094\u0095\7\36\2\2\u0095\u0096\7\r\2\2\u0096\u0097"+
		"\5\36\20\2\u0097\u0098\7\16\2\2\u0098\u00a3\3\2\2\2\u0099\u00a3\7\36\2"+
		"\2\u009a\u00a3\7\37\2\2\u009b\u00a3\7 \2\2\u009c\u00a3\7\23\2\2\u009d"+
		"\u00a3\7!\2\2\u009e\u009f\7\4\2\2\u009f\u00a0\5\36\20\2\u00a0\u00a1\7"+
		"\5\2\2\u00a1\u00a3\3\2\2\2\u00a2\u008e\3\2\2\2\u00a2\u0091\3\2\2\2\u00a2"+
		"\u0093\3\2\2\2\u00a2\u0094\3\2\2\2\u00a2\u0099\3\2\2\2\u00a2\u009a\3\2"+
		"\2\2\u00a2\u009b\3\2\2\2\u00a2\u009c\3\2\2\2\u00a2\u009d\3\2\2\2\u00a2"+
		"\u009e\3\2\2\2\u00a3\u00b2\3\2\2\2\u00a4\u00a5\f\f\2\2\u00a5\u00a6\t\3"+
		"\2\2\u00a6\u00b1\5\36\20\r\u00a7\u00a8\f\13\2\2\u00a8\u00a9\7\20\2\2\u00a9"+
		"\u00b1\5\36\20\f\u00aa\u00ab\f\n\2\2\u00ab\u00ac\t\4\2\2\u00ac\u00b1\5"+
		"\36\20\13\u00ad\u00ae\f\t\2\2\u00ae\u00af\7\21\2\2\u00af\u00b1\5\36\20"+
		"\n\u00b0\u00a4\3\2\2\2\u00b0\u00a7\3\2\2\2\u00b0\u00aa\3\2\2\2\u00b0\u00ad"+
		"\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\37\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\7\36\2\2\u00b6\u00b8\7\4\2"+
		"\2\u00b7\u00b9\5\"\22\2\u00b8\u00b7\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba\u00bb\7\5\2\2\u00bb!\3\2\2\2\u00bc\u00c1\5\36\20"+
		"\2\u00bd\u00be\7\6\2\2\u00be\u00c0\5\36\20\2\u00bf\u00bd\3\2\2\2\u00c0"+
		"\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2#\3\2\2\2"+
		"\u00c3\u00c1\3\2\2\2\22&(.8BL`lpx\u0085\u00a2\u00b0\u00b2\u00b8\u00c1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}