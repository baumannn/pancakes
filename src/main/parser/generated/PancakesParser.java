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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, BOOLEAN=15, T_FLOAT=16, 
		T_INT=17, T_BOOL=18, T_STRING=19, T_VOID=20, EQUAL=21, ADD=22, MINUS=23, 
		MULT=24, DIV=25, ID=26, INT=27, FLOAT=28, STRING=29, WS=30, SL_COMMENT=31;
	public static final int
		RULE_pancakes = 0, RULE_var_declare = 1, RULE_type = 2, RULE_fun_declare = 3, 
		RULE_fun_params = 4, RULE_fun_param = 5, RULE_block = 6, RULE_statement = 7, 
		RULE_return_statement = 8, RULE_assignment = 9, RULE_if_statement = 10, 
		RULE_else_statement = 11, RULE_if_expr = 12, RULE_expr = 13, RULE_arguments = 14;
	public static final String[] ruleNames = {
		"pancakes", "var_declare", "type", "fun_declare", "fun_params", "fun_param", 
		"block", "statement", "return_statement", "assignment", "if_statement", 
		"else_statement", "if_expr", "expr", "arguments"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'('", "')'", "','", "'{'", "'}'", "'return'", "'if'", "'else'", 
		"'['", "']'", "'!'", "'//'", "'=='", null, "'float'", "'int'", "'boolean'", 
		"'string'", "'void'", "'='", "'+'", "'-'", "'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "BOOLEAN", "T_FLOAT", "T_INT", "T_BOOL", "T_STRING", 
		"T_VOID", "EQUAL", "ADD", "MINUS", "MULT", "DIV", "ID", "INT", "FLOAT", 
		"STRING", "WS", "SL_COMMENT"
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
			setState(32); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(32);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(30);
					fun_declare();
					}
					break;
				case 2:
					{
					setState(31);
					var_declare();
					}
					break;
				}
				}
				setState(34); 
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
			setState(36);
			type();
			setState(37);
			match(ID);
			setState(40);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(38);
				match(EQUAL);
				setState(39);
				expr(0);
				}
			}

			setState(42);
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
			setState(44);
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
			setState(46);
			type();
			setState(47);
			match(ID);
			setState(48);
			match(T__1);
			setState(50);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_FLOAT) | (1L << T_INT) | (1L << T_BOOL) | (1L << T_STRING) | (1L << T_VOID))) != 0)) {
				{
				setState(49);
				fun_params();
				}
			}

			setState(52);
			match(T__2);
			setState(53);
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
			setState(55);
			fun_param();
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(56);
				match(T__3);
				setState(57);
				fun_param();
				}
				}
				setState(62);
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
			setState(63);
			type();
			setState(64);
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
			setState(66);
			match(T__4);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__11) | (1L << BOOLEAN) | (1L << T_FLOAT) | (1L << T_INT) | (1L << T_BOOL) | (1L << T_STRING) | (1L << T_VOID) | (1L << MINUS) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				{
				setState(67);
				statement();
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
			setState(87);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				var_declare();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				if_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(78);
				return_statement();
				setState(79);
				match(T__0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(81);
				assignment();
				setState(82);
				match(T__0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(84);
				expr(0);
				setState(85);
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
		enterRule(_localctx, 16, RULE_return_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(T__6);
			setState(91);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__11) | (1L << BOOLEAN) | (1L << MINUS) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				setState(90);
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
		enterRule(_localctx, 18, RULE_assignment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(ID);
			setState(94);
			match(EQUAL);
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(95);
					match(ID);
					setState(96);
					match(EQUAL);
					}
					} 
				}
				setState(101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(102);
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
		enterRule(_localctx, 20, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(T__7);
			setState(105);
			match(T__1);
			setState(106);
			if_expr();
			setState(107);
			match(T__2);
			setState(108);
			match(T__4);
			setState(109);
			statement();
			setState(110);
			match(T__5);
			setState(112);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(111);
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
		enterRule(_localctx, 22, RULE_else_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__8);
			setState(115);
			match(T__4);
			setState(116);
			statement();
			setState(117);
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
		enterRule(_localctx, 24, RULE_if_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryNegateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(122);
				match(MINUS);
				setState(123);
				expr(12);
				}
				break;
			case 2:
				{
				_localctx = new UnaryNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(124);
				match(T__11);
				setState(125);
				expr(11);
				}
				break;
			case 3:
				{
				_localctx = new FunCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(126);
				match(ID);
				setState(127);
				match(T__1);
				setState(129);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__11) | (1L << BOOLEAN) | (1L << MINUS) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
					{
					setState(128);
					arguments();
					}
				}

				setState(131);
				match(T__2);
				}
				break;
			case 4:
				{
				_localctx = new ArrayIndexContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(132);
				match(ID);
				setState(133);
				match(T__9);
				setState(134);
				expr(0);
				setState(135);
				match(T__10);
				}
				break;
			case 5:
				{
				_localctx = new VarRefContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(137);
				match(ID);
				}
				break;
			case 6:
				{
				_localctx = new IntConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(138);
				match(INT);
				}
				break;
			case 7:
				{
				_localctx = new FloatConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(139);
				match(FLOAT);
				}
				break;
			case 8:
				{
				_localctx = new BoolConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(140);
				match(BOOLEAN);
				}
				break;
			case 9:
				{
				_localctx = new StringConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(141);
				match(STRING);
				}
				break;
			case 10:
				{
				_localctx = new ParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(142);
				match(T__1);
				setState(143);
				expr(0);
				setState(144);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(162);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(160);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(148);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(149);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(150);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new IntdivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(151);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						{
						setState(152);
						match(T__12);
						}
						setState(153);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(154);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(155);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(156);
						expr(9);
						}
						break;
					case 4:
						{
						_localctx = new EqualityContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(157);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(158);
						match(T__13);
						setState(159);
						expr(8);
						}
						break;
					}
					} 
				}
				setState(164);
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
		enterRule(_localctx, 28, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			expr(0);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(166);
				match(T__3);
				setState(167);
				expr(0);
				}
				}
				setState(172);
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
		case 13:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3!\u00b0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\6\2#\n\2\r\2"+
		"\16\2$\3\3\3\3\3\3\3\3\5\3+\n\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\5\5\65"+
		"\n\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6=\n\6\f\6\16\6@\13\6\3\7\3\7\3\7\3\b\3"+
		"\b\7\bG\n\b\f\b\16\bJ\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\tZ\n\t\3\n\3\n\5\n^\n\n\3\13\3\13\3\13\3\13\7\13d\n\13"+
		"\f\13\16\13g\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fs\n\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u0084\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u0095\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\7\17\u00a3\n\17\f\17\16\17\u00a6\13\17\3\20"+
		"\3\20\3\20\7\20\u00ab\n\20\f\20\16\20\u00ae\13\20\3\20\2\3\34\21\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36\2\5\3\2\22\26\3\2\32\33\3\2\30\31\u00bd"+
		"\2\"\3\2\2\2\4&\3\2\2\2\6.\3\2\2\2\b\60\3\2\2\2\n9\3\2\2\2\fA\3\2\2\2"+
		"\16D\3\2\2\2\20Y\3\2\2\2\22[\3\2\2\2\24_\3\2\2\2\26j\3\2\2\2\30t\3\2\2"+
		"\2\32y\3\2\2\2\34\u0094\3\2\2\2\36\u00a7\3\2\2\2 #\5\b\5\2!#\5\4\3\2\""+
		" \3\2\2\2\"!\3\2\2\2#$\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\3\3\2\2\2&\'\5\6"+
		"\4\2\'*\7\34\2\2()\7\27\2\2)+\5\34\17\2*(\3\2\2\2*+\3\2\2\2+,\3\2\2\2"+
		",-\7\3\2\2-\5\3\2\2\2./\t\2\2\2/\7\3\2\2\2\60\61\5\6\4\2\61\62\7\34\2"+
		"\2\62\64\7\4\2\2\63\65\5\n\6\2\64\63\3\2\2\2\64\65\3\2\2\2\65\66\3\2\2"+
		"\2\66\67\7\5\2\2\678\5\16\b\28\t\3\2\2\29>\5\f\7\2:;\7\6\2\2;=\5\f\7\2"+
		"<:\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?\13\3\2\2\2@>\3\2\2\2AB\5\6\4"+
		"\2BC\7\34\2\2C\r\3\2\2\2DH\7\7\2\2EG\5\20\t\2FE\3\2\2\2GJ\3\2\2\2HF\3"+
		"\2\2\2HI\3\2\2\2IK\3\2\2\2JH\3\2\2\2KL\7\b\2\2L\17\3\2\2\2MZ\5\16\b\2"+
		"NZ\5\4\3\2OZ\5\26\f\2PQ\5\22\n\2QR\7\3\2\2RZ\3\2\2\2ST\5\24\13\2TU\7\3"+
		"\2\2UZ\3\2\2\2VW\5\34\17\2WX\7\3\2\2XZ\3\2\2\2YM\3\2\2\2YN\3\2\2\2YO\3"+
		"\2\2\2YP\3\2\2\2YS\3\2\2\2YV\3\2\2\2Z\21\3\2\2\2[]\7\t\2\2\\^\5\34\17"+
		"\2]\\\3\2\2\2]^\3\2\2\2^\23\3\2\2\2_`\7\34\2\2`e\7\27\2\2ab\7\34\2\2b"+
		"d\7\27\2\2ca\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2"+
		"hi\5\34\17\2i\25\3\2\2\2jk\7\n\2\2kl\7\4\2\2lm\5\32\16\2mn\7\5\2\2no\7"+
		"\7\2\2op\5\20\t\2pr\7\b\2\2qs\5\30\r\2rq\3\2\2\2rs\3\2\2\2s\27\3\2\2\2"+
		"tu\7\13\2\2uv\7\7\2\2vw\5\20\t\2wx\7\b\2\2x\31\3\2\2\2yz\5\34\17\2z\33"+
		"\3\2\2\2{|\b\17\1\2|}\7\31\2\2}\u0095\5\34\17\16~\177\7\16\2\2\177\u0095"+
		"\5\34\17\r\u0080\u0081\7\34\2\2\u0081\u0083\7\4\2\2\u0082\u0084\5\36\20"+
		"\2\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0095"+
		"\7\5\2\2\u0086\u0087\7\34\2\2\u0087\u0088\7\f\2\2\u0088\u0089\5\34\17"+
		"\2\u0089\u008a\7\r\2\2\u008a\u0095\3\2\2\2\u008b\u0095\7\34\2\2\u008c"+
		"\u0095\7\35\2\2\u008d\u0095\7\36\2\2\u008e\u0095\7\21\2\2\u008f\u0095"+
		"\7\37\2\2\u0090\u0091\7\4\2\2\u0091\u0092\5\34\17\2\u0092\u0093\7\5\2"+
		"\2\u0093\u0095\3\2\2\2\u0094{\3\2\2\2\u0094~\3\2\2\2\u0094\u0080\3\2\2"+
		"\2\u0094\u0086\3\2\2\2\u0094\u008b\3\2\2\2\u0094\u008c\3\2\2\2\u0094\u008d"+
		"\3\2\2\2\u0094\u008e\3\2\2\2\u0094\u008f\3\2\2\2\u0094\u0090\3\2\2\2\u0095"+
		"\u00a4\3\2\2\2\u0096\u0097\f\f\2\2\u0097\u0098\t\3\2\2\u0098\u00a3\5\34"+
		"\17\r\u0099\u009a\f\13\2\2\u009a\u009b\7\17\2\2\u009b\u00a3\5\34\17\f"+
		"\u009c\u009d\f\n\2\2\u009d\u009e\t\4\2\2\u009e\u00a3\5\34\17\13\u009f"+
		"\u00a0\f\t\2\2\u00a0\u00a1\7\20\2\2\u00a1\u00a3\5\34\17\n\u00a2\u0096"+
		"\3\2\2\2\u00a2\u0099\3\2\2\2\u00a2\u009c\3\2\2\2\u00a2\u009f\3\2\2\2\u00a3"+
		"\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\35\3\2\2"+
		"\2\u00a6\u00a4\3\2\2\2\u00a7\u00ac\5\34\17\2\u00a8\u00a9\7\6\2\2\u00a9"+
		"\u00ab\5\34\17\2\u00aa\u00a8\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3"+
		"\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\37\3\2\2\2\u00ae\u00ac\3\2\2\2\21\"$"+
		"*\64>HY]er\u0083\u0094\u00a2\u00a4\u00ac";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}