// Generated from Assgin.g4 by ANTLR 4.9

package assgin;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AssginParser}.
 */
public interface AssginListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AssginParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(AssginParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssginParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(AssginParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssginParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(AssginParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssginParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(AssginParser.AssignContext ctx);
}