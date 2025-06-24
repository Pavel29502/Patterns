package com.example.Patern.Structurnie.Facade;

public class VideoCard {
    private String title;

    public VideoCard(String title) {
        this.title = title;
    }

    public void instal() {
        System.out.println("Установлена видеокарта " + title);
    }
}
