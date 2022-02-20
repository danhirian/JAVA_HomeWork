package com.company;

public class Sequence {

    static String printSequence(String s) {
        String stringResult = " ";
        for (int i = 0; i < s.length()-1; i++) {

            if (s.charAt(i) == s.charAt(i + 1)) {
                stringResult = stringResult + s.charAt(i) + s.charAt(i+1);

            }

        }

            return stringResult;
    }
}


