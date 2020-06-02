// This is a generated file. Not intended for manual editing.
package com.nonnulldinu.clionmeson.build.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.nonnulldinu.clionmeson.build.psi.impl.*;

public interface MesonBuildTypes {

  IElementType ADD_EXPR = new MesonBuildElement("ADD_EXPR");
  IElementType ADD_OP = new MesonBuildElement("ADD_OP");
  IElementType ARRAY = new MesonBuildElement("ARRAY");
  IElementType ASSIGNMENT_STATEMENT = new MesonBuildElement("ASSIGNMENT_STATEMENT");
  IElementType ATROP = new MesonBuildElement("ATROP");
  IElementType DICT = new MesonBuildElement("DICT");
  IElementType EXPRESSION = new MesonBuildElement("EXPRESSION");
  IElementType FACTOR = new MesonBuildElement("FACTOR");
  IElementType FUNC_ARG = new MesonBuildElement("FUNC_ARG");
  IElementType FUNC_ARGS = new MesonBuildElement("FUNC_ARGS");
  IElementType FUNC_CALL_STATEMENT = new MesonBuildElement("FUNC_CALL_STATEMENT");
  IElementType FUNC_NAME = new MesonBuildElement("FUNC_NAME");
  IElementType ID_EXPRESSION = new MesonBuildElement("ID_EXPRESSION");
  IElementType KEYWORD_ELEM = new MesonBuildElement("KEYWORD_ELEM");
  IElementType LVALUE = new MesonBuildElement("LVALUE");
  IElementType MUL_EXPR = new MesonBuildElement("MUL_EXPR");
  IElementType MUL_OP = new MesonBuildElement("MUL_OP");
  IElementType PAR_EXPRESSION = new MesonBuildElement("PAR_EXPRESSION");
  IElementType POSITIONAL_FUNC_ARG = new MesonBuildElement("POSITIONAL_FUNC_ARG");
  IElementType STATEMENT = new MesonBuildElement("STATEMENT");
  IElementType SUBSCRIPT_EXPR = new MesonBuildElement("SUBSCRIPT_EXPR");
  IElementType SUBSCRIPT_ROOT = new MesonBuildElement("SUBSCRIPT_ROOT");

