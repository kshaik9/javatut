package com.kdrtut.interview;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 0;
        int cube = 0;
        int arm = num;
        int rem=0;

        while(arm > 0) {
            rem = arm % 10;
            arm = arm / 10;
            cube = cube + (rem * rem * rem);
        }

        if(num == cube) {
            System.out.println(num + " is an Armstrong Number!");
        } else {
            System.out.println(num + " is not an Armstrong Number!");
        }
    }

}
