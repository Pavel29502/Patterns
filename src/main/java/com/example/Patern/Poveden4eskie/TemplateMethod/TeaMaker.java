package com.example.Patern.Poveden4eskie.TemplateMethod;

public class TeaMaker extends DrinkMaker {
    protected void addIngredients() {
        System.out.println("Добавляем пакетик чая");
    }
}
