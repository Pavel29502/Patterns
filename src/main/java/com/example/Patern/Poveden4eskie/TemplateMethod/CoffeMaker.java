package com.example.Patern.Poveden4eskie.TemplateMethod;

public class CoffeMaker extends DrinkMaker {
    protected void addIngredients() {
        System.out.println("Добавляем кофе");
    }

    public static void main(String[] args) {
        DrinkMaker tea = new TeaMaker();
        System.out.println("Готовим чай:");
        tea.prepareDrink();

        System.out.println();

        DrinkMaker coffe = new CoffeMaker();
        System.out.println("Готовим кофе:");
        coffe.prepareDrink();
    }
}
