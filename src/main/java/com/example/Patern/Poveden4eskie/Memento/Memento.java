package com.example.Patern.Poveden4eskie.Memento;

public class Memento {
    private final String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        editor.setText("Первая версия текста");
        System.out.println("Текущий текст: " + editor.getText());

        Memento saved = editor.save();
        editor.setText("Вторая версия текста");
        System.out.println("Текущий текст: " + editor.getText());

        editor.restore(saved);
        System.out.println("После восстановления: " + editor.getText());
    }
    }

