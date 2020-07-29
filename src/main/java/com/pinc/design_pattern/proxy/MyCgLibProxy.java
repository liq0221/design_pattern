package com.pinc.design_pattern.proxy;

public class MyCgLibProxy {

    public static void main(String[] args) {
        TankNoImpl tankNo = new TankNoImpl();
        MyMethodInterceptor myMethodInterceptor = new MyMethodInterceptor();
        TankNoImpl t = (TankNoImpl)myMethodInterceptor.getInstance(tankNo);
        t.move();
    }
}
