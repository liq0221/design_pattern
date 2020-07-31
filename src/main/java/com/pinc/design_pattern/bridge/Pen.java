package com.pinc.design_pattern.bridge;

public abstract class Pen {

    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract  void draw(String name);
}
