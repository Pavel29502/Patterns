package com.example.Patern.Poveden4eskie.Strategy;

public class FlyStrategy implements MoveStrategy {
    @Override
    public void move() {
        System.out.println("Лечу над землей");
    }
}
