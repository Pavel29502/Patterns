package com.example.Patern.Poveden4eskie.Strategy;

public class Robot {
    private MoveStrategy strategy;

    public Robot(MoveStrategy moveStrategy) {
        this.strategy = moveStrategy;
    }

    public void setStrategy(MoveStrategy moveStrategy) {
        this.strategy = moveStrategy;
    }

    public void move() {
        strategy.move();
    }

    public static void main(String[] args) {
        Robot robot = new Robot(new WalkStrategy());
        robot.move();

        robot.setStrategy(new FlyStrategy());
        robot.move();
    }
}
