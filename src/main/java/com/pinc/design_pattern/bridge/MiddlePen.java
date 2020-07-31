package com.pinc.design_pattern.bridge;

public class MiddlePen extends Pen {
    @Override
    public void draw(String name) {
        String penType = "中号毛笔";
        this.color.bepaint(penType , name);
    }
}
