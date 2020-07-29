package com.pinc.design_pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


public class MyInvocationHandler implements InvocationHandler {

        Moveable moveable;

        public MyInvocationHandler(Moveable moveable) {
            this.moveable = moveable;
        }

    /**
     * invoke()方法里的三个参数
     * 1.proxy是被代理的对象
     * 2.被代理对象的方法
     * 3.被代理对象的参数
     * 步骤：通过InvocationHandler生成一个真正的代理类对象$Proxy (这个代理类对象会实现被代理类的接口[Moveable])
     *         -> 通过代理类$Proxy去调用方法（m.move()）
     *         -> $Proxy 类中重写了接口里的方法(move() { super.h.invoke() }）
     *         -> 调用InvocationHandler实现类的invoke() 方法
     *         -> 通过反射去调用被代理类的方法（method.invoke()）
     */
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("method start ....");
            Object o = method.invoke(moveable,args);
            System.out.println("method end ....");
            return o;
        }
}
