// Generated from ImportCss.g4 by ANTLR 4.9

package importcss;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ImportCssLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, ID=4, CONTENT=5, Comment=6, Space=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "ID", "CONTENT", "Comment", "Space"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "'\"'", "');'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "ID", "CONTENT", "Comment", "Space"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public ImportCssLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ImportCss.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\tb\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\5\5\35\n\5\3\5\3\5\3\5\5\5\"\n\5\3\5\3\5\3\5\5\5"+
		"\'\n\5\3\5\3\5\3\5\5\5,\n\5\3\5\3\5\3\5\5\5\61\n\5\3\5\3\5\3\5\5\5\66"+
		"\n\5\3\6\6\69\n\6\r\6\16\6:\3\7\3\7\3\7\3\7\7\7A\n\7\f\7\16\7D\13\7\3"+
		"\7\6\7G\n\7\r\7\16\7H\3\7\3\7\7\7M\n\7\f\7\16\7P\13\7\3\7\6\7S\n\7\r\7"+
		"\16\7T\7\7W\n\7\f\7\16\7Z\13\7\3\7\3\7\3\b\6\b_\n\b\r\b\16\b`\2\2\t\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\3\2\6\5\2\62;C\\c|\3\2,,\4\2,,\61\61\5\2"+
		"\13\f\16\17\"\"\2t\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\3\21\3\2\2\2\5\23\3\2\2\2\7\25\3\2\2"+
		"\2\t\30\3\2\2\2\138\3\2\2\2\r<\3\2\2\2\17^\3\2\2\2\21\22\7*\2\2\22\4\3"+
		"\2\2\2\23\24\7$\2\2\24\6\3\2\2\2\25\26\7+\2\2\26\27\7=\2\2\27\b\3\2\2"+
		"\2\30\34\7B\2\2\31\35\7k\2\2\32\35\3\2\2\2\33\35\7K\2\2\34\31\3\2\2\2"+
		"\34\32\3\2\2\2\34\33\3\2\2\2\35!\3\2\2\2\36\"\7o\2\2\37\"\3\2\2\2 \"\7"+
		"O\2\2!\36\3\2\2\2!\37\3\2\2\2! \3\2\2\2\"&\3\2\2\2#\'\7r\2\2$\'\3\2\2"+
		"\2%\'\7R\2\2&#\3\2\2\2&$\3\2\2\2&%\3\2\2\2\'+\3\2\2\2(,\7q\2\2),\3\2\2"+
		"\2*,\7Q\2\2+(\3\2\2\2+)\3\2\2\2+*\3\2\2\2,\60\3\2\2\2-\61\7t\2\2.\61\3"+
		"\2\2\2/\61\7T\2\2\60-\3\2\2\2\60.\3\2\2\2\60/\3\2\2\2\61\65\3\2\2\2\62"+
		"\66\7v\2\2\63\66\3\2\2\2\64\66\7V\2\2\65\62\3\2\2\2\65\63\3\2\2\2\65\64"+
		"\3\2\2\2\66\n\3\2\2\2\679\t\2\2\28\67\3\2\2\29:\3\2\2\2:8\3\2\2\2:;\3"+
		"\2\2\2;\f\3\2\2\2<=\7\61\2\2=>\7,\2\2>B\3\2\2\2?A\n\3\2\2@?\3\2\2\2AD"+
		"\3\2\2\2B@\3\2\2\2BC\3\2\2\2CF\3\2\2\2DB\3\2\2\2EG\7,\2\2FE\3\2\2\2GH"+
		"\3\2\2\2HF\3\2\2\2HI\3\2\2\2IX\3\2\2\2JN\n\4\2\2KM\n\3\2\2LK\3\2\2\2M"+
		"P\3\2\2\2NL\3\2\2\2NO\3\2\2\2OR\3\2\2\2PN\3\2\2\2QS\7,\2\2RQ\3\2\2\2S"+
		"T\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VJ\3\2\2\2WZ\3\2\2\2XV\3\2\2\2"+
		"XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[\\\7\61\2\2\\\16\3\2\2\2]_\t\5\2\2^]\3"+
		"\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\20\3\2\2\2\20\2\34!&+\60\65:BHN"+
		"TX`\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}