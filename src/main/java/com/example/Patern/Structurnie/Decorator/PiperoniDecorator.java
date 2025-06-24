package com.example.Patern.Structurnie.Decorator;

public class PiperoniDecorator extends PizzaDecorator {
    public PiperoniDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int cost() {
        return super.cost() + 5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", piperoni";
    }
}
