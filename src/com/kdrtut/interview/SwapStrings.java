package com.kdrtut.interview;

public class SwapStrings {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World!";
        System.out.println("Strings before swap :: s1 -> " + s1 + "; s2 -> " + s2);

        s2 = s1.concat(s2);
        s1 = s2.substring(s1.length());
        s2 = s2.substring(0, s1.length() - 1);
        System.out.println("Strings after swap :: s1 -> " + s1 + "; s2 -> " + s2);
    }
}
