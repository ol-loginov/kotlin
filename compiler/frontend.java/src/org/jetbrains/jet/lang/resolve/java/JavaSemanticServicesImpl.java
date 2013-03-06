/*
 * Copyright 2010-2013 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.jet.lang.resolve.java;

import com.google.common.collect.Lists;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiClass;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.util.NullableFunction;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.jet.lang.descriptors.ClassDescriptor;
import org.jetbrains.jet.lang.descriptors.PackageViewDescriptor;
import org.jetbrains.jet.lang.descriptors.SubModuleDescriptor;
import org.jetbrains.jet.lang.diagnostics.DiagnosticHolder;
import org.jetbrains.jet.lang.resolve.BindingContext;
import org.jetbrains.jet.lang.resolve.BindingTrace;
import org.jetbrains.jet.lang.resolve.java.provider.PsiDeclarationProviderFactory;
import org.jetbrains.jet.lang.resolve.name.FqName;

import javax.inject.Inject;
import java.util.List;

public class JavaSemanticServicesImpl implements JavaSemanticServices {
    private final List<JavaPackageFragmentProvider> providers = Lists.newArrayList();

    @NotNull
    private JavaTypeTransformer typeTransformer;
    @NotNull
    private BindingTrace trace;

    private NullableFunction<PsiClass, ClassDescriptor> lightClassResolver;

    @Inject
    public void setTypeTransformer(@NotNull JavaTypeTransformer typeTransformer) {
        this.typeTransformer = typeTransformer;
    }

    @Inject
    public void setTrace(@NotNull BindingTrace trace) {
        this.trace = trace;
    }

    @Inject
    public void setLightClassResolver(NullableFunction<PsiClass, ClassDescriptor> lightClassResolver) {
        this.lightClassResolver = lightClassResolver;
    }

    @NotNull
    public JavaTypeTransformer getTypeTransformer() {
        return typeTransformer;
    }

    @Override
    @NotNull
    public DiagnosticHolder getDiagnosticHolder() {
        return trace;
    }

    @NotNull
    public JavaPackageFragmentProvider registerRoot(
            @NotNull GlobalSearchScope definingScope,
            @NotNull SubModuleDescriptor subModule
    ) {
        JavaPackageFragmentProvider provider = new JavaPackageFragmentProvider(this, );
        providers.add(provider);
        return provider;
    }

    @Override
    @Nullable
    public ClassDescriptor getClassDescriptor(@NotNull PsiClass psiClass) {
        if (DescriptorResolverUtils.isKotlinLightClass(psiClass)) {
            return lightClassResolver.fun(psiClass);
        }

        VirtualFile virtualFile = psiClass.getContainingFile().getVirtualFile();
        assert virtualFile != null : "No virtual file for psiClass: " + psiClass.getText();

        // NOTE: This may become slow if we have too many providers
        for (JavaPackageFragmentProvider provider : providers) {
            if (provider.isResponsibleFor(virtualFile)) {
                return provider.getClassDescriptor(psiClass);
            }
        }

        throw new IllegalArgumentException("Not in scope: " + psiClass + " from " + virtualFile);
    }
}