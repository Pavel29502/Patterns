package com.example.Patern.AbstractFactory;

public class RussianFactory implements MilitaryFactory{

    @Override
    public Plane createPlane() {
        return new RussianPlane();
    }

    @Override
    public Tank createTank() {
        return new RussianTank();
    }

    @Override
    public Ship createShip() {
        return new RussianShip();
    }
}
