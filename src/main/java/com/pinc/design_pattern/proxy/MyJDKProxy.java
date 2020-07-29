package com.pinc.design_pattern.proxy;

import java.lang.reflect.Proxy;

/**
 * jdk动态代理的前提条件被代理的类必须实现接口
*   jdk动态代理newProxyInstance（）需要三个参数
 *  1.选择使用哪个类加载器
 *  2.被代理的接口
 *  3.InvocationHandler接口的实现（可以自定义handler，必须实现iInvocationHandler接口）
 */
public class MyJDKProxy {

    public static void main(String[] args) {
        Tank tank = new Tank();
       //System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        Moveable m = (Moveable) Proxy.newProxyInstance(Tank.class.getClassLoader(),
                new Class[]{Moveable.class},
                new MyInvocationHandler(tank) );
        m.move();
    }


}
