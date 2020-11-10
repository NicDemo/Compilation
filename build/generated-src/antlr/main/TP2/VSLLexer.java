// Generated from VSLLexer.g by ANTLR 4.7.1

  package TP2;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VSLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, COMMENT=2, LP=3, RP=4, PLUS=5, VIRGULE=6, SUB=7, MUL=8, DIV=9, IF=10, 
		ELSE=11, FI=12, THEN=13, AFFECT=14, ACCOLADE_OUVERT=15, ACCOLADE_FERME=16, 
		IDENT=17, TEXT=18, INTEGER=19, INT_DECLARATION=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS", "COMMENT", "LETTER", "DIGIT", "ASCII", "LP", "RP", "PLUS", "VIRGULE", 
		"SUB", "MUL", "DIV", "IF", "ELSE", "FI", "THEN", "AFFECT", "ACCOLADE_OUVERT", 
		"ACCOLADE_FERME", "IDENT", "TEXT", "INTEGER", "INT_DECLARATION"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'('", "')'", "'+'", "','", "'-'", "'*'", "'/'", "'IF'", 
		"'ELSE'", "'FI'", "'THEN'", "':='", "'{'", "'}'", null, null, null, "'INT'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "COMMENT", "LP", "RP", "PLUS", "VIRGULE", "SUB", "MUL", "DIV", 
		"IF", "ELSE", "FI", "THEN", "AFFECT", "ACCOLADE_OUVERT", "ACCOLADE_FERME", 
		"IDENT", "TEXT", "INTEGER", "INT_DECLARATION"
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


	public VSLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "VSLLexer.g"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 20:
			TEXT_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void TEXT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 setText(getText().substring(1, getText().length() - 1)); 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u0086\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3:\n\3\f\3\16\3=\13\3\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\7\25o"+
		"\n\25\f\25\16\25r\13\25\3\26\3\26\7\26v\n\26\f\26\16\26y\13\26\3\26\3"+
		"\26\3\26\3\27\6\27\177\n\27\r\27\16\27\u0080\3\30\3\30\3\30\3\30\2\2\31"+
		"\3\3\5\4\7\2\t\2\13\2\r\5\17\6\21\7\23\b\25\t\27\n\31\13\33\f\35\r\37"+
		"\16!\17#\20%\21\'\22)\23+\24-\25/\26\3\2\5\4\2\13\f\"\"\3\2\f\f\4\2\f"+
		"\f$$\2\u0087\2\3\3\2\2\2\2\5\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5\65\3\2\2"+
		"\2\7@\3\2\2\2\tB\3\2\2\2\13D\3\2\2\2\rF\3\2\2\2\17H\3\2\2\2\21J\3\2\2"+
		"\2\23L\3\2\2\2\25N\3\2\2\2\27P\3\2\2\2\31R\3\2\2\2\33T\3\2\2\2\35W\3\2"+
		"\2\2\37\\\3\2\2\2!_\3\2\2\2#d\3\2\2\2%g\3\2\2\2\'i\3\2\2\2)k\3\2\2\2+"+
		"s\3\2\2\2-~\3\2\2\2/\u0082\3\2\2\2\61\62\t\2\2\2\62\63\3\2\2\2\63\64\b"+
		"\2\2\2\64\4\3\2\2\2\65\66\7\61\2\2\66\67\7\61\2\2\67;\3\2\2\28:\n\3\2"+
		"\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>?\b\3\2"+
		"\2?\6\3\2\2\2@A\4c|\2A\b\3\2\2\2BC\4\62;\2C\n\3\2\2\2DE\n\4\2\2E\f\3\2"+
		"\2\2FG\7*\2\2G\16\3\2\2\2HI\7+\2\2I\20\3\2\2\2JK\7-\2\2K\22\3\2\2\2LM"+
		"\7.\2\2M\24\3\2\2\2NO\7/\2\2O\26\3\2\2\2PQ\7,\2\2Q\30\3\2\2\2RS\7\61\2"+
		"\2S\32\3\2\2\2TU\7K\2\2UV\7H\2\2V\34\3\2\2\2WX\7G\2\2XY\7N\2\2YZ\7U\2"+
		"\2Z[\7G\2\2[\36\3\2\2\2\\]\7H\2\2]^\7K\2\2^ \3\2\2\2_`\7V\2\2`a\7J\2\2"+
		"ab\7G\2\2bc\7P\2\2c\"\3\2\2\2de\7<\2\2ef\7?\2\2f$\3\2\2\2gh\7}\2\2h&\3"+
		"\2\2\2ij\7\177\2\2j(\3\2\2\2kp\5\7\4\2lo\5\7\4\2mo\5\t\5\2nl\3\2\2\2n"+
		"m\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2q*\3\2\2\2rp\3\2\2\2sw\7$\2\2t"+
		"v\5\13\6\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2\2\2"+
		"z{\7$\2\2{|\b\26\3\2|,\3\2\2\2}\177\5\t\5\2~}\3\2\2\2\177\u0080\3\2\2"+
		"\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081.\3\2\2\2\u0082\u0083\7K\2"+
		"\2\u0083\u0084\7P\2\2\u0084\u0085\7V\2\2\u0085\60\3\2\2\2\b\2;npw\u0080"+
		"\4\b\2\2\3\26\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}