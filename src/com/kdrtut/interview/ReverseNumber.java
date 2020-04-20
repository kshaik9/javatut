package com.kdrtut.interview;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 432479;
        System.out.println("Act number :: " + number);

        int reverse = 0;

        while(number > 0) {
            reverse = reverse * 10 + (number % 10);
            number = number / 10;
        }

        System.out.println("Rev number :: " + reverse);
    }
}
