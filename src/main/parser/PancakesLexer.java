// Generated from Pancakes.g4 by ANTLR 4.5.1
package main.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PancakesLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, BOOLEAN=21, ID=22, INT=23, FLOAT=24, T_FLOAT=25, 
		T_INT=26, T_BOOL=27, T_STRING=28, T_VOID=29, STRING=30, WS=31, SL_COMMENT=32;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "BOOLEAN", "ID", "INT", "FLOAT", "T_FLOAT", 
		"T_INT", "T_BOOL", "T_STRING", "T_VOID", "STRING", "LETTER", "DIGIT", 
		"ESC", "WS", "SL_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "';'", "'('", "')'", "','", "'{'", "'}'", "'return'", "'if'", 
		"'else'", "''", "'['", "']'", "'-'", "'!'", "'*'", "'/'", "'//'", "'+'", 
		"'=='", null, null, null, null, "'float'", "'int'", "'boolean'", "'string'", 
		"'void'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "BOOLEAN", "ID", 
		"INT", "FLOAT", "T_FLOAT", "T_INT", "T_BOOL", "T_STRING", "T_VOID", "STRING", 
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


	public PancakesLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Pancakes.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\"\u00eb\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\5\26\u0085\n\26\3\27\3\27\3\27\7\27\u008a\n\27\f\27\16\27"+
		"\u008d\13\27\3\30\6\30\u0090\n\30\r\30\16\30\u0091\3\31\6\31\u0095\n\31"+
		"\r\31\16\31\u0096\3\31\3\31\7\31\u009b\n\31\f\31\16\31\u009e\13\31\3\31"+
		"\3\31\6\31\u00a2\n\31\r\31\16\31\u00a3\5\31\u00a6\n\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\7\37\u00c9\n\37\f\37\16\37\u00cc\13\37\3\37\3\37\3 \3 \3!\3"+
		"!\3\"\3\"\3\"\3\"\5\"\u00d8\n\"\3#\6#\u00db\n#\r#\16#\u00dc\3#\3#\3$\3"+
		"$\7$\u00e3\n$\f$\16$\u00e6\13$\3$\3$\3$\3$\4\u00ca\u00e4\2%\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?\2A\2"+
		"C\2E!G\"\3\2\5\5\2C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\u00f3\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\3I\3\2\2\2\5K\3\2\2\2\7M\3\2\2\2\tO\3\2\2\2"+
		"\13Q\3\2\2\2\rS\3\2\2\2\17U\3\2\2\2\21W\3\2\2\2\23^\3\2\2\2\25a\3\2\2"+
		"\2\27f\3\2\2\2\31g\3\2\2\2\33i\3\2\2\2\35k\3\2\2\2\37m\3\2\2\2!o\3\2\2"+
		"\2#q\3\2\2\2%s\3\2\2\2\'v\3\2\2\2)x\3\2\2\2+\u0084\3\2\2\2-\u0086\3\2"+
		"\2\2/\u008f\3\2\2\2\61\u00a5\3\2\2\2\63\u00a7\3\2\2\2\65\u00ad\3\2\2\2"+
		"\67\u00b1\3\2\2\29\u00b9\3\2\2\2;\u00c0\3\2\2\2=\u00c5\3\2\2\2?\u00cf"+
		"\3\2\2\2A\u00d1\3\2\2\2C\u00d7\3\2\2\2E\u00da\3\2\2\2G\u00e0\3\2\2\2I"+
		"J\7?\2\2J\4\3\2\2\2KL\7=\2\2L\6\3\2\2\2MN\7*\2\2N\b\3\2\2\2OP\7+\2\2P"+
		"\n\3\2\2\2QR\7.\2\2R\f\3\2\2\2ST\7}\2\2T\16\3\2\2\2UV\7\177\2\2V\20\3"+
		"\2\2\2WX\7t\2\2XY\7g\2\2YZ\7v\2\2Z[\7w\2\2[\\\7t\2\2\\]\7p\2\2]\22\3\2"+
		"\2\2^_\7k\2\2_`\7h\2\2`\24\3\2\2\2ab\7g\2\2bc\7n\2\2cd\7u\2\2de\7g\2\2"+
		"e\26\3\2\2\2gh\7]\2\2h\32\3\2\2\2ij\7_\2\2j\34\3\2\2\2kl\7/\2\2l\36\3"+
		"\2\2\2mn\7#\2\2n \3\2\2\2op\7,\2\2p\"\3\2\2\2qr\7\61\2\2r$\3\2\2\2st\7"+
		"\61\2\2tu\7\61\2\2u&\3\2\2\2vw\7-\2\2w(\3\2\2\2xy\7?\2\2yz\7?\2\2z*\3"+
		"\2\2\2{|\7v\2\2|}\7t\2\2}~\7w\2\2~\u0085\7g\2\2\177\u0080\7h\2\2\u0080"+
		"\u0081\7c\2\2\u0081\u0082\7n\2\2\u0082\u0083\7u\2\2\u0083\u0085\7g\2\2"+
		"\u0084{\3\2\2\2\u0084\177\3\2\2\2\u0085,\3\2\2\2\u0086\u008b\5? \2\u0087"+
		"\u008a\5? \2\u0088\u008a\5A!\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2\2\2"+
		"\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c.\3"+
		"\2\2\2\u008d\u008b\3\2\2\2\u008e\u0090\5A!\2\u008f\u008e\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\60\3\2\2"+
		"\2\u0093\u0095\5A!\2\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094"+
		"\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009c\7\60\2\2"+
		"\u0099\u009b\5A!\2\u009a\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a"+
		"\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u00a6\3\2\2\2\u009e\u009c\3\2\2\2\u009f"+
		"\u00a1\7\60\2\2\u00a0\u00a2\5A!\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3\3\2"+
		"\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5"+
		"\u0094\3\2\2\2\u00a5\u009f\3\2\2\2\u00a6\62\3\2\2\2\u00a7\u00a8\7h\2\2"+
		"\u00a8\u00a9\7n\2\2\u00a9\u00aa\7q\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac"+
		"\7v\2\2\u00ac\64\3\2\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af\7p\2\2\u00af\u00b0"+
		"\7v\2\2\u00b0\66\3\2\2\2\u00b1\u00b2\7d\2\2\u00b2\u00b3\7q\2\2\u00b3\u00b4"+
		"\7q\2\2\u00b4\u00b5\7n\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7c\2\2\u00b7"+
		"\u00b8\7p\2\2\u00b88\3\2\2\2\u00b9\u00ba\7u\2\2\u00ba\u00bb\7v\2\2\u00bb"+
		"\u00bc\7t\2\2\u00bc\u00bd\7k\2\2\u00bd\u00be\7p\2\2\u00be\u00bf\7i\2\2"+
		"\u00bf:\3\2\2\2\u00c0\u00c1\7x\2\2\u00c1\u00c2\7q\2\2\u00c2\u00c3\7k\2"+
		"\2\u00c3\u00c4\7f\2\2\u00c4<\3\2\2\2\u00c5\u00ca\7$\2\2\u00c6\u00c9\5"+
		"C\"\2\u00c7\u00c9\13\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9"+
		"\u00cc\3\2\2\2\u00ca\u00cb\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cd\3\2"+
		"\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\7$\2\2\u00ce>\3\2\2\2\u00cf\u00d0"+
		"\t\2\2\2\u00d0@\3\2\2\2\u00d1\u00d2\t\3\2\2\u00d2B\3\2\2\2\u00d3\u00d4"+
		"\7^\2\2\u00d4\u00d8\7$\2\2\u00d5\u00d6\7^\2\2\u00d6\u00d8\7^\2\2\u00d7"+
		"\u00d3\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8D\3\2\2\2\u00d9\u00db\t\4\2\2"+
		"\u00da\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd"+
		"\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\b#\2\2\u00dfF\3\2\2\2\u00e0\u00e4"+
		"\7%\2\2\u00e1\u00e3\13\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e4\3\2"+
		"\2\2\u00e7\u00e8\7\f\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\b$\2\2\u00ea"+
		"H\3\2\2\2\20\2\u0084\u0089\u008b\u0091\u0096\u009c\u00a3\u00a5\u00c8\u00ca"+
		"\u00d7\u00dc\u00e4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}