package com.kdrtut.interview;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 478;
        int rev = 0;
        int palin = num;

        while(palin > 0) {
            rev = rev * 10 + (palin % 10);
            palin = palin / 10;
        }

        if(num == rev) {
            System.out.println(num + " is a Palindrome Number!");
        } else {
            System.out.println(num + " is not a Palindrome Number!");
        }
    }
}
