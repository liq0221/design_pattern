package com.pinc.design_pattern.composite;

public class LeafNode extends Node {

    String name;

    public LeafNode(String name) {
        this.name = name;
    }

    @Override
    public void p() {
        System.out.println(name);
    }
}
