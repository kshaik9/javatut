package com.kdrtut.collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorTest {
    // Bidirectional (able to iterate forward & backward directions)
    // Can perform - Read, Remove, Replacement and Addition of new object
    // ListIterator ltr = list.ListIterator()
    // public boolean hasNext()
    // public Object next()
    // public int nextIndex()
    // public boolean hasPrevious()
    // public Object previous()
    // public int previousIndex()
    // -- below are extra methods implemented in ListIterator
    // public void remove()
    // public void set(Object new)
    // public void add(Object new)
    // -- limitation
    // it is applicable only for List implemented class objects

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("Khadeer");
        list.add("Rehana");
        list.add("Khayum");
        list.add("Ruksana");

        ListIterator litr = list.listIterator();

        while(litr.hasNext()) {
            String next = (String) litr.next();
            if (next.equals("Khadeer")) {
                litr.remove();
            } else if(next.equals("Ruksana")) {
                litr.set("Baby Ruksana");
            } else if(next.equals("Khayum")) {
                litr.add("Khadeer");
            }
        }
        System.out.println(list);
    }
}
