package com.pinc.design_pattern.factory;

public class MagicFactory extends  AbstractFactory{
    @Override
    Weapon createWeapon() {
        return new XRay();
    }

    @Override
    Food createFood() {
        return new MagicStick();
    }

    @Override
    Vehicle createVehicle() {
        return new SpaceCraft();
    }
}
