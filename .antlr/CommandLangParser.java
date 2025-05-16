// Generated from c:/Users/thedi/Desktop/ssl-antlr-calculator-main/CommandLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CommandLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, TEXTO=7, PALABRA=8, NUMERO=9, 
		ESPACIO=10;
	public static final int
		RULE_comando = 0, RULE_prefijoCommand = 1, RULE_nombreCommand = 2, RULE_argumento = 3, 
		RULE_argumentoPosicional = 4, RULE_argumentoOpcional = 5, RULE_nombreArgumento = 6, 
		RULE_valorArgumento = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"comando", "prefijoCommand", "nombreCommand", "argumento", "argumentoPosicional", 
			"argumentoOpcional", "nombreArgumento", "valorArgumento"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'!'", "'|'", "'#'", "'&'", "'--'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "TEXTO", "PALABRA", "NUMERO", 
			"ESPACIO"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CommandLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CommandLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComandoContext extends ParserRuleContext {
		public PrefijoCommandContext prefijoCommand() {
			return getRuleContext(PrefijoCommandContext.class,0);
		}
		public NombreCommandContext nombreCommand() {
			return getRuleContext(NombreCommandContext.class,0);
		}
		public List<ArgumentoContext> argumento() {
			return getRuleContexts(ArgumentoContext.class);
		}
		public ArgumentoContext argumento(int i) {
			return getRuleContext(ArgumentoContext.class,i);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandLangListener ) ((CommandLangListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandLangListener ) ((CommandLangListener)listener).exitComando(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_comando);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			prefijoCommand();
			setState(17);
			nombreCommand();
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 928L) != 0)) {
				{
				{
				setState(18);
				argumento();
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrefijoCommandContext extends ParserRuleContext {
		public PrefijoCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefijoCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandLangListener ) ((CommandLangListener)listener).enterPrefijoCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandLangListener ) ((CommandLangListener)listener).exitPrefijoCommand(this);
		}
	}

	public final PrefijoCommandContext prefijoCommand() throws RecognitionException {
		PrefijoCommandContext _localctx = new PrefijoCommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_prefijoCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NombreCommandContext extends ParserRuleContext {
		public TerminalNode PALABRA() { return getToken(CommandLangParser.PALABRA, 0); }
		public NombreCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombreCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandLangListener ) ((CommandLangListener)listener).enterNombreCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandLangListener ) ((CommandLangListener)listener).exitNombreCommand(this);
		}
	}

	public final NombreCommandContext nombreCommand() throws RecognitionException {
		NombreCommandContext _localctx = new NombreCommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_nombreCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(PALABRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentoContext extends ParserRuleContext {
		public ArgumentoPosicionalContext argumentoPosicional() {
			return getRuleContext(ArgumentoPosicionalContext.class,0);
		}
		public ArgumentoOpcionalContext argumentoOpcional() {
			return getRuleContext(ArgumentoOpcionalContext.class,0);
		}
		public ArgumentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandLangListener ) ((CommandLangListener)listener).enterArgumento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandLangListener ) ((CommandLangListener)listener).exitArgumento(this);
		}
	}

	public final ArgumentoContext argumento() throws RecognitionException {
		ArgumentoContext _localctx = new ArgumentoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_argumento);
		try {
			setState(30);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXTO:
			case PALABRA:
			case NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				argumentoPosicional();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				argumentoOpcional();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentoPosicionalContext extends ParserRuleContext {
		public TerminalNode TEXTO() { return getToken(CommandLangParser.TEXTO, 0); }
		public TerminalNode PALABRA() { return getToken(CommandLangParser.PALABRA, 0); }
		public TerminalNode NUMERO() { return getToken(CommandLangParser.NUMERO, 0); }
		public ArgumentoPosicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentoPosicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandLangListener ) ((CommandLangListener)listener).enterArgumentoPosicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandLangListener ) ((CommandLangListener)listener).exitArgumentoPosicional(this);
		}
	}

	public final ArgumentoPosicionalContext argumentoPosicional() throws RecognitionException {
		ArgumentoPosicionalContext _localctx = new ArgumentoPosicionalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_argumentoPosicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 896L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentoOpcionalContext extends ParserRuleContext {
		public NombreArgumentoContext nombreArgumento() {
			return getRuleContext(NombreArgumentoContext.class,0);
		}
		public ValorArgumentoContext valorArgumento() {
			return getRuleContext(ValorArgumentoContext.class,0);
		}
		public ArgumentoOpcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentoOpcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandLangListener ) ((CommandLangListener)listener).enterArgumentoOpcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandLangListener ) ((CommandLangListener)listener).exitArgumentoOpcional(this);
		}
	}

	public final ArgumentoOpcionalContext argumentoOpcional() throws RecognitionException {
		ArgumentoOpcionalContext _localctx = new ArgumentoOpcionalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_argumentoOpcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(T__4);
			setState(35);
			nombreArgumento();
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(36);
				match(T__5);
				setState(37);
				valorArgumento();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NombreArgumentoContext extends ParserRuleContext {
		public TerminalNode PALABRA() { return getToken(CommandLangParser.PALABRA, 0); }
		public NombreArgumentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombreArgumento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandLangListener ) ((CommandLangListener)listener).enterNombreArgumento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandLangListener ) ((CommandLangListener)listener).exitNombreArgumento(this);
		}
	}

	public final NombreArgumentoContext nombreArgumento() throws RecognitionException {
		NombreArgumentoContext _localctx = new NombreArgumentoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_nombreArgumento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(PALABRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValorArgumentoContext extends ParserRuleContext {
		public TerminalNode TEXTO() { return getToken(CommandLangParser.TEXTO, 0); }
		public TerminalNode PALABRA() { return getToken(CommandLangParser.PALABRA, 0); }
		public TerminalNode NUMERO() { return getToken(CommandLangParser.NUMERO, 0); }
		public ValorArgumentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valorArgumento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandLangListener ) ((CommandLangListener)listener).enterValorArgumento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandLangListener ) ((CommandLangListener)listener).exitValorArgumento(this);
		}
	}

	public final ValorArgumentoContext valorArgumento() throws RecognitionException {
		ValorArgumentoContext _localctx = new ValorArgumentoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_valorArgumento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 896L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\n-\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u0014\b\u0000\n\u0000\f\u0000"+
		"\u0017\t\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u001f\b\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\'\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0000\u0000\b\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0000\u0002\u0001\u0000\u0001\u0004\u0001\u0000"+
		"\u0007\t\'\u0000\u0010\u0001\u0000\u0000\u0000\u0002\u0018\u0001\u0000"+
		"\u0000\u0000\u0004\u001a\u0001\u0000\u0000\u0000\u0006\u001e\u0001\u0000"+
		"\u0000\u0000\b \u0001\u0000\u0000\u0000\n\"\u0001\u0000\u0000\u0000\f"+
		"(\u0001\u0000\u0000\u0000\u000e*\u0001\u0000\u0000\u0000\u0010\u0011\u0003"+
		"\u0002\u0001\u0000\u0011\u0015\u0003\u0004\u0002\u0000\u0012\u0014\u0003"+
		"\u0006\u0003\u0000\u0013\u0012\u0001\u0000\u0000\u0000\u0014\u0017\u0001"+
		"\u0000\u0000\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0015\u0016\u0001"+
		"\u0000\u0000\u0000\u0016\u0001\u0001\u0000\u0000\u0000\u0017\u0015\u0001"+
		"\u0000\u0000\u0000\u0018\u0019\u0007\u0000\u0000\u0000\u0019\u0003\u0001"+
		"\u0000\u0000\u0000\u001a\u001b\u0005\b\u0000\u0000\u001b\u0005\u0001\u0000"+
		"\u0000\u0000\u001c\u001f\u0003\b\u0004\u0000\u001d\u001f\u0003\n\u0005"+
		"\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001e\u001d\u0001\u0000\u0000"+
		"\u0000\u001f\u0007\u0001\u0000\u0000\u0000 !\u0007\u0001\u0000\u0000!"+
		"\t\u0001\u0000\u0000\u0000\"#\u0005\u0005\u0000\u0000#&\u0003\f\u0006"+
		"\u0000$%\u0005\u0006\u0000\u0000%\'\u0003\u000e\u0007\u0000&$\u0001\u0000"+
		"\u0000\u0000&\'\u0001\u0000\u0000\u0000\'\u000b\u0001\u0000\u0000\u0000"+
		"()\u0005\b\u0000\u0000)\r\u0001\u0000\u0000\u0000*+\u0007\u0001\u0000"+
		"\u0000+\u000f\u0001\u0000\u0000\u0000\u0003\u0015\u001e&";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}