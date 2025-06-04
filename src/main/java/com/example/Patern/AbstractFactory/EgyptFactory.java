package com.example.Patern.AbstractFactory;

public class EgyptFactory implements MilitaryFactory {
    @Override
    public Plane createPlane() {
        return new EgyptPlane();
    }
    @Override
    public Tank createTank() {
        return new EgyptTank();

    }
    @Override
    public Ship createShip() {
        return new EgyptShip();
    }
}
