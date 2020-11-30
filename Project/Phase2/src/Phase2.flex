import java_cup.runtime.*;
import java.io.*;

%%
%class main
%implements sym

%line
%column

%cup
%cupdebug
%standalone
%unicode

%{

  public static Writer writer;  

  private Symbol symbol(int type)
  {
    return new Symbol(type, yyline, yycolumn);
  }
    
  /* Also creates a java_cup.runtime.Symbol with information about the current token, but this object has a value. */
  private Symbol symbol(int type, Object value) 
  {
    return new Symbol(type, yyline, yycolumn, value);
  }

%}

%%

"void" { return symbol (sym.VOID); }
"class" { return symbol(sym.CLASS); }
"interface" { return symbol(sym.INTERFACE); }
"null" { return symbol(sym.NULL); }
"this" { return symbol(sym.THIS); }
"extends" {return symbol (sym.EXTENDS); }
"implements" { return symbol(sym.IMPLEMENTS); }
"for" { return symbol(sym.FOR);}
"while" { return symbol(sym.WHILE); }
"if" { return symbol (sym.IF);}
"else" { return symbol(sym.ELSE) ;}
"return" { return symbol(sym.RETURN); }
"break" { return symbol(sym.BREAK); }
"continue" { return symbol(sym.CONTINUE); }
"true" { return symbol(sym.BOOLEAN, yytext()); }
"false" { return symbol(sym.BOOLEAN, yytext()); }
"new" {return symbol(sym.NEW); }
"NewArray" { return symbol(sym.NEWARRAY); }
"Print" { return symbol(sym.PRINT); }
"ReadInteger" { return symbol(sym.READINTEGER); }
"ReadLine" { return symbol(sym.READLINE); }
"dtoi" { return symbol(sym.DTOI); }
"itod" { return symbol(sym.ITOD); }
"btoi" { return symbol(sym.BTOI); }
"itob" { return symbol(sym.ITOB); }
"private" { return symbol (sym.PRIVATE); }
"protected" { return symbol(sym.PROTECTED); }
"public" { return symbol(sym.PUBLIC); }
"int" { return symbol(sym.INT); }
"double" { return symbol(sym.DOUBLE); }
"bool" { return symbol(sym.BOOLEAN); }
"string" { return symbol(sym.STRING); }
"+" { return symbol(sym.PLUS); }
"-" { return symbol(sym.MINUS); }
"*" { return symbol(sym.MULT); }
"/" { return symbol(sym.DIV); }
"%" { return symbol(sym.MOD); }
"<" { return symbol(sym.LT); }
"<=" { return symbol (sym.LTEQ); }
">" { return symbol(sym.GT); }
">=" { return symbol(sym.GTEQ); }
"=" { return symbol(sym.ASSIGN); }
"==" { return symbol(sym.EQEQ); }
"!=" { return symbol(sym.NOTEQ); }
"&&" { return symbol (sym.ANDAND); }
"||" { return symbol (sym.OROR);}
"!" { return symbol (sym.NOT); }
";" { return symbol(sym.SEMICOLON); }
"," { return symbol(sym.COMMA); }
"." {return symbol (sym.DOT); }
"[" { return symbol (sym.LEFTBRACK); }
"]" { return symbol (sym.RIGHTBRACK); }
"(" { return symbol (sym.LEFTPAREN); }
")" { return symbol (sym.RIGHTPAREN); }
"{" { return symbol (sym.LEFTAKULAD); }
"}" { return symbol (sym.RIGHTAKULAD); }
"//"[^\n]* { /* ignore comments*/ }
"/*"[^]*"*/" { /* ignore comments*/ }
[a-zA-Z]+[a-zA-Z\_0-9]* { return symbol(sym.IDENTIFIER, yytext()); }
[0-9]+ { return symbol(sym.INT, yytext()); }
[0][xX][0-9a-fA-F]+ { return symbol (sym.INT, yytext()); }
[0-9]+\.[0-9]* { return symbol (sym.DOUBLE, yytext()); }
[0-9]+\.[0-9]*[Ee][-+]?[0-9]+ { return symbol(sym.DOUBLE, yytext()); }
[0][xX][0-9a-fA-F]+\.[0-9a-fA-F]* { return symbol (sym.DOUBLE, yytext()); }
[\"][^\n\"]+[\"] { return symbol (sym.STRING, yytext()); }
[\s]  { /* ignore whitespace */ }