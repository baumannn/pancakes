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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, PRINT=17, 
		COLOR=18, DRAWCIRCLE=19, DRAWRECT=20, DRAWOVAL=21, DRAWSTRING=22, DRAWLINE=23, 
		LT=24, GT=25, BOOLEAN=26, T_FLOAT=27, T_INT=28, T_BOOL=29, T_STRING=30, 
		T_VOID=31, EQUAL=32, ADD=33, MINUS=34, MULT=35, DIV=36, ID=37, INT=38, 
		FLOAT=39, STRING=40, WS=41, SL_COMMENT=42;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "PRINT", 
		"COLOR", "DRAWCIRCLE", "DRAWRECT", "DRAWOVAL", "DRAWSTRING", "DRAWLINE", 
		"LT", "GT", "BOOLEAN", "T_FLOAT", "T_INT", "T_BOOL", "T_STRING", "T_VOID", 
		"EQUAL", "ADD", "MINUS", "MULT", "DIV", "ID", "INT", "FLOAT", "STRING", 
		"LETTER", "DIGIT", "ESC", "WS", "SL_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'['", "']'", "'('", "')'", "','", "'{'", "'}'", "'return'", 
		"'if'", "'else'", "'while'", "'do'", "'!'", "'//'", "'=='", "'print'", 
		null, "'drawCircle'", "'drawRectangle'", "'drawOval'", "'drawString'", 
		"'drawLine'", "'<'", "'>'", null, "'float'", "'int'", "'boolean'", "'string'", 
		"'void'", "'='", null, "'-'", null, "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "PRINT", "COLOR", "DRAWCIRCLE", "DRAWRECT", 
		"DRAWOVAL", "DRAWSTRING", "DRAWLINE", "LT", "GT", "BOOLEAN", "T_FLOAT", 
		"T_INT", "T_BOOL", "T_STRING", "T_VOID", "EQUAL", "ADD", "MINUS", "MULT", 
		"DIV", "ID", "INT", "FLOAT", "STRING", "WS", "SL_COMMENT"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2,\u0178\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00bc\n\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0101\n\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3\"\3\"\3\"\5"+
		"\"\u0126\n\"\3#\3#\3$\3$\3$\3$\5$\u012e\n$\3%\3%\3&\3&\3&\7&\u0135\n&"+
		"\f&\16&\u0138\13&\3\'\6\'\u013b\n\'\r\'\16\'\u013c\3(\6(\u0140\n(\r(\16"+
		"(\u0141\3(\3(\7(\u0146\n(\f(\16(\u0149\13(\3(\3(\6(\u014d\n(\r(\16(\u014e"+
		"\5(\u0151\n(\3)\3)\3)\7)\u0156\n)\f)\16)\u0159\13)\3)\3)\3*\3*\3+\3+\3"+
		",\3,\3,\3,\5,\u0165\n,\3-\6-\u0168\n-\r-\16-\u0169\3-\3-\3.\3.\7.\u0170"+
		"\n.\f.\16.\u0173\13.\3.\3.\3.\3.\4\u0157\u0171\2/\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S\2U\2W\2Y+[,\3\2\5\5\2C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\u018a\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2Y\3\2\2\2\2[\3"+
		"\2\2\2\3]\3\2\2\2\5_\3\2\2\2\7a\3\2\2\2\tc\3\2\2\2\13e\3\2\2\2\rg\3\2"+
		"\2\2\17i\3\2\2\2\21k\3\2\2\2\23m\3\2\2\2\25t\3\2\2\2\27w\3\2\2\2\31|\3"+
		"\2\2\2\33\u0082\3\2\2\2\35\u0085\3\2\2\2\37\u0087\3\2\2\2!\u008a\3\2\2"+
		"\2#\u008d\3\2\2\2%\u00bb\3\2\2\2\'\u00bd\3\2\2\2)\u00c8\3\2\2\2+\u00d6"+
		"\3\2\2\2-\u00df\3\2\2\2/\u00ea\3\2\2\2\61\u00f3\3\2\2\2\63\u00f5\3\2\2"+
		"\2\65\u0100\3\2\2\2\67\u0102\3\2\2\29\u0108\3\2\2\2;\u010c\3\2\2\2=\u0114"+
		"\3\2\2\2?\u011b\3\2\2\2A\u0120\3\2\2\2C\u0125\3\2\2\2E\u0127\3\2\2\2G"+
		"\u012d\3\2\2\2I\u012f\3\2\2\2K\u0131\3\2\2\2M\u013a\3\2\2\2O\u0150\3\2"+
		"\2\2Q\u0152\3\2\2\2S\u015c\3\2\2\2U\u015e\3\2\2\2W\u0164\3\2\2\2Y\u0167"+
		"\3\2\2\2[\u016d\3\2\2\2]^\7=\2\2^\4\3\2\2\2_`\7]\2\2`\6\3\2\2\2ab\7_\2"+
		"\2b\b\3\2\2\2cd\7*\2\2d\n\3\2\2\2ef\7+\2\2f\f\3\2\2\2gh\7.\2\2h\16\3\2"+
		"\2\2ij\7}\2\2j\20\3\2\2\2kl\7\177\2\2l\22\3\2\2\2mn\7t\2\2no\7g\2\2op"+
		"\7v\2\2pq\7w\2\2qr\7t\2\2rs\7p\2\2s\24\3\2\2\2tu\7k\2\2uv\7h\2\2v\26\3"+
		"\2\2\2wx\7g\2\2xy\7n\2\2yz\7u\2\2z{\7g\2\2{\30\3\2\2\2|}\7y\2\2}~\7j\2"+
		"\2~\177\7k\2\2\177\u0080\7n\2\2\u0080\u0081\7g\2\2\u0081\32\3\2\2\2\u0082"+
		"\u0083\7f\2\2\u0083\u0084\7q\2\2\u0084\34\3\2\2\2\u0085\u0086\7#\2\2\u0086"+
		"\36\3\2\2\2\u0087\u0088\7\61\2\2\u0088\u0089\7\61\2\2\u0089 \3\2\2\2\u008a"+
		"\u008b\7?\2\2\u008b\u008c\7?\2\2\u008c\"\3\2\2\2\u008d\u008e\7r\2\2\u008e"+
		"\u008f\7t\2\2\u008f\u0090\7k\2\2\u0090\u0091\7p\2\2\u0091\u0092\7v\2\2"+
		"\u0092$\3\2\2\2\u0093\u0094\7t\2\2\u0094\u0095\7g\2\2\u0095\u00bc\7f\2"+
		"\2\u0096\u0097\7{\2\2\u0097\u0098\7g\2\2\u0098\u0099\7n\2\2\u0099\u009a"+
		"\7n\2\2\u009a\u009b\7q\2\2\u009b\u00bc\7y\2\2\u009c\u009d\7i\2\2\u009d"+
		"\u009e\7t\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7g\2\2\u00a0\u00bc\7p\2\2"+
		"\u00a1\u00a2\7d\2\2\u00a2\u00a3\7n\2\2\u00a3\u00a4\7w\2\2\u00a4\u00bc"+
		"\7g\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7\7t\2\2\u00a7\u00a8\7c\2\2\u00a8"+
		"\u00a9\7p\2\2\u00a9\u00aa\7i\2\2\u00aa\u00bc\7g\2\2\u00ab\u00ac\7r\2\2"+
		"\u00ac\u00ad\7w\2\2\u00ad\u00ae\7t\2\2\u00ae\u00af\7r\2\2\u00af\u00b0"+
		"\7n\2\2\u00b0\u00bc\7g\2\2\u00b1\u00b2\7d\2\2\u00b2\u00b3\7n\2\2\u00b3"+
		"\u00b4\7c\2\2\u00b4\u00b5\7e\2\2\u00b5\u00bc\7m\2\2\u00b6\u00b7\7y\2\2"+
		"\u00b7\u00b8\7j\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba\7v\2\2\u00ba\u00bc"+
		"\7g\2\2\u00bb\u0093\3\2\2\2\u00bb\u0096\3\2\2\2\u00bb\u009c\3\2\2\2\u00bb"+
		"\u00a1\3\2\2\2\u00bb\u00a5\3\2\2\2\u00bb\u00ab\3\2\2\2\u00bb\u00b1\3\2"+
		"\2\2\u00bb\u00b6\3\2\2\2\u00bc&\3\2\2\2\u00bd\u00be\7f\2\2\u00be\u00bf"+
		"\7t\2\2\u00bf\u00c0\7c\2\2\u00c0\u00c1\7y\2\2\u00c1\u00c2\7E\2\2\u00c2"+
		"\u00c3\7k\2\2\u00c3\u00c4\7t\2\2\u00c4\u00c5\7e\2\2\u00c5\u00c6\7n\2\2"+
		"\u00c6\u00c7\7g\2\2\u00c7(\3\2\2\2\u00c8\u00c9\7f\2\2\u00c9\u00ca\7t\2"+
		"\2\u00ca\u00cb\7c\2\2\u00cb\u00cc\7y\2\2\u00cc\u00cd\7T\2\2\u00cd\u00ce"+
		"\7g\2\2\u00ce\u00cf\7e\2\2\u00cf\u00d0\7v\2\2\u00d0\u00d1\7c\2\2\u00d1"+
		"\u00d2\7p\2\2\u00d2\u00d3\7i\2\2\u00d3\u00d4\7n\2\2\u00d4\u00d5\7g\2\2"+
		"\u00d5*\3\2\2\2\u00d6\u00d7\7f\2\2\u00d7\u00d8\7t\2\2\u00d8\u00d9\7c\2"+
		"\2\u00d9\u00da\7y\2\2\u00da\u00db\7Q\2\2\u00db\u00dc\7x\2\2\u00dc\u00dd"+
		"\7c\2\2\u00dd\u00de\7n\2\2\u00de,\3\2\2\2\u00df\u00e0\7f\2\2\u00e0\u00e1"+
		"\7t\2\2\u00e1\u00e2\7c\2\2\u00e2\u00e3\7y\2\2\u00e3\u00e4\7U\2\2\u00e4"+
		"\u00e5\7v\2\2\u00e5\u00e6\7t\2\2\u00e6\u00e7\7k\2\2\u00e7\u00e8\7p\2\2"+
		"\u00e8\u00e9\7i\2\2\u00e9.\3\2\2\2\u00ea\u00eb\7f\2\2\u00eb\u00ec\7t\2"+
		"\2\u00ec\u00ed\7c\2\2\u00ed\u00ee\7y\2\2\u00ee\u00ef\7N\2\2\u00ef\u00f0"+
		"\7k\2\2\u00f0\u00f1\7p\2\2\u00f1\u00f2\7g\2\2\u00f2\60\3\2\2\2\u00f3\u00f4"+
		"\7>\2\2\u00f4\62\3\2\2\2\u00f5\u00f6\7@\2\2\u00f6\64\3\2\2\2\u00f7\u00f8"+
		"\7v\2\2\u00f8\u00f9\7t\2\2\u00f9\u00fa\7w\2\2\u00fa\u0101\7g\2\2\u00fb"+
		"\u00fc\7h\2\2\u00fc\u00fd\7c\2\2\u00fd\u00fe\7n\2\2\u00fe\u00ff\7u\2\2"+
		"\u00ff\u0101\7g\2\2\u0100\u00f7\3\2\2\2\u0100\u00fb\3\2\2\2\u0101\66\3"+
		"\2\2\2\u0102\u0103\7h\2\2\u0103\u0104\7n\2\2\u0104\u0105\7q\2\2\u0105"+
		"\u0106\7c\2\2\u0106\u0107\7v\2\2\u01078\3\2\2\2\u0108\u0109\7k\2\2\u0109"+
		"\u010a\7p\2\2\u010a\u010b\7v\2\2\u010b:\3\2\2\2\u010c\u010d\7d\2\2\u010d"+
		"\u010e\7q\2\2\u010e\u010f\7q\2\2\u010f\u0110\7n\2\2\u0110\u0111\7g\2\2"+
		"\u0111\u0112\7c\2\2\u0112\u0113\7p\2\2\u0113<\3\2\2\2\u0114\u0115\7u\2"+
		"\2\u0115\u0116\7v\2\2\u0116\u0117\7t\2\2\u0117\u0118\7k\2\2\u0118\u0119"+
		"\7p\2\2\u0119\u011a\7i\2\2\u011a>\3\2\2\2\u011b\u011c\7x\2\2\u011c\u011d"+
		"\7q\2\2\u011d\u011e\7k\2\2\u011e\u011f\7f\2\2\u011f@\3\2\2\2\u0120\u0121"+
		"\7?\2\2\u0121B\3\2\2\2\u0122\u0126\7-\2\2\u0123\u0124\7Q\2\2\u0124\u0126"+
		"\7T\2\2\u0125\u0122\3\2\2\2\u0125\u0123\3\2\2\2\u0126D\3\2\2\2\u0127\u0128"+
		"\7/\2\2\u0128F\3\2\2\2\u0129\u012e\7,\2\2\u012a\u012b\7C\2\2\u012b\u012c"+
		"\7P\2\2\u012c\u012e\7F\2\2\u012d\u0129\3\2\2\2\u012d\u012a\3\2\2\2\u012e"+
		"H\3\2\2\2\u012f\u0130\7\61\2\2\u0130J\3\2\2\2\u0131\u0136\5S*\2\u0132"+
		"\u0135\5S*\2\u0133\u0135\5U+\2\u0134\u0132\3\2\2\2\u0134\u0133\3\2\2\2"+
		"\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137L\3"+
		"\2\2\2\u0138\u0136\3\2\2\2\u0139\u013b\5U+\2\u013a\u0139\3\2\2\2\u013b"+
		"\u013c\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013dN\3\2\2\2"+
		"\u013e\u0140\5U+\2\u013f\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u013f"+
		"\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0147\7\60\2\2"+
		"\u0144\u0146\5U+\2\u0145\u0144\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145"+
		"\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0151\3\2\2\2\u0149\u0147\3\2\2\2\u014a"+
		"\u014c\7\60\2\2\u014b\u014d\5U+\2\u014c\u014b\3\2\2\2\u014d\u014e\3\2"+
		"\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0151\3\2\2\2\u0150"+
		"\u013f\3\2\2\2\u0150\u014a\3\2\2\2\u0151P\3\2\2\2\u0152\u0157\7$\2\2\u0153"+
		"\u0156\5W,\2\u0154\u0156\13\2\2\2\u0155\u0153\3\2\2\2\u0155\u0154\3\2"+
		"\2\2\u0156\u0159\3\2\2\2\u0157\u0158\3\2\2\2\u0157\u0155\3\2\2\2\u0158"+
		"\u015a\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015b\7$\2\2\u015bR\3\2\2\2\u015c"+
		"\u015d\t\2\2\2\u015dT\3\2\2\2\u015e\u015f\t\3\2\2\u015fV\3\2\2\2\u0160"+
		"\u0161\7^\2\2\u0161\u0165\7$\2\2\u0162\u0163\7^\2\2\u0163\u0165\7^\2\2"+
		"\u0164\u0160\3\2\2\2\u0164\u0162\3\2\2\2\u0165X\3\2\2\2\u0166\u0168\t"+
		"\4\2\2\u0167\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u0167\3\2\2\2\u0169"+
		"\u016a\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\b-\2\2\u016cZ\3\2\2\2\u016d"+
		"\u0171\7%\2\2\u016e\u0170\13\2\2\2\u016f\u016e\3\2\2\2\u0170\u0173\3\2"+
		"\2\2\u0171\u0172\3\2\2\2\u0171\u016f\3\2\2\2\u0172\u0174\3\2\2\2\u0173"+
		"\u0171\3\2\2\2\u0174\u0175\7\f\2\2\u0175\u0176\3\2\2\2\u0176\u0177\b."+
		"\2\2\u0177\\\3\2\2\2\23\2\u00bb\u0100\u0125\u012d\u0134\u0136\u013c\u0141"+
		"\u0147\u014e\u0150\u0155\u0157\u0164\u0169\u0171\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}