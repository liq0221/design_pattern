package com.pinc.design_pattern.strategy;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Person[] persons = {new Person(180),new Person(160),new Person(175)};
        Sorter<Person> sorter = new Sorter<>();
        sorter.sort(persons,(t1,t2) -> {
            if (t1.height > t2.height) {
                return -1;
            } else if (t1.height < t2.height) {
                return 1;
            } else {
                return 0;
            }
        });
        System.out.println(Arrays.toString(persons));
    }
}
