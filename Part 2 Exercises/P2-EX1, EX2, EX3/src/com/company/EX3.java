package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class EX3 {

    public static void main(String[] args) {

        String s1 = " ";
        List<String> EmptyList = new ArrayList<>(Collections.emptyList());
        List<String> array = new ArrayList<>();
        array.add("Ajshsdx");
        array.add("eT");
        array.add("Te");
        array.add("CorNelsdaasdUIPL");
        array.add("luYmmzazlx");
        System.out.println("The elements of the array list are: " + array);

        //if the word starts with a vowel, make it all lowercase and append it to the empty string
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).charAt(0) == 'A' || array.get(i).charAt(0) == 'E' ||
                    array.get(i).charAt(0) == 'I' || array.get(i).charAt(0) == 'O' ||
                    array.get(i).charAt(0) == 'U' || array.get(i).charAt(0) == 'a' ||
                    array.get(i).charAt(0) == 'e' || array.get(i).charAt(0) == 'i' ||
                    array.get(i).charAt(0) == 'o' || array.get(i).charAt(0) == 'u') {

                s1 = s1 + array.get(i).toLowerCase();
                //if the word starts with a consonant, make it all uppercase and add it to the empty array
            } else if (array.get(i).charAt(0) != ' ') {
                String upperString = array.get(i).toUpperCase();
                EmptyList.add(upperString);
            }
        }
        //part 3
        String specialString = " ";
        String initialString = " ";
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).contains("x") || array.get(i).contains("X") || array.get(i).length() < 3) {
                initialString = initialString + " " + array.get(i);
                specialString = specialString + " " + initialString.replace(initialString, "special");
            }
        }
        System.out.println("Printing the updated string: " + s1);
        System.out.println("Printing the updated array: " + EmptyList);
        System.out.println("Initial string is: " + initialString);
        System.out.println("The 'special' string is: " + specialString);
    }
}