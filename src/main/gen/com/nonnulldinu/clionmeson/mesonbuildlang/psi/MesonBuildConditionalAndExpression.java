// This is a generated file. Not intended for manual editing.
package com.nonnulldinu.clionmeson.mesonbuildlang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MesonBuildConditionalAndExpression extends PsiElement {

  @NotNull
  List<MesonBuildAddExpr> getAddExprList();

  @NotNull
  List<MesonBuildFullExpression> getFullExpressionList();

  @NotNull
  List<MesonBuildRelationCheck> getRelationCheckList();

}
