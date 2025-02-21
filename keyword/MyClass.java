package com.keyword;

public class MyClass {
    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    public MyClass getCurrentObject() {
        return this;
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass(42);

        MyClass currentObject = obj.getCurrentObject();

        System.out.println("Value: " + currentObject.getValue());
    }
}
