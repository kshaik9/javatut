package com.kdrtut.practice;

public class Singleton {
    // what? - Singleton is a OOP concept that can only have single object of a class
    // how? - making constructor as private
    //          then write a static method that return type of object of Singleton class (lazy initialization)

    private static Singleton singleton_instance = null;
    public String str;

    private Singleton() {
        str = "Hello world! I'm using Singleton mechanism";
    }

    public static Singleton getInstance() {
        if(singleton_instance == null){
            singleton_instance = new Singleton();
        }
        return singleton_instance;
    }

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();

        System.out.println(instance.str);
    }
}
