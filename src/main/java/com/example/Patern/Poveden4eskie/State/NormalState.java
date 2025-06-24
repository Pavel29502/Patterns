package com.example.Patern.Poveden4eskie.State;

public class NormalState implements PlayerState{

    public void move(Player player) {
        System.out.println("Персонаж идет пешком");
    }

    public void jump(Player player) {
        System.out.println("Персонаж прыгает");
    }

    public void fly(Player player) {
        System.out.println("Не умеет летать");
    }

    public static void main(String[] args) {
        Player player = new Player();

        player.move();
        player.jump();
        player.fly();

        player.setState(new SuperState());

        player.fly();

        player.setState(new StunnedState());

        player.fly();
    }


}
