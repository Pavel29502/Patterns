package com.example.Patern.Structurnie.Adapter;

public class EnglishAdapter implements Translator {

    @Override
    public void speak(String message) {
        EnglishPerson person = new EnglishPerson();
        person.sayInEnglish(" - English message");
    }
}
