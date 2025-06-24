package com.example.Patern.Poveden4eskie.Visitor;

public class Banana implements Fruit {
    int price = 15;
    int weight = 2;

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
