package com.example.Patern.Poveden4eskie.Command;

public class LightCommand implements Command {
    Light light;

    LightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
