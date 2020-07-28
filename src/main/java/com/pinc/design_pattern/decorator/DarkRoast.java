package com.pinc.design_pattern.decorator;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "DarkRoast";
    }
    @Override
    double cost() {
        return 1.25;
    }
}
