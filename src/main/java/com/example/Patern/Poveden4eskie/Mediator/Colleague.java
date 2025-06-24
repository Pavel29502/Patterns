package com.example.Patern.Poveden4eskie.Mediator;

abstract class Colleague {
    protected Mediator mediator;
    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
    public abstract void receive(String message);

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student s1 = new Student(teacher, "Аня");
        Student s2 = new Student(teacher, "Борис");

        teacher.setStudents(s1, s2);
        s1.send("Привет, Борис!");
        s2.send("Привет, Аня!");
    }
}
