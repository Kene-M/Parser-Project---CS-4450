# Generated from MiniPyCode.g4 by ANTLR 4.13.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,21,58,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,1,0,5,0,12,8,0,
        10,0,12,0,15,9,0,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,3,1,26,8,1,
        1,1,1,1,1,1,5,1,31,8,1,10,1,12,1,34,9,1,1,2,1,2,1,2,1,2,1,2,1,3,
        1,3,3,3,43,8,3,1,4,1,4,1,4,1,4,5,4,49,8,4,10,4,12,4,52,9,4,3,4,54,
        8,4,1,4,1,4,1,4,0,1,2,5,0,2,4,6,8,0,2,1,0,1,5,1,0,6,11,62,0,13,1,
        0,0,0,2,25,1,0,0,0,4,35,1,0,0,0,6,42,1,0,0,0,8,44,1,0,0,0,10,12,
        3,4,2,0,11,10,1,0,0,0,12,15,1,0,0,0,13,11,1,0,0,0,13,14,1,0,0,0,
        14,16,1,0,0,0,15,13,1,0,0,0,16,17,5,0,0,1,17,1,1,0,0,0,18,19,6,1,
        -1,0,19,26,5,16,0,0,20,26,5,17,0,0,21,26,5,19,0,0,22,26,5,18,0,0,
        23,26,5,20,0,0,24,26,3,8,4,0,25,18,1,0,0,0,25,20,1,0,0,0,25,21,1,
        0,0,0,25,22,1,0,0,0,25,23,1,0,0,0,25,24,1,0,0,0,26,32,1,0,0,0,27,
        28,10,7,0,0,28,29,7,0,0,0,29,31,3,2,1,8,30,27,1,0,0,0,31,34,1,0,
        0,0,32,30,1,0,0,0,32,33,1,0,0,0,33,3,1,0,0,0,34,32,1,0,0,0,35,36,
        5,19,0,0,36,37,7,1,0,0,37,38,3,2,1,0,38,39,3,6,3,0,39,5,1,0,0,0,
        40,43,5,12,0,0,41,43,1,0,0,0,42,40,1,0,0,0,42,41,1,0,0,0,43,7,1,
        0,0,0,44,53,5,13,0,0,45,50,3,2,1,0,46,47,5,14,0,0,47,49,3,2,1,0,
        48,46,1,0,0,0,49,52,1,0,0,0,50,48,1,0,0,0,50,51,1,0,0,0,51,54,1,
        0,0,0,52,50,1,0,0,0,53,45,1,0,0,0,53,54,1,0,0,0,54,55,1,0,0,0,55,
        56,5,15,0,0,56,9,1,0,0,0,6,13,25,32,42,50,53
    ]

