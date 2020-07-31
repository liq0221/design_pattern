package com.pinc.design_pattern.builder;

public class Main {

    public static void main(String[] args) {
        Person person = new Person.PersonBuilder()
                .basicInfo("zhangsan")
                .height(180)
                .weight(200)
                .loc("#32", "sh")
                .build();
        System.out.println(person);
    }
}
