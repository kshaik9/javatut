package com.kdrtut.interview;

public class FactorialNumber {
    public static void main(String[] args) {
        int num = 10;
        int temp = num;
        long factNum = 1;

        while(temp > 0) {
            factNum = factNum * temp;
            temp --;
        }

        System.out.println("Factorial number of \"" + num + "\" is :: " + factNum);
    }
}
