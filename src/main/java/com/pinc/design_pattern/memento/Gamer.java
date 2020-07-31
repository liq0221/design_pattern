package com.pinc.design_pattern.memento;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Gamer {

    private int money;

    private List<String> fruits = new ArrayList<>();

    private Random random = new Random();

    private String[] fruitNames = {"苹果","香蕉","葡萄","梨"};

    public Gamer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public String getFruit() {
        String prefix = "";
        if (random.nextBoolean()) {
            prefix = "好吃的";
        }
        return prefix + fruitNames[random.nextInt(fruitNames.length)];
    }

    public Memento createMemento() {
        Memento memento = new Memento(100);
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String f = iterator.next();
            if (f.startsWith("好吃的")) {
                fruits.add(f);
            }
        }
        return memento;
    }

    public void restoreMemento(Memento memento) {
        this.money = memento.getMoney();
        this.fruits = memento.getFruits();
    }

    public void bet() {
        switch (random.nextInt(6 ) + 1) {
            case 1:
                money += 100;
                System.out.println("所持有的金钱增加了");
                break;
            case 2:
                money /= 2;
                System.out.println("所持有的金钱减半");
                break;
            case 6:
                String f = getFruit();
                fruits.add(f);
                System.out.println("获得了水果(" + f + ")");
                break;
            default:
                System.out.println("什么都不做");
                break;
        }
    }

    @Override
    public String toString() {
        return "Gamer{" +
                "money=" + money +
                ", fruits=" + fruits +
                '}';
    }
}