class MiniPyCodeParser ( Parser ):

    grammarFileName = "MiniPyCode.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'+'", "'-'", "'*'", "'/'", "'%'", "'='", 
                     "'+='", "'-='", "'*='", "'/='", "'%='", "';'", "'['", 
                     "','", "']'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "BOOL", "INT", "DOUBLE", "VARNAME", "STRING", "WS" ]

    RULE_prog = 0
    RULE_expr = 1
    RULE_assignment = 2
    RULE_endExpr = 3
    RULE_list = 4

    ruleNames =  [ "prog", "expr", "assignment", "endExpr", "list" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    T__7=8
    T__8=9
    T__9=10
    T__10=11
    T__11=12
    T__12=13
    T__13=14
    T__14=15
    BOOL=16
    INT=17
    DOUBLE=18
    VARNAME=19
    STRING=20
    WS=21

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ProgContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(MiniPyCodeParser.EOF, 0)

        def assignment(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MiniPyCodeParser.AssignmentContext)
            else:
                return self.getTypedRuleContext(MiniPyCodeParser.AssignmentContext,i)


        def getRuleIndex(self):
            return MiniPyCodeParser.RULE_prog

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterProg" ):
                listener.enterProg(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitProg" ):
                listener.exitProg(self)




    def prog(self):

        localctx = MiniPyCodeParser.ProgContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_prog)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 13
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==19:
                self.state = 10
                self.assignment()
                self.state = 15
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 16
            self.match(MiniPyCodeParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def BOOL(self):
            return self.getToken(MiniPyCodeParser.BOOL, 0)

        def INT(self):
            return self.getToken(MiniPyCodeParser.INT, 0)

        def VARNAME(self):
            return self.getToken(MiniPyCodeParser.VARNAME, 0)

        def DOUBLE(self):
            return self.getToken(MiniPyCodeParser.DOUBLE, 0)

        def STRING(self):
            return self.getToken(MiniPyCodeParser.STRING, 0)

        def list_(self):
            return self.getTypedRuleContext(MiniPyCodeParser.ListContext,0)


        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MiniPyCodeParser.ExprContext)
            else:
                return self.getTypedRuleContext(MiniPyCodeParser.ExprContext,i)


        def getRuleIndex(self):
            return MiniPyCodeParser.RULE_expr

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpr" ):
                listener.enterExpr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpr" ):
                listener.exitExpr(self)



    def expr(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = MiniPyCodeParser.ExprContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 2
        self.enterRecursionRule(localctx, 2, self.RULE_expr, _p)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 25
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [16]:
                self.state = 19
                self.match(MiniPyCodeParser.BOOL)
                pass
            elif token in [17]:
                self.state = 20
                self.match(MiniPyCodeParser.INT)
                pass
            elif token in [19]:
                self.state = 21
                self.match(MiniPyCodeParser.VARNAME)
                pass
            elif token in [18]:
                self.state = 22
                self.match(MiniPyCodeParser.DOUBLE)
                pass
            elif token in [20]:
                self.state = 23
                self.match(MiniPyCodeParser.STRING)
                pass
            elif token in [13]:
                self.state = 24
                self.list_()
                pass
            else:
                raise NoViableAltException(self)

            self._ctx.stop = self._input.LT(-1)
            self.state = 32
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,2,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    localctx = MiniPyCodeParser.ExprContext(self, _parentctx, _parentState)
                    self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                    self.state = 27
                    if not self.precpred(self._ctx, 7):
                        from antlr4.error.Errors import FailedPredicateException
                        raise FailedPredicateException(self, "self.precpred(self._ctx, 7)")
                    self.state = 28
                    _la = self._input.LA(1)
                    if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 62) != 0)):
                        self._errHandler.recoverInline(self)
                    else:
                        self._errHandler.reportMatch(self)
                        self.consume()
                    self.state = 29
                    self.expr(8) 
                self.state = 34
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,2,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx


    class AssignmentContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def VARNAME(self):
            return self.getToken(MiniPyCodeParser.VARNAME, 0)

        def expr(self):
            return self.getTypedRuleContext(MiniPyCodeParser.ExprContext,0)


        def endExpr(self):
            return self.getTypedRuleContext(MiniPyCodeParser.EndExprContext,0)


        def getRuleIndex(self):
            return MiniPyCodeParser.RULE_assignment

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAssignment" ):
                listener.enterAssignment(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAssignment" ):
                listener.exitAssignment(self)




    def assignment(self):

        localctx = MiniPyCodeParser.AssignmentContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_assignment)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 35
            self.match(MiniPyCodeParser.VARNAME)
            self.state = 36
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 4032) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
            self.state = 37
            self.expr(0)
            self.state = 38
            self.endExpr()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class EndExprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return MiniPyCodeParser.RULE_endExpr

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterEndExpr" ):
                listener.enterEndExpr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitEndExpr" ):
                listener.exitEndExpr(self)




    def endExpr(self):

        localctx = MiniPyCodeParser.EndExprContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_endExpr)
        try:
            self.state = 42
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [12]:
                self.enterOuterAlt(localctx, 1)
                self.state = 40
                self.match(MiniPyCodeParser.T__11)
                pass
            elif token in [-1, 19]:
                self.enterOuterAlt(localctx, 2)

                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ListContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MiniPyCodeParser.ExprContext)
            else:
                return self.getTypedRuleContext(MiniPyCodeParser.ExprContext,i)


        def getRuleIndex(self):
            return MiniPyCodeParser.RULE_list

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterList" ):
                listener.enterList(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitList" ):
                listener.exitList(self)




    def list_(self):

        localctx = MiniPyCodeParser.ListContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_list)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 44
            self.match(MiniPyCodeParser.T__12)
            self.state = 53
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & 2039808) != 0):
                self.state = 45
                self.expr(0)
                self.state = 50
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==14:
                    self.state = 46
                    self.match(MiniPyCodeParser.T__13)
                    self.state = 47
                    self.expr(0)
                    self.state = 52
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)



            self.state = 55
            self.match(MiniPyCodeParser.T__14)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx



    def sempred(self, localctx:RuleContext, ruleIndex:int, predIndex:int):
        if self._predicates == None:
            self._predicates = dict()
        self._predicates[1] = self.expr_sempred
        pred = self._predicates.get(ruleIndex, None)
        if pred is None:
            raise Exception("No predicate with index:" + str(ruleIndex))
        else:
            return pred(localctx, predIndex)

    def expr_sempred(self, localctx:ExprContext, predIndex:int):
            if predIndex == 0:
                return self.precpred(self._ctx, 7)
         




