package com.example.Patern.Poveden4eskie.Visitor;

public class WeightVisitor implements Visitor {
    int totalWeight = 0;

    public void visit(Apple apple) {
        totalWeight += apple.weight;
    }

    public void visit(Banana banana) {
        totalWeight += banana.weight;
    }

    public int getTotalWeight() {
        return totalWeight;
    }
}
