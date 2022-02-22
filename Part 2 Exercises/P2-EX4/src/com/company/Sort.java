package com.company;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Sort {

    static Map<String, String> EmptyMap = new java.util.HashMap<>(Collections.emptyMap());

    //created a function that sorts by key
    public static void sortByKey() {
        TreeMap<String, String> sorted = new TreeMap<>();
        sorted.putAll(EmptyMap);

        for (Map.Entry<String, String> entry : sorted.entrySet())
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
    }

}
