package com.pinc.design_pattern.flywight;

/**
 * 共用常量池的“123”
 */
public class PoolIdea {
    public static void main(String[] args) {
        String s1 = "123";
        String s2 = "123";
        System.out.println(s1 == s2);
    }
}
