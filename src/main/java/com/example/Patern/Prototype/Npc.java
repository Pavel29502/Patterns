package com.example.Patern.Prototype;

import java.util.ArrayList;
import java.util.List;

public class Npc implements Prototype {
    String type;
    String name;
    int level;
    List<Item> inventory;

    public Npc(String type, String name, int level, List<Item> inventory) {
        this.type = type;
        this.name = name;
        this.level = level;
        this.inventory = inventory;
    }

    @Override
    public Prototype clone() {
        List<Item> copyInventory = new ArrayList<>();
        for (Item item : this.inventory) {
            copyInventory.add(new Item(item));
        }
        return new Npc(this.type, this.name, this.level, copyInventory);
    }

    public static void main(String[] args) {
        List<Item> itemList = new ArrayList<>();
        itemList.add(new Item("Sword", 12));
//        itemList.add(new Item("Bow", 15));


        Npc original = new Npc("Gladiator", "Maximus",
                80, itemList);

        Npc clone = (Npc) original.clone();
        clone.name = "Ahiles";
//        clone.inventory.get
    }
}
