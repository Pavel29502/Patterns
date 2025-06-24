package com.example.Patern.Poveden4eskie.Observer;

public class ConcreteObserver implements Observer{
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name + "получил обновление " + message);
    }

    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer o1 = new ConcreteObserver("Наблюдатель 1");
        Observer o2 = new ConcreteObserver("Наблюдатель 2");

        subject.attach(o1);
        subject.attach(o2);

        subject.setState("Состояние изменилось");
    }
}
