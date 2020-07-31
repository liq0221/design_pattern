package com.pinc.design_pattern.memento;

public class Main {

    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = new Memento(gamer.getMoney());
        for (int i = 0; i < 10; i++) {
            System.out.println("========" + i);
            System.out.println("当前状态===" + gamer);

            gamer.bet();
            System.out.println("所持金钱为："+gamer.getMoney()+"元");
            if(gamer.getMoney()>memento.getMoney()){
                System.out.println("所持金钱增加了许多，所以保存游戏当前状态");
                gamer.createMemento();
            }

            if(gamer.getMoney()<memento.getMoney()){
                System.out.println("所持金钱减少了许多，所以恢复至游戏以前的状态");
                gamer.restoreMemento(memento);
            }
        }

    }

}
