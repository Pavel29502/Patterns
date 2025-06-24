package com.example.Patern.Poveden4eskie.ChainOfResponsibility;

 class Secretary extends CallHandler {
     @Override
     public void handleCall(String callTopic) {
     if (callTopic.equalsIgnoreCase("вопрос по времени работы")) {
        System.out.println("Секретарь ответил на вопрос о времени работы.");
    } else if (next != null) {
        System.out.println("Секретарь перенаправил звонок...");
        next.handleCall(callTopic);
    }
}
}
