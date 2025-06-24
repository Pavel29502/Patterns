package com.example.Patern.Poveden4eskie.State;

public interface PlayerState {
    void move(Player player);
    void jump(Player player);
    void fly(Player player);
}
