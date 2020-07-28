package com.pinc.design_pattern.strategy;

public class Quack implements  QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack...");
    }
}
