// Generated from c:/Users/thedi/Desktop/ssl-antlr-calculator-main/CommandLang.g4 by ANTLR 4.13.2
// jshint ignore: start
import antlr4 from 'antlr4';
import CommandLangListener from './CommandLangListener.js';
import CommandLangVisitor from './CommandLangVisitor.js';

const serializedATN = [4,1,10,45,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,
2,5,7,5,2,6,7,6,2,7,7,7,1,0,1,0,1,0,5,0,20,8,0,10,0,12,0,23,9,0,1,1,1,1,
1,2,1,2,1,3,1,3,3,3,31,8,3,1,4,1,4,1,5,1,5,1,5,1,5,3,5,39,8,5,1,6,1,6,1,
7,1,7,1,7,0,0,8,0,2,4,6,8,10,12,14,0,2,1,0,1,4,1,0,7,9,39,0,16,1,0,0,0,2,
24,1,0,0,0,4,26,1,0,0,0,6,30,1,0,0,0,8,32,1,0,0,0,10,34,1,0,0,0,12,40,1,
0,0,0,14,42,1,0,0,0,16,17,3,2,1,0,17,21,3,4,2,0,18,20,3,6,3,0,19,18,1,0,
0,0,20,23,1,0,0,0,21,19,1,0,0,0,21,22,1,0,0,0,22,1,1,0,0,0,23,21,1,0,0,0,
24,25,7,0,0,0,25,3,1,0,0,0,26,27,5,8,0,0,27,5,1,0,0,0,28,31,3,8,4,0,29,31,
3,10,5,0,30,28,1,0,0,0,30,29,1,0,0,0,31,7,1,0,0,0,32,33,7,1,0,0,33,9,1,0,
0,0,34,35,5,5,0,0,35,38,3,12,6,0,36,37,5,6,0,0,37,39,3,14,7,0,38,36,1,0,
0,0,38,39,1,0,0,0,39,11,1,0,0,0,40,41,5,8,0,0,41,13,1,0,0,0,42,43,7,1,0,
0,43,15,1,0,0,0,3,21,30,38];


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

const sharedContextCache = new antlr4.atn.PredictionContextCache();

export default class CommandLangParser extends antlr4.Parser {

    static grammarFileName = "CommandLang.g4";
    static literalNames = [ null, "'!'", "'|'", "'#'", "'&'", "'--'", "'='" ];
    static symbolicNames = [ null, null, null, null, null, null, null, "TEXTO", 
                             "PALABRA", "NUMERO", "ESPACIO" ];
    static ruleNames = [ "comando", "prefijoCommand", "nombreCommand", "argumento", 
                         "argumentoPosicional", "argumentoOpcional", "nombreArgumento", 
                         "valorArgumento" ];

    constructor(input) {
        super(input);
        this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
        this.ruleNames = CommandLangParser.ruleNames;
        this.literalNames = CommandLangParser.literalNames;
        this.symbolicNames = CommandLangParser.symbolicNames;
    }



