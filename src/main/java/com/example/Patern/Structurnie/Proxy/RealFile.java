package com.example.Patern.Structurnie.Proxy;

public class RealFile implements File{
    private final String filename;

    public RealFile(String filename) {
        this.filename = filename;
        System.out.println("Загружаем файл " + filename);
    }

    public void open() {
        System.out.println("Открываем файл " + filename);
    }
}
