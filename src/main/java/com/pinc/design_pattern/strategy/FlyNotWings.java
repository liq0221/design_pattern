package com.pinc.design_pattern.strategy;

public class FlyNotWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("i can't fly...");
    }
}
