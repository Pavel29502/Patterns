package com.example.Patern.Poveden4eskie.ChainOfResponsibility;

abstract class CallHandler {
    protected CallHandler next;

    public void setNext(CallHandler next) {
        this.next = next;
    }
    public abstract void handleCall(String callTopic);

    public static void main(String[] args) {
        CallHandler secretary = new Secretary();
        CallHandler manager = new Manager();
        CallHandler director = new Director();

        secretary.setNext(manager);
        manager.setNext(director);

        System.out.println("---- Звонок 1 ----");
        secretary.handleCall("вопрос по времени работы");

        System.out.println("\n---- Звонок 2 ----");
        secretary.handleCall("вопрос по заказу");

        System.out.println("\n---- Звонок 3 ----");
        secretary.handleCall("жалоба");
    }
}

