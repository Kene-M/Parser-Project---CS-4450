// Generated from MiniPyCode.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MiniPyCodeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, BOOL=16, INT=17, 
		DOUBLE=18, VARNAME=19, STRING=20, NEWLINE=21, WS=22, INDENT=23, DEDENT=24, 
		AND=25, OR=26, NOT=27, IF=28, ELIF=29, ELSE=30, COLON=31, COMP_OP=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "BOOL", "INT", "DOUBLE", 
			"VARNAME", "STRING", "NEWLINE", "WS", "INDENT", "DEDENT", "AND", "OR", 
			"NOT", "IF", "ELIF", "ELSE", "COLON", "COMP_OP"
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


	public MiniPyCodeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniPyCode.g4"; }

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
		"\u0004\u0000 \u00ed\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000fn\b\u000f\u0001\u0010\u0004\u0010q\b\u0010\u000b"+
		"\u0010\f\u0010r\u0001\u0011\u0004\u0011v\b\u0011\u000b\u0011\f\u0011w"+
		"\u0001\u0011\u0001\u0011\u0004\u0011|\b\u0011\u000b\u0011\f\u0011}\u0001"+
		"\u0012\u0001\u0012\u0005\u0012\u0082\b\u0012\n\u0012\f\u0012\u0085\t\u0012"+
		"\u0001\u0013\u0001\u0013\u0005\u0013\u0089\b\u0013\n\u0013\f\u0013\u008c"+
		"\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0091\b\u0013"+
		"\n\u0013\f\u0013\u0094\t\u0013\u0001\u0013\u0003\u0013\u0097\b\u0013\u0001"+
		"\u0014\u0004\u0014\u009a\b\u0014\u000b\u0014\f\u0014\u009b\u0001\u0015"+
		"\u0004\u0015\u009f\b\u0015\u000b\u0015\f\u0015\u00a0\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003"+
		"\u001f\u00ec\b\u001f\u0000\u0000 \u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012"+
		"%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c"+
		"9\u001d;\u001e=\u001f? \u0001\u0000\b\u0001\u000009\u0003\u0000AZ__az"+
		"\u0004\u000009AZ__az\u0002\u0000\"\"\\\\\u0002\u0000\'\'\\\\\u0002\u0000"+
		"\n\n\r\r\u0001\u0000  \u0002\u0000<<>>\u00ff\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"+
		"\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000"+
		"\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000"+
		"\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001"+
		"\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000"+
		"\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000"+
		"\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?"+
		"\u0001\u0000\u0000\u0000\u0001A\u0001\u0000\u0000\u0000\u0003C\u0001\u0000"+
		"\u0000\u0000\u0005E\u0001\u0000\u0000\u0000\u0007G\u0001\u0000\u0000\u0000"+
		"\tI\u0001\u0000\u0000\u0000\u000bK\u0001\u0000\u0000\u0000\rM\u0001\u0000"+
		"\u0000\u0000\u000fP\u0001\u0000\u0000\u0000\u0011S\u0001\u0000\u0000\u0000"+
		"\u0013V\u0001\u0000\u0000\u0000\u0015Y\u0001\u0000\u0000\u0000\u0017\\"+
		"\u0001\u0000\u0000\u0000\u0019^\u0001\u0000\u0000\u0000\u001b`\u0001\u0000"+
		"\u0000\u0000\u001db\u0001\u0000\u0000\u0000\u001fm\u0001\u0000\u0000\u0000"+
		"!p\u0001\u0000\u0000\u0000#u\u0001\u0000\u0000\u0000%\u007f\u0001\u0000"+
		"\u0000\u0000\'\u0096\u0001\u0000\u0000\u0000)\u0099\u0001\u0000\u0000"+
		"\u0000+\u009e\u0001\u0000\u0000\u0000-\u00a4\u0001\u0000\u0000\u0000/"+
		"\u00ad\u0001\u0000\u0000\u00001\u00b6\u0001\u0000\u0000\u00003\u00ba\u0001"+
		"\u0000\u0000\u00005\u00bd\u0001\u0000\u0000\u00007\u00c1\u0001\u0000\u0000"+
		"\u00009\u00c4\u0001\u0000\u0000\u0000;\u00c9\u0001\u0000\u0000\u0000="+
		"\u00ce\u0001\u0000\u0000\u0000?\u00eb\u0001\u0000\u0000\u0000AB\u0005"+
		"+\u0000\u0000B\u0002\u0001\u0000\u0000\u0000CD\u0005-\u0000\u0000D\u0004"+
		"\u0001\u0000\u0000\u0000EF\u0005*\u0000\u0000F\u0006\u0001\u0000\u0000"+
		"\u0000GH\u0005/\u0000\u0000H\b\u0001\u0000\u0000\u0000IJ\u0005%\u0000"+
		"\u0000J\n\u0001\u0000\u0000\u0000KL\u0005=\u0000\u0000L\f\u0001\u0000"+
		"\u0000\u0000MN\u0005+\u0000\u0000NO\u0005=\u0000\u0000O\u000e\u0001\u0000"+
		"\u0000\u0000PQ\u0005-\u0000\u0000QR\u0005=\u0000\u0000R\u0010\u0001\u0000"+
		"\u0000\u0000ST\u0005*\u0000\u0000TU\u0005=\u0000\u0000U\u0012\u0001\u0000"+
		"\u0000\u0000VW\u0005/\u0000\u0000WX\u0005=\u0000\u0000X\u0014\u0001\u0000"+
		"\u0000\u0000YZ\u0005%\u0000\u0000Z[\u0005=\u0000\u0000[\u0016\u0001\u0000"+
		"\u0000\u0000\\]\u0005;\u0000\u0000]\u0018\u0001\u0000\u0000\u0000^_\u0005"+
		"[\u0000\u0000_\u001a\u0001\u0000\u0000\u0000`a\u0005,\u0000\u0000a\u001c"+
		"\u0001\u0000\u0000\u0000bc\u0005]\u0000\u0000c\u001e\u0001\u0000\u0000"+
		"\u0000de\u0005T\u0000\u0000ef\u0005r\u0000\u0000fg\u0005u\u0000\u0000"+
		"gn\u0005e\u0000\u0000hi\u0005F\u0000\u0000ij\u0005a\u0000\u0000jk\u0005"+
		"l\u0000\u0000kl\u0005s\u0000\u0000ln\u0005e\u0000\u0000md\u0001\u0000"+
		"\u0000\u0000mh\u0001\u0000\u0000\u0000n \u0001\u0000\u0000\u0000oq\u0007"+
		"\u0000\u0000\u0000po\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000"+
		"rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000s\"\u0001\u0000\u0000"+
		"\u0000tv\u0007\u0000\u0000\u0000ut\u0001\u0000\u0000\u0000vw\u0001\u0000"+
		"\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xy\u0001"+
		"\u0000\u0000\u0000y{\u0005.\u0000\u0000z|\u0007\u0000\u0000\u0000{z\u0001"+
		"\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000"+
		"}~\u0001\u0000\u0000\u0000~$\u0001\u0000\u0000\u0000\u007f\u0083\u0007"+
		"\u0001\u0000\u0000\u0080\u0082\u0007\u0002\u0000\u0000\u0081\u0080\u0001"+
		"\u0000\u0000\u0000\u0082\u0085\u0001\u0000\u0000\u0000\u0083\u0081\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084&\u0001\u0000"+
		"\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0086\u008a\u0005\"\u0000"+
		"\u0000\u0087\u0089\b\u0003\u0000\u0000\u0088\u0087\u0001\u0000\u0000\u0000"+
		"\u0089\u008c\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000"+
		"\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008d\u0001\u0000\u0000\u0000"+
		"\u008c\u008a\u0001\u0000\u0000\u0000\u008d\u0097\u0005\"\u0000\u0000\u008e"+
		"\u0092\u0005\'\u0000\u0000\u008f\u0091\b\u0004\u0000\u0000\u0090\u008f"+
		"\u0001\u0000\u0000\u0000\u0091\u0094\u0001\u0000\u0000\u0000\u0092\u0090"+
		"\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0095"+
		"\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0095\u0097"+
		"\u0005\'\u0000\u0000\u0096\u0086\u0001\u0000\u0000\u0000\u0096\u008e\u0001"+
		"\u0000\u0000\u0000\u0097(\u0001\u0000\u0000\u0000\u0098\u009a\u0007\u0005"+
		"\u0000\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000"+
		"\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000"+
		"\u0000\u0000\u009c*\u0001\u0000\u0000\u0000\u009d\u009f\u0007\u0006\u0000"+
		"\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3\u0006\u0015\u0000"+
		"\u0000\u00a3,\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005<\u0000\u0000\u00a5"+
		"\u00a6\u0005I\u0000\u0000\u00a6\u00a7\u0005N\u0000\u0000\u00a7\u00a8\u0005"+
		"D\u0000\u0000\u00a8\u00a9\u0005E\u0000\u0000\u00a9\u00aa\u0005N\u0000"+
		"\u0000\u00aa\u00ab\u0005T\u0000\u0000\u00ab\u00ac\u0005>\u0000\u0000\u00ac"+
		".\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005<\u0000\u0000\u00ae\u00af\u0005"+
		"D\u0000\u0000\u00af\u00b0\u0005E\u0000\u0000\u00b0\u00b1\u0005D\u0000"+
		"\u0000\u00b1\u00b2\u0005E\u0000\u0000\u00b2\u00b3\u0005N\u0000\u0000\u00b3"+
		"\u00b4\u0005T\u0000\u0000\u00b4\u00b5\u0005>\u0000\u0000\u00b50\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b7\u0005a\u0000\u0000\u00b7\u00b8\u0005n\u0000"+
		"\u0000\u00b8\u00b9\u0005d\u0000\u0000\u00b92\u0001\u0000\u0000\u0000\u00ba"+
		"\u00bb\u0005o\u0000\u0000\u00bb\u00bc\u0005r\u0000\u0000\u00bc4\u0001"+
		"\u0000\u0000\u0000\u00bd\u00be\u0005n\u0000\u0000\u00be\u00bf\u0005o\u0000"+
		"\u0000\u00bf\u00c0\u0005t\u0000\u0000\u00c06\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c2\u0005i\u0000\u0000\u00c2\u00c3\u0005f\u0000\u0000\u00c38\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c5\u0005e\u0000\u0000\u00c5\u00c6\u0005l\u0000"+
		"\u0000\u00c6\u00c7\u0005i\u0000\u0000\u00c7\u00c8\u0005f\u0000\u0000\u00c8"+
		":\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005e\u0000\u0000\u00ca\u00cb\u0005"+
		"l\u0000\u0000\u00cb\u00cc\u0005s\u0000\u0000\u00cc\u00cd\u0005e\u0000"+
		"\u0000\u00cd<\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005:\u0000\u0000\u00cf"+
		">\u0001\u0000\u0000\u0000\u00d0\u00ec\u0007\u0007\u0000\u0000\u00d1\u00d2"+
		"\u0005=\u0000\u0000\u00d2\u00ec\u0005=\u0000\u0000\u00d3\u00d4\u0005>"+
		"\u0000\u0000\u00d4\u00ec\u0005=\u0000\u0000\u00d5\u00d6\u0005<\u0000\u0000"+
		"\u00d6\u00ec\u0005=\u0000\u0000\u00d7\u00d8\u0005<\u0000\u0000\u00d8\u00ec"+
		"\u0005>\u0000\u0000\u00d9\u00da\u0005!\u0000\u0000\u00da\u00ec\u0005="+
		"\u0000\u0000\u00db\u00dc\u0005i\u0000\u0000\u00dc\u00ec\u0005n\u0000\u0000"+
		"\u00dd\u00de\u0005n\u0000\u0000\u00de\u00df\u0005o\u0000\u0000\u00df\u00e0"+
		"\u0005t\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005"+
		"i\u0000\u0000\u00e2\u00ec\u0005n\u0000\u0000\u00e3\u00e4\u0005i\u0000"+
		"\u0000\u00e4\u00ec\u0005s\u0000\u0000\u00e5\u00e6\u0005i\u0000\u0000\u00e6"+
		"\u00e7\u0005s\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00e9"+
		"\u0005n\u0000\u0000\u00e9\u00ea\u0005o\u0000\u0000\u00ea\u00ec\u0005t"+
		"\u0000\u0000\u00eb\u00d0\u0001\u0000\u0000\u0000\u00eb\u00d1\u0001\u0000"+
		"\u0000\u0000\u00eb\u00d3\u0001\u0000\u0000\u0000\u00eb\u00d5\u0001\u0000"+
		"\u0000\u0000\u00eb\u00d7\u0001\u0000\u0000\u0000\u00eb\u00d9\u0001\u0000"+
		"\u0000\u0000\u00eb\u00db\u0001\u0000\u0000\u0000\u00eb\u00dd\u0001\u0000"+
		"\u0000\u0000\u00eb\u00e3\u0001\u0000\u0000\u0000\u00eb\u00e5\u0001\u0000"+
		"\u0000\u0000\u00ec@\u0001\u0000\u0000\u0000\f\u0000mrw}\u0083\u008a\u0092"+
		"\u0096\u009b\u00a0\u00eb\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}