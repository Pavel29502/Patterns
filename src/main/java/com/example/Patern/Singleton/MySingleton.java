package com.example.Patern.Singleton;

public class MySingleton {
    private static MySingleton singleton = new MySingleton();

    private MySingleton() {
        System.out.println("Создан приватный конструктор");
    }

    public static MySingleton getInstance() {
        return singleton;
    }

    public static void main(String[] args) {
        MySingleton singleton1 = MySingleton.getInstance();
        MySingleton singleton2 = MySingleton.getInstance();

        if (singleton1 == singleton2) {
            System.out.println("Это один и тот же обьект");
        } else {
            System.out.println("Обьект не является синглтоном");
        }
    }
}
