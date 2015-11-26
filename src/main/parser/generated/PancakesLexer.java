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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		PRINT=18, LT=19, GT=20, BOOLEAN=21, T_FLOAT=22, T_INT=23, T_BOOL=24, T_STRING=25, 
		T_VOID=26, EQUAL=27, ADD=28, MINUS=29, MULT=30, DIV=31, ID=32, INT=33, 
		FLOAT=34, STRING=35, WS=36, SL_COMMENT=37;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"PRINT", "LT", "GT", "BOOLEAN", "T_FLOAT", "T_INT", "T_BOOL", "T_STRING", 
		"T_VOID", "EQUAL", "ADD", "MINUS", "MULT", "DIV", "ID", "INT", "FLOAT", 
		"STRING", "LETTER", "DIGIT", "ESC", "WS", "SL_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'['", "']'", "'('", "')'", "','", "'{'", "'}'", "'dummy'", 
		"'return'", "'if'", "'else'", "'while'", "'do'", "'!'", "'//'", "'=='", 
		"'print'", "'<'", "'>'", null, "'float'", "'int'", "'boolean'", "'string'", 
		"'void'", "'='", "'+'", "'-'", "'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "PRINT", "LT", "GT", "BOOLEAN", "T_FLOAT", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\'\u010d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u009d\n\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\7!\u00ca\n!\f"+
		"!\16!\u00cd\13!\3\"\6\"\u00d0\n\"\r\"\16\"\u00d1\3#\6#\u00d5\n#\r#\16"+
		"#\u00d6\3#\3#\7#\u00db\n#\f#\16#\u00de\13#\3#\3#\6#\u00e2\n#\r#\16#\u00e3"+
		"\5#\u00e6\n#\3$\3$\3$\7$\u00eb\n$\f$\16$\u00ee\13$\3$\3$\3%\3%\3&\3&\3"+
		"\'\3\'\3\'\3\'\5\'\u00fa\n\'\3(\6(\u00fd\n(\r(\16(\u00fe\3(\3(\3)\3)\7"+
		")\u0105\n)\f)\16)\u0108\13)\3)\3)\3)\3)\4\u00ec\u0106\2*\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I\2K\2M\2O&Q\'\3\2\5\5\2C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\u0116\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\3S\3\2\2\2\5U\3\2\2\2\7W\3\2\2\2\tY\3\2\2\2\13[\3"+
		"\2\2\2\r]\3\2\2\2\17_\3\2\2\2\21a\3\2\2\2\23c\3\2\2\2\25i\3\2\2\2\27p"+
		"\3\2\2\2\31s\3\2\2\2\33x\3\2\2\2\35~\3\2\2\2\37\u0081\3\2\2\2!\u0083\3"+
		"\2\2\2#\u0086\3\2\2\2%\u0089\3\2\2\2\'\u008f\3\2\2\2)\u0091\3\2\2\2+\u009c"+
		"\3\2\2\2-\u009e\3\2\2\2/\u00a4\3\2\2\2\61\u00a8\3\2\2\2\63\u00b0\3\2\2"+
		"\2\65\u00b7\3\2\2\2\67\u00bc\3\2\2\29\u00be\3\2\2\2;\u00c0\3\2\2\2=\u00c2"+
		"\3\2\2\2?\u00c4\3\2\2\2A\u00c6\3\2\2\2C\u00cf\3\2\2\2E\u00e5\3\2\2\2G"+
		"\u00e7\3\2\2\2I\u00f1\3\2\2\2K\u00f3\3\2\2\2M\u00f9\3\2\2\2O\u00fc\3\2"+
		"\2\2Q\u0102\3\2\2\2ST\7=\2\2T\4\3\2\2\2UV\7]\2\2V\6\3\2\2\2WX\7_\2\2X"+
		"\b\3\2\2\2YZ\7*\2\2Z\n\3\2\2\2[\\\7+\2\2\\\f\3\2\2\2]^\7.\2\2^\16\3\2"+
		"\2\2_`\7}\2\2`\20\3\2\2\2ab\7\177\2\2b\22\3\2\2\2cd\7f\2\2de\7w\2\2ef"+
		"\7o\2\2fg\7o\2\2gh\7{\2\2h\24\3\2\2\2ij\7t\2\2jk\7g\2\2kl\7v\2\2lm\7w"+
		"\2\2mn\7t\2\2no\7p\2\2o\26\3\2\2\2pq\7k\2\2qr\7h\2\2r\30\3\2\2\2st\7g"+
		"\2\2tu\7n\2\2uv\7u\2\2vw\7g\2\2w\32\3\2\2\2xy\7y\2\2yz\7j\2\2z{\7k\2\2"+
		"{|\7n\2\2|}\7g\2\2}\34\3\2\2\2~\177\7f\2\2\177\u0080\7q\2\2\u0080\36\3"+
		"\2\2\2\u0081\u0082\7#\2\2\u0082 \3\2\2\2\u0083\u0084\7\61\2\2\u0084\u0085"+
		"\7\61\2\2\u0085\"\3\2\2\2\u0086\u0087\7?\2\2\u0087\u0088\7?\2\2\u0088"+
		"$\3\2\2\2\u0089\u008a\7r\2\2\u008a\u008b\7t\2\2\u008b\u008c\7k\2\2\u008c"+
		"\u008d\7p\2\2\u008d\u008e\7v\2\2\u008e&\3\2\2\2\u008f\u0090\7>\2\2\u0090"+
		"(\3\2\2\2\u0091\u0092\7@\2\2\u0092*\3\2\2\2\u0093\u0094\7v\2\2\u0094\u0095"+
		"\7t\2\2\u0095\u0096\7w\2\2\u0096\u009d\7g\2\2\u0097\u0098\7h\2\2\u0098"+
		"\u0099\7c\2\2\u0099\u009a\7n\2\2\u009a\u009b\7u\2\2\u009b\u009d\7g\2\2"+
		"\u009c\u0093\3\2\2\2\u009c\u0097\3\2\2\2\u009d,\3\2\2\2\u009e\u009f\7"+
		"h\2\2\u009f\u00a0\7n\2\2\u00a0\u00a1\7q\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3"+
		"\7v\2\2\u00a3.\3\2\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6\7p\2\2\u00a6\u00a7"+
		"\7v\2\2\u00a7\60\3\2\2\2\u00a8\u00a9\7d\2\2\u00a9\u00aa\7q\2\2\u00aa\u00ab"+
		"\7q\2\2\u00ab\u00ac\7n\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7c\2\2\u00ae"+
		"\u00af\7p\2\2\u00af\62\3\2\2\2\u00b0\u00b1\7u\2\2\u00b1\u00b2\7v\2\2\u00b2"+
		"\u00b3\7t\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7p\2\2\u00b5\u00b6\7i\2\2"+
		"\u00b6\64\3\2\2\2\u00b7\u00b8\7x\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7"+
		"k\2\2\u00ba\u00bb\7f\2\2\u00bb\66\3\2\2\2\u00bc\u00bd\7?\2\2\u00bd8\3"+
		"\2\2\2\u00be\u00bf\7-\2\2\u00bf:\3\2\2\2\u00c0\u00c1\7/\2\2\u00c1<\3\2"+
		"\2\2\u00c2\u00c3\7,\2\2\u00c3>\3\2\2\2\u00c4\u00c5\7\61\2\2\u00c5@\3\2"+
		"\2\2\u00c6\u00cb\5I%\2\u00c7\u00ca\5I%\2\u00c8\u00ca\5K&\2\u00c9\u00c7"+
		"\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00ccB\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d0\5K&\2\u00cf"+
		"\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2"+
		"\2\2\u00d2D\3\2\2\2\u00d3\u00d5\5K&\2\u00d4\u00d3\3\2\2\2\u00d5\u00d6"+
		"\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"\u00dc\7\60\2\2\u00d9\u00db\5K&\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2"+
		"\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00e6\3\2\2\2\u00de"+
		"\u00dc\3\2\2\2\u00df\u00e1\7\60\2\2\u00e0\u00e2\5K&\2\u00e1\u00e0\3\2"+
		"\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00e6\3\2\2\2\u00e5\u00d4\3\2\2\2\u00e5\u00df\3\2\2\2\u00e6F\3\2\2\2"+
		"\u00e7\u00ec\7$\2\2\u00e8\u00eb\5M\'\2\u00e9\u00eb\13\2\2\2\u00ea\u00e8"+
		"\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0\7$"+
		"\2\2\u00f0H\3\2\2\2\u00f1\u00f2\t\2\2\2\u00f2J\3\2\2\2\u00f3\u00f4\t\3"+
		"\2\2\u00f4L\3\2\2\2\u00f5\u00f6\7^\2\2\u00f6\u00fa\7$\2\2\u00f7\u00f8"+
		"\7^\2\2\u00f8\u00fa\7^\2\2\u00f9\u00f5\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa"+
		"N\3\2\2\2\u00fb\u00fd\t\4\2\2\u00fc\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2"+
		"\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101"+
		"\b(\2\2\u0101P\3\2\2\2\u0102\u0106\7%\2\2\u0103\u0105\13\2\2\2\u0104\u0103"+
		"\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0107\3\2\2\2\u0106\u0104\3\2\2\2\u0107"+
		"\u0109\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010a\7\f\2\2\u010a\u010b\3\2"+
		"\2\2\u010b\u010c\b)\2\2\u010cR\3\2\2\2\20\2\u009c\u00c9\u00cb\u00d1\u00d6"+
		"\u00dc\u00e3\u00e5\u00ea\u00ec\u00f9\u00fe\u0106\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}