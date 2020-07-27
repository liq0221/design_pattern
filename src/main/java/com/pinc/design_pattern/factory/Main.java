package com.pinc.design_pattern.factory;

public class Main {

    public static void main(String[] args) {
        AbstractFactory f = new MagicFactory();

        Food food = f.createFood();
        food.eat();
        Vehicle vehicle = f.createVehicle();
        vehicle.go();
        Weapon weapon = f.createWeapon();
        weapon.shoot();

    }
}
