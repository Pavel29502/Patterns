package com.example.Patern.Prototype;

public class Item {
    String name;
    int power;

    public Item(String name, int power) {
        this.name = name;
        this.power = power;
    }
    public Item(Item copyItem) {
        this.name = copyItem.name;
        this.power = copyItem.power;
    }
}
