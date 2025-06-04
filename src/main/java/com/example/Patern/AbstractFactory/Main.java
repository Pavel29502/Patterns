package com.example.Patern.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        MilitaryFactory rusFactory = new RussianFactory();
        Tank tank1 = rusFactory.createTank();
        System.out.println(tank1);

        Plane plane1 = rusFactory.createPlane();
        Ship ship1 = rusFactory.createShip();

        MilitaryFactory egyptFactory = new EgyptFactory();
        Tank tank2 = egyptFactory.createTank();
        Plane plane2 = egyptFactory.createPlane();
        Ship ship2 = egyptFactory.createShip();

    }
}
