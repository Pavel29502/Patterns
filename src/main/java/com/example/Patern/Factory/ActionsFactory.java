package com.example.Patern.Factory;

public class ActionsFactory {
    public Actions createAction(String type) {
        if (type.equals("bee")) {
            return new Bee();
        } else if (type.equals("bird")) {
            return new Bird();
        } else if (type.equals("helicopter")) {
            return new Helicopter();
        }
        throw new IllegalArgumentException("Unknown type");
    }

    public static void main(String[] args) {
        ActionsFactory factory = new ActionsFactory();
        Actions action1 = factory.createAction("bee");
        action1.fly();

        Actions action2 = factory.createAction("helicopter");
        action2.fly();
    }


}
