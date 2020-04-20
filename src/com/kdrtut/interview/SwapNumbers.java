package com.kdrtut.interview;

public class SwapNumbers {
    public static void main(String[] args) {
        int num1 = 883;
        int num2 = 638;
        System.out.println("Numbers before swap :: num1 -> " + num1 + ", num2 -> " + num2);

        num2 = num1 + num2;
        num1 = num2 - num1;
        num2 = num2 - num1;
        System.out.println("Numbers after swap :: num1 -> " + num1 + ", num2 -> " + num2);

    }
}
