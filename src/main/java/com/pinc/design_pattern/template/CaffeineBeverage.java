package com.pinc.design_pattern.template;

public abstract class CaffeineBeverage {

    final void  prepareRecipe() {
        boliWater();
        brew();
        pourIncup();
        addCondiments();
    }

    abstract  void brew();

    abstract  void addCondiments();

    void boliWater() {
        System.out.println("Boiling water...");
    };

    void pourIncup() {
        System.out.println("pour in cup...");
    }
}
