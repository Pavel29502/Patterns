package com.example.Patern.Poveden4eskie.ChainOfResponsibility;

public class Director extends CallHandler {
    public void handleCall(String callTopic) {
        if (callTopic.equalsIgnoreCase("жалоба") || callTopic.equalsIgnoreCase("важный вопрос")) {
            System.out.println("Директор принял звонок по важному вопросу.");
        } else {
            System.out.println("Никто не смог обработать звонок: \"" + callTopic + "\"");
        }
    }

}
