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
	 * Enter a parse tree produced by {@link MiniPyCodeParser#endExpr}.
	 * @param ctx the parse tree
	 */
	void enterEndExpr(MiniPyCodeParser.EndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPyCodeParser#endExpr}.
	 * @param ctx the parse tree
	 */
	void exitEndExpr(MiniPyCodeParser.EndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPyCodeParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(MiniPyCodeParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPyCodeParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(MiniPyCodeParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPyCodeParser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void enterIfExpr(MiniPyCodeParser.IfExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPyCodeParser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void exitIfExpr(MiniPyCodeParser.IfExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPyCodeParser#elifExpr}.
	 * @param ctx the parse tree
	 */
	void enterElifExpr(MiniPyCodeParser.ElifExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPyCodeParser#elifExpr}.
	 * @param ctx the parse tree
	 */
	void exitElifExpr(MiniPyCodeParser.ElifExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPyCodeParser#elseExpr}.
	 * @param ctx the parse tree
	 */
	void enterElseExpr(MiniPyCodeParser.ElseExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPyCodeParser#elseExpr}.
	 * @param ctx the parse tree
	 */
	void exitElseExpr(MiniPyCodeParser.ElseExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPyCodeParser#exprBlock}.
	 * @param ctx the parse tree
	 */
	void enterExprBlock(MiniPyCodeParser.ExprBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPyCodeParser#exprBlock}.
	 * @param ctx the parse tree
	 */
	void exitExprBlock(MiniPyCodeParser.ExprBlockContext ctx);
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