package com.kdrtut.interfc;

public interface Car {

    static int lights = 6;
    final int wheels = 4;

    void start();
    void stop();
    void refuel();

}
