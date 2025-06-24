package com.example.Patern.Structurnie.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class CIrcleFactory {
    private final Map<String, Circle> circles = new HashMap<>();

    public Circle getCircle(String color) {
        if (!circles.containsKey(color)) {
            circles.put(color, new Circle(color));
        }
        return circles.get(color);
    }
}
