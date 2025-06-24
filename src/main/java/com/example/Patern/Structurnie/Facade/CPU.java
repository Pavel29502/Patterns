package com.example.Patern.Structurnie.Facade;

public class CPU {
    private String title;

    public CPU(String title) {
        this.title = title;
    }

    public void instal() {
        System.out.println("Установлен процессор " + title);
    }
}
