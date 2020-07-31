package com.pinc.design_pattern.bridge;

public class SmallPen extends Pen {
    @Override
    public void draw(String name) {
        String penType = "小号毛笔";
        this.color.bepaint(penType , name);
    }
}
