package com.example.Patern.Structurnie.Flyweight;

public class Circle {
    private final String color;

    public Circle(String color) {
        this.color = color;
    }

    public void draw(int x, int y) {
        System.out.println("Рисуем круг цвета " + color + " в позиции (" + x + ", " + y + ")");
    }

    public static void main(String[] args) {
        CIrcleFactory factory = new CIrcleFactory();

        factory.getCircle("красный").draw(10, 10);
        factory.getCircle("красный").draw(20, 15);
        factory.getCircle("красный").draw(30, 20);

        factory.getCircle("синий").draw(5, 5);
        factory.getCircle("синий").draw(15, 10);
    }

}
