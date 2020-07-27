package com.pinc.design_pattern.factory;

public class ModelFactory extends  AbstractFactory{
    @Override
    Weapon createWeapon() {
        return new Nurclear();
    }

    @Override
    Food createFood() {
        return new Bread();
    }

    @Override
    Vehicle createVehicle() {
        return new BMWCar();
    }
}
