package com.kdrtut.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class FailFastFailSafeTest {
    public static void main(String[] args) {
//        Map<String, String> phoneDir = new HashMap<>();
        Map<String, String> phoneDir = new ConcurrentHashMap<>();
        phoneDir.put("1", "Khadeer");
        phoneDir.put("2", "Rehana");
        phoneDir.put("3", "Khayum");
        phoneDir.put("4", "Ruksana");

        Set<String> phoneNbr = phoneDir.keySet();
        Iterator<String> dirItr = phoneNbr.iterator();

        while(dirItr.hasNext()) {
            String thisPhoneEntry = dirItr.next();
            phoneDir.put("5", "Khaleel");
            System.out.println(thisPhoneEntry + " :: " + phoneDir.get(thisPhoneEntry));
        }


    }
}
