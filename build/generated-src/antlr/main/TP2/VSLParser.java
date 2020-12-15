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
		WHILE=17, DO=18, DONE=19, FUNC=20, PROTO=21, RETURN=22, PRINT=23, READ=24, 
		IDENT=25, TEXT=26, INTEGER=27, INT_DECLARATION=28, VOID_DECLARATION=29;
	public static final int
		RULE_program = 0, RULE_function = 1, RULE_instruction = 2, RULE_declaration = 3, 
		RULE_expression = 4, RULE_factor = 5, RULE_primary = 6;
	public static final String[] ruleNames = {
		"program", "function", "instruction", "declaration", "expression", "factor", 
		"primary"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'('", "')'", "'+'", "','", "'-'", "'*'", "'/'", "'IF'", 
		"'ELSE'", "'FI'", "'THEN'", "':='", "'{'", "'}'", "'WHILE'", "'DO'", "'DONE'", 
		"'FUNC'", "'PROTO'", "'RETURN'", "'PRINT'", "'READ'", null, null, null, 
		"'INT'", "'VOID'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "COMMENT", "LP", "RP", "PLUS", "VIRGULE", "SUB", "MUL", "DIV", 
		"IF", "ELSE", "FI", "THEN", "AFFECT", "ACCOLADE_OUVERT", "ACCOLADE_FERME", 
		"WHILE", "DO", "DONE", "FUNC", "PROTO", "RETURN", "PRINT", "READ", "IDENT", 
		"TEXT", "INTEGER", "INT_DECLARATION", "VOID_DECLARATION"
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
		public FunctionContext f;
		public TerminalNode EOF() { return getToken(VSLParser.EOF, 0); }
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
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
			ArrayList<TP2.ASD.ABSFunction> programme =new ArrayList<>();
			setState(18); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(15);
				((ProgramContext)_localctx).f = function();
				programme.add(((ProgramContext)_localctx).f.out);
				}
				}
				setState(20); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FUNC || _la==PROTO );
			((ProgramContext)_localctx).out =  new TP2.ASD.Program(programme);
			setState(23);
			match(EOF);
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

	public static class FunctionContext extends ParserRuleContext {
		public TP2.ASD.ABSFunction out;
		public Token name;
		public Token i;
		public InstructionContext inst;
		public Token arg;
		public TerminalNode FUNC() { return getToken(VSLParser.FUNC, 0); }
		public TerminalNode ACCOLADE_OUVERT() { return getToken(VSLParser.ACCOLADE_OUVERT, 0); }
		public TerminalNode ACCOLADE_FERME() { return getToken(VSLParser.ACCOLADE_FERME, 0); }
		public List<TerminalNode> IDENT() { return getTokens(VSLParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(VSLParser.IDENT, i);
		}
		public TerminalNode INT_DECLARATION() { return getToken(VSLParser.INT_DECLARATION, 0); }
		public TerminalNode VOID_DECLARATION() { return getToken(VSLParser.VOID_DECLARATION, 0); }
		public TerminalNode LP() { return getToken(VSLParser.LP, 0); }
		public TerminalNode RP() { return getToken(VSLParser.RP, 0); }
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public TerminalNode PROTO() { return getToken(VSLParser.PROTO, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		int _la;
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
				enterOuterAlt(_localctx, 1);
				{
				ArrayList<String> params = new ArrayList<>();TP2.ASD.Type type;
				setState(26);
				match(FUNC);
				setState(31);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT_DECLARATION:
					{
					setState(27);
					match(INT_DECLARATION);
					type = new TP2.ASD.Int();
					}
					break;
				case VOID_DECLARATION:
					{
					setState(29);
					match(VOID_DECLARATION);
					type = new TP2.ASD.Void();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(33);
				((FunctionContext)_localctx).name = match(IDENT);
				{
				setState(34);
				match(LP);
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENT) {
					{
					{
					setState(35);
					((FunctionContext)_localctx).i = match(IDENT);
					params.add(((FunctionContext)_localctx).i.getText());
					}
					}
					setState(41);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(42);
				match(RP);
				}
				setState(44);
				match(ACCOLADE_OUVERT);
				{
				setState(45);
				((FunctionContext)_localctx).inst = instruction();
				}
				setState(46);
				match(ACCOLADE_FERME);
				((FunctionContext)_localctx).out =  new TP2.ASD.Function(type,((FunctionContext)_localctx).name.getText(),params,((FunctionContext)_localctx).inst.out);
				}
				break;
			case PROTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				match(PROTO);
				ArrayList<String> params = new ArrayList<>();TP2.ASD.Type type;
				setState(55);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT_DECLARATION:
					{
					setState(51);
					match(INT_DECLARATION);
					type = new TP2.ASD.Int();
					}
					break;
				case VOID_DECLARATION:
					{
					setState(53);
					match(VOID_DECLARATION);
					type = new TP2.ASD.Void();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(57);
				((FunctionContext)_localctx).name = match(IDENT);
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENT) {
					{
					{
					setState(58);
					((FunctionContext)_localctx).arg = match(IDENT);
					params.add(((FunctionContext)_localctx).arg.getText());
					}
					}
					setState(64);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((FunctionContext)_localctx).out =  new TP2.ASD.Protot(type,((FunctionContext)_localctx).name.getText(),params);
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

	public static class InstructionContext extends ParserRuleContext {
		public TP2.ASD.Instruction out;
		public DeclarationContext d;
		public InstructionContext i;
		public ExpressionContext cond;
		public InstructionContext i1;
		public Token ident;
		public ExpressionContext e;
		public ExpressionContext e2;
		public Token id;
		public TerminalNode ACCOLADE_OUVERT() { return getToken(VSLParser.ACCOLADE_OUVERT, 0); }
		public TerminalNode ACCOLADE_FERME() { return getToken(VSLParser.ACCOLADE_FERME, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(VSLParser.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(VSLParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(VSLParser.DO, 0); }
		public TerminalNode DONE() { return getToken(VSLParser.DONE, 0); }
		public TerminalNode AFFECT() { return getToken(VSLParser.AFFECT, 0); }
		public TerminalNode IDENT() { return getToken(VSLParser.IDENT, 0); }
		public TerminalNode RETURN() { return getToken(VSLParser.RETURN, 0); }
		public TerminalNode PRINT() { return getToken(VSLParser.PRINT, 0); }
		public List<TerminalNode> VIRGULE() { return getTokens(VSLParser.VIRGULE); }
		public TerminalNode VIRGULE(int i) {
			return getToken(VSLParser.VIRGULE, i);
		}
		public TerminalNode READ() { return getToken(VSLParser.READ, 0); }
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruction);
		int _la;
		try {
			int _alt;
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACCOLADE_OUVERT:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				match(ACCOLADE_OUVERT);
				ArrayList<TP2.ASD.DeclInstruction> decs = new ArrayList<TP2.ASD.DeclInstruction>();
				ArrayList<TP2.ASD.Instruction> instructions = new ArrayList<TP2.ASD.Instruction>();
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==INT_DECLARATION) {
					{
					{
					setState(71);
					((InstructionContext)_localctx).d = declaration();
					decs=((InstructionContext)_localctx).d.out;
					}
					}
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << ACCOLADE_OUVERT) | (1L << WHILE) | (1L << RETURN) | (1L << PRINT) | (1L << READ) | (1L << IDENT))) != 0)) {
					{
					{
					setState(79);
					((InstructionContext)_localctx).i = instruction();
					instructions.add(((InstructionContext)_localctx).i.out);
					}
					}
					setState(86);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((InstructionContext)_localctx).out = new TP2.ASD.Bloc(decs,instructions);
				setState(88);
				match(ACCOLADE_FERME);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				match(IF);
				setState(90);
				((InstructionContext)_localctx).cond = expression();
				setState(91);
				match(THEN);
				boolean a = false;
				{
				setState(93);
				((InstructionContext)_localctx).i = instruction();
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(94);
					match(ELSE);
					{
					setState(95);
					((InstructionContext)_localctx).i1 = instruction();
					}
					a=true;
					}
				}

				setState(100);
				match(FI);
				if(a){
				      	    ((InstructionContext)_localctx).out = new TP2.ASD.IF(((InstructionContext)_localctx).cond.out,((InstructionContext)_localctx).i.out,((InstructionContext)_localctx).i1.out);
				      	}else{
				      	((InstructionContext)_localctx).out = new TP2.ASD.IF(((InstructionContext)_localctx).cond.out,((InstructionContext)_localctx).i.out,null);}
				      	
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				match(WHILE);
				{
				setState(104);
				((InstructionContext)_localctx).cond = expression();
				}
				setState(105);
				match(DO);
				{
				setState(106);
				((InstructionContext)_localctx).i = instruction();
				}
				setState(107);
				match(DONE);
				((InstructionContext)_localctx).out = new TP2.ASD.While(((InstructionContext)_localctx).cond.out,((InstructionContext)_localctx).i.out);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(110);
				((InstructionContext)_localctx).ident = match(IDENT);
				setState(111);
				match(AFFECT);
				setState(112);
				((InstructionContext)_localctx).e = expression();
				((InstructionContext)_localctx).out = new TP2.ASD.AffectationInstruction(((InstructionContext)_localctx).ident.getText(),((InstructionContext)_localctx).e.out); 
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 5);
				{
				setState(115);
				match(RETURN);
				setState(116);
				((InstructionContext)_localctx).e = expression();
				((InstructionContext)_localctx).out =  new TP2.ASD.Return(((InstructionContext)_localctx).e.out);
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 6);
				{
				setState(119);
				match(PRINT);
				ArrayList<TP2.ASD.Expression> expressions = new ArrayList<>();
				setState(127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(121);
						((InstructionContext)_localctx).e = expression();
						expressions.add(((InstructionContext)_localctx).e.out);
						setState(123);
						match(VIRGULE);
						}
						} 
					}
					setState(129);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				{
				setState(130);
				((InstructionContext)_localctx).e2 = expression();
				expressions.add(((InstructionContext)_localctx).e2.out);
				}
				((InstructionContext)_localctx).out =  new TP2.ASD.Print(expressions);
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 7);
				{
				setState(135);
				match(READ);
				setState(136);
				((InstructionContext)_localctx).id = match(IDENT);
				((InstructionContext)_localctx).out =  new TP2.ASD.Read(((InstructionContext)_localctx).id.getText());
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
		enterRule(_localctx, 6, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			ArrayList<TP2.ASD.DeclInstruction> decls = new ArrayList<TP2.ASD.DeclInstruction>(); 
			{
			setState(141);
			match(INT_DECLARATION);
			setState(142);
			((DeclarationContext)_localctx).ident = match(IDENT);
			decls.add(new TP2.ASD.IntegerDeclaration(((DeclarationContext)_localctx).ident.getText()));
			}
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULE) {
				{
				{
				setState(145);
				match(VIRGULE);
				setState(146);
				((DeclarationContext)_localctx).ident2 = match(IDENT);
				decls.add(new TP2.ASD.IntegerDeclaration(((DeclarationContext)_localctx).ident2.getText()) );
				}
				}
				setState(152);
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
		enterRule(_localctx, 8, RULE_expression);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				((ExpressionContext)_localctx).l = factor();
				setState(156);
				match(PLUS);
				setState(157);
				((ExpressionContext)_localctx).r = expression();
				 ((ExpressionContext)_localctx).out =  new TP2.ASD.AddExpression(((ExpressionContext)_localctx).l.out, ((ExpressionContext)_localctx).r.out);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				((ExpressionContext)_localctx).l = factor();
				setState(161);
				match(SUB);
				setState(162);
				((ExpressionContext)_localctx).r = expression();
				((ExpressionContext)_localctx).out =  new TP2.ASD.SubExpression(((ExpressionContext)_localctx).l.out,((ExpressionContext)_localctx).r.out);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(165);
				((ExpressionContext)_localctx).l = factor();
				setState(166);
				match(DIV);
				setState(167);
				((ExpressionContext)_localctx).r = expression();
				((ExpressionContext)_localctx).out =  new TP2.ASD.DivExpression(((ExpressionContext)_localctx).l.out,((ExpressionContext)_localctx).r.out);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(170);
				((ExpressionContext)_localctx).l = factor();
				setState(171);
				match(MUL);
				setState(172);
				((ExpressionContext)_localctx).r = expression();
				((ExpressionContext)_localctx).out =  new TP2.ASD.MulExpression (((ExpressionContext)_localctx).l.out,((ExpressionContext)_localctx).r.out);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(175);
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
		public ExpressionContext exp;
		public ExpressionContext exp2;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(VSLParser.IDENT, 0); }
		public TerminalNode LP() { return getToken(VSLParser.LP, 0); }
		public TerminalNode RP() { return getToken(VSLParser.RP, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> VIRGULE() { return getTokens(VSLParser.VIRGULE); }
		public TerminalNode VIRGULE(int i) {
			return getToken(VSLParser.VIRGULE, i);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_factor);
		int _la;
		try {
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				((FactorContext)_localctx).p = primary();
				 ((FactorContext)_localctx).out =  ((FactorContext)_localctx).p.out; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				((FactorContext)_localctx).id = match(IDENT);
				((FactorContext)_localctx).out =  new TP2.ASD.VariableExpression(((FactorContext)_localctx).id.getText());
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(185);
				((FactorContext)_localctx).id = match(IDENT);
				setState(186);
				match(LP);
				ArrayList<TP2.ASD.Expression> expressions = new ArrayList<>();
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENT || _la==INTEGER) {
					{
					setState(188);
					((FactorContext)_localctx).exp = expression();
					expressions.add(((FactorContext)_localctx).exp.out);
					setState(196);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VIRGULE) {
						{
						{
						setState(190);
						match(VIRGULE);
						setState(191);
						((FactorContext)_localctx).exp2 = expression();
						expressions.add(((FactorContext)_localctx).exp2.out);
						}
						}
						setState(198);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(201);
				match(RP);
				((FactorContext)_localctx).out =  new TP2.ASD.RezFunction(((FactorContext)_localctx).id.getText(),expressions);
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
		enterRule(_localctx, 12, RULE_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u00d3\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\6\2\25"+
		"\n\2\r\2\16\2\26\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3\"\n\3\3\3\3\3"+
		"\3\3\3\3\7\3(\n\3\f\3\16\3+\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3:\n\3\3\3\3\3\3\3\7\3?\n\3\f\3\16\3B\13\3\3\3\5\3E\n"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4M\n\4\f\4\16\4P\13\4\3\4\3\4\3\4\7\4U\n"+
		"\4\f\4\16\4X\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4e\n\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u0080\n\4\f\4\16\4\u0083\13\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u008d\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\7\5\u0097\n\5\f\5\16\5\u009a\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6"+
		"\u00b5\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7"+
		"\u00c5\n\7\f\7\16\7\u00c8\13\7\5\7\u00ca\n\7\3\7\3\7\5\7\u00ce\n\7\3\b"+
		"\3\b\3\b\3\b\2\2\t\2\4\6\b\n\f\16\2\2\2\u00e4\2\20\3\2\2\2\4D\3\2\2\2"+
		"\6\u008c\3\2\2\2\b\u008e\3\2\2\2\n\u00b4\3\2\2\2\f\u00cd\3\2\2\2\16\u00cf"+
		"\3\2\2\2\20\24\b\2\1\2\21\22\5\4\3\2\22\23\b\2\1\2\23\25\3\2\2\2\24\21"+
		"\3\2\2\2\25\26\3\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\30\3\2\2\2\30\31"+
		"\b\2\1\2\31\32\7\2\2\3\32\3\3\2\2\2\33\34\b\3\1\2\34!\7\26\2\2\35\36\7"+
		"\36\2\2\36\"\b\3\1\2\37 \7\37\2\2 \"\b\3\1\2!\35\3\2\2\2!\37\3\2\2\2\""+
		"#\3\2\2\2#$\7\33\2\2$)\7\5\2\2%&\7\33\2\2&(\b\3\1\2\'%\3\2\2\2(+\3\2\2"+
		"\2)\'\3\2\2\2)*\3\2\2\2*,\3\2\2\2+)\3\2\2\2,-\7\6\2\2-.\3\2\2\2./\7\21"+
		"\2\2/\60\5\6\4\2\60\61\7\22\2\2\61\62\b\3\1\2\62E\3\2\2\2\63\64\7\27\2"+
		"\2\649\b\3\1\2\65\66\7\36\2\2\66:\b\3\1\2\678\7\37\2\28:\b\3\1\29\65\3"+
		"\2\2\29\67\3\2\2\2:;\3\2\2\2;@\7\33\2\2<=\7\33\2\2=?\b\3\1\2><\3\2\2\2"+
		"?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2B@\3\2\2\2CE\b\3\1\2D\33\3\2\2"+
		"\2D\63\3\2\2\2E\5\3\2\2\2FG\7\21\2\2GH\b\4\1\2HN\b\4\1\2IJ\5\b\5\2JK\b"+
		"\4\1\2KM\3\2\2\2LI\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OV\3\2\2\2PN\3"+
		"\2\2\2QR\5\6\4\2RS\b\4\1\2SU\3\2\2\2TQ\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3"+
		"\2\2\2WY\3\2\2\2XV\3\2\2\2YZ\b\4\1\2Z\u008d\7\22\2\2[\\\7\f\2\2\\]\5\n"+
		"\6\2]^\7\17\2\2^_\b\4\1\2_d\5\6\4\2`a\7\r\2\2ab\5\6\4\2bc\b\4\1\2ce\3"+
		"\2\2\2d`\3\2\2\2de\3\2\2\2ef\3\2\2\2fg\7\16\2\2gh\b\4\1\2h\u008d\3\2\2"+
		"\2ij\7\23\2\2jk\5\n\6\2kl\7\24\2\2lm\5\6\4\2mn\7\25\2\2no\b\4\1\2o\u008d"+
		"\3\2\2\2pq\7\33\2\2qr\7\20\2\2rs\5\n\6\2st\b\4\1\2t\u008d\3\2\2\2uv\7"+
		"\30\2\2vw\5\n\6\2wx\b\4\1\2x\u008d\3\2\2\2yz\7\31\2\2z\u0081\b\4\1\2{"+
		"|\5\n\6\2|}\b\4\1\2}~\7\b\2\2~\u0080\3\2\2\2\177{\3\2\2\2\u0080\u0083"+
		"\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0084\u0085\5\n\6\2\u0085\u0086\b\4\1\2\u0086\u0087\3\2"+
		"\2\2\u0087\u0088\b\4\1\2\u0088\u008d\3\2\2\2\u0089\u008a\7\32\2\2\u008a"+
		"\u008b\7\33\2\2\u008b\u008d\b\4\1\2\u008cF\3\2\2\2\u008c[\3\2\2\2\u008c"+
		"i\3\2\2\2\u008cp\3\2\2\2\u008cu\3\2\2\2\u008cy\3\2\2\2\u008c\u0089\3\2"+
		"\2\2\u008d\7\3\2\2\2\u008e\u008f\b\5\1\2\u008f\u0090\7\36\2\2\u0090\u0091"+
		"\7\33\2\2\u0091\u0092\b\5\1\2\u0092\u0098\3\2\2\2\u0093\u0094\7\b\2\2"+
		"\u0094\u0095\7\33\2\2\u0095\u0097\b\5\1\2\u0096\u0093\3\2\2\2\u0097\u009a"+
		"\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009b\u009c\b\5\1\2\u009c\t\3\2\2\2\u009d\u009e\5\f\7\2"+
		"\u009e\u009f\7\7\2\2\u009f\u00a0\5\n\6\2\u00a0\u00a1\b\6\1\2\u00a1\u00b5"+
		"\3\2\2\2\u00a2\u00a3\5\f\7\2\u00a3\u00a4\7\t\2\2\u00a4\u00a5\5\n\6\2\u00a5"+
		"\u00a6\b\6\1\2\u00a6\u00b5\3\2\2\2\u00a7\u00a8\5\f\7\2\u00a8\u00a9\7\13"+
		"\2\2\u00a9\u00aa\5\n\6\2\u00aa\u00ab\b\6\1\2\u00ab\u00b5\3\2\2\2\u00ac"+
		"\u00ad\5\f\7\2\u00ad\u00ae\7\n\2\2\u00ae\u00af\5\n\6\2\u00af\u00b0\b\6"+
		"\1\2\u00b0\u00b5\3\2\2\2\u00b1\u00b2\5\f\7\2\u00b2\u00b3\b\6\1\2\u00b3"+
		"\u00b5\3\2\2\2\u00b4\u009d\3\2\2\2\u00b4\u00a2\3\2\2\2\u00b4\u00a7\3\2"+
		"\2\2\u00b4\u00ac\3\2\2\2\u00b4\u00b1\3\2\2\2\u00b5\13\3\2\2\2\u00b6\u00b7"+
		"\5\16\b\2\u00b7\u00b8\b\7\1\2\u00b8\u00ce\3\2\2\2\u00b9\u00ba\7\33\2\2"+
		"\u00ba\u00ce\b\7\1\2\u00bb\u00bc\7\33\2\2\u00bc\u00bd\7\5\2\2\u00bd\u00c9"+
		"\b\7\1\2\u00be\u00bf\5\n\6\2\u00bf\u00c6\b\7\1\2\u00c0\u00c1\7\b\2\2\u00c1"+
		"\u00c2\5\n\6\2\u00c2\u00c3\b\7\1\2\u00c3\u00c5\3\2\2\2\u00c4\u00c0\3\2"+
		"\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00be\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\7\6\2\2\u00cc\u00ce\b\7\1\2\u00cd"+
		"\u00b6\3\2\2\2\u00cd\u00b9\3\2\2\2\u00cd\u00bb\3\2\2\2\u00ce\r\3\2\2\2"+
		"\u00cf\u00d0\7\35\2\2\u00d0\u00d1\b\b\1\2\u00d1\17\3\2\2\2\22\26!)9@D"+
		"NVd\u0081\u008c\u0098\u00b4\u00c6\u00c9\u00cd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}