package com.example.Patern.Structurnie.Facade;

public class Ram {
    private int sizeGB;

    public Ram(int sizeGB) {
        this.sizeGB = sizeGB;
    }

    public void install() {
        System.out.println("Установлена память " + sizeGB);
    }


}
