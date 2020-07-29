package com.pinc.design_pattern.adaptor;

public class MallardDuck extends Duck {

    @Override
    public void quack() {
        System.out.println("zhizhizhi...");
    }

    @Override
    public void fly() {
        System.out.println("i can fly...");
    }
}
