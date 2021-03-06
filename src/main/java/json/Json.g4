grammar Json;

json : object
     | array
     ;

object
    : '{' pair (',' pair)* '}'
    | '{' '}'
    ;

pair : STRING ':' value ;

array
    : '[' value (',' value)* ']'
    | '[' ']'
    ;

value
    : STRING
    | NUMBER
    | object
    | array
    | 'true'
    | 'false'
    | 'null'
    ;

STRING : '"' (ESC | ~["\\])* '"' ;
