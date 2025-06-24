package com.example.Patern.Poveden4eskie.Mediator;

public class Teacher implements Mediator {
    private Colleague student1;
    private Colleague student2;

    public void setStudents(Colleague s1, Colleague s2) {
        this.student1 = s1;
        this.student2 = s2;
    }

    @Override
    public void send(String message, Colleague sender) {
        if (sender == student1) {
            student2.receive(message);
        } else {
            student1.receive(message);
        }
    }
}
