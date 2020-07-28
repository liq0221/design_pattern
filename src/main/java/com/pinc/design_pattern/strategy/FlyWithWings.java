package com.pinc.design_pattern.strategy;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("i can fly...");
    }
}
