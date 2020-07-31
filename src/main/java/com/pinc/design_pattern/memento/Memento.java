package com.pinc.design_pattern.memento;

import java.util.ArrayList;
import java.util.List;

public class Memento {

    int money;

    ArrayList<String> fruits;

    public Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList<>();
    }

    public int getMoney() {
        return money;
    }

    public void addFruit(String fruit) {
        fruits.add(fruit);
    }

    public List<String> getFruits() {
        return fruits;
    }
}
