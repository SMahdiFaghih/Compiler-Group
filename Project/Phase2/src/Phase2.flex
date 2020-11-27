import java.io.*;

%%

%class main
%standalone
%unicode

%{

  enum TokenName 
  {
    VOID, CLASS, INTERFACE, NULL, THIS, EXTENDS, IMPLEMENTS,
    FOR, WHILE, IF, ELSE, RETURN, BREAK, CONTINUE,
    TRUE, FALSE, NEW, NEWARRAY, PRINT, READINTEGER, READLINE,
    DTOI, ITOD, BTOI, ITOB, PRIVATE, PROTECTED, PUBLIC, 
    T_INTLITERAL, T_DOUBLELITERAL, T_STRINGLITERAL, T_BOOLEANLITERAL, T_ID,
    ADD, SUB, MUL, DIV, MOD, LT, LTE, ASSIGN, EQ, NEQ, GT, GTE,
    NOT, OR, AND, SEMICOLON, COMMA, DOT,
    OPENBRACE, CLOSEBRACE, OPENPARENTHESES, CLOSEPARENTHESES, OPENCURLYBRACET, CLOSECURLYBRACET,
    COMMENT, MULTILINECOMMENT 
  };

  public static Writer writer;

  public void getToken(String value) throws IOException
  {
	  writer.write(value + "\n");
  }

  public void getToken(TokenName token, String value) throws IOException
  {
    writer.write(token.toString() + " " + value + "\n");
  }

%}

%%

"void" { getToken(yytext()); }
"class" { getToken(yytext()); }
"interface" { getToken(yytext()); }
"null" { getToken(yytext()); }
"this" { getToken(yytext()); }
"extends" { getToken(yytext()); }
"implements" { getToken(yytext()); }
"for" { getToken(yytext()); }
"while" { getToken(yytext()); }
"if" { getToken(yytext()); }
"else" { getToken(yytext()); }
"return" { getToken(yytext()); }
"break" { getToken(yytext()); }
"continue" { getToken(yytext()); }
"true" { getToken(TokenName.T_BOOLEANLITERAL, yytext()); }
"false" { getToken(TokenName.T_BOOLEANLITERAL, yytext()); }
"new" { getToken(yytext()); }
"NewArray" { getToken(yytext()); }
"Print" { getToken(yytext()); }
"ReadInteger" { getToken(yytext()); }
"ReadLine" { getToken(yytext()); }
"dtoi" { getToken(yytext()); }
"itod" { getToken(yytext()); }
"btoi" { getToken(yytext()); }
"itob" { getToken(yytext()); }
"private" { getToken(yytext()); }
"protected" { getToken(yytext()); }
"public" { getToken(yytext()); }
"int" { getToken(yytext()); }
"double" { getToken(yytext()); }
"bool" { getToken(yytext()); }
"string" { getToken(yytext()); }
"+" { getToken(yytext()); }
"-" { getToken(yytext()); }
"*" { getToken(yytext()); }
"/" { getToken(yytext()); }
"%" { getToken(yytext()); }
"<" { getToken(yytext()); }
"<=" { getToken(yytext()); }
">" { getToken(yytext()); }
">=" { getToken(yytext()); }
"=" { getToken(yytext()); }
"==" { getToken(yytext()); }
"!=" { getToken(yytext()); }
"&&" { getToken(yytext()); }
"||" { getToken(yytext()); }
"!" { getToken(yytext()); }
";" { getToken(yytext()); }
"," { getToken(yytext()); }
"." { getToken(yytext()); }
"[" { getToken(yytext()); }
"]" { getToken(yytext()); }
"(" { getToken(yytext()); }
")" { getToken(yytext()); }
"{" { getToken(yytext()); }
"}" { getToken(yytext()); }
"//"[^\n]* { /* ignore comments*/ }
"/*"[^]*"*/" { /* ignore comments*/ }
[a-zA-Z]+[a-zA-Z\_0-9]* { getToken(TokenName.T_ID, yytext()); }
[0-9]+ { getToken(TokenName.T_INTLITERAL, yytext()); }
[0][xX][0-9a-fA-F]+ { getToken(TokenName.T_INTLITERAL, yytext()); }
[0-9]+\.[0-9]* { getToken(TokenName.T_DOUBLELITERAL, yytext()); }
[0-9]+\.[0-9]*[Ee][-+]?[0-9]+ { getToken(TokenName.T_DOUBLELITERAL, yytext()); }
[0][xX][0-9a-fA-F]+\.[0-9a-fA-F]* { getToken(TokenName.T_DOUBLELITERAL, yytext()); }
[\"][^\n\"]+[\"] { getToken(TokenName.T_STRINGLITERAL, yytext()); }
[\s]  { /* ignore whitespace */ }