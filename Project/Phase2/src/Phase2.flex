import java_cup.runtime.*;

%%
%class main
%implements sym

%line
%column

%cup
%cupdebug

%unicode

%{

  private Symbol symbol(int type)
  {
      return new Symbol(type, yyline, yycolumn);
  }
    
  /* Also creates a new java_cup.runtime.Symbol with information about the current token, but this object has a value. */
  private Symbol symbol(int type, Object value) 
  {
      return new Symbol(type, yyline, yycolumn, value);
  }

%}

%%

"void" { return new symbol (sym.VOID); }
"class" { return new symbol(sym.CLASS); }
"interface" { return new symbol(sym.INTERFACE); }
"null" { return new symbol(sym.NULL); }
"this" { return new symbol(sym.THIS) }
"extends" {return new symbol (sym.EXTENDS); }
"implements" { return new symbol(sym.IMPLEMENTS); }
"for" { return new symbol(sym.FOR);}
"while" { return new symbol(sym.WHILE); }
"if" { return new symbol (sym.IF);}
"else" { return new symbol(sym.ELSE) ;}
"return" { return new symbol(sym.RETURN); }
"break" { return new symbol(sym.BREAK); }
"continue" { return new symbol(sym.CONTINUE); }
"true" { return new symbol(sym.BOOLEAN, yytext()); }
"false" { return new symbol(sym.BOOLEAN, yytext()); }
"new" {return new symbol(sym.NEW); }
"NewArray" { return new symbol(sym.NEWARRAY); }
"Print" { return new symbol(sym.PRINT); }
"ReadInteger" { return new symbol(sym.READINTEGER); }
"ReadLine" { return new symbol(sym.READLINE); }
"dtoi" { return new symbol(sym.DTOI); }
"itod" { return new symbol(sym.ITOD); }
"btoi" { return new symbol(sym.BTOI); }
"itob" { return new symbol(sym.ITOB); }
"private" { return new symbol (sym.PRIVATE); }
"protected" { return new symbol(sym.PROTECTED); }
"public" { return new symbol(sym.PUBLIC); }
"int" { return new symbol(sym.INT); }
"double" { return new symbol(sym.DOUBLE); }
"bool" { return new symbol(sym.BOOLEAN); }
"string" { return new symbol(sym.STRING); }
"+" { return new symbol(sym.PLUS); }
"-" { return new symbol(sym.MINUS); }
"*" { return new symbol(sym.MULT); }
"/" { return new symbol(sym.DIV); }
"%" { return new symbol(sym.MOD); }
"<" { return new symbol(sym.LT); }
"<=" { return new symbol (sym.LTEQ); }
">" { return new symbol(sym.GT); }
">=" { return new symbol(sym.GTEQ); }
"=" { return new symbol(sym.ASSIGN); }
"==" { return new symbol(sym.EQEQ); }
"!=" { return new symbol(sym.NOTEQ); }
"&&" { return new symbol (sym.ANDAND); }
"||" { return new symbol (sym.OROR);}
"!" { return new symbol (sym.NOT); }
";" { return new symbol(sym.SEMICOLON); }
"," { return new symbol(sym.COMMA); }
"." {return new symbol (sym.DOT); }
"[" { return new symbol (sym.LEFTBRACK); }
"]" { return new symbol (sym.RIGHTBRACK); }
"(" { return new symbol (sym.LEFTPAREN); }
")" { return new symbol (sym.RIGHTPAREN); }
"{" { return new symbol (sym.LEFTAKULAD); }
"}" { return new symbol (sym.RIGHTAKULAD); }
"//"[^\n]* { /* ignore comments*/ }
"/*"[^]*"*/" { /* ignore comments*/ }
[a-zA-Z]+[a-zA-Z\_0-9]* { return new symbol(sym.IDENTIFIER, yytext()); }
[0-9]+ { return new symbol(sym.INT, yytext()); }
[0][xX][0-9a-fA-F]+ { return new symbol (sym.INT, yytext()); }
[0-9]+\.[0-9]* { return new symbol (sym.DOUBLE, yytext()); }
[0-9]+\.[0-9]*[Ee][-+]?[0-9]+ { return new symbol(sym.DOUBLE, yytext()); }
[0][xX][0-9a-fA-F]+\.[0-9a-fA-F]* { return new symbol (sym.DOUBLE, yytext()); }
[\"][^\n\"]+[\"] { return new symbol (sym.STRING, yytext()); }
[\s]  { /* ignore whitespace */ }