package com.pinc.design_pattern.decorator;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }
    @Override
    double cost() {
        return 0.85;
    }
}
