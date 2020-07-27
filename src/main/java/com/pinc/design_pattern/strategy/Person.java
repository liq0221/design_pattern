package com.pinc.design_pattern.strategy;

public class Person {

    int height;

    public Person(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "height=" + height +
                '}';
    }
}
