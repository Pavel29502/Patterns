package com.example.Patern.Structurnie.Adapter;

public class RussianTranslator implements Translator {
    public void speak(String message) {
        System.out.println("Русский человек переводит для себя - Здравствуйте ");
    }

    public static void main(String[] args) {
        RussianTranslator russianTranslator = new RussianTranslator();
        EnglishAdapter adapter = new EnglishAdapter();
        russianTranslator.speak("Hello");
        adapter.speak("Hello adapter");
    }
}
