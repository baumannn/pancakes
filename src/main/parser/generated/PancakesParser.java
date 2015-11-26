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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, PRINT=16, LT=17, 
		GT=18, BOOLEAN=19, T_FLOAT=20, T_INT=21, T_BOOL=22, T_STRING=23, T_VOID=24, 
		EQUAL=25, ADD=26, MINUS=27, MULT=28, DIV=29, ID=30, INT=31, FLOAT=32, 
		STRING=33, WS=34, SL_COMMENT=35;
	public static final int
		RULE_pancakes = 0, RULE_var_declare = 1, RULE_array_declare = 2, RULE_type = 3, 
		RULE_fun_declare = 4, RULE_fun_params = 5, RULE_fun_param = 6, RULE_block = 7, 
		RULE_statement = 8, RULE_built_in_function = 9, RULE_return_statement = 10, 
		RULE_array_assignment = 11, RULE_assignment = 12, RULE_if_statement = 13, 
		RULE_else_statement = 14, RULE_if_expr = 15, RULE_expr = 16, RULE_close_bracket = 17, 
		RULE_funCall = 18, RULE_arguments = 19;
	public static final String[] ruleNames = {
		"pancakes", "var_declare", "array_declare", "type", "fun_declare", "fun_params", 
		"fun_param", "block", "statement", "built_in_function", "return_statement", 
		"array_assignment", "assignment", "if_statement", "else_statement", "if_expr", 
		"expr", "close_bracket", "funCall", "arguments"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'['", "']'", "'('", "')'", "','", "'{'", "'}'", "'dummy'", 
		"'return'", "'if'", "'else'", "'!'", "'//'", "'=='", "'print'", "'<'", 
		"'>'", null, "'float'", "'int'", "'boolean'", "'string'", "'void'", "'='", 
		"'+'", "'-'", "'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "PRINT", "LT", "GT", "BOOLEAN", "T_FLOAT", "T_INT", 
		"T_BOOL", "T_STRING", "T_VOID", "EQUAL", "ADD", "MINUS", "MULT", "DIV", 
		"ID", "INT", "FLOAT", "STRING", "WS", "SL_COMMENT"
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
			setState(42); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(42);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(40);
					fun_declare();
					}
					break;
				case 2:
					{
					setState(41);
					statement();
					}
					break;
				}
				}
				setState(44); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << PRINT) | (1L << T_FLOAT) | (1L << T_INT) | (1L << T_BOOL) | (1L << T_STRING) | (1L << T_VOID) | (1L << ID))) != 0) );
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
			setState(46);
			type();
			setState(47);
			match(ID);
			setState(50);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(48);
				match(EQUAL);
				setState(49);
				expr(0);
				}
			}

			setState(52);
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

	public static class Array_declareContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(PancakesParser.ID, 0); }
		public List<TerminalNode> INT() { return getTokens(PancakesParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(PancakesParser.INT, i);
		}
		public Array_declareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_declare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).enterArray_declare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).exitArray_declare(this);
		}
	}

	public final Array_declareContext array_declare() throws RecognitionException {
		Array_declareContext _localctx = new Array_declareContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_array_declare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			type();
			setState(58); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(55);
				match(T__1);
				setState(56);
				match(INT);
				setState(57);
				match(T__2);
				}
				}
				setState(60); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 );
			setState(62);
			match(ID);
			setState(63);
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
		enterRule(_localctx, 6, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
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
		enterRule(_localctx, 8, RULE_fun_declare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			type();
			setState(68);
			match(ID);
			setState(69);
			match(T__3);
			setState(71);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_FLOAT) | (1L << T_INT) | (1L << T_BOOL) | (1L << T_STRING) | (1L << T_VOID))) != 0)) {
				{
				setState(70);
				fun_params();
				}
			}

			setState(73);
			match(T__4);
			setState(74);
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
		enterRule(_localctx, 10, RULE_fun_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			fun_param();
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(77);
				match(T__5);
				setState(78);
				fun_param();
				}
				}
				setState(83);
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
		enterRule(_localctx, 12, RULE_fun_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			type();
			setState(85);
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
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__6);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << PRINT) | (1L << T_FLOAT) | (1L << T_INT) | (1L << T_BOOL) | (1L << T_STRING) | (1L << T_VOID) | (1L << ID))) != 0)) {
				{
				{
				setState(88);
				statement();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
			match(T__7);
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
		public Array_declareContext array_declare() {
			return getRuleContext(Array_declareContext.class,0);
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
		public Array_assignmentContext array_assignment() {
			return getRuleContext(Array_assignmentContext.class,0);
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
		enterRule(_localctx, 16, RULE_statement);
		try {
			setState(115);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				var_declare();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				array_declare();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(99);
				if_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(100);
				return_statement();
				setState(101);
				match(T__0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(103);
				assignment();
				setState(104);
				match(T__0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(106);
				array_assignment();
				setState(107);
				match(T__0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(109);
				funCall();
				setState(110);
				match(T__0);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(112);
				built_in_function();
				setState(113);
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
		enterRule(_localctx, 18, RULE_built_in_function);
		try {
			setState(127);
			switch (_input.LA(1)) {
			case PRINT:
				_localctx = new PrintFuncContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				match(PRINT);
				setState(118);
				match(T__3);
				setState(119);
				expr(0);
				setState(120);
				match(T__4);
				}
				break;
			case T__8:
				_localctx = new DummyFuncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				match(T__8);
				setState(123);
				match(T__3);
				setState(124);
				expr(0);
				setState(125);
				match(T__4);
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
		enterRule(_localctx, 20, RULE_return_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(T__9);
			setState(131);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << BOOLEAN) | (1L << MINUS) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				setState(130);
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

	public static class Array_assignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PancakesParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> INT() { return getTokens(PancakesParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(PancakesParser.INT, i);
		}
		public Array_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).enterArray_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).exitArray_assignment(this);
		}
	}

	public final Array_assignmentContext array_assignment() throws RecognitionException {
		Array_assignmentContext _localctx = new Array_assignmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_array_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(ID);
			setState(137); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(134);
				match(T__1);
				setState(135);
				match(INT);
				setState(136);
				match(T__2);
				}
				}
				setState(139); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 );
			setState(141);
			match(EQUAL);
			setState(142);
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
		enterRule(_localctx, 24, RULE_assignment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(ID);
			setState(145);
			match(EQUAL);
			setState(150);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(146);
					match(ID);
					setState(147);
					match(EQUAL);
					}
					} 
				}
				setState(152);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(153);
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
		enterRule(_localctx, 26, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(T__10);
			setState(156);
			match(T__3);
			setState(157);
			if_expr();
			setState(158);
			match(T__4);
			setState(159);
			block();
			setState(161);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(160);
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
		enterRule(_localctx, 28, RULE_else_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(T__11);
			setState(164);
			match(T__6);
			setState(165);
			statement();
			setState(166);
			match(T__7);
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
		enterRule(_localctx, 30, RULE_if_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
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
	public static class LTGTContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LT() { return getToken(PancakesParser.LT, 0); }
		public TerminalNode GT() { return getToken(PancakesParser.GT, 0); }
		public LTGTContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).enterLTGT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).exitLTGT(this);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Close_bracketContext> close_bracket() {
			return getRuleContexts(Close_bracketContext.class);
		}
		public Close_bracketContext close_bracket(int i) {
			return getRuleContext(Close_bracketContext.class,i);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryNegateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(171);
				match(MINUS);
				setState(172);
				expr(13);
				}
				break;
			case 2:
				{
				_localctx = new UnaryNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(173);
				match(T__12);
				setState(174);
				expr(12);
				}
				break;
			case 3:
				{
				_localctx = new DontUseFunCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175);
				funCall();
				}
				break;
			case 4:
				{
				_localctx = new ArrayIndexContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(176);
				match(ID);
				setState(181); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(177);
						match(T__1);
						setState(178);
						expr(0);
						setState(179);
						close_bracket();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(183); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 5:
				{
				_localctx = new VarRefContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(185);
				match(ID);
				}
				break;
			case 6:
				{
				_localctx = new IntConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(186);
				match(INT);
				}
				break;
			case 7:
				{
				_localctx = new FloatConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(187);
				match(FLOAT);
				}
				break;
			case 8:
				{
				_localctx = new BoolConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(188);
				match(BOOLEAN);
				}
				break;
			case 9:
				{
				_localctx = new StringConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(189);
				match(STRING);
				}
				break;
			case 10:
				{
				_localctx = new ParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(190);
				match(T__3);
				setState(191);
				expr(0);
				setState(192);
				match(T__4);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(211);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(196);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(197);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(198);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new IntdivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(199);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						{
						setState(200);
						match(T__13);
						}
						setState(201);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(202);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(203);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(204);
						expr(10);
						}
						break;
					case 4:
						{
						_localctx = new LTGTContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(205);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(206);
						_la = _input.LA(1);
						if ( !(_la==LT || _la==GT) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(207);
						expr(9);
						}
						break;
					case 5:
						{
						_localctx = new EqualityContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(208);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(209);
						match(T__14);
						setState(210);
						expr(8);
						}
						break;
					}
					} 
				}
				setState(215);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class Close_bracketContext extends ParserRuleContext {
		public Close_bracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_close_bracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).enterClose_bracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).exitClose_bracket(this);
		}
	}

	public final Close_bracketContext close_bracket() throws RecognitionException {
		Close_bracketContext _localctx = new Close_bracketContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_close_bracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
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
		enterRule(_localctx, 36, RULE_funCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(ID);
			setState(219);
			match(T__3);
			setState(221);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << BOOLEAN) | (1L << MINUS) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				setState(220);
				arguments();
				}
			}

			setState(223);
			match(T__4);
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
		enterRule(_localctx, 38, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			expr(0);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(226);
				match(T__5);
				setState(227);
				expr(0);
				}
				}
				setState(232);
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
		case 16:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3%\u00ec\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\6\2-\n\2\r\2\16\2.\3\3\3\3\3\3"+
		"\3\3\5\3\65\n\3\3\3\3\3\3\4\3\4\3\4\3\4\6\4=\n\4\r\4\16\4>\3\4\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\5\6J\n\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7R\n\7\f\7"+
		"\16\7U\13\7\3\b\3\b\3\b\3\t\3\t\7\t\\\n\t\f\t\16\t_\13\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\5\nv\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0082"+
		"\n\13\3\f\3\f\5\f\u0086\n\f\3\r\3\r\3\r\3\r\6\r\u008c\n\r\r\r\16\r\u008d"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\7\16\u0097\n\16\f\16\16\16\u009a\13\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00a4\n\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\6\22\u00b8\n\22\r\22\16\22\u00b9\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\5\22\u00c5\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00d6\n\22\f\22\16\22\u00d9\13"+
		"\22\3\23\3\23\3\24\3\24\3\24\5\24\u00e0\n\24\3\24\3\24\3\25\3\25\3\25"+
		"\7\25\u00e7\n\25\f\25\16\25\u00ea\13\25\3\25\2\3\"\26\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(\2\6\3\2\26\32\3\2\36\37\3\2\34\35\3\2\23\24"+
		"\u00fc\2,\3\2\2\2\4\60\3\2\2\2\68\3\2\2\2\bC\3\2\2\2\nE\3\2\2\2\fN\3\2"+
		"\2\2\16V\3\2\2\2\20Y\3\2\2\2\22u\3\2\2\2\24\u0081\3\2\2\2\26\u0083\3\2"+
		"\2\2\30\u0087\3\2\2\2\32\u0092\3\2\2\2\34\u009d\3\2\2\2\36\u00a5\3\2\2"+
		"\2 \u00aa\3\2\2\2\"\u00c4\3\2\2\2$\u00da\3\2\2\2&\u00dc\3\2\2\2(\u00e3"+
		"\3\2\2\2*-\5\n\6\2+-\5\22\n\2,*\3\2\2\2,+\3\2\2\2-.\3\2\2\2.,\3\2\2\2"+
		"./\3\2\2\2/\3\3\2\2\2\60\61\5\b\5\2\61\64\7 \2\2\62\63\7\33\2\2\63\65"+
		"\5\"\22\2\64\62\3\2\2\2\64\65\3\2\2\2\65\66\3\2\2\2\66\67\7\3\2\2\67\5"+
		"\3\2\2\28<\5\b\5\29:\7\4\2\2:;\7!\2\2;=\7\5\2\2<9\3\2\2\2=>\3\2\2\2><"+
		"\3\2\2\2>?\3\2\2\2?@\3\2\2\2@A\7 \2\2AB\7\3\2\2B\7\3\2\2\2CD\t\2\2\2D"+
		"\t\3\2\2\2EF\5\b\5\2FG\7 \2\2GI\7\6\2\2HJ\5\f\7\2IH\3\2\2\2IJ\3\2\2\2"+
		"JK\3\2\2\2KL\7\7\2\2LM\5\20\t\2M\13\3\2\2\2NS\5\16\b\2OP\7\b\2\2PR\5\16"+
		"\b\2QO\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\r\3\2\2\2US\3\2\2\2VW\5"+
		"\b\5\2WX\7 \2\2X\17\3\2\2\2Y]\7\t\2\2Z\\\5\22\n\2[Z\3\2\2\2\\_\3\2\2\2"+
		"][\3\2\2\2]^\3\2\2\2^`\3\2\2\2_]\3\2\2\2`a\7\n\2\2a\21\3\2\2\2bv\5\20"+
		"\t\2cv\5\4\3\2dv\5\6\4\2ev\5\34\17\2fg\5\26\f\2gh\7\3\2\2hv\3\2\2\2ij"+
		"\5\32\16\2jk\7\3\2\2kv\3\2\2\2lm\5\30\r\2mn\7\3\2\2nv\3\2\2\2op\5&\24"+
		"\2pq\7\3\2\2qv\3\2\2\2rs\5\24\13\2st\7\3\2\2tv\3\2\2\2ub\3\2\2\2uc\3\2"+
		"\2\2ud\3\2\2\2ue\3\2\2\2uf\3\2\2\2ui\3\2\2\2ul\3\2\2\2uo\3\2\2\2ur\3\2"+
		"\2\2v\23\3\2\2\2wx\7\22\2\2xy\7\6\2\2yz\5\"\22\2z{\7\7\2\2{\u0082\3\2"+
		"\2\2|}\7\13\2\2}~\7\6\2\2~\177\5\"\22\2\177\u0080\7\7\2\2\u0080\u0082"+
		"\3\2\2\2\u0081w\3\2\2\2\u0081|\3\2\2\2\u0082\25\3\2\2\2\u0083\u0085\7"+
		"\f\2\2\u0084\u0086\5\"\22\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\27\3\2\2\2\u0087\u008b\7 \2\2\u0088\u0089\7\4\2\2\u0089\u008a\7!\2\2"+
		"\u008a\u008c\7\5\2\2\u008b\u0088\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b"+
		"\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\7\33\2\2"+
		"\u0090\u0091\5\"\22\2\u0091\31\3\2\2\2\u0092\u0093\7 \2\2\u0093\u0098"+
		"\7\33\2\2\u0094\u0095\7 \2\2\u0095\u0097\7\33\2\2\u0096\u0094\3\2\2\2"+
		"\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b"+
		"\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009c\5\"\22\2\u009c\33\3\2\2\2\u009d"+
		"\u009e\7\r\2\2\u009e\u009f\7\6\2\2\u009f\u00a0\5 \21\2\u00a0\u00a1\7\7"+
		"\2\2\u00a1\u00a3\5\20\t\2\u00a2\u00a4\5\36\20\2\u00a3\u00a2\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\35\3\2\2\2\u00a5\u00a6\7\16\2\2\u00a6\u00a7\7\t\2"+
		"\2\u00a7\u00a8\5\22\n\2\u00a8\u00a9\7\n\2\2\u00a9\37\3\2\2\2\u00aa\u00ab"+
		"\5\"\22\2\u00ab!\3\2\2\2\u00ac\u00ad\b\22\1\2\u00ad\u00ae\7\35\2\2\u00ae"+
		"\u00c5\5\"\22\17\u00af\u00b0\7\17\2\2\u00b0\u00c5\5\"\22\16\u00b1\u00c5"+
		"\5&\24\2\u00b2\u00b7\7 \2\2\u00b3\u00b4\7\4\2\2\u00b4\u00b5\5\"\22\2\u00b5"+
		"\u00b6\5$\23\2\u00b6\u00b8\3\2\2\2\u00b7\u00b3\3\2\2\2\u00b8\u00b9\3\2"+
		"\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00c5\3\2\2\2\u00bb"+
		"\u00c5\7 \2\2\u00bc\u00c5\7!\2\2\u00bd\u00c5\7\"\2\2\u00be\u00c5\7\25"+
		"\2\2\u00bf\u00c5\7#\2\2\u00c0\u00c1\7\6\2\2\u00c1\u00c2\5\"\22\2\u00c2"+
		"\u00c3\7\7\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00ac\3\2\2\2\u00c4\u00af\3\2"+
		"\2\2\u00c4\u00b1\3\2\2\2\u00c4\u00b2\3\2\2\2\u00c4\u00bb\3\2\2\2\u00c4"+
		"\u00bc\3\2\2\2\u00c4\u00bd\3\2\2\2\u00c4\u00be\3\2\2\2\u00c4\u00bf\3\2"+
		"\2\2\u00c4\u00c0\3\2\2\2\u00c5\u00d7\3\2\2\2\u00c6\u00c7\f\r\2\2\u00c7"+
		"\u00c8\t\3\2\2\u00c8\u00d6\5\"\22\16\u00c9\u00ca\f\f\2\2\u00ca\u00cb\7"+
		"\20\2\2\u00cb\u00d6\5\"\22\r\u00cc\u00cd\f\13\2\2\u00cd\u00ce\t\4\2\2"+
		"\u00ce\u00d6\5\"\22\f\u00cf\u00d0\f\n\2\2\u00d0\u00d1\t\5\2\2\u00d1\u00d6"+
		"\5\"\22\13\u00d2\u00d3\f\t\2\2\u00d3\u00d4\7\21\2\2\u00d4\u00d6\5\"\22"+
		"\n\u00d5\u00c6\3\2\2\2\u00d5\u00c9\3\2\2\2\u00d5\u00cc\3\2\2\2\u00d5\u00cf"+
		"\3\2\2\2\u00d5\u00d2\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8#\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db\7\5\2\2"+
		"\u00db%\3\2\2\2\u00dc\u00dd\7 \2\2\u00dd\u00df\7\6\2\2\u00de\u00e0\5("+
		"\25\2\u00df\u00de\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"\u00e2\7\7\2\2\u00e2\'\3\2\2\2\u00e3\u00e8\5\"\22\2\u00e4\u00e5\7\b\2"+
		"\2\u00e5\u00e7\5\"\22\2\u00e6\u00e4\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8"+
		"\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9)\3\2\2\2\u00ea\u00e8\3\2\2\2"+
		"\25,.\64>IS]u\u0081\u0085\u008d\u0098\u00a3\u00b9\u00c4\u00d5\u00d7\u00df"+
		"\u00e8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}