package com.example.caroops;

import androidx.annotation.NonNull;

public class Car extends Vehicles {

    private final String color;

    public Car(String name, int speed, int maxSpeed, int maxFuelTank, int noOfWheels,
               boolean canFly, String color) {
        super(name, speed, maxSpeed, maxFuelTank, noOfWheels, canFly);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @NonNull
    @Override
    public String toString() {
        return String.format("%s%s %s", super.toString(),
                "color :", getColor() );
    }

    public String sound() {
        return String.format("%s", "car pupupupup");
    }
}

