package com.example.Patern.Poveden4eskie.TemplateMethod;

abstract class DrinkMaker {
    public final void prepareDrink() {
        boilWater();
        pourInCup();
        addIngredients();
    }

    private void boilWater() {
        System.out.println("Кипятим воду");
    }

    private void pourInCup() {
        System.out.println("Наливаем в чашку");
    }

    protected abstract void addIngredients();
}
