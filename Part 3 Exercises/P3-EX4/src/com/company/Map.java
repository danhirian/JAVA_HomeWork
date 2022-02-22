package com.company;

import java.util.HashMap;

public class Map {

    public static HashMap map(int keys, int values) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(keys, values);
        return map;
    }
}
