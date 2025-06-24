package com.example.Patern.Poveden4eskie.State;

public class SuperState implements PlayerState {
    public void move(Player player) {
        System.out.println("Персонаж бежит с быстрой скоростью");
    }

    public void jump(Player player) {
        System.out.println("Суперпрыжок");
    }

    @Override
    public void fly(Player player) {
        System.out.println("Персонаж летит");
    }
}
