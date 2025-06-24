package com.example.Patern.Structurnie.Decorator;

public class SimplePizza implements Pizza {
    @Override
    public int cost() {
        return 15;
    }

    @Override
    public String getDescription() {
        return "Simple pizza";
    }
}
