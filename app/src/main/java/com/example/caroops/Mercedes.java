package com.example.caroops;

import androidx.annotation.NonNull;

public class Mercedes extends Car implements Control {

    private final String sticker;
    private final String seatbelt;
    private final String roofTop;

    public Mercedes(String name, int speed, int maxSpeed, int maxFuelTank, int noOfWheels, boolean canFly, String color, String sticker, String seatbelt, String roofTop) {
        super(name, speed, maxSpeed, maxFuelTank, noOfWheels, canFly, color);
        this.sticker = sticker;
        this.seatbelt = seatbelt;
        this.roofTop = roofTop;
    }


    public String getSticker() {
        return sticker;
    }

    public String getSeatbelt() {
        return seatbelt;
    }

    public String getRoofTop() {
        return roofTop;
    }

    @NonNull
    @Override
    public String toString() {
        return String.format("%s\n%s %s\n%s %s\n%s %s", super.toString(),
                "Sticker :", getSticker(),
                "Seatbelt :", getSeatbelt(),
                "Rooftop :", getRoofTop());
    }

    public String sound() {
        return String.format("%s", "mercedes poooooooooooo");
    }

    @Override
    public String goSlow() {
        return "slowing speed";
    }

    @Override
    public String goFast() {
        return "fastening up";
    }

    @Override
    public String applyBrakes() {
        return "applying brakes";
    }
}
