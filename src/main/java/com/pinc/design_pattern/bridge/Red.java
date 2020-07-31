package com.pinc.design_pattern.bridge;

public class Red implements Color {
    @Override
    public void bepaint(String penType, String name) {
        System.out.println(penType + "绘制红色" + name);
    }
}
