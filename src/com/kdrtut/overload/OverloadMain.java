package com.kdrtut.overload;

public class OverloadMain {
    public static void main(String[] args) {
        System.out.println("Main with String[] args");

        main("args");
        main(20, 45);
        main(65);
    }

    public static void main(String args) {
        System.out.println("Main with String args");
    }

    public static void main(int a, int b) {
        System.out.println("Main with two inteagers :: " + a + ", " + b);
    }

    public static void main(int a) {
        System.out.println("Main with two inteagers :: " + a);
    }
}
