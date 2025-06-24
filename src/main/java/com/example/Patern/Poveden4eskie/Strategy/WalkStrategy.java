package com.example.Patern.Poveden4eskie.Strategy;

public class WalkStrategy implements MoveStrategy {
    @Override
    public void move() {
        System.out.println("Иду пешком");
    }
}
