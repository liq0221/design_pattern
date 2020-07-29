package com.pinc.design_pattern.adaptor;

public class DuckAdaptor extends Duck {

    Turkey turkey;

    public DuckAdaptor(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        System.out.println("duck adaptor....");
        turkey.quack();
    }

    @Override
    public void fly() {
        System.out.println("duck adaptor....");
        turkey.fly();
    }
}
