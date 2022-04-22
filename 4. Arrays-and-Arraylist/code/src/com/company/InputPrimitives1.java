package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class InputPrimitives1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[5];  // Declaration and initialization

        // Array input in general for theory
        arr[0] = 63;
        arr[1] = 53;
        arr[2] = 43;
        arr[3] = 23;
        arr[4] = 23;
        System.out.println(arr[4]);

        //// Array input and output using for-loop in three ways

        // input and output using for-loop   1st way  - BEST WAY
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr)); // best way to do it



         //  2nd way
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {//here arr.length is used to represent the length of index which is unknown.
            System.out.println(arr[i] + " ");
        }



        //  3rd way  - optimised
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        for (int num: arr) { // for every element in the array, print the element. // enhanced for loop
            System.out.println(num + " ");//here num represent the element of the array.
        }


    }
}
