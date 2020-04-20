package com.kdrtut.interview;

public class PrimeNumber {
    public static void main(String[] args) {
        int number = 5;
        PrimeNumber primeNumber = new PrimeNumber();
        System.out.println("Is \"" + number + "\" a prime number? " + primeNumber.isPrimeNumber(number));
    }

    public boolean isPrimeNumber(int num) {
        if(num < 1) {
            return false;
        }

        for(int i = 2; i < num; i++) {
            if(num % 2 == 0) {
                return false;
            }
        }

        return true;
    }
}