	comando() {
	    let localctx = new ComandoContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 0, CommandLangParser.RULE_comando);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 16;
	        this.prefijoCommand();
	        this.state = 17;
	        this.nombreCommand();
	        this.state = 21;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while((((_la) & ~0x1f) === 0 && ((1 << _la) & 928) !== 0)) {
	            this.state = 18;
	            this.argumento();
	            this.state = 23;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	prefijoCommand() {
	    let localctx = new PrefijoCommandContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 2, CommandLangParser.RULE_prefijoCommand);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 24;
	        _la = this._input.LA(1);
	        if(!((((_la) & ~0x1f) === 0 && ((1 << _la) & 30) !== 0))) {
	        this._errHandler.recoverInline(this);
	        }
	        else {
	        	this._errHandler.reportMatch(this);
	            this.consume();
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	nombreCommand() {
	    let localctx = new NombreCommandContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 4, CommandLangParser.RULE_nombreCommand);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 26;
	        this.match(CommandLangParser.PALABRA);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	argumento() {
	    let localctx = new ArgumentoContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 6, CommandLangParser.RULE_argumento);
	    try {
	        this.state = 30;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 7:
	        case 8:
	        case 9:
	            this.enterOuterAlt(localctx, 1);
	            this.state = 28;
	            this.argumentoPosicional();
	            break;
	        case 5:
	            this.enterOuterAlt(localctx, 2);
	            this.state = 29;
	            this.argumentoOpcional();
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	argumentoPosicional() {
	    let localctx = new ArgumentoPosicionalContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 8, CommandLangParser.RULE_argumentoPosicional);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 32;
	        _la = this._input.LA(1);
	        if(!((((_la) & ~0x1f) === 0 && ((1 << _la) & 896) !== 0))) {
	        this._errHandler.recoverInline(this);
	        }
	        else {
	        	this._errHandler.reportMatch(this);
	            this.consume();
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	argumentoOpcional() {
	    let localctx = new ArgumentoOpcionalContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 10, CommandLangParser.RULE_argumentoOpcional);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 34;
	        this.match(CommandLangParser.T__4);
	        this.state = 35;
	        this.nombreArgumento();
	        this.state = 38;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===6) {
	            this.state = 36;
	            this.match(CommandLangParser.T__5);
	            this.state = 37;
	            this.valorArgumento();
	        }

	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	nombreArgumento() {
	    let localctx = new NombreArgumentoContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 12, CommandLangParser.RULE_nombreArgumento);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 40;
	        this.match(CommandLangParser.PALABRA);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	valorArgumento() {
	    let localctx = new ValorArgumentoContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 14, CommandLangParser.RULE_valorArgumento);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 42;
	        _la = this._input.LA(1);
	        if(!((((_la) & ~0x1f) === 0 && ((1 << _la) & 896) !== 0))) {
	        this._errHandler.recoverInline(this);
	        }
	        else {
	        	this._errHandler.reportMatch(this);
	            this.consume();
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}


}

CommandLangParser.EOF = antlr4.Token.EOF;
CommandLangParser.T__0 = 1;
CommandLangParser.T__1 = 2;
CommandLangParser.T__2 = 3;
CommandLangParser.T__3 = 4;
CommandLangParser.T__4 = 5;
CommandLangParser.T__5 = 6;
CommandLangParser.TEXTO = 7;
CommandLangParser.PALABRA = 8;
CommandLangParser.NUMERO = 9;
CommandLangParser.ESPACIO = 10;

CommandLangParser.RULE_comando = 0;
CommandLangParser.RULE_prefijoCommand = 1;
CommandLangParser.RULE_nombreCommand = 2;
CommandLangParser.RULE_argumento = 3;
CommandLangParser.RULE_argumentoPosicional = 4;
CommandLangParser.RULE_argumentoOpcional = 5;
CommandLangParser.RULE_nombreArgumento = 6;
CommandLangParser.RULE_valorArgumento = 7;

class ComandoContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = CommandLangParser.RULE_comando;
    }

	prefijoCommand() {
	    return this.getTypedRuleContext(PrefijoCommandContext,0);
	};

	nombreCommand() {
	    return this.getTypedRuleContext(NombreCommandContext,0);
	};

	argumento = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(ArgumentoContext);
	    } else {
	        return this.getTypedRuleContext(ArgumentoContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof CommandLangListener ) {
	        listener.enterComando(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof CommandLangListener ) {
	        listener.exitComando(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof CommandLangVisitor ) {
	        return visitor.visitComando(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class PrefijoCommandContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = CommandLangParser.RULE_prefijoCommand;
    }


	enterRule(listener) {
	    if(listener instanceof CommandLangListener ) {
	        listener.enterPrefijoCommand(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof CommandLangListener ) {
	        listener.exitPrefijoCommand(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof CommandLangVisitor ) {
	        return visitor.visitPrefijoCommand(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class NombreCommandContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = CommandLangParser.RULE_nombreCommand;
    }

	PALABRA() {
	    return this.getToken(CommandLangParser.PALABRA, 0);
	};

	enterRule(listener) {
	    if(listener instanceof CommandLangListener ) {
	        listener.enterNombreCommand(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof CommandLangListener ) {
	        listener.exitNombreCommand(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof CommandLangVisitor ) {
	        return visitor.visitNombreCommand(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ArgumentoContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = CommandLangParser.RULE_argumento;
    }

	argumentoPosicional() {
	    return this.getTypedRuleContext(ArgumentoPosicionalContext,0);
	};

	argumentoOpcional() {
	    return this.getTypedRuleContext(ArgumentoOpcionalContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof CommandLangListener ) {
	        listener.enterArgumento(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof CommandLangListener ) {
	        listener.exitArgumento(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof CommandLangVisitor ) {
	        return visitor.visitArgumento(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ArgumentoPosicionalContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = CommandLangParser.RULE_argumentoPosicional;
    }

	TEXTO() {
	    return this.getToken(CommandLangParser.TEXTO, 0);
	};

	PALABRA() {
	    return this.getToken(CommandLangParser.PALABRA, 0);
	};

	NUMERO() {
	    return this.getToken(CommandLangParser.NUMERO, 0);
	};

	enterRule(listener) {
	    if(listener instanceof CommandLangListener ) {
	        listener.enterArgumentoPosicional(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof CommandLangListener ) {
	        listener.exitArgumentoPosicional(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof CommandLangVisitor ) {
	        return visitor.visitArgumentoPosicional(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ArgumentoOpcionalContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = CommandLangParser.RULE_argumentoOpcional;
    }

	nombreArgumento() {
	    return this.getTypedRuleContext(NombreArgumentoContext,0);
	};

	valorArgumento() {
	    return this.getTypedRuleContext(ValorArgumentoContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof CommandLangListener ) {
	        listener.enterArgumentoOpcional(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof CommandLangListener ) {
	        listener.exitArgumentoOpcional(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof CommandLangVisitor ) {
	        return visitor.visitArgumentoOpcional(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class NombreArgumentoContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = CommandLangParser.RULE_nombreArgumento;
    }

	PALABRA() {
	    return this.getToken(CommandLangParser.PALABRA, 0);
	};

	enterRule(listener) {
	    if(listener instanceof CommandLangListener ) {
	        listener.enterNombreArgumento(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof CommandLangListener ) {
	        listener.exitNombreArgumento(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof CommandLangVisitor ) {
	        return visitor.visitNombreArgumento(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class ValorArgumentoContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = CommandLangParser.RULE_valorArgumento;
    }

	TEXTO() {
	    return this.getToken(CommandLangParser.TEXTO, 0);
	};

	PALABRA() {
	    return this.getToken(CommandLangParser.PALABRA, 0);
	};

	NUMERO() {
	    return this.getToken(CommandLangParser.NUMERO, 0);
	};

	enterRule(listener) {
	    if(listener instanceof CommandLangListener ) {
	        listener.enterValorArgumento(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof CommandLangListener ) {
	        listener.exitValorArgumento(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof CommandLangVisitor ) {
	        return visitor.visitValorArgumento(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}




CommandLangParser.ComandoContext = ComandoContext; 
CommandLangParser.PrefijoCommandContext = PrefijoCommandContext; 
CommandLangParser.NombreCommandContext = NombreCommandContext; 
CommandLangParser.ArgumentoContext = ArgumentoContext; 
CommandLangParser.ArgumentoPosicionalContext = ArgumentoPosicionalContext; 
CommandLangParser.ArgumentoOpcionalContext = ArgumentoOpcionalContext; 
CommandLangParser.NombreArgumentoContext = NombreArgumentoContext; 
CommandLangParser.ValorArgumentoContext = ValorArgumentoContext; 
