grammar Assgin;

@header {
package assgin;
}

ID : [a-z]+ ;
expr : NUMBER ;
NUMBER : [1-9][0-9]*|[0]|([0-9]+[.][0-9]+) ;
assign : ID '=' expr '+' expr ';'
       | ID '=' expr '-' expr ';'
       | ID '=' expr '*' expr ';'
       | ID '=' expr '/' expr ';'
       ;
