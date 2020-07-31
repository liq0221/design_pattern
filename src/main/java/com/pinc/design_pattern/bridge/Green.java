package com.pinc.design_pattern.bridge;

public class Green implements Color {
    @Override
    public void bepaint(String penType, String name) {
        System.out.println(penType + "绘制绿色" + name);
    }
}
