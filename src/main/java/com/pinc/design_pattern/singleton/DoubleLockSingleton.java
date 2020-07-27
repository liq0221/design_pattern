package com.pinc.design_pattern.singleton;

public class DoubleLockSingleton {

    private volatile  DoubleLockSingleton doubleLockSingleton;

    public DoubleLockSingleton(){};

    public DoubleLockSingleton getInstance() {
        if (doubleLockSingleton == null) {
            synchronized (this) {
                if (doubleLockSingleton == null) {
                    doubleLockSingleton = new DoubleLockSingleton();
                }
            }
        }
        return doubleLockSingleton;
    }
}
