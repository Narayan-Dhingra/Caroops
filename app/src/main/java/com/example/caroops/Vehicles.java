package com.example.caroops;

import androidx.annotation.NonNull;

public class Vehicles extends Object{

    private String name;
    private int speed;
    private final int maxSpeed;
    private final int maxFuelTank;
    private int noOfWheels;
    private final boolean canFly;

    /*****
     * Constructor to initialise values
     * @param name
     * @param speed
     * @param maxSpeed
     * @param maxFuelTank
     * @param noOfWheels
     * @param canFly
     */

    public Vehicles(String name, int speed, int maxSpeed,
                    int maxFuelTank, int noOfWheels, boolean canFly)
    {
        this.name = name;
        this.speed = speed;
        this.maxSpeed = maxSpeed;
        this.maxFuelTank = maxFuelTank;
        this.noOfWheels = noOfWheels;
        this.canFly = canFly;
    }

    /****
     * Getter & Setters
     * @return
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }



    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getMaxFuelTank() {
        return maxFuelTank;
    }



    public int getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }



    public boolean isCanFly() {
        return canFly;
    }


    @NonNull
    @Override
    public String toString() {
        return String.format("%s %s \n%s %s \n%s %s \n%s %s \n%s %s \n%s %s \n",
                "Name :", getName(),
                "Max Speed :", getMaxSpeed(),
                "Speed :",getSpeed(),
                "Fuel Tank :", getMaxFuelTank(),
                "Wheels :", getNoOfWheels(),
                "Fly :", isCanFly());





    }

    public String sound() {
        return String.format("%s", "pooooooooo poooooooo piiiiiiiiiii");
    }

}
