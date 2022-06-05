grammar ImportCss;

@header {
package importcss;
}

assign: ws ID '(' '"' CONTENT '"' ');' ws ;

ID
    : ('@')('i'||'I')('m'||'M')('p'||'P')('o'||'O')('r'||'R')('t'||'T')
    ;
CONTENT : [a-zA-Z0-9]+ ;

ws
    : ( Comment | Space )*
    ;

Comment
    : '/*' ~'*'* '*'+ ( ~[/*] ~'*'* '*'+ )* '/'
    ;

Space
    : [ \t\r\n\f]+
    ;