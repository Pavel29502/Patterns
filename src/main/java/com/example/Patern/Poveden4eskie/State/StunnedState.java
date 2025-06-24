package com.example.Patern.Poveden4eskie.State;

public class StunnedState implements PlayerState {
    public void  move(Player player) {
        System.out.println("Персонаж оглушен и не может двигаться");
    }

    public void jump(Player player) {
        System.out.println("Персонаж оглушен и не может прыгать");
    }

    public void fly(Player player) {
        System.out.println("Персонаж оглушен и не может летать");
    }
}
