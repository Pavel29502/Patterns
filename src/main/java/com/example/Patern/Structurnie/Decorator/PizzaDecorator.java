package com.example.Patern.Structurnie.Decorator;

public class PizzaDecorator implements Pizza {
    protected Pizza decoratedPizza;

    public PizzaDecorator(Pizza pizza) {
        this.decoratedPizza = pizza;
    }

    @Override
    public int cost() {
        return decoratedPizza.cost();
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription();
    }

    public static void main(String[] args) {
        Pizza pizza = new SimplePizza();
        System.out.println(pizza.getDescription() + pizza.cost());

        Pizza pizCheese = new CheeseDecorator(pizza);
        System.out.println(pizCheese.getDescription() + pizCheese.cost());

        Pizza pizPiperoni = new PiperoniDecorator(pizza);
        System.out.println(pizPiperoni.getDescription() + pizPiperoni.cost());

    }
}
