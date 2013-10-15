package de.plushnikov.intellij.lombok.psi;

import com.intellij.lang.Language;
import com.intellij.lang.java.JavaLanguage;
import com.intellij.openapi.util.Pair;
import com.intellij.psi.*;
import com.intellij.psi.impl.light.*;
import com.intellij.psi.javadoc.PsiDocComment;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.List;

public class LombokLightClassBuilderImpl extends LombokLightClass implements LombokLightClassBuilder {

  public LombokLightClassBuilderImpl(@NotNull PsiManager manager, @NotNull String name) {
    super(manager, JavaLanguage.INSTANCE);
//    setMyContainingClass(containingClass);
    setName(name);
  }

  @Override
  public LombokLightClassBuilder withModifier(@PsiModifier.ModifierConstant @NotNull @NonNls String modifier) {
      ((LightModifierList) getModifierList()).addModifier(modifier);
      return this;
  }


}