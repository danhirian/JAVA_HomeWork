package com.company;

import java.util.List;

public class Counting {

    public static String CountVowelsAndConsonants(List<List<String>> firstList) {
        String wordWithMostVowels="";
        String wordWithMostConsonants="";
        int biggestVowelsNo=0;
        int biggestConsNo=0;
        for (int i = 0; i < firstList.size(); i++) {
            if( returnVowels(String.valueOf(firstList.get(i)))>biggestVowelsNo)
                wordWithMostVowels= String.valueOf(firstList.get(i));

            if( returnConsonants(String.valueOf(firstList.get(i)))>biggestConsNo)
                wordWithMostConsonants= String.valueOf(firstList.get(i));
        }
        return "Largest VowelsNo: "+wordWithMostVowels+biggestVowelsNo + "Largest ConsNo:" +wordWithMostConsonants+ biggestConsNo;
    }

    public static int returnVowels(String str) {
        int vCount=0;
        int cCount=0;
        for (int i = 0; i < str.length(); i++) {
            //Checks whether a character is a vowel
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                //Increments the vowel counter
                vCount++;
            }
            //Checks whether a character is a consonant
            else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                //Increments the consonant counter
                cCount++;
            }
        }
        return vCount;
    }

    public static int returnConsonants(String str) {
        int vCount=0;
        int cCount=0;
        for (int i = 0; i < str.length(); i++) {
            //Checks whether a character is a vowel
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                //Increments the vowel counter
                vCount++;
            }
            //Checks whether a character is a consonant
            else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                //Increments the consonant counter
                cCount++;
            }
        }
        return cCount;
    }
}
