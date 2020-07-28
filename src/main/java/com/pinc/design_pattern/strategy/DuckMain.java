package com.pinc.design_pattern.strategy;

public class DuckMain {

    public static void main(String[] args) {
        Duck duck = new ModelDuck();

        duck.setFlyBehavior(new FlyNotWings());

        duck.setQuackBehavior(new MuteQuack());

        duck.initDuck();

        duck.performFly();

        duck.performQuack();
    }
}
