package com.example.Patern.Structurnie.Facade;

public class HDD {
    private String type;

    public HDD(String type) {
        this.type = type;
    }

    public void install() {
        System.out.println("Установлен накопитель " + type);
    }
}
