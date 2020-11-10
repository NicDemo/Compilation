// Generated from VSLParser.g by ANTLR 4.7.1

  package TP2;

  import java.util.stream.Collectors;
  import java.util.Arrays;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VSLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, COMMENT=2, LP=3, RP=4, PLUS=5, VIRGULE=6, SUB=7, MUL=8, DIV=9, IF=10, 
		ELSE=11, FI=12, THEN=13, AFFECT=14, ACCOLADE_OUVERT=15, ACCOLADE_FERME=16, 
		IDENT=17, TEXT=18, INTEGER=19, INT_DECLARATION=20;
	public static final int
		RULE_program = 0, RULE_instruction = 1, RULE_declaration = 2, RULE_expression = 3, 
		RULE_factor = 4, RULE_primary = 5;
	public static final String[] ruleNames = {
		"program", "instruction", "declaration", "expression", "factor", "primary"
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

	@Override
	public String getGrammarFileName() { return "VSLParser.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VSLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TP2.ASD.Program out;
		public InstructionContext i;
		public TerminalNode EOF() { return getToken(VSLParser.EOF, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			ArrayList<TP2.ASD.Instruction> inst= new ArrayList<>();
			setState(18);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << ACCOLADE_OUVERT) | (1L << IDENT))) != 0)) {
				{
				{
				setState(13);
				((ProgramContext)_localctx).i = instruction();
				inst.add(((ProgramContext)_localctx).i.out);
				}
				}
				setState(20);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(21);
			match(EOF);
			 ((ProgramContext)_localctx).out =  new TP2.ASD.Program(inst);
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

	public static class InstructionContext extends ParserRuleContext {
		public TP2.ASD.Instruction out;
		public DeclarationContext d;
		public InstructionContext i;
		public ExpressionContext cond;
		public Token ident;
		public ExpressionContext e;
		public TerminalNode ACCOLADE_OUVERT() { return getToken(VSLParser.ACCOLADE_OUVERT, 0); }
		public TerminalNode ACCOLADE_FERME() { return getToken(VSLParser.ACCOLADE_FERME, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public TerminalNode IF() { return getToken(VSLParser.IF, 0); }
		public TerminalNode THEN() { return getToken(VSLParser.THEN, 0); }
		public TerminalNode FI() { return getToken(VSLParser.FI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AFFECT() { return getToken(VSLParser.AFFECT, 0); }
		public TerminalNode IDENT() { return getToken(VSLParser.IDENT, 0); }
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruction);
		int _la;
		try {
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACCOLADE_OUVERT:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				match(ACCOLADE_OUVERT);
				ArrayList<TP2.ASD.DeclInstruction> decs = new ArrayList<TP2.ASD.DeclInstruction>();
				ArrayList<TP2.ASD.Instruction> instructions = new ArrayList<TP2.ASD.Instruction>();
				{
				setState(27);
				((InstructionContext)_localctx).d = declaration();
				decs=((InstructionContext)_localctx).d.out;
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << ACCOLADE_OUVERT) | (1L << IDENT))) != 0)) {
					{
					{
					setState(30);
					((InstructionContext)_localctx).i = instruction();
					instructions.add(((InstructionContext)_localctx).i.out);
					}
					}
					setState(37);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((InstructionContext)_localctx).out = new TP2.ASD.Bloc(decs,instructions);
				setState(39);
				match(ACCOLADE_FERME);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				ArrayList<TP2.ASD.Instruction> if_inst = new ArrayList<>(); ArrayList<TP2.ASD.Instruction> else_inst=new ArrayList<>();int a=0;
				setState(42);
				match(IF);
				setState(43);
				((InstructionContext)_localctx).cond = expression();
				setState(44);
				match(THEN);
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << ACCOLADE_OUVERT) | (1L << IDENT))) != 0)) {
					{
					{
					setState(45);
					((InstructionContext)_localctx).i = instruction();
					if_inst.add(((InstructionContext)_localctx).i.out);
					}
					}
					setState(52);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(53);
				match(FI);
				((InstructionContext)_localctx).out = new TP2.ASD.IF(((InstructionContext)_localctx).cond.out,if_inst);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				((InstructionContext)_localctx).ident = match(IDENT);
				setState(57);
				match(AFFECT);
				setState(58);
				((InstructionContext)_localctx).e = expression();
				((InstructionContext)_localctx).out = new TP2.ASD.AffectationInstruction(((InstructionContext)_localctx).ident.getText(),((InstructionContext)_localctx).e.out); 
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

	public static class DeclarationContext extends ParserRuleContext {
		public ArrayList<TP2.ASD.DeclInstruction> out;
		public Token ident;
		public Token ident2;
		public TerminalNode INT_DECLARATION() { return getToken(VSLParser.INT_DECLARATION, 0); }
		public List<TerminalNode> IDENT() { return getTokens(VSLParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(VSLParser.IDENT, i);
		}
		public List<TerminalNode> VIRGULE() { return getTokens(VSLParser.VIRGULE); }
		public TerminalNode VIRGULE(int i) {
			return getToken(VSLParser.VIRGULE, i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			ArrayList<TP2.ASD.DeclInstruction> decls = new ArrayList<TP2.ASD.DeclInstruction>(); 
			{
			setState(64);
			match(INT_DECLARATION);
			setState(65);
			((DeclarationContext)_localctx).ident = match(IDENT);
			decls.add(new TP2.ASD.IntegerDeclaration(((DeclarationContext)_localctx).ident.getText()));
			}
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULE) {
				{
				{
				setState(68);
				match(VIRGULE);
				setState(69);
				((DeclarationContext)_localctx).ident2 = match(IDENT);
				decls.add(new TP2.ASD.IntegerDeclaration(((DeclarationContext)_localctx).ident2.getText()) );
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((DeclarationContext)_localctx).out = decls;
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
		public TP2.ASD.Expression out;
		public FactorContext l;
		public ExpressionContext r;
		public FactorContext f;
		public TerminalNode PLUS() { return getToken(VSLParser.PLUS, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SUB() { return getToken(VSLParser.SUB, 0); }
		public TerminalNode DIV() { return getToken(VSLParser.DIV, 0); }
		public TerminalNode MUL() { return getToken(VSLParser.MUL, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expression);
		try {
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				((ExpressionContext)_localctx).l = factor();
				setState(79);
				match(PLUS);
				setState(80);
				((ExpressionContext)_localctx).r = expression();
				 ((ExpressionContext)_localctx).out =  new TP2.ASD.AddExpression(((ExpressionContext)_localctx).l.out, ((ExpressionContext)_localctx).r.out);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				((ExpressionContext)_localctx).l = factor();
				setState(84);
				match(SUB);
				setState(85);
				((ExpressionContext)_localctx).r = expression();
				((ExpressionContext)_localctx).out =  new TP2.ASD.SubExpression(((ExpressionContext)_localctx).l.out,((ExpressionContext)_localctx).r.out);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				((ExpressionContext)_localctx).l = factor();
				setState(89);
				match(DIV);
				setState(90);
				((ExpressionContext)_localctx).r = expression();
				((ExpressionContext)_localctx).out =  new TP2.ASD.DivExpression(((ExpressionContext)_localctx).l.out,((ExpressionContext)_localctx).r.out);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				((ExpressionContext)_localctx).l = factor();
				setState(94);
				match(MUL);
				setState(95);
				((ExpressionContext)_localctx).r = expression();
				((ExpressionContext)_localctx).out =  new TP2.ASD.MulExpression (((ExpressionContext)_localctx).l.out,((ExpressionContext)_localctx).r.out);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(98);
				((ExpressionContext)_localctx).f = factor();
				 ((ExpressionContext)_localctx).out =  ((ExpressionContext)_localctx).f.out; 
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

	public static class FactorContext extends ParserRuleContext {
		public TP2.ASD.Expression out;
		public PrimaryContext p;
		public Token id;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(VSLParser.IDENT, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_factor);
		try {
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				((FactorContext)_localctx).p = primary();
				 ((FactorContext)_localctx).out =  ((FactorContext)_localctx).p.out; 
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				((FactorContext)_localctx).id = match(IDENT);
				((FactorContext)_localctx).out =  new TP2.ASD.VariableExpression(((FactorContext)_localctx).id.getText());
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

	public static class PrimaryContext extends ParserRuleContext {
		public TP2.ASD.Expression out;
		public Token INTEGER;
		public TerminalNode INTEGER() { return getToken(VSLParser.INTEGER, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			((PrimaryContext)_localctx).INTEGER = match(INTEGER);
			 ((PrimaryContext)_localctx).out =  new TP2.ASD.IntegerExpression((((PrimaryContext)_localctx).INTEGER!=null?Integer.valueOf(((PrimaryContext)_localctx).INTEGER.getText()):0)); 
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26t\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\7\2\23\n\2\f\2\16\2"+
		"\26\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3$\n\3\f\3"+
		"\16\3\'\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\63\n\3\f\3\16"+
		"\3\66\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3@\n\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\7\4J\n\4\f\4\16\4M\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5h\n\5\3\6\3\6\3\6\3\6\3\6\5\6o\n\6\3\7\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f"+
		"\2\2\2x\2\16\3\2\2\2\4?\3\2\2\2\6A\3\2\2\2\bg\3\2\2\2\nn\3\2\2\2\fp\3"+
		"\2\2\2\16\24\b\2\1\2\17\20\5\4\3\2\20\21\b\2\1\2\21\23\3\2\2\2\22\17\3"+
		"\2\2\2\23\26\3\2\2\2\24\22\3\2\2\2\24\25\3\2\2\2\25\27\3\2\2\2\26\24\3"+
		"\2\2\2\27\30\7\2\2\3\30\31\b\2\1\2\31\3\3\2\2\2\32\33\7\21\2\2\33\34\b"+
		"\3\1\2\34\35\b\3\1\2\35\36\5\6\4\2\36\37\b\3\1\2\37%\3\2\2\2 !\5\4\3\2"+
		"!\"\b\3\1\2\"$\3\2\2\2# \3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&(\3\2"+
		"\2\2\'%\3\2\2\2()\b\3\1\2)*\7\22\2\2*@\3\2\2\2+,\b\3\1\2,-\7\f\2\2-.\5"+
		"\b\5\2.\64\7\17\2\2/\60\5\4\3\2\60\61\b\3\1\2\61\63\3\2\2\2\62/\3\2\2"+
		"\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\67\3\2\2\2\66\64\3\2\2"+
		"\2\678\7\16\2\289\b\3\1\29@\3\2\2\2:;\7\23\2\2;<\7\20\2\2<=\5\b\5\2=>"+
		"\b\3\1\2>@\3\2\2\2?\32\3\2\2\2?+\3\2\2\2?:\3\2\2\2@\5\3\2\2\2AB\b\4\1"+
		"\2BC\7\26\2\2CD\7\23\2\2DE\b\4\1\2EK\3\2\2\2FG\7\b\2\2GH\7\23\2\2HJ\b"+
		"\4\1\2IF\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2MK\3\2\2\2NO\b"+
		"\4\1\2O\7\3\2\2\2PQ\5\n\6\2QR\7\7\2\2RS\5\b\5\2ST\b\5\1\2Th\3\2\2\2UV"+
		"\5\n\6\2VW\7\t\2\2WX\5\b\5\2XY\b\5\1\2Yh\3\2\2\2Z[\5\n\6\2[\\\7\13\2\2"+
		"\\]\5\b\5\2]^\b\5\1\2^h\3\2\2\2_`\5\n\6\2`a\7\n\2\2ab\5\b\5\2bc\b\5\1"+
		"\2ch\3\2\2\2de\5\n\6\2ef\b\5\1\2fh\3\2\2\2gP\3\2\2\2gU\3\2\2\2gZ\3\2\2"+
		"\2g_\3\2\2\2gd\3\2\2\2h\t\3\2\2\2ij\5\f\7\2jk\b\6\1\2ko\3\2\2\2lm\7\23"+
		"\2\2mo\b\6\1\2ni\3\2\2\2nl\3\2\2\2o\13\3\2\2\2pq\7\25\2\2qr\b\7\1\2r\r"+
		"\3\2\2\2\t\24%\64?Kgn";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}