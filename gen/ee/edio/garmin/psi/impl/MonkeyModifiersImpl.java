// This is a generated file. Not intended for manual editing.
package ee.edio.garmin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static ee.edio.garmin.psi.MonkeyTypes.*;
import ee.edio.garmin.psi.*;

public class MonkeyModifiersImpl extends MonkeyPsiCompositeElementImpl implements MonkeyModifiers {

  public MonkeyModifiersImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MonkeyVisitor) ((MonkeyVisitor)visitor).visitModifiers(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MonkeyAnnotation getAnnotation() {
    return findChildByClass(MonkeyAnnotation.class);
  }

}
