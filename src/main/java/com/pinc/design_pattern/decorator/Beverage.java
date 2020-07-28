package com.pinc.design_pattern.decorator;

public abstract class Beverage {

    String description = "unknow beverage";

    public String getDescription() {
        return description;
    }

    abstract  double cost();
}
