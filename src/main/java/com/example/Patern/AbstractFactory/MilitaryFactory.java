package com.example.Patern.AbstractFactory;

public interface MilitaryFactory {
    Plane createPlane();
    Tank createTank();
    Ship createShip();
}
