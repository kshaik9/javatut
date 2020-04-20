package com.kdrtut.interview;

import java.util.Arrays;

public class SmallBigNumbers {
    public static void main(String[] args) {
        int marks[] = {-77, 47, 80, 76, 39, 0, -3, -100};
        int small = marks[0];
        int big = marks[0];

        for(int i = 0; i < marks.length; i++) {
            for(int j = i + 1; j < marks.length; j++) {
                if(marks[i] > big){
                    big = marks[i];
                } else if(marks[j] < small) {
                    small = marks[j];
                }
            }
        }

        System.out.println("Marks :: " + Arrays.toString(marks));
        System.out.println("Smaller number :: " + small);
        System.out.println("Bigger number :: " + big);

    }
}
