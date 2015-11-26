// Generated from Pancakes.g4 by ANTLR 4.5.1
package main.parser.generated;
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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, PRINT=16, BOOLEAN=17, 
		T_FLOAT=18, T_INT=19, T_BOOL=20, T_STRING=21, T_VOID=22, EQUAL=23, ADD=24, 
		MINUS=25, MULT=26, DIV=27, ID=28, INT=29, FLOAT=30, STRING=31, WS=32, 
		SL_COMMENT=33;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "PRINT", "BOOLEAN", 
		"T_FLOAT", "T_INT", "T_BOOL", "T_STRING", "T_VOID", "EQUAL", "ADD", "MINUS", 
		"MULT", "DIV", "ID", "INT", "FLOAT", "STRING", "LETTER", "DIGIT", "ESC", 
		"WS", "SL_COMMENT"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2#\u00f8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\5\22\u0088\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\7\35\u00b5\n\35\f\35\16\35\u00b8"+
		"\13\35\3\36\6\36\u00bb\n\36\r\36\16\36\u00bc\3\37\6\37\u00c0\n\37\r\37"+
		"\16\37\u00c1\3\37\3\37\7\37\u00c6\n\37\f\37\16\37\u00c9\13\37\3\37\3\37"+
		"\6\37\u00cd\n\37\r\37\16\37\u00ce\5\37\u00d1\n\37\3 \3 \3 \7 \u00d6\n"+
		" \f \16 \u00d9\13 \3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3#\5#\u00e5\n#\3$\6$\u00e8"+
		"\n$\r$\16$\u00e9\3$\3$\3%\3%\7%\u00f0\n%\f%\16%\u00f3\13%\3%\3%\3%\3%"+
		"\4\u00d7\u00f1\2&\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\2C\2E\2G\"I#\3\2\5\5\2C\\aac|\3\2\62;\5\2\13\f"+
		"\17\17\"\"\u0101\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\3K"+
		"\3\2\2\2\5M\3\2\2\2\7O\3\2\2\2\tQ\3\2\2\2\13S\3\2\2\2\rU\3\2\2\2\17W\3"+
		"\2\2\2\21]\3\2\2\2\23d\3\2\2\2\25g\3\2\2\2\27l\3\2\2\2\31n\3\2\2\2\33"+
		"p\3\2\2\2\35r\3\2\2\2\37u\3\2\2\2!x\3\2\2\2#\u0087\3\2\2\2%\u0089\3\2"+
		"\2\2\'\u008f\3\2\2\2)\u0093\3\2\2\2+\u009b\3\2\2\2-\u00a2\3\2\2\2/\u00a7"+
		"\3\2\2\2\61\u00a9\3\2\2\2\63\u00ab\3\2\2\2\65\u00ad\3\2\2\2\67\u00af\3"+
		"\2\2\29\u00b1\3\2\2\2;\u00ba\3\2\2\2=\u00d0\3\2\2\2?\u00d2\3\2\2\2A\u00dc"+
		"\3\2\2\2C\u00de\3\2\2\2E\u00e4\3\2\2\2G\u00e7\3\2\2\2I\u00ed\3\2\2\2K"+
		"L\7=\2\2L\4\3\2\2\2MN\7*\2\2N\6\3\2\2\2OP\7+\2\2P\b\3\2\2\2QR\7.\2\2R"+
		"\n\3\2\2\2ST\7}\2\2T\f\3\2\2\2UV\7\177\2\2V\16\3\2\2\2WX\7f\2\2XY\7w\2"+
		"\2YZ\7o\2\2Z[\7o\2\2[\\\7{\2\2\\\20\3\2\2\2]^\7t\2\2^_\7g\2\2_`\7v\2\2"+
		"`a\7w\2\2ab\7t\2\2bc\7p\2\2c\22\3\2\2\2de\7k\2\2ef\7h\2\2f\24\3\2\2\2"+
		"gh\7g\2\2hi\7n\2\2ij\7u\2\2jk\7g\2\2k\26\3\2\2\2lm\7]\2\2m\30\3\2\2\2"+
		"no\7_\2\2o\32\3\2\2\2pq\7#\2\2q\34\3\2\2\2rs\7\61\2\2st\7\61\2\2t\36\3"+
		"\2\2\2uv\7?\2\2vw\7?\2\2w \3\2\2\2xy\7r\2\2yz\7t\2\2z{\7k\2\2{|\7p\2\2"+
		"|}\7v\2\2}\"\3\2\2\2~\177\7v\2\2\177\u0080\7t\2\2\u0080\u0081\7w\2\2\u0081"+
		"\u0088\7g\2\2\u0082\u0083\7h\2\2\u0083\u0084\7c\2\2\u0084\u0085\7n\2\2"+
		"\u0085\u0086\7u\2\2\u0086\u0088\7g\2\2\u0087~\3\2\2\2\u0087\u0082\3\2"+
		"\2\2\u0088$\3\2\2\2\u0089\u008a\7h\2\2\u008a\u008b\7n\2\2\u008b\u008c"+
		"\7q\2\2\u008c\u008d\7c\2\2\u008d\u008e\7v\2\2\u008e&\3\2\2\2\u008f\u0090"+
		"\7k\2\2\u0090\u0091\7p\2\2\u0091\u0092\7v\2\2\u0092(\3\2\2\2\u0093\u0094"+
		"\7d\2\2\u0094\u0095\7q\2\2\u0095\u0096\7q\2\2\u0096\u0097\7n\2\2\u0097"+
		"\u0098\7g\2\2\u0098\u0099\7c\2\2\u0099\u009a\7p\2\2\u009a*\3\2\2\2\u009b"+
		"\u009c\7u\2\2\u009c\u009d\7v\2\2\u009d\u009e\7t\2\2\u009e\u009f\7k\2\2"+
		"\u009f\u00a0\7p\2\2\u00a0\u00a1\7i\2\2\u00a1,\3\2\2\2\u00a2\u00a3\7x\2"+
		"\2\u00a3\u00a4\7q\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6\7f\2\2\u00a6.\3\2"+
		"\2\2\u00a7\u00a8\7?\2\2\u00a8\60\3\2\2\2\u00a9\u00aa\7-\2\2\u00aa\62\3"+
		"\2\2\2\u00ab\u00ac\7/\2\2\u00ac\64\3\2\2\2\u00ad\u00ae\7,\2\2\u00ae\66"+
		"\3\2\2\2\u00af\u00b0\7\61\2\2\u00b08\3\2\2\2\u00b1\u00b6\5A!\2\u00b2\u00b5"+
		"\5A!\2\u00b3\u00b5\5C\"\2\u00b4\u00b2\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5"+
		"\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7:\3\2\2\2"+
		"\u00b8\u00b6\3\2\2\2\u00b9\u00bb\5C\"\2\u00ba\u00b9\3\2\2\2\u00bb\u00bc"+
		"\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd<\3\2\2\2\u00be"+
		"\u00c0\5C\"\2\u00bf\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00bf\3\2"+
		"\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c7\7\60\2\2\u00c4"+
		"\u00c6\5C\"\2\u00c5\u00c4\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2"+
		"\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00d1\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca"+
		"\u00cc\7\60\2\2\u00cb\u00cd\5C\"\2\u00cc\u00cb\3\2\2\2\u00cd\u00ce\3\2"+
		"\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0"+
		"\u00bf\3\2\2\2\u00d0\u00ca\3\2\2\2\u00d1>\3\2\2\2\u00d2\u00d7\7$\2\2\u00d3"+
		"\u00d6\5E#\2\u00d4\u00d6\13\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d4\3\2"+
		"\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8"+
		"\u00da\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db\7$\2\2\u00db@\3\2\2\2\u00dc"+
		"\u00dd\t\2\2\2\u00ddB\3\2\2\2\u00de\u00df\t\3\2\2\u00dfD\3\2\2\2\u00e0"+
		"\u00e1\7^\2\2\u00e1\u00e5\7$\2\2\u00e2\u00e3\7^\2\2\u00e3\u00e5\7^\2\2"+
		"\u00e4\u00e0\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5F\3\2\2\2\u00e6\u00e8\t"+
		"\4\2\2\u00e7\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9"+
		"\u00ea\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\b$\2\2\u00ecH\3\2\2\2\u00ed"+
		"\u00f1\7%\2\2\u00ee\u00f0\13\2\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f3\3\2"+
		"\2\2\u00f1\u00f2\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f4\u00f5\7\f\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\b%"+
		"\2\2\u00f7J\3\2\2\2\20\2\u0087\u00b4\u00b6\u00bc\u00c1\u00c7\u00ce\u00d0"+
		"\u00d5\u00d7\u00e4\u00e9\u00f1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}