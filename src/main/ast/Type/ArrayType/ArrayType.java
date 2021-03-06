package ast.Type.ArrayType;

import ast.Type.Type;

public class ArrayType extends Type {
    private int size;
    public ArrayType(int size)
    {
        isPrimitive = true;
        this.size = size;
    }
    @Override
    public String toString() {
        return "int[]";
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
