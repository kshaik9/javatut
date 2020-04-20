package com.kdrtut.inheritance;

public abstract class Car {
    public static Car gear(int size) {
        return new CarGear(size);
    }

    public static class CarGear extends Car {
        private final int size;
        public CarGear(int size) {
            if (size == 0) {
                throw new IllegalArgumentException("Cannot find the size of the gear.");
            }
            this.size = size;
        }
    }


}
