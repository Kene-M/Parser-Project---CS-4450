// Generated from MiniPyCode.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniPyCodeParser}.
 */
public interface MiniPyCodeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniPyCodeParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(MiniPyCodeParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPyCodeParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(MiniPyCodeParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPyCodeParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(MiniPyCodeParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPyCodeParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(MiniPyCodeParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPyCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MiniPyCodeParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPyCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MiniPyCodeParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPyCodeParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(MiniPyCodeParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPyCodeParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(MiniPyCodeParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPyCodeParser#comp_stmt}.
	 * @param ctx the parse tree
	 */
	void enterComp_stmt(MiniPyCodeParser.Comp_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPyCodeParser#comp_stmt}.
	 * @param ctx the parse tree
	 */
	void exitComp_stmt(MiniPyCodeParser.Comp_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPyCodeParser#if_context}.
	 * @param ctx the parse tree
	 */
	void enterIf_context(MiniPyCodeParser.If_contextContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPyCodeParser#if_context}.
	 * @param ctx the parse tree
	 */
	void exitIf_context(MiniPyCodeParser.If_contextContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPyCodeParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(MiniPyCodeParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPyCodeParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(MiniPyCodeParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPyCodeParser#elif_stmt}.
	 * @param ctx the parse tree
	 */
	void enterElif_stmt(MiniPyCodeParser.Elif_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPyCodeParser#elif_stmt}.
	 * @param ctx the parse tree
	 */
	void exitElif_stmt(MiniPyCodeParser.Elif_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPyCodeParser#else_stmt}.
	 * @param ctx the parse tree
	 */
	void enterElse_stmt(MiniPyCodeParser.Else_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPyCodeParser#else_stmt}.
	 * @param ctx the parse tree
	 */
	void exitElse_stmt(MiniPyCodeParser.Else_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPyCodeParser#loop_stmt}.
	 * @param ctx the parse tree
	 */
	void enterLoop_stmt(MiniPyCodeParser.Loop_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPyCodeParser#loop_stmt}.
	 * @param ctx the parse tree
	 */
	void exitLoop_stmt(MiniPyCodeParser.Loop_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPyCodeParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(MiniPyCodeParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPyCodeParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(MiniPyCodeParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPyCodeParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(MiniPyCodeParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPyCodeParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(MiniPyCodeParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPyCodeParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(MiniPyCodeParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPyCodeParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(MiniPyCodeParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPyCodeParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MiniPyCodeParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPyCodeParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MiniPyCodeParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPyCodeParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(MiniPyCodeParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPyCodeParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(MiniPyCodeParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPyCodeParser#comparision}.
	 * @param ctx the parse tree
	 */
	void enterComparision(MiniPyCodeParser.ComparisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPyCodeParser#comparision}.
	 * @param ctx the parse tree
	 */
	void exitComparision(MiniPyCodeParser.ComparisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPyCodeParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterComp_op(MiniPyCodeParser.Comp_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPyCodeParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitComp_op(MiniPyCodeParser.Comp_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPyCodeParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(MiniPyCodeParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPyCodeParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(MiniPyCodeParser.ListContext ctx);
}