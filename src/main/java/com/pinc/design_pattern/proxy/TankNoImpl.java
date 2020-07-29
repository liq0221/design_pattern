package com.pinc.design_pattern.proxy;

public class TankNoImpl {

    public void move() {
        System.out.println("TankNoImpl honghonghong...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
