// Generated from MiniPyCode.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MiniPyCodeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, BOOL=16, INT=17, 
		DOUBLE=18, VARNAME=19, STRING=20, NEWLINE=21, WS=22, INDENT=23, DEDENT=24, 
		AND=25, OR=26, NOT=27, IF=28, ELIF=29, ELSE=30, COLON=31, COMP_OP=32;
	public static final int
		RULE_prog = 0, RULE_expr = 1, RULE_assignment = 2, RULE_endExpr = 3, RULE_cond = 4, 
		RULE_ifExpr = 5, RULE_elifExpr = 6, RULE_elseExpr = 7, RULE_exprBlock = 8, 
		RULE_list = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "expr", "assignment", "endExpr", "cond", "ifExpr", "elifExpr", 
			"elseExpr", "exprBlock", "list"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'%'", "'='", "'+='", "'-='", "'*='", 
			"'/='", "'%='", "';'", "'['", "','", "']'", null, null, null, null, null, 
			null, null, "'<INDENT>'", "'<DEDENT>'", "'and'", "'or'", "'not'", "'if'", 
			"'elif'", "'else'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "BOOL", "INT", "DOUBLE", "VARNAME", "STRING", 
			"NEWLINE", "WS", "INDENT", "DEDENT", "AND", "OR", "NOT", "IF", "ELIF", 
			"ELSE", "COLON", "COMP_OP"
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

	@Override
	public String getGrammarFileName() { return "MiniPyCode.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    import sys
	    from antlr4 import *

	    class PythonLexer(Lexer):
	        def __init__(self, input=None, output=sys.stdout):
	            super().__init__(input, output)
	            self.indents = []            # Stack to track indentation levels
	            self.current_indent = 0       # Current indentation level

	        def reset(self):
	            self.indents = []
	            self.opened = 0
	            super().reset()

	        def nextToken(self):
	            token = super().nextToken()
	            # Check for NEWLINE token to handle indentation
	            if token.type == self.NEWLINE:
	                self.handle_indentation()
	            return token

	        def handle_indentation(self):
	            # Measure leading whitespace on the current line
	            whitespace_count = 0
	            while self._input.LA(1) == ' ' or self._input.LA(1) == '\t':
	                whitespace_count += 1 if self._input.LA(1) == ' ' else 4  # e.g., tab = 4 spaces
	                self._input.consume()

	            # Determine if we need to emit INDENT or DEDENT tokens
	            if whitespace_count > self.current_indent:
	                self.emitToken(self.createToken(self.INDENT))
	                self.indents.append(whitespace_count)
	                self.current_indent = whitespace_count
	            elif whitespace_count < self.current_indent:
	                while self.indents and self.indents[-1] > whitespace_count:
	                    self.indents.pop()
	                    self.emitToken(self.createToken(self.DEDENT))
	                self.current_indent = whitespace_count

	        def createToken(self, tokenType):
	            # Create a new token of a specific type
	            token = CommonToken(self._tokenFactorySourcePair, tokenType, self.DEFAULT_TOKEN_CHANNEL, -1, -1)
	            return token

	public MiniPyCodeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MiniPyCodeParser.EOF, 0); }
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPyCodeListener ) ((MiniPyCodeListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPyCodeListener ) ((MiniPyCodeListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VARNAME) {
				{
				{
				setState(20);
				assignment();
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(26);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(MiniPyCodeParser.BOOL, 0); }
		public TerminalNode INT() { return getToken(MiniPyCodeParser.INT, 0); }
		public TerminalNode VARNAME() { return getToken(MiniPyCodeParser.VARNAME, 0); }
		public TerminalNode DOUBLE() { return getToken(MiniPyCodeParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(MiniPyCodeParser.STRING, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPyCodeListener ) ((MiniPyCodeListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPyCodeListener ) ((MiniPyCodeListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
				{
				setState(29);
				match(BOOL);
				}
				break;
			case INT:
				{
				setState(30);
				match(INT);
				}
				break;
			case VARNAME:
				{
				setState(31);
				match(VARNAME);
				}
				break;
			case DOUBLE:
				{
				setState(32);
				match(DOUBLE);
				}
				break;
			case STRING:
				{
				setState(33);
				match(STRING);
				}
				break;
			case T__12:
				{
				setState(34);
				list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(42);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(37);
					if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
					setState(38);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 62L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(39);
					expr(8);
					}
					} 
				}
				setState(44);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(MiniPyCodeParser.VARNAME, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public EndExprContext endExpr() {
			return getRuleContext(EndExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPyCodeListener ) ((MiniPyCodeListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPyCodeListener ) ((MiniPyCodeListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(VARNAME);
			setState(46);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4032L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(47);
			expr(0);
			setState(48);
			endExpr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class EndExprContext extends ParserRuleContext {
		public EndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPyCodeListener ) ((MiniPyCodeListener)listener).enterEndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPyCodeListener ) ((MiniPyCodeListener)listener).exitEndExpr(this);
		}
	}

	public final EndExprContext endExpr() throws RecognitionException {
		EndExprContext _localctx = new EndExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_endExpr);
		try {
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				match(T__11);
				}
				break;
			case EOF:
			case VARNAME:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class CondContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(MiniPyCodeParser.NOT, 0); }
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMP_OP() { return getToken(MiniPyCodeParser.COMP_OP, 0); }
		public TerminalNode AND() { return getToken(MiniPyCodeParser.AND, 0); }
		public TerminalNode OR() { return getToken(MiniPyCodeParser.OR, 0); }
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPyCodeListener ) ((MiniPyCodeListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPyCodeListener ) ((MiniPyCodeListener)listener).exitCond(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		return cond(0);
	}

	private CondContext cond(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondContext _localctx = new CondContext(_ctx, _parentState);
		CondContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_cond, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				setState(55);
				match(NOT);
				setState(56);
				cond(2);
				}
				break;
			case T__12:
			case BOOL:
			case INT:
			case DOUBLE:
			case VARNAME:
			case STRING:
				{
				setState(57);
				expr(0);
				setState(58);
				match(COMP_OP);
				setState(59);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(69);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new CondContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(63);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(64);
						match(AND);
						setState(65);
						cond(5);
						}
						break;
					case 2:
						{
						_localctx = new CondContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(66);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(67);
						match(OR);
						setState(68);
						cond(4);
						}
						break;
					}
					} 
				}
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfExprContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MiniPyCodeParser.IF, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode COLON() { return getToken(MiniPyCodeParser.COLON, 0); }
		public TerminalNode NEWLINE() { return getToken(MiniPyCodeParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(MiniPyCodeParser.INDENT, 0); }
		public ExprBlockContext exprBlock() {
			return getRuleContext(ExprBlockContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(MiniPyCodeParser.DEDENT, 0); }
		public List<ElifExprContext> elifExpr() {
			return getRuleContexts(ElifExprContext.class);
		}
		public ElifExprContext elifExpr(int i) {
			return getRuleContext(ElifExprContext.class,i);
		}
		public ElseExprContext elseExpr() {
			return getRuleContext(ElseExprContext.class,0);
		}
		public IfExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPyCodeListener ) ((MiniPyCodeListener)listener).enterIfExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPyCodeListener ) ((MiniPyCodeListener)listener).exitIfExpr(this);
		}
	}

	public final IfExprContext ifExpr() throws RecognitionException {
		IfExprContext _localctx = new IfExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(IF);
			setState(75);
			cond(0);
			setState(76);
			match(COLON);
			setState(77);
			match(NEWLINE);
			setState(78);
			match(INDENT);
			setState(79);
			exprBlock();
			setState(80);
			match(DEDENT);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(81);
				elifExpr();
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(87);
				elseExpr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElifExprContext extends ParserRuleContext {
		public TerminalNode ELIF() { return getToken(MiniPyCodeParser.ELIF, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode COLON() { return getToken(MiniPyCodeParser.COLON, 0); }
		public TerminalNode NEWLINE() { return getToken(MiniPyCodeParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(MiniPyCodeParser.INDENT, 0); }
		public ExprBlockContext exprBlock() {
			return getRuleContext(ExprBlockContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(MiniPyCodeParser.DEDENT, 0); }
		public ElifExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPyCodeListener ) ((MiniPyCodeListener)listener).enterElifExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPyCodeListener ) ((MiniPyCodeListener)listener).exitElifExpr(this);
		}
	}

	public final ElifExprContext elifExpr() throws RecognitionException {
		ElifExprContext _localctx = new ElifExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_elifExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(ELIF);
			setState(91);
			cond(0);
			setState(92);
			match(COLON);
			setState(93);
			match(NEWLINE);
			setState(94);
			match(INDENT);
			setState(95);
			exprBlock();
			setState(96);
			match(DEDENT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElseExprContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(MiniPyCodeParser.ELSE, 0); }
		public TerminalNode COLON() { return getToken(MiniPyCodeParser.COLON, 0); }
		public TerminalNode NEWLINE() { return getToken(MiniPyCodeParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(MiniPyCodeParser.INDENT, 0); }
		public ExprBlockContext exprBlock() {
			return getRuleContext(ExprBlockContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(MiniPyCodeParser.DEDENT, 0); }
		public ElseExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPyCodeListener ) ((MiniPyCodeListener)listener).enterElseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPyCodeListener ) ((MiniPyCodeListener)listener).exitElseExpr(this);
		}
	}

	public final ElseExprContext elseExpr() throws RecognitionException {
		ElseExprContext _localctx = new ElseExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_elseExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(ELSE);
			setState(99);
			match(COLON);
			setState(100);
			match(NEWLINE);
			setState(101);
			match(INDENT);
			setState(102);
			exprBlock();
			setState(103);
			match(DEDENT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprBlockContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPyCodeListener ) ((MiniPyCodeListener)listener).enterExprBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPyCodeListener ) ((MiniPyCodeListener)listener).exitExprBlock(this);
		}
	}

	public final ExprBlockContext exprBlock() throws RecognitionException {
		ExprBlockContext _localctx = new ExprBlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_exprBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(105);
				expr(0);
				}
				}
				setState(108); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2039808L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPyCodeListener ) ((MiniPyCodeListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPyCodeListener ) ((MiniPyCodeListener)listener).exitList(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(T__12);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2039808L) != 0)) {
				{
				setState(111);
				expr(0);
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(112);
					match(T__13);
					setState(113);
					expr(0);
					}
					}
					setState(118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(121);
			match(T__14);
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
		case 1:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 4:
			return cond_sempred((CondContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean cond_sempred(CondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001 |\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007"+
		"\b\u0002\t\u0007\t\u0001\u0000\u0005\u0000\u0016\b\u0000\n\u0000\f\u0000"+
		"\u0019\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001$\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001)\b\u0001\n\u0001\f\u0001"+
		",\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0003\u00035\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		">\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004F\b\u0004\n\u0004\f\u0004I\t\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005S\b\u0005\n\u0005\f\u0005V\t\u0005\u0001\u0005"+
		"\u0003\u0005Y\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0004"+
		"\bk\b\b\u000b\b\f\bl\u0001\t\u0001\t\u0001\t\u0001\t\u0005\ts\b\t\n\t"+
		"\f\tv\t\t\u0003\tx\b\t\u0001\t\u0001\t\u0001\t\u0000\u0002\u0002\b\n\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0000\u0002\u0001\u0000\u0001"+
		"\u0005\u0001\u0000\u0006\u000b\u0081\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0002#\u0001\u0000\u0000\u0000\u0004-\u0001\u0000\u0000\u0000\u00064"+
		"\u0001\u0000\u0000\u0000\b=\u0001\u0000\u0000\u0000\nJ\u0001\u0000\u0000"+
		"\u0000\fZ\u0001\u0000\u0000\u0000\u000eb\u0001\u0000\u0000\u0000\u0010"+
		"j\u0001\u0000\u0000\u0000\u0012n\u0001\u0000\u0000\u0000\u0014\u0016\u0003"+
		"\u0004\u0002\u0000\u0015\u0014\u0001\u0000\u0000\u0000\u0016\u0019\u0001"+
		"\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0017\u0018\u0001"+
		"\u0000\u0000\u0000\u0018\u001a\u0001\u0000\u0000\u0000\u0019\u0017\u0001"+
		"\u0000\u0000\u0000\u001a\u001b\u0005\u0000\u0000\u0001\u001b\u0001\u0001"+
		"\u0000\u0000\u0000\u001c\u001d\u0006\u0001\uffff\uffff\u0000\u001d$\u0005"+
		"\u0010\u0000\u0000\u001e$\u0005\u0011\u0000\u0000\u001f$\u0005\u0013\u0000"+
		"\u0000 $\u0005\u0012\u0000\u0000!$\u0005\u0014\u0000\u0000\"$\u0003\u0012"+
		"\t\u0000#\u001c\u0001\u0000\u0000\u0000#\u001e\u0001\u0000\u0000\u0000"+
		"#\u001f\u0001\u0000\u0000\u0000# \u0001\u0000\u0000\u0000#!\u0001\u0000"+
		"\u0000\u0000#\"\u0001\u0000\u0000\u0000$*\u0001\u0000\u0000\u0000%&\n"+
		"\u0007\u0000\u0000&\'\u0007\u0000\u0000\u0000\')\u0003\u0002\u0001\b("+
		"%\u0001\u0000\u0000\u0000),\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000"+
		"\u0000*+\u0001\u0000\u0000\u0000+\u0003\u0001\u0000\u0000\u0000,*\u0001"+
		"\u0000\u0000\u0000-.\u0005\u0013\u0000\u0000./\u0007\u0001\u0000\u0000"+
		"/0\u0003\u0002\u0001\u000001\u0003\u0006\u0003\u00001\u0005\u0001\u0000"+
		"\u0000\u000025\u0005\f\u0000\u000035\u0001\u0000\u0000\u000042\u0001\u0000"+
		"\u0000\u000043\u0001\u0000\u0000\u00005\u0007\u0001\u0000\u0000\u0000"+
		"67\u0006\u0004\uffff\uffff\u000078\u0005\u001b\u0000\u00008>\u0003\b\u0004"+
		"\u00029:\u0003\u0002\u0001\u0000:;\u0005 \u0000\u0000;<\u0003\u0002\u0001"+
		"\u0000<>\u0001\u0000\u0000\u0000=6\u0001\u0000\u0000\u0000=9\u0001\u0000"+
		"\u0000\u0000>G\u0001\u0000\u0000\u0000?@\n\u0004\u0000\u0000@A\u0005\u0019"+
		"\u0000\u0000AF\u0003\b\u0004\u0005BC\n\u0003\u0000\u0000CD\u0005\u001a"+
		"\u0000\u0000DF\u0003\b\u0004\u0004E?\u0001\u0000\u0000\u0000EB\u0001\u0000"+
		"\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001"+
		"\u0000\u0000\u0000H\t\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000"+
		"JK\u0005\u001c\u0000\u0000KL\u0003\b\u0004\u0000LM\u0005\u001f\u0000\u0000"+
		"MN\u0005\u0015\u0000\u0000NO\u0005\u0017\u0000\u0000OP\u0003\u0010\b\u0000"+
		"PT\u0005\u0018\u0000\u0000QS\u0003\f\u0006\u0000RQ\u0001\u0000\u0000\u0000"+
		"SV\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000"+
		"\u0000UX\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000WY\u0003\u000e"+
		"\u0007\u0000XW\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y\u000b"+
		"\u0001\u0000\u0000\u0000Z[\u0005\u001d\u0000\u0000[\\\u0003\b\u0004\u0000"+
		"\\]\u0005\u001f\u0000\u0000]^\u0005\u0015\u0000\u0000^_\u0005\u0017\u0000"+
		"\u0000_`\u0003\u0010\b\u0000`a\u0005\u0018\u0000\u0000a\r\u0001\u0000"+
		"\u0000\u0000bc\u0005\u001e\u0000\u0000cd\u0005\u001f\u0000\u0000de\u0005"+
		"\u0015\u0000\u0000ef\u0005\u0017\u0000\u0000fg\u0003\u0010\b\u0000gh\u0005"+
		"\u0018\u0000\u0000h\u000f\u0001\u0000\u0000\u0000ik\u0003\u0002\u0001"+
		"\u0000ji\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lj\u0001\u0000"+
		"\u0000\u0000lm\u0001\u0000\u0000\u0000m\u0011\u0001\u0000\u0000\u0000"+
		"nw\u0005\r\u0000\u0000ot\u0003\u0002\u0001\u0000pq\u0005\u000e\u0000\u0000"+
		"qs\u0003\u0002\u0001\u0000rp\u0001\u0000\u0000\u0000sv\u0001\u0000\u0000"+
		"\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000ux\u0001\u0000"+
		"\u0000\u0000vt\u0001\u0000\u0000\u0000wo\u0001\u0000\u0000\u0000wx\u0001"+
		"\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000yz\u0005\u000f\u0000\u0000"+
		"z\u0013\u0001\u0000\u0000\u0000\f\u0017#*4=EGTXltw";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}