package org.jetbrains.jet.descriptors.serialization;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.jet.lang.resolve.name.FqName;
import org.jetbrains.jet.lang.resolve.name.FqNameUnsafe;
import org.jetbrains.jet.lang.resolve.name.Name;

public final class ClassId {
    private final FqName packageFqName;
    private final FqNameUnsafe relativeClassName;

    public ClassId(@NotNull FqName packageFqName, @NotNull FqNameUnsafe relativeClassName) {
        this.packageFqName = packageFqName;
        assert !relativeClassName.isRoot() : "Class name must not be root. " + packageFqName;
        this.relativeClassName = relativeClassName;
    }

    @NotNull
    public FqName getPackageFqName() {
        return packageFqName;
    }

    @NotNull
    public FqNameUnsafe getRelativeClassName() {
        return relativeClassName;
    }

    @NotNull
    public ClassId createNestedClassId(@NotNull Name name) {
        return new ClassId(getPackageFqName(), relativeClassName.child(name));
    }

    public FqNameUnsafe asSingleFqName() {
        if (packageFqName.isRoot()) return relativeClassName;
        return new FqNameUnsafe(packageFqName.asString() + "." + relativeClassName.asString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClassId id = (ClassId) o;

        if (!packageFqName.equals(id.packageFqName)) return false;
        if (!relativeClassName.equals(id.relativeClassName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = packageFqName.hashCode();
        result = 31 * result + relativeClassName.hashCode();
        return result;
    }

    @Override
    public String toString() {
        if (packageFqName.isRoot()) return "/" + relativeClassName;
        return packageFqName.toString().replace('.', '/') + "/" + relativeClassName;
    }
}
