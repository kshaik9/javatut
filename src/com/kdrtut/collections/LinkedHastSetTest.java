package com.kdrtut.collections;

import java.util.LinkedHashSet;

public class LinkedHastSetTest {
    // Child class of HashSet
    // Introduced in Java v 1.4
    // Duplicates not allowed
    // Insertion order is preserved
    // Is best set for developing cache based applications

    /**
     *
     *                  |   HashSet         |   LinkedHashSet           |
     * ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
     * DataStructure    |   HashTable       |   HashTable + Linked List |
     * Insertion Order  |   Not preserved   |   Is preserved            |
     * Introduced       |   V 1.2           |   V 1.4                   |
     */

    public static void main(String[] args) {
        LinkedHashSet lhs = new LinkedHashSet();

        lhs.add("A");
        lhs.add(0);
        lhs.add(null);
        lhs.add(true);
        lhs.add("Z");
        lhs.add("");

        System.out.println(lhs.add("Z"));
        System.out.println(lhs);
    }
}
