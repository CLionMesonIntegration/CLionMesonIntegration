// This is a generated file. Not intended for manual editing.
package com.nonnulldinu.clionmeson.mesonbuildlang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MesonBuildTernaryExpression extends PsiElement {

  @Nullable
  MesonBuildAddExpr getAddExpr();

  @Nullable
  MesonBuildConditionalOrExpression getConditionalOrExpression();

  @NotNull
  List<MesonBuildFullExpression> getFullExpressionList();

}
