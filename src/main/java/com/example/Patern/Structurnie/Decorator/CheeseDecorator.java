package com.example.Patern.Structurnie.Decorator;

public class CheeseDecorator extends PizzaDecorator {
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int cost() {
        return super.cost() + 3;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", cheese";
    }
}
