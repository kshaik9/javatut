package com.kdrtut.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {

    // This is an Interface
    // Child Interface of Set(I)
    // Insertion order is preserved
    // Ascending order is default numeric sorting
    // Alphabetical order is default String sorting
    // Methods -
    //      first(), last(), headSet(Object o) => returns the values less than or equal to Object o
    //      tailSet(Object o) => returns the values greater than or equal to Object o
    //      subSet(Object o1, Object o2) => returns values between Object o1, Object o2 including them
    //      comparator() => returns Comparator() object that describes underling sorting technique

    public static void main(String[] args) {
        System.out.println("This is all about SortedSet & methods available!");
    }
}
