grammar CommandLang;

// Axioma
comando : prefijoCommand nombreCommand argumento* ;

// Reglas sintácticas
prefijoCommand : '!' | '|' | '#' | '&' ;

nombreCommand : PALABRA ;

argumento : argumentoPosicional | argumentoOpcional ;

argumentoPosicional : TEXTO | PALABRA | NUMERO ;

argumentoOpcional : '--' nombreArgumento ('=' valorArgumento)? ;

nombreArgumento : PALABRA ;

valorArgumento : TEXTO | PALABRA | NUMERO ;

// Reglas léxicas
TEXTO : '"' (~["\r\n])* '"' ;

PALABRA : [a-zA-ZáéíóúÁÉÍÓÚñÑ_][a-zA-Z0-9áéíóúÁÉÍÓÚñÑ_]* ;


NUMERO : [0-9]+ ('.' [0-9]+)? ;

ESPACIO : [ \t\r\n]+ -> skip ;
