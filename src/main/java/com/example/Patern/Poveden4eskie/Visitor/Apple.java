package com.example.Patern.Poveden4eskie.Visitor;

public class Apple implements Fruit {
    int price = 10;
    int weight = 3;

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public static void main(String[] args) {
        Fruit[] fruits = { new Apple(), new Banana(), new Apple() };
        PriceVisitor priceVisitor = new PriceVisitor();
        WeightVisitor weightVisitor = new WeightVisitor();

        for (Fruit fruit : fruits) {
            fruit.accept(priceVisitor);
            fruit.accept(weightVisitor);
        }

        System.out.println("Общая стоимость " + priceVisitor.getTotalPrice());
        System.out.println("Общий вес " + weightVisitor.getTotalWeight());
    }
}
