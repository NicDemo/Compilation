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
		WS=1, COMMENT=2, LP=3, RP=4, PLUS=5, VIRGULE=6, SUB=7, MUL=8, DIV=9, AFFECT=10, 
		ACCOLADE_OUVERT=11, ACCOLADE_FERME=12, IDENT=13, TEXT=14, INTEGER=15, 
		INT_DECLARATION=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS", "COMMENT", "LETTER", "DIGIT", "ASCII", "LP", "RP", "PLUS", "VIRGULE", 
		"SUB", "MUL", "DIV", "AFFECT", "ACCOLADE_OUVERT", "ACCOLADE_FERME", "IDENT", 
		"TEXT", "INTEGER", "INT_DECLARATION"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'('", "')'", "'+'", "','", "'-'", "'*'", "'/'", "':='", 
		"'{'", "'}'", null, null, null, "'INT'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "COMMENT", "LP", "RP", "PLUS", "VIRGULE", "SUB", "MUL", "DIV", 
		"AFFECT", "ACCOLADE_OUVERT", "ACCOLADE_FERME", "IDENT", "TEXT", "INTEGER", 
		"INT_DECLARATION"
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
		case 16:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22n\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3\62\n\3\f\3\16"+
		"\3\65\13\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\21\7\21W\n\21\f\21\16\21Z\13\21\3\22\3\22\7\22^\n\22\f\22\16\22"+
		"a\13\22\3\22\3\22\3\22\3\23\6\23g\n\23\r\23\16\23h\3\24\3\24\3\24\3\24"+
		"\2\2\25\3\3\5\4\7\2\t\2\13\2\r\5\17\6\21\7\23\b\25\t\27\n\31\13\33\f\35"+
		"\r\37\16!\17#\20%\21\'\22\3\2\5\4\2\13\f\"\"\3\2\f\f\4\2\f\f$$\2o\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5"+
		"-\3\2\2\2\78\3\2\2\2\t:\3\2\2\2\13<\3\2\2\2\r>\3\2\2\2\17@\3\2\2\2\21"+
		"B\3\2\2\2\23D\3\2\2\2\25F\3\2\2\2\27H\3\2\2\2\31J\3\2\2\2\33L\3\2\2\2"+
		"\35O\3\2\2\2\37Q\3\2\2\2!S\3\2\2\2#[\3\2\2\2%f\3\2\2\2\'j\3\2\2\2)*\t"+
		"\2\2\2*+\3\2\2\2+,\b\2\2\2,\4\3\2\2\2-.\7\61\2\2./\7\61\2\2/\63\3\2\2"+
		"\2\60\62\n\3\2\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2"+
		"\2\64\66\3\2\2\2\65\63\3\2\2\2\66\67\b\3\2\2\67\6\3\2\2\289\4c|\29\b\3"+
		"\2\2\2:;\4\62;\2;\n\3\2\2\2<=\n\4\2\2=\f\3\2\2\2>?\7*\2\2?\16\3\2\2\2"+
		"@A\7+\2\2A\20\3\2\2\2BC\7-\2\2C\22\3\2\2\2DE\7.\2\2E\24\3\2\2\2FG\7/\2"+
		"\2G\26\3\2\2\2HI\7,\2\2I\30\3\2\2\2JK\7\61\2\2K\32\3\2\2\2LM\7<\2\2MN"+
		"\7?\2\2N\34\3\2\2\2OP\7}\2\2P\36\3\2\2\2QR\7\177\2\2R \3\2\2\2SX\5\7\4"+
		"\2TW\5\7\4\2UW\5\t\5\2VT\3\2\2\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2"+
		"\2Y\"\3\2\2\2ZX\3\2\2\2[_\7$\2\2\\^\5\13\6\2]\\\3\2\2\2^a\3\2\2\2_]\3"+
		"\2\2\2_`\3\2\2\2`b\3\2\2\2a_\3\2\2\2bc\7$\2\2cd\b\22\3\2d$\3\2\2\2eg\5"+
		"\t\5\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2i&\3\2\2\2jk\7K\2\2kl\7"+
		"P\2\2lm\7V\2\2m(\3\2\2\2\b\2\63VX_h\4\b\2\2\3\22\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}