# Generated from MiniPyCode.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .MiniPyCodeParser import MiniPyCodeParser
else:
    from MiniPyCodeParser import MiniPyCodeParser

# This class defines a complete listener for a parse tree produced by MiniPyCodeParser.
class MiniPyCodeListener(ParseTreeListener):

    # Enter a parse tree produced by MiniPyCodeParser#prog.
    def enterProg(self, ctx:MiniPyCodeParser.ProgContext):
        pass

    # Exit a parse tree produced by MiniPyCodeParser#prog.
    def exitProg(self, ctx:MiniPyCodeParser.ProgContext):
        pass


    # Enter a parse tree produced by MiniPyCodeParser#expr.
    def enterExpr(self, ctx:MiniPyCodeParser.ExprContext):
        pass

    # Exit a parse tree produced by MiniPyCodeParser#expr.
    def exitExpr(self, ctx:MiniPyCodeParser.ExprContext):
        pass


    # Enter a parse tree produced by MiniPyCodeParser#assignment.
    def enterAssignment(self, ctx:MiniPyCodeParser.AssignmentContext):
        pass

    # Exit a parse tree produced by MiniPyCodeParser#assignment.
    def exitAssignment(self, ctx:MiniPyCodeParser.AssignmentContext):
        pass


    # Enter a parse tree produced by MiniPyCodeParser#endExpr.
    def enterEndExpr(self, ctx:MiniPyCodeParser.EndExprContext):
        pass

    # Exit a parse tree produced by MiniPyCodeParser#endExpr.
    def exitEndExpr(self, ctx:MiniPyCodeParser.EndExprContext):
        pass


    # Enter a parse tree produced by MiniPyCodeParser#cond.
    def enterCond(self, ctx:MiniPyCodeParser.CondContext):
        pass

    # Exit a parse tree produced by MiniPyCodeParser#cond.
    def exitCond(self, ctx:MiniPyCodeParser.CondContext):
        pass


    # Enter a parse tree produced by MiniPyCodeParser#ifExpr.
    def enterIfExpr(self, ctx:MiniPyCodeParser.IfExprContext):
        pass

    # Exit a parse tree produced by MiniPyCodeParser#ifExpr.
    def exitIfExpr(self, ctx:MiniPyCodeParser.IfExprContext):
        pass


    # Enter a parse tree produced by MiniPyCodeParser#elifExpr.
    def enterElifExpr(self, ctx:MiniPyCodeParser.ElifExprContext):
        pass

    # Exit a parse tree produced by MiniPyCodeParser#elifExpr.
    def exitElifExpr(self, ctx:MiniPyCodeParser.ElifExprContext):
        pass


    # Enter a parse tree produced by MiniPyCodeParser#elseExpr.
    def enterElseExpr(self, ctx:MiniPyCodeParser.ElseExprContext):
        pass

    # Exit a parse tree produced by MiniPyCodeParser#elseExpr.
    def exitElseExpr(self, ctx:MiniPyCodeParser.ElseExprContext):
        pass


    # Enter a parse tree produced by MiniPyCodeParser#exprBlock.
    def enterExprBlock(self, ctx:MiniPyCodeParser.ExprBlockContext):
        pass

    # Exit a parse tree produced by MiniPyCodeParser#exprBlock.
    def exitExprBlock(self, ctx:MiniPyCodeParser.ExprBlockContext):
        pass


    # Enter a parse tree produced by MiniPyCodeParser#list.
    def enterList(self, ctx:MiniPyCodeParser.ListContext):
        pass

    # Exit a parse tree produced by MiniPyCodeParser#list.
    def exitList(self, ctx:MiniPyCodeParser.ListContext):
        pass



del MiniPyCodeParser