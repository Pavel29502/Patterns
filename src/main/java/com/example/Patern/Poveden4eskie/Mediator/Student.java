package com.example.Patern.Poveden4eskie.Mediator;

public class Student extends Colleague {
    private String name;

    public Student(Mediator mediator, String name) {
        super(mediator);
        this.name = name;
    }

    public void send(String message) {
        System.out.println(name + " говорит: " + message);
        mediator.send(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println(name + " получил: " + message);
    }
}
