package com.example.Patern.Poveden4eskie.State;

public class Player {
    private PlayerState state;

    public Player() {
        this.state = new NormalState();
    }

    public void setState(PlayerState state) {
        this.state = state;
    }

    public void move() {
        state.move(this);
    }

    public void jump() {
        state.jump(this);
    }

    public void fly() {
        state.fly(this);
    }
}
