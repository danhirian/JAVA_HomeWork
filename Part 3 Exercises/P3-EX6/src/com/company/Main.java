package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<List<String>> stringsArray = new ArrayList<>();

        stringsArray.add(Collections.singletonList("methods"));
        stringsArray.add(Collections.singletonList("inheritance"));
        stringsArray.add(Collections.singletonList("polimorphism"));
        stringsArray.add(Collections.singletonList("methodz"));
        stringsArray.add(Collections.singletonList("polymorphizm"));

        System.out.println("The elements are: "+stringsArray);

        



    }
}
