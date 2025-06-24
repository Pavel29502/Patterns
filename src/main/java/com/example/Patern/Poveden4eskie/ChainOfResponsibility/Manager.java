package com.example.Patern.Poveden4eskie.ChainOfResponsibility;

public class Manager extends CallHandler {
    public void handleCall(String callTopic) {
        if (callTopic.equalsIgnoreCase("вопрос по заказу")) {
            System.out.println("Менеджер ответил на вопрос по заказу.");
        } else if (next != null) {
            System.out.println("Менеджер перенаправил звонок...");
            next.handleCall(callTopic);
        }
    }

}
