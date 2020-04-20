package com.kdrtut.interfc;

public class Maruti implements Car{
    @Override
    public void start() {
        System.out.println("Maruti -- start");
    }

    @Override
    public void stop() {
        System.out.println("Maruti -- stop");
    }

    @Override
    public void refuel() {
        System.out.println("Maruti -- refuel");
    }
}
