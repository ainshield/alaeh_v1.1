// Generated from alaeh.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link alaehParser}.
 */
public interface alaehListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link alaehParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(alaehParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link alaehParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(alaehParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link alaehParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(alaehParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link alaehParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(alaehParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link alaehParser#assignstmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignstmt(alaehParser.AssignstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link alaehParser#assignstmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignstmt(alaehParser.AssignstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link alaehParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void enterIfstmt(alaehParser.IfstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link alaehParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void exitIfstmt(alaehParser.IfstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link alaehParser#elseifstmt}.
	 * @param ctx the parse tree
	 */
	void enterElseifstmt(alaehParser.ElseifstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link alaehParser#elseifstmt}.
	 * @param ctx the parse tree
	 */
	void exitElseifstmt(alaehParser.ElseifstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link alaehParser#elsestmt}.
	 * @param ctx the parse tree
	 */
	void enterElsestmt(alaehParser.ElsestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link alaehParser#elsestmt}.
	 * @param ctx the parse tree
	 */
	void exitElsestmt(alaehParser.ElsestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link alaehParser#endif}.
	 * @param ctx the parse tree
	 */
	void enterEndif(alaehParser.EndifContext ctx);
	/**
	 * Exit a parse tree produced by {@link alaehParser#endif}.
	 * @param ctx the parse tree
	 */
	void exitEndif(alaehParser.EndifContext ctx);
	/**
	 * Enter a parse tree produced by {@link alaehParser#switchstmt}.
	 * @param ctx the parse tree
	 */
	void enterSwitchstmt(alaehParser.SwitchstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link alaehParser#switchstmt}.
	 * @param ctx the parse tree
	 */
	void exitSwitchstmt(alaehParser.SwitchstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link alaehParser#casestmt}.
	 * @param ctx the parse tree
	 */
	void enterCasestmt(alaehParser.CasestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link alaehParser#casestmt}.
	 * @param ctx the parse tree
	 */
	void exitCasestmt(alaehParser.CasestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link alaehParser#conditionstmt}.
	 * @param ctx the parse tree
	 */
	void enterConditionstmt(alaehParser.ConditionstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link alaehParser#conditionstmt}.
	 * @param ctx the parse tree
	 */
	void exitConditionstmt(alaehParser.ConditionstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link alaehParser#forloopstmt}.
	 * @param ctx the parse tree
	 */
	void enterForloopstmt(alaehParser.ForloopstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link alaehParser#forloopstmt}.
	 * @param ctx the parse tree
	 */
	void exitForloopstmt(alaehParser.ForloopstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link alaehParser#printstmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintstmt(alaehParser.PrintstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link alaehParser#printstmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintstmt(alaehParser.PrintstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link alaehParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(alaehParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link alaehParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(alaehParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link alaehParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(alaehParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link alaehParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(alaehParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link alaehParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(alaehParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link alaehParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(alaehParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link alaehParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(alaehParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link alaehParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(alaehParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link alaehParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(alaehParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link alaehParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(alaehParser.StringContext ctx);
}