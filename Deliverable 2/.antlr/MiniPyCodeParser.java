// Generated from c:/Users/shave/ParseProject/Parser-Project---CS-4450/Deliverable 2/MiniPyCode.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MiniPyCodeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, BOOL=33, INT=34, DOUBLE=35, VARNAME=36, STRING=37, WS=38, NEWLINE=39, 
		INDENT=40, DEDENT=41;
	public static final int
		RULE_prog = 0, RULE_stmt = 1, RULE_expr = 2, RULE_assignment = 3, RULE_comp_stmt = 4, 
		RULE_if_context = 5, RULE_if_stmt = 6, RULE_elif_stmt = 7, RULE_else_stmt = 8, 
		RULE_block = 9, RULE_condition = 10, RULE_comparision = 11, RULE_comp_op = 12, 
		RULE_list = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stmt", "expr", "assignment", "comp_stmt", "if_context", "if_stmt", 
			"elif_stmt", "else_stmt", "block", "condition", "comparision", "comp_op", 
			"list"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'%'", "'='", "'+='", "'-='", "'*='", 
			"'/='", "'%='", "'if'", "':'", "'elif'", "'else'", "'and'", "'or'", "'not'", 
			"'('", "')'", "'<'", "'>'", "'=='", "'>='", "'<='", "'<>'", "'!='", "'in'", 
			"'is'", "'['", "','", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "BOOL", "INT", 
			"DOUBLE", "VARNAME", "STRING", "WS", "NEWLINE", "INDENT", "DEDENT"
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

	public MiniPyCodeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MiniPyCodeParser.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(MiniPyCodeParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MiniPyCodeParser.NEWLINE, i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 618475294720L) != 0)) {
				{
				setState(30);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEWLINE:
					{
					setState(28);
					match(NEWLINE);
					}
					break;
				case T__11:
				case VARNAME:
					{
					setState(29);
					stmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(35);
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
	public static class StmtContext extends ParserRuleContext {
		public Comp_stmtContext comp_stmt() {
			return getRuleContext(Comp_stmtContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MiniPyCodeParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MiniPyCodeParser.NEWLINE, i);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				{
				setState(37);
				comp_stmt();
				}
				break;
			case VARNAME:
				{
				setState(38);
				assignment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(42); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(41);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(44); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
				{
				setState(47);
				match(BOOL);
				}
				break;
			case INT:
				{
				setState(48);
				match(INT);
				}
				break;
			case VARNAME:
				{
				setState(49);
				match(VARNAME);
				}
				break;
			case DOUBLE:
				{
				setState(50);
				match(DOUBLE);
				}
				break;
			case STRING:
				{
				setState(51);
				match(STRING);
				}
				break;
			case T__29:
				{
				setState(52);
				list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(60);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(55);
					if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
					setState(56);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 62L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(57);
					expr(8);
					}
					} 
				}
				setState(62);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(VARNAME);
			setState(64);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4032L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(65);
			expr(0);
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
	public static class Comp_stmtContext extends ParserRuleContext {
		public If_contextContext if_context() {
			return getRuleContext(If_contextContext.class,0);
		}
		public Comp_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_stmt; }
	}

	public final Comp_stmtContext comp_stmt() throws RecognitionException {
		Comp_stmtContext _localctx = new Comp_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_comp_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			if_context();
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
	public static class If_contextContext extends ParserRuleContext {
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public List<Elif_stmtContext> elif_stmt() {
			return getRuleContexts(Elif_stmtContext.class);
		}
		public Elif_stmtContext elif_stmt(int i) {
			return getRuleContext(Elif_stmtContext.class,i);
		}
		public Else_stmtContext else_stmt() {
			return getRuleContext(Else_stmtContext.class,0);
		}
		public If_contextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_context; }
	}

	public final If_contextContext if_context() throws RecognitionException {
		If_contextContext _localctx = new If_contextContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_if_context);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			if_stmt();
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(70);
				elif_stmt();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(76);
				else_stmt();
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
	public static class If_stmtContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__11);
			setState(80);
			condition(0);
			setState(81);
			match(T__12);
			setState(82);
			block();
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
	public static class Elif_stmtContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Elif_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif_stmt; }
	}

	public final Elif_stmtContext elif_stmt() throws RecognitionException {
		Elif_stmtContext _localctx = new Elif_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_elif_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(T__13);
			setState(85);
			condition(0);
			setState(86);
			match(T__12);
			setState(87);
			block();
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
	public static class Else_stmtContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_stmt; }
	}

	public final Else_stmtContext else_stmt() throws RecognitionException {
		Else_stmtContext _localctx = new Else_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_else_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(T__14);
			setState(90);
			match(T__12);
			setState(91);
			block();
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
	public static class BlockContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode NEWLINE() { return getToken(MiniPyCodeParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(MiniPyCodeParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(MiniPyCodeParser.DEDENT, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_block);
		int _la;
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case VARNAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				stmt();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(NEWLINE);
				setState(95);
				match(INDENT);
				setState(97); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(96);
					stmt();
					}
					}
					setState(99); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__11 || _la==VARNAME );
				setState(101);
				match(DEDENT);
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
	public static class ConditionContext extends ParserRuleContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public ComparisionContext comparision() {
			return getRuleContext(ComparisionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				{
				setState(106);
				match(T__17);
				setState(107);
				condition(3);
				}
				break;
			case T__18:
				{
				setState(108);
				match(T__18);
				setState(109);
				condition(0);
				setState(110);
				match(T__19);
				}
				break;
			case T__29:
			case BOOL:
			case INT:
			case DOUBLE:
			case VARNAME:
			case STRING:
				{
				setState(112);
				comparision();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(121);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(115);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(116);
						match(T__15);
						setState(117);
						condition(6);
						}
						break;
					case 2:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(118);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(119);
						match(T__16);
						setState(120);
						condition(5);
						}
						break;
					}
					} 
				}
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
	public static class ComparisionContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Comp_opContext> comp_op() {
			return getRuleContexts(Comp_opContext.class);
		}
		public Comp_opContext comp_op(int i) {
			return getRuleContext(Comp_opContext.class,i);
		}
		public ComparisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparision; }
	}

	public final ComparisionContext comparision() throws RecognitionException {
		ComparisionContext _localctx = new ComparisionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comparision);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			expr(0);
			setState(132);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(127);
					comp_op();
					setState(128);
					expr(0);
					}
					} 
				}
				setState(134);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
	public static class Comp_opContext extends ParserRuleContext {
		public Comp_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_op; }
	}

	public final Comp_opContext comp_op() throws RecognitionException {
		Comp_opContext _localctx = new Comp_opContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_comp_op);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(T__20);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(T__21);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				match(T__22);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(138);
				match(T__23);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(139);
				match(T__24);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(140);
				match(T__25);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(141);
				match(T__26);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(142);
				match(T__27);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(143);
				match(T__17);
				setState(144);
				match(T__27);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(145);
				match(T__28);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(146);
				match(T__28);
				setState(147);
				match(T__17);
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
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(T__29);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 267361714176L) != 0)) {
				{
				setState(151);
				expr(0);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__30) {
					{
					{
					setState(152);
					match(T__30);
					setState(153);
					expr(0);
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(161);
			match(T__31);
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
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 10:
			return condition_sempred((ConditionContext)_localctx, predIndex);
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
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001)\u00a4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0005\u0000\u001f\b"+
		"\u0000\n\u0000\f\u0000\"\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0003\u0001(\b\u0001\u0001\u0001\u0004\u0001+\b\u0001\u000b\u0001"+
		"\f\u0001,\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u00026\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002;\b\u0002\n\u0002\f\u0002>\t\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0005\u0005H\b\u0005\n\u0005\f\u0005K\t\u0005\u0001\u0005"+
		"\u0003\u0005N\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0004"+
		"\tb\b\t\u000b\t\f\tc\u0001\t\u0001\t\u0003\th\b\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\nr\b\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\nz\b\n\n\n\f\n}\t\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0083\b\u000b\n\u000b"+
		"\f\u000b\u0086\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0095"+
		"\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u009b\b\r\n\r\f\r\u009e\t"+
		"\r\u0003\r\u00a0\b\r\u0001\r\u0001\r\u0001\r\u0000\u0002\u0004\u0014\u000e"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u0000\u0002\u0001\u0000\u0001\u0005\u0001\u0000\u0006\u000b\u00b4\u0000"+
		" \u0001\u0000\u0000\u0000\u0002\'\u0001\u0000\u0000\u0000\u00045\u0001"+
		"\u0000\u0000\u0000\u0006?\u0001\u0000\u0000\u0000\bC\u0001\u0000\u0000"+
		"\u0000\nE\u0001\u0000\u0000\u0000\fO\u0001\u0000\u0000\u0000\u000eT\u0001"+
		"\u0000\u0000\u0000\u0010Y\u0001\u0000\u0000\u0000\u0012g\u0001\u0000\u0000"+
		"\u0000\u0014q\u0001\u0000\u0000\u0000\u0016~\u0001\u0000\u0000\u0000\u0018"+
		"\u0094\u0001\u0000\u0000\u0000\u001a\u0096\u0001\u0000\u0000\u0000\u001c"+
		"\u001f\u0005\'\u0000\u0000\u001d\u001f\u0003\u0002\u0001\u0000\u001e\u001c"+
		"\u0001\u0000\u0000\u0000\u001e\u001d\u0001\u0000\u0000\u0000\u001f\"\u0001"+
		"\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000"+
		"\u0000!#\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000#$\u0005\u0000"+
		"\u0000\u0001$\u0001\u0001\u0000\u0000\u0000%(\u0003\b\u0004\u0000&(\u0003"+
		"\u0006\u0003\u0000\'%\u0001\u0000\u0000\u0000\'&\u0001\u0000\u0000\u0000"+
		"(*\u0001\u0000\u0000\u0000)+\u0005\'\u0000\u0000*)\u0001\u0000\u0000\u0000"+
		"+,\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000"+
		"\u0000-\u0003\u0001\u0000\u0000\u0000./\u0006\u0002\uffff\uffff\u0000"+
		"/6\u0005!\u0000\u000006\u0005\"\u0000\u000016\u0005$\u0000\u000026\u0005"+
		"#\u0000\u000036\u0005%\u0000\u000046\u0003\u001a\r\u00005.\u0001\u0000"+
		"\u0000\u000050\u0001\u0000\u0000\u000051\u0001\u0000\u0000\u000052\u0001"+
		"\u0000\u0000\u000053\u0001\u0000\u0000\u000054\u0001\u0000\u0000\u0000"+
		"6<\u0001\u0000\u0000\u000078\n\u0007\u0000\u000089\u0007\u0000\u0000\u0000"+
		"9;\u0003\u0004\u0002\b:7\u0001\u0000\u0000\u0000;>\u0001\u0000\u0000\u0000"+
		"<:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=\u0005\u0001\u0000"+
		"\u0000\u0000><\u0001\u0000\u0000\u0000?@\u0005$\u0000\u0000@A\u0007\u0001"+
		"\u0000\u0000AB\u0003\u0004\u0002\u0000B\u0007\u0001\u0000\u0000\u0000"+
		"CD\u0003\n\u0005\u0000D\t\u0001\u0000\u0000\u0000EI\u0003\f\u0006\u0000"+
		"FH\u0003\u000e\u0007\u0000GF\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000"+
		"\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JM\u0001\u0000"+
		"\u0000\u0000KI\u0001\u0000\u0000\u0000LN\u0003\u0010\b\u0000ML\u0001\u0000"+
		"\u0000\u0000MN\u0001\u0000\u0000\u0000N\u000b\u0001\u0000\u0000\u0000"+
		"OP\u0005\f\u0000\u0000PQ\u0003\u0014\n\u0000QR\u0005\r\u0000\u0000RS\u0003"+
		"\u0012\t\u0000S\r\u0001\u0000\u0000\u0000TU\u0005\u000e\u0000\u0000UV"+
		"\u0003\u0014\n\u0000VW\u0005\r\u0000\u0000WX\u0003\u0012\t\u0000X\u000f"+
		"\u0001\u0000\u0000\u0000YZ\u0005\u000f\u0000\u0000Z[\u0005\r\u0000\u0000"+
		"[\\\u0003\u0012\t\u0000\\\u0011\u0001\u0000\u0000\u0000]h\u0003\u0002"+
		"\u0001\u0000^_\u0005\'\u0000\u0000_a\u0005(\u0000\u0000`b\u0003\u0002"+
		"\u0001\u0000a`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000ca\u0001"+
		"\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000"+
		"ef\u0005)\u0000\u0000fh\u0001\u0000\u0000\u0000g]\u0001\u0000\u0000\u0000"+
		"g^\u0001\u0000\u0000\u0000h\u0013\u0001\u0000\u0000\u0000ij\u0006\n\uffff"+
		"\uffff\u0000jk\u0005\u0012\u0000\u0000kr\u0003\u0014\n\u0003lm\u0005\u0013"+
		"\u0000\u0000mn\u0003\u0014\n\u0000no\u0005\u0014\u0000\u0000or\u0001\u0000"+
		"\u0000\u0000pr\u0003\u0016\u000b\u0000qi\u0001\u0000\u0000\u0000ql\u0001"+
		"\u0000\u0000\u0000qp\u0001\u0000\u0000\u0000r{\u0001\u0000\u0000\u0000"+
		"st\n\u0005\u0000\u0000tu\u0005\u0010\u0000\u0000uz\u0003\u0014\n\u0006"+
		"vw\n\u0004\u0000\u0000wx\u0005\u0011\u0000\u0000xz\u0003\u0014\n\u0005"+
		"ys\u0001\u0000\u0000\u0000yv\u0001\u0000\u0000\u0000z}\u0001\u0000\u0000"+
		"\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|\u0015\u0001"+
		"\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000~\u0084\u0003\u0004\u0002"+
		"\u0000\u007f\u0080\u0003\u0018\f\u0000\u0080\u0081\u0003\u0004\u0002\u0000"+
		"\u0081\u0083\u0001\u0000\u0000\u0000\u0082\u007f\u0001\u0000\u0000\u0000"+
		"\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0017\u0001\u0000\u0000\u0000"+
		"\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u0095\u0005\u0015\u0000\u0000"+
		"\u0088\u0095\u0005\u0016\u0000\u0000\u0089\u0095\u0005\u0017\u0000\u0000"+
		"\u008a\u0095\u0005\u0018\u0000\u0000\u008b\u0095\u0005\u0019\u0000\u0000"+
		"\u008c\u0095\u0005\u001a\u0000\u0000\u008d\u0095\u0005\u001b\u0000\u0000"+
		"\u008e\u0095\u0005\u001c\u0000\u0000\u008f\u0090\u0005\u0012\u0000\u0000"+
		"\u0090\u0095\u0005\u001c\u0000\u0000\u0091\u0095\u0005\u001d\u0000\u0000"+
		"\u0092\u0093\u0005\u001d\u0000\u0000\u0093\u0095\u0005\u0012\u0000\u0000"+
		"\u0094\u0087\u0001\u0000\u0000\u0000\u0094\u0088\u0001\u0000\u0000\u0000"+
		"\u0094\u0089\u0001\u0000\u0000\u0000\u0094\u008a\u0001\u0000\u0000\u0000"+
		"\u0094\u008b\u0001\u0000\u0000\u0000\u0094\u008c\u0001\u0000\u0000\u0000"+
		"\u0094\u008d\u0001\u0000\u0000\u0000\u0094\u008e\u0001\u0000\u0000\u0000"+
		"\u0094\u008f\u0001\u0000\u0000\u0000\u0094\u0091\u0001\u0000\u0000\u0000"+
		"\u0094\u0092\u0001\u0000\u0000\u0000\u0095\u0019\u0001\u0000\u0000\u0000"+
		"\u0096\u009f\u0005\u001e\u0000\u0000\u0097\u009c\u0003\u0004\u0002\u0000"+
		"\u0098\u0099\u0005\u001f\u0000\u0000\u0099\u009b\u0003\u0004\u0002\u0000"+
		"\u009a\u0098\u0001\u0000\u0000\u0000\u009b\u009e\u0001\u0000\u0000\u0000"+
		"\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000"+
		"\u009d\u00a0\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000"+
		"\u009f\u0097\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005 \u0000\u0000\u00a2"+
		"\u001b\u0001\u0000\u0000\u0000\u0011\u001e \',5<IMcgqy{\u0084\u0094\u009c"+
		"\u009f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}