package com.nonnulldinu.clionmeson.languages.lexers;

import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.nonnulldinu.clionmeson.mesonbuildlang.psi.MesonBuildTypes.*;

%%

%{
  public _MesonBuildLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _MesonBuildLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

NEWLINE=[ \t\n\x0B\f\r]*\R[ \t\n\x0B\f\r]*
WHITE_SPACE=\s+

BINNUM=0b[01]+
HEXNUM=0x[a-fA-F0-9]+
OCTNUM=0[0-7]*
DECNUM=[1-9][0-9]*
ID=[a-zA-Z_][a-zA-Z_0-9]*
STRSIMPLE='(\\.|[^\'])*'
BLOCK_COMMENT=(\h*?#.*?\R+)(\h*?#.*?\R+)+
LINE_COMMENT=#.*\R+

%state MULTILINE_STRING
%%
<YYINITIAL> {
  {NEWLINE}            { return NEWLINE; }
  {WHITE_SPACE}        { return WHITE_SPACE; }

  "in"                 { return IN_OP; }
  "["                  { return BRACE_BEGIN; }
  "]"                  { return BRACE_END; }
  "{"                  { return CURLY_BRACE_BEGIN; }
  "}"                  { return CURLY_BRACE_END; }
  "("                  { return PAREN_BEGIN; }
  ")"                  { return PAREN_END; }
  ","                  { return COMMA; }
  "=="                 { return COMP_OP1; }
  "<="                 { return COMP_OP2; }
  ">="                 { return COMP_OP3; }
  "<"                  { return COMP_OP4; }
  ">"                  { return COMP_OP5; }
  "!="                 { return COMP_OP6; }
  "*="                 { return COMP_ATR_OP1; }
  "/="                 { return COMP_ATR_OP2; }
  "%="                 { return COMP_ATR_OP3; }
  "+="                 { return COMP_ATR_OP4; }
  "-="                 { return COMP_ATR_OP5; }
  "="                  { return ATR_OP; }
  "+"                  { return PLUS_OP; }
  "-"                  { return MINUS_OP; }
  "*"                  { return MULT_OP; }
  "/"                  { return DIV_OP; }
  "%"                  { return MOD_OP; }
  "true"               { return BOOL_LITERAL_TRUE; }
  "false"              { return BOOL_LITERAL_FALSE; }
  "foreach"            { return LANG_TOKEN_FOREACH; }
  "endforeach"         { return LANG_TOKEN_FOREACH_END; }
  "continue"           { return LANG_TOKEN_JUMP_CONTINUE; }
  "break"              { return LANG_TOKEN_JUMP_BREAK; }
  "if"                 { return LANG_TOKEN_IF; }
  "elif"               { return LANG_TOKEN_ELSE_IF; }
  "else"               { return LANG_TOKEN_ELSE; }
  "endif"              { return LANG_TOKEN_ENDIF; }
  "and"                { return LANG_TOKEN_AND; }
  "or"                 { return LANG_TOKEN_OR; }
  "not"                { return LANG_TOKEN_NOT; }
  "?"                  { return LANG_TOKEN_QMARK; }
  ":"                  { return LANG_TOKEN_COLON; }
  "."                  { return LANG_TOKEN_DOT; }

  "'''"                { yybegin(MULTILINE_STRING); }

  {BINNUM}             { return BINNUM; }
  {HEXNUM}             { return HEXNUM; }
  {OCTNUM}             { return OCTNUM; }
  {DECNUM}             { return DECNUM; }
  {ID}                 { return ID; }
  {STRSIMPLE}          { return STRSIMPLE; }
  {BLOCK_COMMENT}      { return BLOCK_COMMENT; }
  {LINE_COMMENT}       { return LINE_COMMENT; }
}

<MULTILINE_STRING> {
"'''"                          {yybegin(YYINITIAL); return STRMULTILINE;}
[^]                            { /*ignore*/ }
}

[^] { return BAD_CHARACTER; }
