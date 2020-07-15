package com.example.caroops;

import androidx.annotation.NonNull;

public class Motorcycle extends Vehicles {

    private final int noOfSeats;
    private final int headLight;

    public Motorcycle(String name, int speed, int maxSpeed, int maxFuelTank, int noOfWheels, boolean canFly, int noOfSeats, int headLight) {
        super(name, speed, maxSpeed, maxFuelTank, noOfWheels, canFly);
        this.noOfSeats = noOfSeats;
        this.headLight = headLight;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public int getHeadLight() {
        return headLight;
    }

    @NonNull
    @Override
    public String toString() {
        return String.format("%s%s %s\n%s %s", super.toString(),
                "Seats :", getNoOfSeats(),
                "Headlight :", getNoOfSeats());
    }

    public String sound() {
        return String.format("%s", "pulsor pipipipiipipiii");
    }
}
