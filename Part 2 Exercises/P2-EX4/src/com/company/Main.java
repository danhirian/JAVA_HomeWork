package com.company;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

import static com.company.Sort.EmptyMap;
import static com.company.Sort.sortByKey;

public class Main {

    public static void main(String[] args) {

        //added entries to the map
        EmptyMap.put("Jack Denis", "jackD@gmail.com");
        EmptyMap.put("Grey Goose", "theGoose@gmail.com");
        EmptyMap.put("Star Lord", "domainLord@gmail.com");
        EmptyMap.put("Jim Nuggetz", "themNuggz@yahoo.com");

        //called the sorting function
        sortByKey();

        System.out.println("Initial entries are: " + EmptyMap);

        //getting the size of the map
        System.out.println("The size of the map is: " + EmptyMap.size());

        //checking the map for a specific name
        String key = String.valueOf(EmptyMap.containsKey("Jim"));
        System.out.println("Is the value present? " + key);

        //getting the email for Grey Goose
        String x = "Grey Goose";
        System.out.println("The requested email is: " + EmptyMap.get(x));

        //removing an entry
        String returned_value = (String) EmptyMap.remove("Grey Goose");
        System.out.println("Returned value is: " + returned_value);
        System.out.println("The new map is: " + EmptyMap);
    }
}






