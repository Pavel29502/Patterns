package com.example.Patern.Builder;

public class Car {
    private int doors;
    private double engine;
    private int numberOfSeats;
    private boolean truck;

    public static class Builder {
        private int doors;
        private double engine;
        private int numberOfSeats;
        private boolean truck;

        public Builder doors(int doors) {
            this.doors = doors;
            return this;
        }

        public Builder engine(double engine) {
            if (engine <= 0.6 || engine > 4.0) {
                throw new IllegalArgumentException("Dvigatel' mojet bit' v predelah 0.6 - 4 L");
            }
            this.engine = engine;
            return this;
        }

        public Builder numberOfSeats(int number) {
            if (number < 2 || number > 8) {
                throw new IllegalArgumentException("Koli4estvo mes doljno bit' ot 2 do 8");
            }
            this.numberOfSeats = number;
            return this;
        }

        public Builder truck(boolean truck1) {
            this.truck = truck1;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    private Car(Builder builder) {
        this.doors = builder.doors;
        this.engine = builder.engine;
        this.numberOfSeats = builder.numberOfSeats;
        this.truck = builder.truck;
    }

    public static void main(String[] args) {
        Car wv = new Builder()
                .doors(5)
                .engine(3.0)
                .numberOfSeats(4)
                .truck(false)
                .build();
    }
}
