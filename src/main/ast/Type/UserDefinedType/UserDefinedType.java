package ast.Type.UserDefinedType;

import ast.Type.Type;
import ast.node.declaration.ClassDeclaration;
import ast.node.expression.Identifier;

public class UserDefinedType extends Type {
    private ClassDeclaration classDeclaration;

    public UserDefinedType() {}
    public UserDefinedType(ClassDeclaration classDeclaration)
    {
        isPrimitive = false;
        this.classDeclaration = classDeclaration;
    }

    public ClassDeclaration getClassDeclaration() {
        return classDeclaration;
    }

    public void setClassDeclaration(ClassDeclaration classDeclaration) {
        this.classDeclaration = classDeclaration;
    }

    public Identifier getName() {
        return name;
    }

    public void setName(Identifier name) {
        this.name = name;
    }

    private Identifier name;

    @Override
    public String toString() {
        if (classDeclaration == null)
            return "";
        return classDeclaration.getName().getName();
    }
}