package com.example.Patern.AbstractFactory;

public class RussianTank implements Tank {

    private String name = "T-80";
    public RussianTank() {
        System.out.println("Russian tank created");
    }

    @Override
    public String toString() {
        return "RussianTank{" +
                "name='" + name + '\'' +
                '}';
    }
}
