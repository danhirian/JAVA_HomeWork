package com.company;

import java.util.Scanner;

import static com.company.Convert.convertString;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = scan.nextLine();
        System.out.println("You entered: " + str);
        convertString(str.toCharArray());
    }
}


