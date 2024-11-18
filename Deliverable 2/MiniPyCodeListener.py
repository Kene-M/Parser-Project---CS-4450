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


    # Enter a parse tree produced by MiniPyCodeParser#stmt.
    def enterStmt(self, ctx:MiniPyCodeParser.StmtContext):
        pass

    # Exit a parse tree produced by MiniPyCodeParser#stmt.
    def exitStmt(self, ctx:MiniPyCodeParser.StmtContext):
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


    # Enter a parse tree produced by MiniPyCodeParser#comp_stmt.
    def enterComp_stmt(self, ctx:MiniPyCodeParser.Comp_stmtContext):
        pass

    # Exit a parse tree produced by MiniPyCodeParser#comp_stmt.
    def exitComp_stmt(self, ctx:MiniPyCodeParser.Comp_stmtContext):
        pass


    # Enter a parse tree produced by MiniPyCodeParser#if_context.
    def enterIf_context(self, ctx:MiniPyCodeParser.If_contextContext):
        pass

    # Exit a parse tree produced by MiniPyCodeParser#if_context.
    def exitIf_context(self, ctx:MiniPyCodeParser.If_contextContext):
        pass


    # Enter a parse tree produced by MiniPyCodeParser#if_stmt.
    def enterIf_stmt(self, ctx:MiniPyCodeParser.If_stmtContext):
        pass

    # Exit a parse tree produced by MiniPyCodeParser#if_stmt.
    def exitIf_stmt(self, ctx:MiniPyCodeParser.If_stmtContext):
        pass


    # Enter a parse tree produced by MiniPyCodeParser#elif_stmt.
    def enterElif_stmt(self, ctx:MiniPyCodeParser.Elif_stmtContext):
        pass

    # Exit a parse tree produced by MiniPyCodeParser#elif_stmt.
    def exitElif_stmt(self, ctx:MiniPyCodeParser.Elif_stmtContext):
        pass


    # Enter a parse tree produced by MiniPyCodeParser#else_stmt.
    def enterElse_stmt(self, ctx:MiniPyCodeParser.Else_stmtContext):
        pass

    # Exit a parse tree produced by MiniPyCodeParser#else_stmt.
    def exitElse_stmt(self, ctx:MiniPyCodeParser.Else_stmtContext):
        pass


    # Enter a parse tree produced by MiniPyCodeParser#block.
    def enterBlock(self, ctx:MiniPyCodeParser.BlockContext):
        pass

    # Exit a parse tree produced by MiniPyCodeParser#block.
    def exitBlock(self, ctx:MiniPyCodeParser.BlockContext):
        pass


    # Enter a parse tree produced by MiniPyCodeParser#condition.
    def enterCondition(self, ctx:MiniPyCodeParser.ConditionContext):
        pass

    # Exit a parse tree produced by MiniPyCodeParser#condition.
    def exitCondition(self, ctx:MiniPyCodeParser.ConditionContext):
        pass


    # Enter a parse tree produced by MiniPyCodeParser#comparision.
    def enterComparision(self, ctx:MiniPyCodeParser.ComparisionContext):
        pass

    # Exit a parse tree produced by MiniPyCodeParser#comparision.
    def exitComparision(self, ctx:MiniPyCodeParser.ComparisionContext):
        pass


    # Enter a parse tree produced by MiniPyCodeParser#comp_op.
    def enterComp_op(self, ctx:MiniPyCodeParser.Comp_opContext):
        pass

    # Exit a parse tree produced by MiniPyCodeParser#comp_op.
    def exitComp_op(self, ctx:MiniPyCodeParser.Comp_opContext):
        pass


    # Enter a parse tree produced by MiniPyCodeParser#list.
    def enterList(self, ctx:MiniPyCodeParser.ListContext):
        pass

    # Exit a parse tree produced by MiniPyCodeParser#list.
    def exitList(self, ctx:MiniPyCodeParser.ListContext):
        pass



del MiniPyCodeParser