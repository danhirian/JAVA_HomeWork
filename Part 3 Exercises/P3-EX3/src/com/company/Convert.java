package com.company;

public class Convert {

    static void convert(char[] str) {

        int N = str.length;

        for (int i = 0; i < N; i++) {
            if (str[i] == 'a' || str[i] == 'e' ||
                    str[i] == 'i' || str[i] == 'o' ||
                    str[i] == 'u') {

                char c = Character.toUpperCase(str[i]);
                str[i] = c;
            } else if (str[i] != ' ') {
                char k = Character.toLowerCase(str[i]);
                str[i] = k;

            }

        }


        for(char c : str)
            System.out.print(c);

    }
}
