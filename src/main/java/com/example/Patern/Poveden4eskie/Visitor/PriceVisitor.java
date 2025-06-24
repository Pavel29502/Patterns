package com.example.Patern.Poveden4eskie.Visitor;

public class PriceVisitor implements Visitor {
    int totalPrice = 0;

    public void visit(Apple apple) {
        totalPrice += apple.price;
    }

    public void visit(Banana banana) {
        totalPrice += banana.price;
    }

    public int getTotalPrice() {
        return totalPrice;
    }
}
