// Generated from c:/Users/thedi/Desktop/ssl-antlr-calculator-main/CommandLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CommandLangParser}.
 */
public interface CommandLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CommandLangParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(CommandLangParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandLangParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(CommandLangParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandLangParser#prefijoCommand}.
	 * @param ctx the parse tree
	 */
	void enterPrefijoCommand(CommandLangParser.PrefijoCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandLangParser#prefijoCommand}.
	 * @param ctx the parse tree
	 */
	void exitPrefijoCommand(CommandLangParser.PrefijoCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandLangParser#nombreCommand}.
	 * @param ctx the parse tree
	 */
	void enterNombreCommand(CommandLangParser.NombreCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandLangParser#nombreCommand}.
	 * @param ctx the parse tree
	 */
	void exitNombreCommand(CommandLangParser.NombreCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandLangParser#argumento}.
	 * @param ctx the parse tree
	 */
	void enterArgumento(CommandLangParser.ArgumentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandLangParser#argumento}.
	 * @param ctx the parse tree
	 */
	void exitArgumento(CommandLangParser.ArgumentoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandLangParser#argumentoPosicional}.
	 * @param ctx the parse tree
	 */
	void enterArgumentoPosicional(CommandLangParser.ArgumentoPosicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandLangParser#argumentoPosicional}.
	 * @param ctx the parse tree
	 */
	void exitArgumentoPosicional(CommandLangParser.ArgumentoPosicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandLangParser#argumentoOpcional}.
	 * @param ctx the parse tree
	 */
	void enterArgumentoOpcional(CommandLangParser.ArgumentoOpcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandLangParser#argumentoOpcional}.
	 * @param ctx the parse tree
	 */
	void exitArgumentoOpcional(CommandLangParser.ArgumentoOpcionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandLangParser#nombreArgumento}.
	 * @param ctx the parse tree
	 */
	void enterNombreArgumento(CommandLangParser.NombreArgumentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandLangParser#nombreArgumento}.
	 * @param ctx the parse tree
	 */
	void exitNombreArgumento(CommandLangParser.NombreArgumentoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommandLangParser#valorArgumento}.
	 * @param ctx the parse tree
	 */
	void enterValorArgumento(CommandLangParser.ValorArgumentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommandLangParser#valorArgumento}.
	 * @param ctx the parse tree
	 */
	void exitValorArgumento(CommandLangParser.ValorArgumentoContext ctx);
}