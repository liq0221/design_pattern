package com.pinc.design_pattern.bridge;

public class Main {

    public static void main(String[] args) {
        Pen pen = new MiddlePen();
        Color color = new Red();
        pen.setColor(color);
        pen.draw("玫瑰");
    }
}