  IElementType ATR_OP = new MesonBuildToken("=");
  IElementType BINNUM = new MesonBuildToken("binnum");
  IElementType BOOL_LITERAL_FALSE = new MesonBuildToken("false");
  IElementType BOOL_LITERAL_TRUE = new MesonBuildToken("true");
  IElementType BRACE_BEGIN = new MesonBuildToken("[");
  IElementType BRACE_END = new MesonBuildToken("]");
  IElementType COMMA = new MesonBuildToken(",");
  IElementType COMP_ATR_OP1 = new MesonBuildToken("*=");
  IElementType COMP_ATR_OP2 = new MesonBuildToken("/=");
  IElementType COMP_ATR_OP3 = new MesonBuildToken("%=");
  IElementType COMP_ATR_OP4 = new MesonBuildToken("+=");
  IElementType COMP_ATR_OP5 = new MesonBuildToken("-=");
  IElementType COMP_OP1 = new MesonBuildToken("==");
  IElementType COMP_OP2 = new MesonBuildToken("<=");
  IElementType COMP_OP3 = new MesonBuildToken(">=");
  IElementType COMP_OP4 = new MesonBuildToken("<");
  IElementType COMP_OP5 = new MesonBuildToken(">");
  IElementType COMP_OP6 = new MesonBuildToken("!=");
  IElementType CURLY_BRACE_BEGIN = new MesonBuildToken("{");
  IElementType CURLY_BRACE_END = new MesonBuildToken("}");
  IElementType DECNUM = new MesonBuildToken("decnum");
  IElementType DIV_OP = new MesonBuildToken("/");
  IElementType HEXNUM = new MesonBuildToken("hexnum");
  IElementType ID = new MesonBuildToken("id");
  IElementType IN_OP = new MesonBuildToken("in");
  IElementType LANG_TOKEN_COLON = new MesonBuildToken(":");
  IElementType LANG_TOKEN_DOT = new MesonBuildToken(".");
  IElementType LANG_TOKEN_ELSE = new MesonBuildToken("else");
  IElementType LANG_TOKEN_ELSE_IF = new MesonBuildToken("elif");
  IElementType LANG_TOKEN_ENDIF = new MesonBuildToken("endif");
  IElementType LANG_TOKEN_FOREACH = new MesonBuildToken("foreach");
  IElementType LANG_TOKEN_FOREACH_END = new MesonBuildToken("endforeach");
  IElementType LANG_TOKEN_IF = new MesonBuildToken("if");
  IElementType LANG_TOKEN_JUMP_BREAK = new MesonBuildToken("break");
  IElementType LANG_TOKEN_JUMP_CONTINUE = new MesonBuildToken("continue");
  IElementType LANG_TOKEN_QMARK = new MesonBuildToken("?");
  IElementType MINUS_OP = new MesonBuildToken("-");
  IElementType MOD_OP = new MesonBuildToken("%");
  IElementType MULTILINE_COMMENT = new MesonBuildToken("multiline_comment");
  IElementType MULT_OP = new MesonBuildToken("*");
  IElementType NEWLINE = new MesonBuildToken("newline");
  IElementType NOT_OP = new MesonBuildToken("not");
  IElementType OCTNUM = new MesonBuildToken("octnum");
  IElementType PAREN_BEGIN = new MesonBuildToken("(");
  IElementType PAREN_END = new MesonBuildToken(")");
  IElementType PLUS_OP = new MesonBuildToken("+");
  IElementType SINGLE_LINE_COMMENT = new MesonBuildToken("single_line_comment");
  IElementType STRMULTILINE = new MesonBuildToken("strmultiline");
  IElementType STRSIMPLE = new MesonBuildToken("strsimple");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ADD_EXPR) {
        return new MesonBuildAddExprImpl(node);
      }
      else if (type == ADD_OP) {
        return new MesonBuildAddOpImpl(node);
      }
      else if (type == ARRAY) {
        return new MesonBuildArrayImpl(node);
      }
      else if (type == ASSIGNMENT_STATEMENT) {
        return new MesonBuildAssignmentStatementImpl(node);
      }
      else if (type == ATROP) {
        return new MesonBuildAtropImpl(node);
      }
      else if (type == DICT) {
        return new MesonBuildDictImpl(node);
      }
      else if (type == EXPRESSION) {
        return new MesonBuildExpressionImpl(node);
      }
      else if (type == FACTOR) {
        return new MesonBuildFactorImpl(node);
      }
      else if (type == FUNC_ARG) {
        return new MesonBuildFuncArgImpl(node);
      }
      else if (type == FUNC_ARGS) {
        return new MesonBuildFuncArgsImpl(node);
      }
      else if (type == FUNC_CALL_STATEMENT) {
        return new MesonBuildFuncCallStatementImpl(node);
      }
      else if (type == FUNC_NAME) {
        return new MesonBuildFuncNameImpl(node);
      }
      else if (type == ID_EXPRESSION) {
        return new MesonBuildIdExpressionImpl(node);
      }
      else if (type == KEYWORD_ELEM) {
        return new MesonBuildKeywordElemImpl(node);
      }
      else if (type == LVALUE) {
        return new MesonBuildLvalueImpl(node);
      }
      else if (type == MUL_EXPR) {
        return new MesonBuildMulExprImpl(node);
      }
      else if (type == MUL_OP) {
        return new MesonBuildMulOpImpl(node);
      }
      else if (type == PAR_EXPRESSION) {
        return new MesonBuildParExpressionImpl(node);
      }
      else if (type == POSITIONAL_FUNC_ARG) {
        return new MesonBuildPositionalFuncArgImpl(node);
      }
      else if (type == STATEMENT) {
        return new MesonBuildStatementImpl(node);
      }
      else if (type == SUBSCRIPT_EXPR) {
        return new MesonBuildSubscriptExprImpl(node);
      }
      else if (type == SUBSCRIPT_ROOT) {
        return new MesonBuildSubscriptRootImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
