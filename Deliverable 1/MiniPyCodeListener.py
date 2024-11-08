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


    # Enter a parse tree produced by MiniPyCodeParser#list.
    def enterList(self, ctx:MiniPyCodeParser.ListContext):
        pass

    # Exit a parse tree produced by MiniPyCodeParser#list.
    def exitList(self, ctx:MiniPyCodeParser.ListContext):
        pass



del MiniPyCodeParser