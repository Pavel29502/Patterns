package com.example.Patern.Poveden4eskie.Command;

public class Button {
    Command command;

    Button(Command command) {
        this.command = command;
    }

    void press() {
        command.execute();
    }

    public static void main(String[] args) {
        Light light = new Light();
        Command lightOn = new LightCommand(light);
        Button button = new Button(lightOn);

        button.press();
    }
}
