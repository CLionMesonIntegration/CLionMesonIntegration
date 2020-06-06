package com.nonnulldinu.clionmeson.build.elementsandutils

import com.intellij.psi.tree.IElementType
import com.nonnulldinu.clionmeson.languages.MesonBuildLang
import org.jetbrains.annotations.NonNls

class MesonBuildElement(@NonNls debugName: String) : IElementType(debugName, MesonBuildLang)