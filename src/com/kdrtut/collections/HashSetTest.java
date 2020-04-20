package com.kdrtut.collections;

import java.util.HashSet;

public class HashSetTest {
    // underlying data structure "HastTable"
    // duplicates are not allowed
    //      if duplicates are trying to add, no Compiletime / Runtime exceptions
    //      add method returns False
    // Insertion order is not preserved
    //      all objects are inserted based on HashCode of objects
    // Heterogeneous objects are allowed
    // null - accepts
    // Serailizable & Clonable
    // HashSet is preferred if frequent operation is Search

    // Constructors
    // HashSet h = new HashSet() - create hashset with default size as 16 ; fill ratio/Load factor 0.75
    // HashSet h = new HashSet(int initialCapacity) - with default size as 16 ; fill ratio/Load factor 0.75
    // HashSet h = new HashSet(int initialCapacity, float fillRatio)
    // HashSet h = new HashSet(Collection c)

    public static void main(String[] args) {
        HashSet h = new HashSet();
        h.add("A");
        h.add(0);
        h.add(null);
        h.add("A");
        h.add(true);

        System.out.println(h.add("A"));
        System.out.println(h);
    }

}
