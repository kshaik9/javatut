package com.kdrtut.practice;

import com.sun.xml.internal.xsom.XSUnionSimpleType;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {
    public static void main(String[] args) {
        ArrayList<String> tvSeries = new ArrayList<>();
        tvSeries.add("Game of Thromes");
        tvSeries.add("Cheekh");
        tvSeries.add("Mere Pass Tum Ho");
        tvSeries.add("Sadak");

        // foreach
        tvSeries.forEach(series -> {
            System.out.println(series);
        });
        System.out.println("----------");

        // iterator
        Iterator<String> itr = tvSeries.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("----------");

        // forEachRemaining
        itr = tvSeries.iterator();
        itr.forEachRemaining(series -> {
            System.out.println(series);
        });
        System.out.println("----------");

        // foreach look
        for(String series : tvSeries) {
            System.out.println(series);
        }
        System.out.println("----------");

        // for look with index
        for(int i = 0; i < tvSeries.size(); i++) {
            System.out.println(tvSeries.get(i));
        }
        System.out.println("----------");

        // listIterator
        ListIterator<String> lstItr = tvSeries.listIterator(tvSeries.size());
        while(lstItr.hasPrevious()) {
            System.out.println(lstItr.previous());
        }
        System.out.println("----------");
    }
}
