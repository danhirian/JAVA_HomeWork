package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import static com.company.Map.map;
import static com.company.Print.printArray;

public class Main {

    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements do you want to store in the array?: ");
        n = sc.nextInt();

        //creates an array in the memory of length 10
        int[] array = new int[10];
        System.out.println("Enter the elements: ");

        for (int i = 0; i < n; i++) {
            //reading array elements from the user
            array[i] = sc.nextInt();
        }
        System.out.println("You entered the following elements: " + Arrays.toString(array));

        int oddSize = 0;
        int evenSize = 0;

        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0)
                evenSize++;
            else
                oddSize++;
        }
        //created 2 new arrays
        int[] even = new int[evenSize];
        int[] odd = new int[oddSize];

        // odd and even array iterator
        int j = 0, k = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0)
                even[j++] = array[i];
            else
                odd[k++] = array[i];
        }
        //creating 2 variables to store the number of elements in the arrays
        int evenCounter = even.length;
        int oddCounter = odd.length;
        HashMap m = map(evenCounter, oddCounter);
        System.out.println(m);
    }
}

