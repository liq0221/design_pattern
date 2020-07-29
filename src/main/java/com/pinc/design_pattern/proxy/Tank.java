package com.pinc.design_pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Tank implements Moveable {

    @Override
    public void move() {
        System.out.println("Tank honghonghong...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
