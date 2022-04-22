package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class InputObjects2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] str = new String[4];

        for (int i = 0; i < str.length; i++) {   // in non-primitive/objects are stored in heap memory
            str[i] = input.next();
        }
        System.out.println(Arrays.toString(str));
        str[3] = "gaurav";  // changing the original object.
        System.out.println(Arrays.toString(str));
    }
}
