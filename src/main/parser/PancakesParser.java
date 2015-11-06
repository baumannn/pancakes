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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		WHILE=39, FOR=40, LINE_COMMENT=41, COMMENT=42, ID=43, CID=44, STRING=45, 
		NUMBER=46, BOOLEAN=47, WS=48;
	public static final int
		RULE_pancakes = 0, RULE_program = 1, RULE_element = 2, RULE_var_declaration = 3, 
		RULE_fun_declaration = 4, RULE_args = 5, RULE_fun_arg = 6, RULE_fun_call = 7, 
		RULE_params = 8, RULE_param = 9, RULE_class_declaration = 10, RULE_class_elements = 11, 
		RULE_loops = 12, RULE_for_loop = 13, RULE_loop_element = 14, RULE_do_while = 15, 
		RULE_while_loop = 16, RULE_conditionals = 17, RULE_expression = 18, RULE_class_instantiation = 19, 
		RULE_assignments = 20, RULE_return_statement = 21, RULE_value = 22, RULE_indexes = 23;
	public static final String[] ruleNames = {
		"pancakes", "program", "element", "var_declaration", "fun_declaration", 
		"args", "fun_arg", "fun_call", "params", "param", "class_declaration", 
		"class_elements", "loops", "for_loop", "loop_element", "do_while", "while_loop", 
		"conditionals", "expression", "class_instantiation", "assignments", "return_statement", 
		"value", "indexes"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'fun'", "';'", "'var'", "'='", "','", "'('", "')'", "'{'", "'}'", 
		"'ref'", "'.'", "'&'", "'class'", "':'", "'do'", "'if'", "'else'", "'!'", 
		"'*'", "'/'", "'//'", "'%'", "'+'", "'-'", "'>='", "'<='", "'>'", "'<'", 
		"'=='", "'!='", "'&&'", "'||'", "'new'", "'++'", "'--'", "'return'", "'['", 
		"']'", "'while'", "'for'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "WHILE", "FOR", "LINE_COMMENT", "COMMENT", "ID", "CID", 
		"STRING", "NUMBER", "BOOLEAN", "WS"
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
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			program();
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

	public static class ProgramContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__35) | (1L << WHILE) | (1L << FOR) | (1L << ID))) != 0)) {
				{
				{
				setState(50);
				element();
				}
				}
				setState(55);
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

	public static class ElementContext extends ParserRuleContext {
		public Var_declarationContext var_declaration() {
			return getRuleContext(Var_declarationContext.class,0);
		}
		public Fun_declarationContext fun_declaration() {
			return getRuleContext(Fun_declarationContext.class,0);
		}
		public Fun_callContext fun_call() {
			return getRuleContext(Fun_callContext.class,0);
		}
		public Class_declarationContext class_declaration() {
			return getRuleContext(Class_declarationContext.class,0);
		}
		public LoopsContext loops() {
			return getRuleContext(LoopsContext.class,0);
		}
		public ConditionalsContext conditionals() {
			return getRuleContext(ConditionalsContext.class,0);
		}
		public AssignmentsContext assignments() {
			return getRuleContext(AssignmentsContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_element);
		try {
			setState(67);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				var_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				match(T__0);
				setState(58);
				fun_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				fun_call();
				setState(60);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(62);
				class_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(63);
				loops();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(64);
				conditionals();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(65);
				assignments();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(66);
				return_statement();
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

	public static class Var_declarationContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PancakesParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PancakesParser.ID, i);
		}
		public List<Fun_declarationContext> fun_declaration() {
			return getRuleContexts(Fun_declarationContext.class);
		}
		public Fun_declarationContext fun_declaration(int i) {
			return getRuleContext(Fun_declarationContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Var_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).enterVar_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).exitVar_declaration(this);
		}
	}

	public final Var_declarationContext var_declaration() throws RecognitionException {
		Var_declarationContext _localctx = new Var_declarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(69);
			match(T__2);
			setState(70);
			match(ID);
			setState(77);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(71);
				match(T__3);
				setState(75);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(72);
					match(T__0);
					setState(73);
					fun_declaration();
					}
					break;
				case T__5:
				case T__17:
				case T__32:
				case ID:
				case STRING:
				case NUMBER:
				case BOOLEAN:
					{
					setState(74);
					expression(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(79);
				match(T__4);
				setState(80);
				match(ID);
				setState(87);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(81);
					match(T__3);
					setState(85);
					switch (_input.LA(1)) {
					case T__0:
						{
						setState(82);
						match(T__0);
						setState(83);
						fun_declaration();
						}
						break;
					case T__5:
					case T__17:
					case T__32:
					case ID:
					case STRING:
					case NUMBER:
					case BOOLEAN:
						{
						setState(84);
						expression(0);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
			match(T__1);
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

	public static class Fun_declarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PancakesParser.ID, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public Fun_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).enterFun_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).exitFun_declaration(this);
		}
	}

	public final Fun_declarationContext fun_declaration() throws RecognitionException {
		Fun_declarationContext _localctx = new Fun_declarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fun_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(ID);
			setState(97);
			match(T__5);
			setState(98);
			args();
			setState(99);
			match(T__6);
			setState(100);
			match(T__7);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__35) | (1L << WHILE) | (1L << FOR) | (1L << ID))) != 0)) {
				{
				{
				setState(101);
				element();
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
			match(T__8);
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

	public static class ArgsContext extends ParserRuleContext {
		public List<Fun_argContext> fun_arg() {
			return getRuleContexts(Fun_argContext.class);
		}
		public Fun_argContext fun_arg(int i) {
			return getRuleContext(Fun_argContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_args);
		int _la;
		try {
			setState(118);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__9:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(110);
				fun_arg();
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(111);
					match(T__4);
					setState(112);
					fun_arg();
					}
					}
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Fun_argContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PancakesParser.ID, 0); }
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public Fun_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).enterFun_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).exitFun_arg(this);
		}
	}

	public final Fun_argContext fun_arg() throws RecognitionException {
		Fun_argContext _localctx = new Fun_argContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fun_arg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(120);
				match(T__9);
				}
			}

			setState(123);
			match(ID);
			setState(125);
			_la = _input.LA(1);
			if (_la==T__36) {
				{
				setState(124);
				indexes();
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

	public static class Fun_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PancakesParser.ID, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public Fun_callContext fun_call() {
			return getRuleContext(Fun_callContext.class,0);
		}
		public Fun_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).enterFun_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).exitFun_call(this);
		}
	}

	public final Fun_callContext fun_call() throws RecognitionException {
		Fun_callContext _localctx = new Fun_callContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fun_call);
		int _la;
		try {
			setState(141);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(ID);
				setState(129);
				_la = _input.LA(1);
				if (_la==T__36) {
					{
					setState(128);
					indexes();
					}
				}

				setState(131);
				match(T__5);
				setState(132);
				params();
				setState(133);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				match(ID);
				setState(137);
				_la = _input.LA(1);
				if (_la==T__36) {
					{
					setState(136);
					indexes();
					}
				}

				setState(139);
				match(T__10);
				setState(140);
				fun_call();
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

	public static class ParamsContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_params);
		int _la;
		try {
			setState(152);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__5:
			case T__11:
			case T__17:
			case T__32:
			case ID:
			case STRING:
			case NUMBER:
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(144);
				param();
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(145);
					match(T__4);
					setState(146);
					param();
					}
					}
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class ParamContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ID() { return getToken(PancakesParser.ID, 0); }
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).exitParam(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_param);
		int _la;
		try {
			setState(160);
			switch (_input.LA(1)) {
			case T__5:
			case T__17:
			case T__32:
			case ID:
			case STRING:
			case NUMBER:
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				expression(0);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(T__11);
				setState(156);
				match(ID);
				setState(158);
				_la = _input.LA(1);
				if (_la==T__36) {
					{
					setState(157);
					indexes();
					}
				}

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

	public static class Class_declarationContext extends ParserRuleContext {
		public List<TerminalNode> CID() { return getTokens(PancakesParser.CID); }
		public TerminalNode CID(int i) {
			return getToken(PancakesParser.CID, i);
		}
		public List<Class_elementsContext> class_elements() {
			return getRuleContexts(Class_elementsContext.class);
		}
		public Class_elementsContext class_elements(int i) {
			return getRuleContext(Class_elementsContext.class,i);
		}
		public Class_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).enterClass_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).exitClass_declaration(this);
		}
	}

	public final Class_declarationContext class_declaration() throws RecognitionException {
		Class_declarationContext _localctx = new Class_declarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_class_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(T__12);
			setState(163);
			match(CID);
			setState(166);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(164);
				match(T__13);
				setState(165);
				match(CID);
				}
			}

			setState(168);
			match(T__7);
			setState(170); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(169);
				class_elements();
				}
				}
				setState(172); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 || _la==ID );
			setState(174);
			match(T__8);
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

	public static class Class_elementsContext extends ParserRuleContext {
		public Fun_declarationContext fun_declaration() {
			return getRuleContext(Fun_declarationContext.class,0);
		}
		public Var_declarationContext var_declaration() {
			return getRuleContext(Var_declarationContext.class,0);
		}
		public Class_elementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_elements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).enterClass_elements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).exitClass_elements(this);
		}
	}

	public final Class_elementsContext class_elements() throws RecognitionException {
		Class_elementsContext _localctx = new Class_elementsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_class_elements);
		try {
			setState(178);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				fun_declaration();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				var_declaration();
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

	public static class LoopsContext extends ParserRuleContext {
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public Do_whileContext do_while() {
			return getRuleContext(Do_whileContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public LoopsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loops; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).enterLoops(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).exitLoops(this);
		}
	}

	public final LoopsContext loops() throws RecognitionException {
		LoopsContext _localctx = new LoopsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_loops);
		try {
			setState(183);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				for_loop();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				do_while();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
				while_loop();
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

	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(PancakesParser.FOR, 0); }
		public TerminalNode ID() { return getToken(PancakesParser.ID, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(PancakesParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(PancakesParser.NUMBER, i);
		}
		public List<Loop_elementContext> loop_element() {
			return getRuleContexts(Loop_elementContext.class);
		}
		public Loop_elementContext loop_element(int i) {
			return getRuleContext(Loop_elementContext.class,i);
		}
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).exitFor_loop(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_for_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(FOR);
			setState(186);
			match(T__5);
			setState(187);
			match(ID);
			setState(188);
			match(T__1);
			setState(189);
			match(NUMBER);
			setState(190);
			match(T__1);
			setState(191);
			match(NUMBER);
			setState(192);
			match(T__6);
			setState(193);
			match(T__7);
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << WHILE) | (1L << FOR) | (1L << ID))) != 0)) {
				{
				{
				setState(194);
				loop_element();
				}
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(200);
			match(T__8);
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

	public static class Loop_elementContext extends ParserRuleContext {
		public Fun_callContext fun_call() {
			return getRuleContext(Fun_callContext.class,0);
		}
		public LoopsContext loops() {
			return getRuleContext(LoopsContext.class,0);
		}
		public ConditionalsContext conditionals() {
			return getRuleContext(ConditionalsContext.class,0);
		}
		public AssignmentsContext assignments() {
			return getRuleContext(AssignmentsContext.class,0);
		}
		public Loop_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).enterLoop_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).exitLoop_element(this);
		}
	}

	public final Loop_elementContext loop_element() throws RecognitionException {
		Loop_elementContext _localctx = new Loop_elementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_loop_element);
		try {
			setState(208);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				fun_call();
				setState(203);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				loops();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
				conditionals();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(207);
				assignments();
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

	public static class Do_whileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(PancakesParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<Loop_elementContext> loop_element() {
			return getRuleContexts(Loop_elementContext.class);
		}
		public Loop_elementContext loop_element(int i) {
			return getRuleContext(Loop_elementContext.class,i);
		}
		public Do_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).enterDo_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).exitDo_while(this);
		}
	}

	public final Do_whileContext do_while() throws RecognitionException {
		Do_whileContext _localctx = new Do_whileContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_do_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(T__14);
			setState(211);
			match(T__7);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << WHILE) | (1L << FOR) | (1L << ID))) != 0)) {
				{
				{
				setState(212);
				loop_element();
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(218);
			match(T__8);
			setState(219);
			match(WHILE);
			setState(220);
			match(T__5);
			setState(221);
			expression(0);
			setState(222);
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

	public static class While_loopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(PancakesParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<Loop_elementContext> loop_element() {
			return getRuleContexts(Loop_elementContext.class);
		}
		public Loop_elementContext loop_element(int i) {
			return getRuleContext(Loop_elementContext.class,i);
		}
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).enterWhile_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).exitWhile_loop(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_while_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(WHILE);
			setState(225);
			match(T__5);
			setState(226);
			expression(0);
			setState(227);
			match(T__6);
			setState(228);
			match(T__7);
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << WHILE) | (1L << FOR) | (1L << ID))) != 0)) {
				{
				{
				setState(229);
				loop_element();
				}
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(235);
			match(T__8);
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

	public static class ConditionalsContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<Loop_elementContext> loop_element() {
			return getRuleContexts(Loop_elementContext.class);
		}
		public Loop_elementContext loop_element(int i) {
			return getRuleContext(Loop_elementContext.class,i);
		}
		public List<Return_statementContext> return_statement() {
			return getRuleContexts(Return_statementContext.class);
		}
		public Return_statementContext return_statement(int i) {
			return getRuleContext(Return_statementContext.class,i);
		}
		public ConditionalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).enterConditionals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).exitConditionals(this);
		}
	}

	public final ConditionalsContext conditionals() throws RecognitionException {
		ConditionalsContext _localctx = new ConditionalsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_conditionals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(T__15);
			setState(238);
			match(T__5);
			setState(239);
			expression(0);
			setState(240);
			match(T__6);
			setState(241);
			match(T__7);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__35) | (1L << WHILE) | (1L << FOR) | (1L << ID))) != 0)) {
				{
				setState(244);
				switch (_input.LA(1)) {
				case T__14:
				case T__15:
				case WHILE:
				case FOR:
				case ID:
					{
					setState(242);
					loop_element();
					}
					break;
				case T__35:
					{
					setState(243);
					return_statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(249);
			match(T__8);
			setState(260);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(250);
				match(T__16);
				setState(251);
				match(T__7);
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__35) | (1L << WHILE) | (1L << FOR) | (1L << ID))) != 0)) {
					{
					setState(254);
					switch (_input.LA(1)) {
					case T__14:
					case T__15:
					case WHILE:
					case FOR:
					case ID:
						{
						setState(252);
						loop_element();
						}
						break;
					case T__35:
						{
						setState(253);
						return_statement();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(258);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(259);
				match(T__8);
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode ID() { return getToken(PancakesParser.ID, 0); }
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public Fun_callContext fun_call() {
			return getRuleContext(Fun_callContext.class,0);
		}
		public Class_instantiationContext class_instantiation() {
			return getRuleContext(Class_instantiationContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(263);
				match(T__17);
				setState(264);
				expression(20);
				}
				break;
			case 2:
				{
				setState(265);
				value();
				}
				break;
			case 3:
				{
				setState(266);
				match(ID);
				setState(268);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(267);
					indexes();
					}
					break;
				}
				}
				break;
			case 4:
				{
				setState(270);
				match(T__5);
				setState(271);
				expression(0);
				setState(272);
				match(T__6);
				}
				break;
			case 5:
				{
				setState(274);
				fun_call();
				}
				break;
			case 6:
				{
				setState(275);
				class_instantiation();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(322);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(320);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(278);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(279);
						match(T__18);
						setState(280);
						expression(20);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(281);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(282);
						match(T__19);
						setState(283);
						expression(19);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(284);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(285);
						match(T__20);
						setState(286);
						expression(18);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(287);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(288);
						match(T__21);
						setState(289);
						expression(17);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(290);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(291);
						match(T__22);
						setState(292);
						expression(16);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(293);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(294);
						match(T__23);
						setState(295);
						expression(15);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(296);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(297);
						match(T__24);
						setState(298);
						expression(14);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(299);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(300);
						match(T__25);
						setState(301);
						expression(13);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(302);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(303);
						match(T__26);
						setState(304);
						expression(12);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(305);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(306);
						match(T__27);
						setState(307);
						expression(11);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(308);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(309);
						match(T__28);
						setState(310);
						expression(10);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(311);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(312);
						match(T__29);
						setState(313);
						expression(9);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(314);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(315);
						match(T__30);
						setState(316);
						expression(8);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(317);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(318);
						match(T__31);
						setState(319);
						expression(7);
						}
						break;
					}
					} 
				}
				setState(324);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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

	public static class Class_instantiationContext extends ParserRuleContext {
		public TerminalNode CID() { return getToken(PancakesParser.CID, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public Class_instantiationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_instantiation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).enterClass_instantiation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).exitClass_instantiation(this);
		}
	}

	public final Class_instantiationContext class_instantiation() throws RecognitionException {
		Class_instantiationContext _localctx = new Class_instantiationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_class_instantiation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(T__32);
			setState(326);
			match(CID);
			setState(327);
			match(T__5);
			setState(328);
			params();
			setState(329);
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

	public static class AssignmentsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PancakesParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Fun_declarationContext fun_declaration() {
			return getRuleContext(Fun_declarationContext.class,0);
		}
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public AssignmentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).enterAssignments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).exitAssignments(this);
		}
	}

	public final AssignmentsContext assignments() throws RecognitionException {
		AssignmentsContext _localctx = new AssignmentsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assignments);
		int _la;
		try {
			setState(355);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				match(ID);
				setState(333);
				_la = _input.LA(1);
				if (_la==T__36) {
					{
					setState(332);
					indexes();
					}
				}

				setState(335);
				match(T__3);
				setState(339);
				switch (_input.LA(1)) {
				case T__5:
				case T__17:
				case T__32:
				case ID:
				case STRING:
				case NUMBER:
				case BOOLEAN:
					{
					setState(336);
					expression(0);
					}
					break;
				case T__0:
					{
					setState(337);
					match(T__0);
					setState(338);
					fun_declaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(341);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				match(ID);
				setState(345);
				_la = _input.LA(1);
				if (_la==T__36) {
					{
					setState(344);
					indexes();
					}
				}

				setState(347);
				match(T__33);
				setState(348);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(349);
				match(ID);
				setState(351);
				_la = _input.LA(1);
				if (_la==T__36) {
					{
					setState(350);
					indexes();
					}
				}

				setState(353);
				match(T__34);
				setState(354);
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

	public static class Return_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 42, RULE_return_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(T__35);
			setState(359);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__17) | (1L << T__32) | (1L << ID) | (1L << STRING) | (1L << NUMBER) | (1L << BOOLEAN))) != 0)) {
				{
				setState(358);
				expression(0);
				}
			}

			setState(361);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(PancakesParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(PancakesParser.BOOLEAN, 0); }
		public TerminalNode NUMBER() { return getToken(PancakesParser.NUMBER, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << NUMBER) | (1L << BOOLEAN))) != 0)) ) {
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

	public static class IndexesContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IndexesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).enterIndexes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PancakesListener ) ((PancakesListener)listener).exitIndexes(this);
		}
	}

	public final IndexesContext indexes() throws RecognitionException {
		IndexesContext _localctx = new IndexesContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_indexes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(369); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(365);
					match(T__36);
					setState(366);
					expression(0);
					setState(367);
					match(T__37);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(371); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		case 18:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 19);
		case 1:
			return precpred(_ctx, 18);
		case 2:
			return precpred(_ctx, 17);
		case 3:
			return precpred(_ctx, 16);
		case 4:
			return precpred(_ctx, 15);
		case 5:
			return precpred(_ctx, 14);
		case 6:
			return precpred(_ctx, 13);
		case 7:
			return precpred(_ctx, 12);
		case 8:
			return precpred(_ctx, 11);
		case 9:
			return precpred(_ctx, 10);
		case 10:
			return precpred(_ctx, 9);
		case 11:
			return precpred(_ctx, 8);
		case 12:
			return precpred(_ctx, 7);
		case 13:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\62\u0178\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\3\7\3\66\n\3\f\3\16\39\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\5\4F\n\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5N\n\5\5\5P\n\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\5\5X\n\5\5\5Z\n\5\7\5\\\n\5\f\5\16\5_\13\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\7\6i\n\6\f\6\16\6l\13\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\7\7t\n\7\f\7\16\7w\13\7\5\7y\n\7\3\b\5\b|\n\b\3\b\3\b\5\b\u0080\n\b"+
		"\3\t\3\t\5\t\u0084\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u008c\n\t\3\t\3\t\5"+
		"\t\u0090\n\t\3\n\3\n\3\n\3\n\7\n\u0096\n\n\f\n\16\n\u0099\13\n\5\n\u009b"+
		"\n\n\3\13\3\13\3\13\3\13\5\13\u00a1\n\13\5\13\u00a3\n\13\3\f\3\f\3\f\3"+
		"\f\5\f\u00a9\n\f\3\f\3\f\6\f\u00ad\n\f\r\f\16\f\u00ae\3\f\3\f\3\r\3\r"+
		"\5\r\u00b5\n\r\3\16\3\16\3\16\5\16\u00ba\n\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\7\17\u00c6\n\17\f\17\16\17\u00c9\13\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00d3\n\20\3\21\3\21\3\21\7\21"+
		"\u00d8\n\21\f\21\16\21\u00db\13\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\7\22\u00e9\n\22\f\22\16\22\u00ec\13\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00f7\n\23\f\23\16\23\u00fa"+
		"\13\23\3\23\3\23\3\23\3\23\3\23\7\23\u0101\n\23\f\23\16\23\u0104\13\23"+
		"\3\23\5\23\u0107\n\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u010f\n\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\5\24\u0117\n\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0143\n\24\f\24\16"+
		"\24\u0146\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\5\26\u0150\n\26"+
		"\3\26\3\26\3\26\3\26\5\26\u0156\n\26\3\26\3\26\3\26\3\26\5\26\u015c\n"+
		"\26\3\26\3\26\3\26\3\26\5\26\u0162\n\26\3\26\3\26\5\26\u0166\n\26\3\27"+
		"\3\27\5\27\u016a\n\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\6\31\u0174"+
		"\n\31\r\31\16\31\u0175\3\31\2\3&\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\2\3\3\2/\61\u01a4\2\62\3\2\2\2\4\67\3\2\2\2\6E\3\2\2\2"+
		"\bG\3\2\2\2\nb\3\2\2\2\fx\3\2\2\2\16{\3\2\2\2\20\u008f\3\2\2\2\22\u009a"+
		"\3\2\2\2\24\u00a2\3\2\2\2\26\u00a4\3\2\2\2\30\u00b4\3\2\2\2\32\u00b9\3"+
		"\2\2\2\34\u00bb\3\2\2\2\36\u00d2\3\2\2\2 \u00d4\3\2\2\2\"\u00e2\3\2\2"+
		"\2$\u00ef\3\2\2\2&\u0116\3\2\2\2(\u0147\3\2\2\2*\u0165\3\2\2\2,\u0167"+
		"\3\2\2\2.\u016d\3\2\2\2\60\u0173\3\2\2\2\62\63\5\4\3\2\63\3\3\2\2\2\64"+
		"\66\5\6\4\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\5\3\2"+
		"\2\29\67\3\2\2\2:F\5\b\5\2;<\7\3\2\2<F\5\n\6\2=>\5\20\t\2>?\7\4\2\2?F"+
		"\3\2\2\2@F\5\26\f\2AF\5\32\16\2BF\5$\23\2CF\5*\26\2DF\5,\27\2E:\3\2\2"+
		"\2E;\3\2\2\2E=\3\2\2\2E@\3\2\2\2EA\3\2\2\2EB\3\2\2\2EC\3\2\2\2ED\3\2\2"+
		"\2F\7\3\2\2\2GH\7\5\2\2HO\7-\2\2IM\7\6\2\2JK\7\3\2\2KN\5\n\6\2LN\5&\24"+
		"\2MJ\3\2\2\2ML\3\2\2\2NP\3\2\2\2OI\3\2\2\2OP\3\2\2\2P]\3\2\2\2QR\7\7\2"+
		"\2RY\7-\2\2SW\7\6\2\2TU\7\3\2\2UX\5\n\6\2VX\5&\24\2WT\3\2\2\2WV\3\2\2"+
		"\2XZ\3\2\2\2YS\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Q\3\2\2\2\\_\3\2\2\2][\3\2"+
		"\2\2]^\3\2\2\2^`\3\2\2\2_]\3\2\2\2`a\7\4\2\2a\t\3\2\2\2bc\7-\2\2cd\7\b"+
		"\2\2de\5\f\7\2ef\7\t\2\2fj\7\n\2\2gi\5\6\4\2hg\3\2\2\2il\3\2\2\2jh\3\2"+
		"\2\2jk\3\2\2\2km\3\2\2\2lj\3\2\2\2mn\7\13\2\2n\13\3\2\2\2oy\3\2\2\2pu"+
		"\5\16\b\2qr\7\7\2\2rt\5\16\b\2sq\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2"+
		"vy\3\2\2\2wu\3\2\2\2xo\3\2\2\2xp\3\2\2\2y\r\3\2\2\2z|\7\f\2\2{z\3\2\2"+
		"\2{|\3\2\2\2|}\3\2\2\2}\177\7-\2\2~\u0080\5\60\31\2\177~\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080\17\3\2\2\2\u0081\u0083\7-\2\2\u0082\u0084\5\60\31\2\u0083"+
		"\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\7\b"+
		"\2\2\u0086\u0087\5\22\n\2\u0087\u0088\7\t\2\2\u0088\u0090\3\2\2\2\u0089"+
		"\u008b\7-\2\2\u008a\u008c\5\60\31\2\u008b\u008a\3\2\2\2\u008b\u008c\3"+
		"\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\7\r\2\2\u008e\u0090\5\20\t\2\u008f"+
		"\u0081\3\2\2\2\u008f\u0089\3\2\2\2\u0090\21\3\2\2\2\u0091\u009b\3\2\2"+
		"\2\u0092\u0097\5\24\13\2\u0093\u0094\7\7\2\2\u0094\u0096\5\24\13\2\u0095"+
		"\u0093\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2"+
		"\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u0091\3\2\2\2\u009a"+
		"\u0092\3\2\2\2\u009b\23\3\2\2\2\u009c\u00a3\5&\24\2\u009d\u009e\7\16\2"+
		"\2\u009e\u00a0\7-\2\2\u009f\u00a1\5\60\31\2\u00a0\u009f\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u009c\3\2\2\2\u00a2\u009d\3\2"+
		"\2\2\u00a3\25\3\2\2\2\u00a4\u00a5\7\17\2\2\u00a5\u00a8\7.\2\2\u00a6\u00a7"+
		"\7\20\2\2\u00a7\u00a9\7.\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\u00ac\7\n\2\2\u00ab\u00ad\5\30\r\2\u00ac\u00ab\3"+
		"\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00b1\7\13\2\2\u00b1\27\3\2\2\2\u00b2\u00b5\5\n\6"+
		"\2\u00b3\u00b5\5\b\5\2\u00b4\u00b2\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\31"+
		"\3\2\2\2\u00b6\u00ba\5\34\17\2\u00b7\u00ba\5 \21\2\u00b8\u00ba\5\"\22"+
		"\2\u00b9\u00b6\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\33"+
		"\3\2\2\2\u00bb\u00bc\7*\2\2\u00bc\u00bd\7\b\2\2\u00bd\u00be\7-\2\2\u00be"+
		"\u00bf\7\4\2\2\u00bf\u00c0\7\60\2\2\u00c0\u00c1\7\4\2\2\u00c1\u00c2\7"+
		"\60\2\2\u00c2\u00c3\7\t\2\2\u00c3\u00c7\7\n\2\2\u00c4\u00c6\5\36\20\2"+
		"\u00c5\u00c4\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8"+
		"\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cb\7\13\2\2"+
		"\u00cb\35\3\2\2\2\u00cc\u00cd\5\20\t\2\u00cd\u00ce\7\4\2\2\u00ce\u00d3"+
		"\3\2\2\2\u00cf\u00d3\5\32\16\2\u00d0\u00d3\5$\23\2\u00d1\u00d3\5*\26\2"+
		"\u00d2\u00cc\3\2\2\2\u00d2\u00cf\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d1"+
		"\3\2\2\2\u00d3\37\3\2\2\2\u00d4\u00d5\7\21\2\2\u00d5\u00d9\7\n\2\2\u00d6"+
		"\u00d8\5\36\20\2\u00d7\u00d6\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3"+
		"\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc"+
		"\u00dd\7\13\2\2\u00dd\u00de\7)\2\2\u00de\u00df\7\b\2\2\u00df\u00e0\5&"+
		"\24\2\u00e0\u00e1\7\t\2\2\u00e1!\3\2\2\2\u00e2\u00e3\7)\2\2\u00e3\u00e4"+
		"\7\b\2\2\u00e4\u00e5\5&\24\2\u00e5\u00e6\7\t\2\2\u00e6\u00ea\7\n\2\2\u00e7"+
		"\u00e9\5\36\20\2\u00e8\u00e7\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3"+
		"\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed"+
		"\u00ee\7\13\2\2\u00ee#\3\2\2\2\u00ef\u00f0\7\22\2\2\u00f0\u00f1\7\b\2"+
		"\2\u00f1\u00f2\5&\24\2\u00f2\u00f3\7\t\2\2\u00f3\u00f8\7\n\2\2\u00f4\u00f7"+
		"\5\36\20\2\u00f5\u00f7\5,\27\2\u00f6\u00f4\3\2\2\2\u00f6\u00f5\3\2\2\2"+
		"\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb"+
		"\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u0106\7\13\2\2\u00fc\u00fd\7\23\2\2"+
		"\u00fd\u0102\7\n\2\2\u00fe\u0101\5\36\20\2\u00ff\u0101\5,\27\2\u0100\u00fe"+
		"\3\2\2\2\u0100\u00ff\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102"+
		"\u0103\3\2\2\2\u0103\u0105\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0107\7\13"+
		"\2\2\u0106\u00fc\3\2\2\2\u0106\u0107\3\2\2\2\u0107%\3\2\2\2\u0108\u0109"+
		"\b\24\1\2\u0109\u010a\7\24\2\2\u010a\u0117\5&\24\26\u010b\u0117\5.\30"+
		"\2\u010c\u010e\7-\2\2\u010d\u010f\5\60\31\2\u010e\u010d\3\2\2\2\u010e"+
		"\u010f\3\2\2\2\u010f\u0117\3\2\2\2\u0110\u0111\7\b\2\2\u0111\u0112\5&"+
		"\24\2\u0112\u0113\7\t\2\2\u0113\u0117\3\2\2\2\u0114\u0117\5\20\t\2\u0115"+
		"\u0117\5(\25\2\u0116\u0108\3\2\2\2\u0116\u010b\3\2\2\2\u0116\u010c\3\2"+
		"\2\2\u0116\u0110\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0115\3\2\2\2\u0117"+
		"\u0144\3\2\2\2\u0118\u0119\f\25\2\2\u0119\u011a\7\25\2\2\u011a\u0143\5"+
		"&\24\26\u011b\u011c\f\24\2\2\u011c\u011d\7\26\2\2\u011d\u0143\5&\24\25"+
		"\u011e\u011f\f\23\2\2\u011f\u0120\7\27\2\2\u0120\u0143\5&\24\24\u0121"+
		"\u0122\f\22\2\2\u0122\u0123\7\30\2\2\u0123\u0143\5&\24\23\u0124\u0125"+
		"\f\21\2\2\u0125\u0126\7\31\2\2\u0126\u0143\5&\24\22\u0127\u0128\f\20\2"+
		"\2\u0128\u0129\7\32\2\2\u0129\u0143\5&\24\21\u012a\u012b\f\17\2\2\u012b"+
		"\u012c\7\33\2\2\u012c\u0143\5&\24\20\u012d\u012e\f\16\2\2\u012e\u012f"+
		"\7\34\2\2\u012f\u0143\5&\24\17\u0130\u0131\f\r\2\2\u0131\u0132\7\35\2"+
		"\2\u0132\u0143\5&\24\16\u0133\u0134\f\f\2\2\u0134\u0135\7\36\2\2\u0135"+
		"\u0143\5&\24\r\u0136\u0137\f\13\2\2\u0137\u0138\7\37\2\2\u0138\u0143\5"+
		"&\24\f\u0139\u013a\f\n\2\2\u013a\u013b\7 \2\2\u013b\u0143\5&\24\13\u013c"+
		"\u013d\f\t\2\2\u013d\u013e\7!\2\2\u013e\u0143\5&\24\n\u013f\u0140\f\b"+
		"\2\2\u0140\u0141\7\"\2\2\u0141\u0143\5&\24\t\u0142\u0118\3\2\2\2\u0142"+
		"\u011b\3\2\2\2\u0142\u011e\3\2\2\2\u0142\u0121\3\2\2\2\u0142\u0124\3\2"+
		"\2\2\u0142\u0127\3\2\2\2\u0142\u012a\3\2\2\2\u0142\u012d\3\2\2\2\u0142"+
		"\u0130\3\2\2\2\u0142\u0133\3\2\2\2\u0142\u0136\3\2\2\2\u0142\u0139\3\2"+
		"\2\2\u0142\u013c\3\2\2\2\u0142\u013f\3\2\2\2\u0143\u0146\3\2\2\2\u0144"+
		"\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\'\3\2\2\2\u0146\u0144\3\2\2\2"+
		"\u0147\u0148\7#\2\2\u0148\u0149\7.\2\2\u0149\u014a\7\b\2\2\u014a\u014b"+
		"\5\22\n\2\u014b\u014c\7\t\2\2\u014c)\3\2\2\2\u014d\u014f\7-\2\2\u014e"+
		"\u0150\5\60\31\2\u014f\u014e\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\3"+
		"\2\2\2\u0151\u0155\7\6\2\2\u0152\u0156\5&\24\2\u0153\u0154\7\3\2\2\u0154"+
		"\u0156\5\n\6\2\u0155\u0152\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u0157\3\2"+
		"\2\2\u0157\u0158\7\4\2\2\u0158\u0166\3\2\2\2\u0159\u015b\7-\2\2\u015a"+
		"\u015c\5\60\31\2\u015b\u015a\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\3"+
		"\2\2\2\u015d\u015e\7$\2\2\u015e\u0166\7\4\2\2\u015f\u0161\7-\2\2\u0160"+
		"\u0162\5\60\31\2\u0161\u0160\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163\3"+
		"\2\2\2\u0163\u0164\7%\2\2\u0164\u0166\7\4\2\2\u0165\u014d\3\2\2\2\u0165"+
		"\u0159\3\2\2\2\u0165\u015f\3\2\2\2\u0166+\3\2\2\2\u0167\u0169\7&\2\2\u0168"+
		"\u016a\5&\24\2\u0169\u0168\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016b\3\2"+
		"\2\2\u016b\u016c\7\4\2\2\u016c-\3\2\2\2\u016d\u016e\t\2\2\2\u016e/\3\2"+
		"\2\2\u016f\u0170\7\'\2\2\u0170\u0171\5&\24\2\u0171\u0172\7(\2\2\u0172"+
		"\u0174\3\2\2\2\u0173\u016f\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0173\3\2"+
		"\2\2\u0175\u0176\3\2\2\2\u0176\61\3\2\2\2-\67EMOWY]jux{\177\u0083\u008b"+
		"\u008f\u0097\u009a\u00a0\u00a2\u00a8\u00ae\u00b4\u00b9\u00c7\u00d2\u00d9"+
		"\u00ea\u00f6\u00f8\u0100\u0102\u0106\u010e\u0116\u0142\u0144\u014f\u0155"+
		"\u015b\u0161\u0165\u0169\u0175";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}