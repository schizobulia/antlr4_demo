// Generated from Structure.g4 by ANTLR 4.9

package structure;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StructureParser}.
 */
public interface StructureListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StructureParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(StructureParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructureParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(StructureParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link StructureParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(StructureParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link StructureParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(StructureParser.ValueContext ctx);
}