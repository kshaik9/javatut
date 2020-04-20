package com.kdrtut.collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> item = new LinkedList<>();

        item.addFirst(100);

        item.add(1, 200);
        item.add(2, 200);

        item.addLast(300);

        ListIterator<Integer> itemitr = item.listIterator();
        while(itemitr.hasNext()) {
            System.out.println(itemitr.next());
        }
    }
}
