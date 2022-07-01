grammar alaeh;

program       : 
              
              statement*
              ;


statement      : 
               assignstmt
             | forloopstmt
             | conditionstmt 
             | printstmt 
             | ifstmt
             | switchstmt
//             | elseifstmt
//             | elsestmt
               ;

assignstmt      : 
                 NAME ASSIGN expression  
              |  NAME ASSIGN string
              |  NAME ASSIGN integer
                ;


// Parse rule for if statements
ifstmt      : 
            IF LPAREN conditionstmt RPAREN COLON 
            statement*
            elseifstmt
            ;

elseifstmt      :
            ELSEIF LPAREN conditionstmt RPAREN COLON
            statement*
            elsestmt
            ;

elsestmt        : 
            ELSE COLON
            statement*
            endif
            ;

endif:ENDIF;

//SWITCH STATEMENT

switchstmt:
          SWITCH LPAREN term RPAREN COLON 
          casestmt+
          ;
casestmt: CASE integer COLON
          statement*
          BREAK;
//CONDITION STMT

conditionstmt:  integer EQUAL integer
              | integer MORETHAN integer
              | integer MOREQUAL integer
              | integer LESSTHAN integer
              | integer LESQUAL integer
              
              | integer EQUAL identifier
              | integer MORETHAN identifier
              | integer MOREQUAL identifier
              | integer LESSTHAN identifier
              | integer LESQUAL identifier
              
              | identifier EQUAL integer
              | identifier MORETHAN integer
              | identifier MOREQUAL integer
              | identifier LESSTHAN integer
              | identifier LESQUAL integer

              | identifier EQUAL identifier
              | identifier MORETHAN identifier
              | identifier MOREQUAL identifier
              | identifier LESSTHAN identifier
              | identifier LESQUAL identifier               
                ;

//Parse rule for FORLOOP statement

forloopstmt:  FOR LPAREN conditionstmt RPAREN COLON 
              statement*
              LOOP;

// Parse rule for print statements

printstmt      : 
               PRINT LPAREN term RPAREN
               ;


// Parse rule for expressions

expression      : 
                term
              | term PLUS term 
              | term MINUS term
              | string
    //          | integer INCREMENT
     //         | integer DECREMENT
   //           | identifier INCREMENT
   //           | identifier DECREMENT
                ;




// Parse rule for terms

term          : 
              identifier
            | integer 
            | string
              ;

// Parse rule for identifiers

identifier   : NAME  ;

// Parse rule for numbers 

integer      : INTEGER  ;
string       : QUOTE NAME QUOTE  ;
// Reserved Keywords
////////////////////////////////

IF: 'kapag';
ELSEIF: 'o_kapag';
ELSE: 'pag_hinde';
ENDIF: 'tapuse';
SWITCH: 'lipate';
CASE: 'lagay';
BREAK: 'itigil';

PRINT: 'pakitahe';
//INT: 'numero';
//STR: 'salita';
FOR: 'para';
LOOP: 'ulite';

// Operators
PLUS: '+';
EQUAL: '==';
ASSIGN: '=';
NOTEQUAL: '!=';
MORETHAN: '>';
MOREQUAL: '>=';
LESSTHAN: '<';
LESQUAL: '<=';

MINUS: '-';
INCREMENT: '++';
DECREMENT: '--';

// Semicolon and parentheses
SEMICOLON: ';';
COLON: ':';
LPAREN: '(';
RPAREN: ')';
QUOTE: '"';
LCURL: '{';
RCURL: '}';



// Integers
INTEGER: [0-9]+;

// Variable names
NAME: [a-zA-Z]+ ;   

// Ignore all white spaces 
WSSKIP: [ \t\r\n]+ -> skip ;

//Insert White Space
NEWLINE: [\r\n]+;
