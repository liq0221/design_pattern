package com.pinc.design_pattern.decorator;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "HouseBlend";
    }
    @Override
    double cost() {
        return 0.75;
    }
}
