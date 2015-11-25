// Generated from src/grammar/Pancakes.g4 by ANTLR 4.5.1
 
  package main.parser; 

import main.parser.generated.PancakesListener;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, WHILE=37, FOR=38, LINE_COMMENT=39, 
		COMMENT=40, ID=41, CID=42, STRING=43, NUMBER=44, BOOLEAN=45, WS=46;
	public static final int
		RULE_pancakes = 0, RULE_program = 1, RULE_element = 2, RULE_var_declaration = 3, 
		RULE_fun_declaration = 4, RULE_args = 5, RULE_fun_arg = 6, RULE_fun_call = 7, 
		RULE_params = 8, RULE_param = 9, RULE_class_declaration = 10, RULE_class_elements = 11, 
		RULE_loops = 12, RULE_for_loop = 13, RULE_loop_element = 14, RULE_do_while = 15, 
		RULE_while_loop = 16, RULE_conditionals = 17, RULE_expression = 18, RULE_class_instantiation = 19, 
		RULE_assignments = 20, RULE_return_statement = 21, RULE_value = 22;
	public static final String[] ruleNames = {
		"pancakes", "program", "element", "var_declaration", "fun_declaration", 
		"args", "fun_arg", "fun_call", "params", "param", "class_declaration", 
		"class_elements", "loops", "for_loop", "loop_element", "do_while", "while_loop", 
		"conditionals", "expression", "class_instantiation", "assignments", "return_statement", 
		"value"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'fun'", "';'", "'var'", "'='", "','", "'('", "')'", "'{'", "'}'", 
		"'ref'", "'.'", "'&'", "'class'", "':'", "'do'", "'if'", "'else'", "'!'", 
		"'*'", "'/'", "'//'", "'%'", "'+'", "'-'", "'>='", "'<='", "'>'", "'<'", 
		"'=='", "'!='", "'&&'", "'||'", "'new'", "'++'", "'--'", "'return'", "'while'", 
		"'for'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "WHILE", "FOR", "LINE_COMMENT", "COMMENT", "ID", "CID", "STRING", 
		"NUMBER", "BOOLEAN", "WS"
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
			if ( listener instanceof PancakesListener) ((PancakesListener)listener).enterPancakes(this);
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
			setState(46);
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
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__35) | (1L << WHILE) | (1L << FOR) | (1L << ID))) != 0)) {
				{
				{
				setState(48);
				element();
				}
				}
				setState(53);
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
			setState(65);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				var_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				match(T__0);
				setState(56);
				fun_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				fun_call();
				setState(58);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(60);
				class_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(61);
				loops();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(62);
				conditionals();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(63);
				assignments();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(64);
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
			setState(67);
			match(T__2);
			setState(68);
			match(ID);
			setState(75);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(69);
				match(T__3);
				setState(73);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(70);
					match(T__0);
					setState(71);
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
					setState(72);
					expression(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(77);
				match(T__4);
				setState(78);
				match(ID);
				setState(85);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(79);
					match(T__3);
					setState(83);
					switch (_input.LA(1)) {
					case T__0:
						{
						setState(80);
						match(T__0);
						setState(81);
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
						setState(82);
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
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
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
			setState(94);
			match(ID);
			setState(95);
			match(T__5);
			setState(96);
			args();
			setState(97);
			match(T__6);
			setState(98);
			match(T__7);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__35) | (1L << WHILE) | (1L << FOR) | (1L << ID))) != 0)) {
				{
				{
				setState(99);
				element();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
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
			setState(116);
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
				setState(108);
				fun_arg();
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(109);
					match(T__4);
					setState(110);
					fun_arg();
					}
					}
					setState(115);
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
			setState(119);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(118);
				match(T__9);
				}
			}

			setState(121);
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

	public static class Fun_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PancakesParser.ID, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
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
		try {
			setState(131);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				match(ID);
				setState(124);
				match(T__5);
				setState(125);
				params();
				setState(126);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(ID);
				setState(129);
				match(T__10);
				setState(130);
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
			setState(142);
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
				setState(134);
				param();
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(135);
					match(T__4);
					setState(136);
					param();
					}
					}
					setState(141);
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
		try {
			setState(147);
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
				setState(144);
				expression(0);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				match(T__11);
				setState(146);
				match(ID);
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
			setState(149);
			match(T__12);
			setState(150);
			match(CID);
			setState(153);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(151);
				match(T__13);
				setState(152);
				match(CID);
				}
			}

			setState(155);
			match(T__7);
			setState(157); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(156);
				class_elements();
				}
				}
				setState(159); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 || _la==ID );
			setState(161);
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
			setState(165);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				fun_declaration();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
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
			setState(170);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				for_loop();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				do_while();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
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
			setState(172);
			match(FOR);
			setState(173);
			match(T__5);
			setState(174);
			match(ID);
			setState(175);
			match(T__1);
			setState(176);
			match(NUMBER);
			setState(177);
			match(T__1);
			setState(178);
			match(NUMBER);
			setState(179);
			match(T__6);
			setState(180);
			match(T__7);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << WHILE) | (1L << FOR) | (1L << ID))) != 0)) {
				{
				{
				setState(181);
				loop_element();
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(187);
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
			setState(195);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				fun_call();
				setState(190);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				loops();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(193);
				conditionals();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(194);
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
			setState(197);
			match(T__14);
			setState(198);
			match(T__7);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << WHILE) | (1L << FOR) | (1L << ID))) != 0)) {
				{
				{
				setState(199);
				loop_element();
				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(205);
			match(T__8);
			setState(206);
			match(WHILE);
			setState(207);
			match(T__5);
			setState(208);
			expression(0);
			setState(209);
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
			setState(211);
			match(WHILE);
			setState(212);
			match(T__5);
			setState(213);
			expression(0);
			setState(214);
			match(T__6);
			setState(215);
			match(T__7);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << WHILE) | (1L << FOR) | (1L << ID))) != 0)) {
				{
				{
				setState(216);
				loop_element();
				}
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(222);
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
			setState(224);
			match(T__15);
			setState(225);
			match(T__5);
			setState(226);
			expression(0);
			setState(227);
			match(T__6);
			setState(228);
			match(T__7);
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__35) | (1L << WHILE) | (1L << FOR) | (1L << ID))) != 0)) {
				{
				setState(231);
				switch (_input.LA(1)) {
				case T__14:
				case T__15:
				case WHILE:
				case FOR:
				case ID:
					{
					setState(229);
					loop_element();
					}
					break;
				case T__35:
					{
					setState(230);
					return_statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(236);
			match(T__8);
			setState(247);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(237);
				match(T__16);
				setState(238);
				match(T__7);
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__35) | (1L << WHILE) | (1L << FOR) | (1L << ID))) != 0)) {
					{
					setState(241);
					switch (_input.LA(1)) {
					case T__14:
					case T__15:
					case WHILE:
					case FOR:
					case ID:
						{
						setState(239);
						loop_element();
						}
						break;
					case T__35:
						{
						setState(240);
						return_statement();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(245);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(246);
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
			setState(260);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(250);
				match(T__17);
				setState(251);
				expression(20);
				}
				break;
			case 2:
				{
				setState(252);
				value();
				}
				break;
			case 3:
				{
				setState(253);
				match(ID);
				}
				break;
			case 4:
				{
				setState(254);
				match(T__5);
				setState(255);
				expression(0);
				setState(256);
				match(T__6);
				}
				break;
			case 5:
				{
				setState(258);
				fun_call();
				}
				break;
			case 6:
				{
				setState(259);
				class_instantiation();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(306);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(304);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(262);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(263);
						match(T__18);
						setState(264);
						expression(20);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(265);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(266);
						match(T__19);
						setState(267);
						expression(19);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(268);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(269);
						match(T__20);
						setState(270);
						expression(18);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(271);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(272);
						match(T__21);
						setState(273);
						expression(17);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(274);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(275);
						match(T__22);
						setState(276);
						expression(16);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(277);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(278);
						match(T__23);
						setState(279);
						expression(15);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(280);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(281);
						match(T__24);
						setState(282);
						expression(14);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(283);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(284);
						match(T__25);
						setState(285);
						expression(13);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(286);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(287);
						match(T__26);
						setState(288);
						expression(12);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(289);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(290);
						match(T__27);
						setState(291);
						expression(11);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(292);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(293);
						match(T__28);
						setState(294);
						expression(10);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(295);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(296);
						match(T__29);
						setState(297);
						expression(9);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(298);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(299);
						match(T__30);
						setState(300);
						expression(8);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(301);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(302);
						match(T__31);
						setState(303);
						expression(7);
						}
						break;
					}
					} 
				}
				setState(308);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
			setState(309);
			match(T__32);
			setState(310);
			match(CID);
			setState(311);
			match(T__5);
			setState(312);
			params();
			setState(313);
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
		try {
			setState(330);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				match(ID);
				setState(316);
				match(T__3);
				setState(320);
				switch (_input.LA(1)) {
				case T__5:
				case T__17:
				case T__32:
				case ID:
				case STRING:
				case NUMBER:
				case BOOLEAN:
					{
					setState(317);
					expression(0);
					}
					break;
				case T__0:
					{
					setState(318);
					match(T__0);
					setState(319);
					fun_declaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(322);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				match(ID);
				setState(325);
				match(T__33);
				setState(326);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(327);
				match(ID);
				setState(328);
				match(T__34);
				setState(329);
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
			setState(332);
			match(T__35);
			setState(334);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__17) | (1L << T__32) | (1L << ID) | (1L << STRING) | (1L << NUMBER) | (1L << BOOLEAN))) != 0)) {
				{
				setState(333);
				expression(0);
				}
			}

			setState(336);
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
			setState(338);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\60\u0157\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\3\7\3\64\n\3\f\3\16\3\67\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\4D\n\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5L\n\5\5\5N\n\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\5\5V\n\5\5\5X\n\5\7\5Z\n\5\f\5\16\5]\13\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\7\6g\n\6\f\6\16\6j\13\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7r\n"+
		"\7\f\7\16\7u\13\7\5\7w\n\7\3\b\5\bz\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\t\u0086\n\t\3\n\3\n\3\n\3\n\7\n\u008c\n\n\f\n\16\n\u008f"+
		"\13\n\5\n\u0091\n\n\3\13\3\13\3\13\5\13\u0096\n\13\3\f\3\f\3\f\3\f\5\f"+
		"\u009c\n\f\3\f\3\f\6\f\u00a0\n\f\r\f\16\f\u00a1\3\f\3\f\3\r\3\r\5\r\u00a8"+
		"\n\r\3\16\3\16\3\16\5\16\u00ad\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\7\17\u00b9\n\17\f\17\16\17\u00bc\13\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u00c6\n\20\3\21\3\21\3\21\7\21\u00cb\n"+
		"\21\f\21\16\21\u00ce\13\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\7\22\u00dc\n\22\f\22\16\22\u00df\13\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00ea\n\23\f\23\16\23\u00ed\13\23"+
		"\3\23\3\23\3\23\3\23\3\23\7\23\u00f4\n\23\f\23\16\23\u00f7\13\23\3\23"+
		"\5\23\u00fa\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\5\24\u0107\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\7\24\u0133\n\24\f\24\16\24\u0136\13\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\5\26\u0143\n\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u014d\n\26\3\27\3\27\5\27\u0151\n\27\3"+
		"\27\3\27\3\30\3\30\3\30\2\3&\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\2\3\3\2-/\u017b\2\60\3\2\2\2\4\65\3\2\2\2\6C\3\2\2\2\bE\3\2"+
		"\2\2\n`\3\2\2\2\fv\3\2\2\2\16y\3\2\2\2\20\u0085\3\2\2\2\22\u0090\3\2\2"+
		"\2\24\u0095\3\2\2\2\26\u0097\3\2\2\2\30\u00a7\3\2\2\2\32\u00ac\3\2\2\2"+
		"\34\u00ae\3\2\2\2\36\u00c5\3\2\2\2 \u00c7\3\2\2\2\"\u00d5\3\2\2\2$\u00e2"+
		"\3\2\2\2&\u0106\3\2\2\2(\u0137\3\2\2\2*\u014c\3\2\2\2,\u014e\3\2\2\2."+
		"\u0154\3\2\2\2\60\61\5\4\3\2\61\3\3\2\2\2\62\64\5\6\4\2\63\62\3\2\2\2"+
		"\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\5\3\2\2\2\67\65\3\2\2\2"+
		"8D\5\b\5\29:\7\3\2\2:D\5\n\6\2;<\5\20\t\2<=\7\4\2\2=D\3\2\2\2>D\5\26\f"+
		"\2?D\5\32\16\2@D\5$\23\2AD\5*\26\2BD\5,\27\2C8\3\2\2\2C9\3\2\2\2C;\3\2"+
		"\2\2C>\3\2\2\2C?\3\2\2\2C@\3\2\2\2CA\3\2\2\2CB\3\2\2\2D\7\3\2\2\2EF\7"+
		"\5\2\2FM\7+\2\2GK\7\6\2\2HI\7\3\2\2IL\5\n\6\2JL\5&\24\2KH\3\2\2\2KJ\3"+
		"\2\2\2LN\3\2\2\2MG\3\2\2\2MN\3\2\2\2N[\3\2\2\2OP\7\7\2\2PW\7+\2\2QU\7"+
		"\6\2\2RS\7\3\2\2SV\5\n\6\2TV\5&\24\2UR\3\2\2\2UT\3\2\2\2VX\3\2\2\2WQ\3"+
		"\2\2\2WX\3\2\2\2XZ\3\2\2\2YO\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\"+
		"^\3\2\2\2][\3\2\2\2^_\7\4\2\2_\t\3\2\2\2`a\7+\2\2ab\7\b\2\2bc\5\f\7\2"+
		"cd\7\t\2\2dh\7\n\2\2eg\5\6\4\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2"+
		"ik\3\2\2\2jh\3\2\2\2kl\7\13\2\2l\13\3\2\2\2mw\3\2\2\2ns\5\16\b\2op\7\7"+
		"\2\2pr\5\16\b\2qo\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tw\3\2\2\2us\3"+
		"\2\2\2vm\3\2\2\2vn\3\2\2\2w\r\3\2\2\2xz\7\f\2\2yx\3\2\2\2yz\3\2\2\2z{"+
		"\3\2\2\2{|\7+\2\2|\17\3\2\2\2}~\7+\2\2~\177\7\b\2\2\177\u0080\5\22\n\2"+
		"\u0080\u0081\7\t\2\2\u0081\u0086\3\2\2\2\u0082\u0083\7+\2\2\u0083\u0084"+
		"\7\r\2\2\u0084\u0086\5\20\t\2\u0085}\3\2\2\2\u0085\u0082\3\2\2\2\u0086"+
		"\21\3\2\2\2\u0087\u0091\3\2\2\2\u0088\u008d\5\24\13\2\u0089\u008a\7\7"+
		"\2\2\u008a\u008c\5\24\13\2\u008b\u0089\3\2\2\2\u008c\u008f\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2"+
		"\2\2\u0090\u0087\3\2\2\2\u0090\u0088\3\2\2\2\u0091\23\3\2\2\2\u0092\u0096"+
		"\5&\24\2\u0093\u0094\7\16\2\2\u0094\u0096\7+\2\2\u0095\u0092\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0096\25\3\2\2\2\u0097\u0098\7\17\2\2\u0098\u009b\7,\2"+
		"\2\u0099\u009a\7\20\2\2\u009a\u009c\7,\2\2\u009b\u0099\3\2\2\2\u009b\u009c"+
		"\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\7\n\2\2\u009e\u00a0\5\30\r\2"+
		"\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2"+
		"\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\7\13\2\2\u00a4\27\3\2\2\2\u00a5"+
		"\u00a8\5\n\6\2\u00a6\u00a8\5\b\5\2\u00a7\u00a5\3\2\2\2\u00a7\u00a6\3\2"+
		"\2\2\u00a8\31\3\2\2\2\u00a9\u00ad\5\34\17\2\u00aa\u00ad\5 \21\2\u00ab"+
		"\u00ad\5\"\22\2\u00ac\u00a9\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ab\3"+
		"\2\2\2\u00ad\33\3\2\2\2\u00ae\u00af\7(\2\2\u00af\u00b0\7\b\2\2\u00b0\u00b1"+
		"\7+\2\2\u00b1\u00b2\7\4\2\2\u00b2\u00b3\7.\2\2\u00b3\u00b4\7\4\2\2\u00b4"+
		"\u00b5\7.\2\2\u00b5\u00b6\7\t\2\2\u00b6\u00ba\7\n\2\2\u00b7\u00b9\5\36"+
		"\20\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00be\7\13"+
		"\2\2\u00be\35\3\2\2\2\u00bf\u00c0\5\20\t\2\u00c0\u00c1\7\4\2\2\u00c1\u00c6"+
		"\3\2\2\2\u00c2\u00c6\5\32\16\2\u00c3\u00c6\5$\23\2\u00c4\u00c6\5*\26\2"+
		"\u00c5\u00bf\3\2\2\2\u00c5\u00c2\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c4"+
		"\3\2\2\2\u00c6\37\3\2\2\2\u00c7\u00c8\7\21\2\2\u00c8\u00cc\7\n\2\2\u00c9"+
		"\u00cb\5\36\20\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3"+
		"\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf"+
		"\u00d0\7\13\2\2\u00d0\u00d1\7\'\2\2\u00d1\u00d2\7\b\2\2\u00d2\u00d3\5"+
		"&\24\2\u00d3\u00d4\7\t\2\2\u00d4!\3\2\2\2\u00d5\u00d6\7\'\2\2\u00d6\u00d7"+
		"\7\b\2\2\u00d7\u00d8\5&\24\2\u00d8\u00d9\7\t\2\2\u00d9\u00dd\7\n\2\2\u00da"+
		"\u00dc\5\36\20\2\u00db\u00da\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3"+
		"\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e0\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0"+
		"\u00e1\7\13\2\2\u00e1#\3\2\2\2\u00e2\u00e3\7\22\2\2\u00e3\u00e4\7\b\2"+
		"\2\u00e4\u00e5\5&\24\2\u00e5\u00e6\7\t\2\2\u00e6\u00eb\7\n\2\2\u00e7\u00ea"+
		"\5\36\20\2\u00e8\u00ea\5,\27\2\u00e9\u00e7\3\2\2\2\u00e9\u00e8\3\2\2\2"+
		"\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee"+
		"\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00f9\7\13\2\2\u00ef\u00f0\7\23\2\2"+
		"\u00f0\u00f5\7\n\2\2\u00f1\u00f4\5\36\20\2\u00f2\u00f4\5,\27\2\u00f3\u00f1"+
		"\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00fa\7\13"+
		"\2\2\u00f9\u00ef\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa%\3\2\2\2\u00fb\u00fc"+
		"\b\24\1\2\u00fc\u00fd\7\24\2\2\u00fd\u0107\5&\24\26\u00fe\u0107\5.\30"+
		"\2\u00ff\u0107\7+\2\2\u0100\u0101\7\b\2\2\u0101\u0102\5&\24\2\u0102\u0103"+
		"\7\t\2\2\u0103\u0107\3\2\2\2\u0104\u0107\5\20\t\2\u0105\u0107\5(\25\2"+
		"\u0106\u00fb\3\2\2\2\u0106\u00fe\3\2\2\2\u0106\u00ff\3\2\2\2\u0106\u0100"+
		"\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0105\3\2\2\2\u0107\u0134\3\2\2\2\u0108"+
		"\u0109\f\25\2\2\u0109\u010a\7\25\2\2\u010a\u0133\5&\24\26\u010b\u010c"+
		"\f\24\2\2\u010c\u010d\7\26\2\2\u010d\u0133\5&\24\25\u010e\u010f\f\23\2"+
		"\2\u010f\u0110\7\27\2\2\u0110\u0133\5&\24\24\u0111\u0112\f\22\2\2\u0112"+
		"\u0113\7\30\2\2\u0113\u0133\5&\24\23\u0114\u0115\f\21\2\2\u0115\u0116"+
		"\7\31\2\2\u0116\u0133\5&\24\22\u0117\u0118\f\20\2\2\u0118\u0119\7\32\2"+
		"\2\u0119\u0133\5&\24\21\u011a\u011b\f\17\2\2\u011b\u011c\7\33\2\2\u011c"+
		"\u0133\5&\24\20\u011d\u011e\f\16\2\2\u011e\u011f\7\34\2\2\u011f\u0133"+
		"\5&\24\17\u0120\u0121\f\r\2\2\u0121\u0122\7\35\2\2\u0122\u0133\5&\24\16"+
		"\u0123\u0124\f\f\2\2\u0124\u0125\7\36\2\2\u0125\u0133\5&\24\r\u0126\u0127"+
		"\f\13\2\2\u0127\u0128\7\37\2\2\u0128\u0133\5&\24\f\u0129\u012a\f\n\2\2"+
		"\u012a\u012b\7 \2\2\u012b\u0133\5&\24\13\u012c\u012d\f\t\2\2\u012d\u012e"+
		"\7!\2\2\u012e\u0133\5&\24\n\u012f\u0130\f\b\2\2\u0130\u0131\7\"\2\2\u0131"+
		"\u0133\5&\24\t\u0132\u0108\3\2\2\2\u0132\u010b\3\2\2\2\u0132\u010e\3\2"+
		"\2\2\u0132\u0111\3\2\2\2\u0132\u0114\3\2\2\2\u0132\u0117\3\2\2\2\u0132"+
		"\u011a\3\2\2\2\u0132\u011d\3\2\2\2\u0132\u0120\3\2\2\2\u0132\u0123\3\2"+
		"\2\2\u0132\u0126\3\2\2\2\u0132\u0129\3\2\2\2\u0132\u012c\3\2\2\2\u0132"+
		"\u012f\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2"+
		"\2\2\u0135\'\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u0138\7#\2\2\u0138\u0139"+
		"\7,\2\2\u0139\u013a\7\b\2\2\u013a\u013b\5\22\n\2\u013b\u013c\7\t\2\2\u013c"+
		")\3\2\2\2\u013d\u013e\7+\2\2\u013e\u0142\7\6\2\2\u013f\u0143\5&\24\2\u0140"+
		"\u0141\7\3\2\2\u0141\u0143\5\n\6\2\u0142\u013f\3\2\2\2\u0142\u0140\3\2"+
		"\2\2\u0143\u0144\3\2\2\2\u0144\u0145\7\4\2\2\u0145\u014d\3\2\2\2\u0146"+
		"\u0147\7+\2\2\u0147\u0148\7$\2\2\u0148\u014d\7\4\2\2\u0149\u014a\7+\2"+
		"\2\u014a\u014b\7%\2\2\u014b\u014d\7\4\2\2\u014c\u013d\3\2\2\2\u014c\u0146"+
		"\3\2\2\2\u014c\u0149\3\2\2\2\u014d+\3\2\2\2\u014e\u0150\7&\2\2\u014f\u0151"+
		"\5&\24\2\u0150\u014f\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		"\u0153\7\4\2\2\u0153-\3\2\2\2\u0154\u0155\t\2\2\2\u0155/\3\2\2\2$\65C"+
		"KMUW[hsvy\u0085\u008d\u0090\u0095\u009b\u00a1\u00a7\u00ac\u00ba\u00c5"+
		"\u00cc\u00dd\u00e9\u00eb\u00f3\u00f5\u00f9\u0106\u0132\u0134\u0142\u014c"+
		"\u0150";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}