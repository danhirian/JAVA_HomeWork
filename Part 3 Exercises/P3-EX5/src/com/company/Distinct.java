package com.company;

import java.util.Arrays;

public class Distinct{

    static void printDistinct(int arr[], int n){
        //sorting the array so it's consecutive
        Arrays.sort(arr);
        // Traverse the sorted array
        for (int i = 0; i < n; i++){
            // Move the index ahead while there are duplicates
            while (i < n - 1 && arr[i] == arr[i + 1])
                i++;
            // print last occurrence of current element
            System.out.print(arr[i] +" ");
        }
    }
}

