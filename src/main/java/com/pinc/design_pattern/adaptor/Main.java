package com.pinc.design_pattern.adaptor;

public class Main {

    public static void main(String[] args) {
        Turkey turkey = new Turkey();
        DuckAdaptor adaptor = new DuckAdaptor(turkey);
        adaptor.quack();
        adaptor.fly();
    }
}
