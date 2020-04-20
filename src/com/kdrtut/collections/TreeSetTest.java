package com.kdrtut.collections;

import java.util.TreeSet;

public class TreeSetTest {
    // This is a Class
    // Implemented Class of SortedSet (I)
    // Underlying data structure -> Balanced Tree
    // Duplicates not allowed
    // Insertion order not applicable
    // But, all elements are inserted based on some sorting order
    // Heterogeneous objects are not allowed (only homogeneous)
    // null is acceptable only ONCE
    //      null insertion is allowed only for the empty TreeSet

    // --- TreeSet Constructors ---
    // TreeSet t = new TreeSet()
    //      Elements inserted based on Default Natural Sorting Order (DNSO)
    //      If it is numbers -> Ascending order; If it is string -> Alphabetical order
    // TreeSet t = new TreeSet(Comparator c)
    //      Elements inserted "Customised sorting order"
    // TreeSet t = new TreeSet(Collection c)
    // TreeSet t = new TreeSet(SortedSet s)

    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add("a");
        ts.add("L");
        ts.add("W");
        ts.add("C");
        ts.add("A");
        ts.add("L"); // duplicates are not allowed

        System.out.println(ts);
    }
}
