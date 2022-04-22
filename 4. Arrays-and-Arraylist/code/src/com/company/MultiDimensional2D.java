package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensional2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 2D arrays

        int[][] arr = new int[3][3]; // declaration and initialization

       //// Array input and output using for-loop for 2D in three ways

        // input and output  -- 1st way

        for (int row = 0; row < arr.length; row++) {               // Taking input
            for (int col = 0; col < arr[row].length; col++) {      // for each column in every row
                arr[row][col] = input.nextInt();
            }
        }
        for (int row = 0; row < arr.length; row++) {               // Taking output to print it
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println(); // this means print new line after taking every single row -- to give a matrix shape
        }

        // 2nd way more optimised

        for (int row = 0; row < arr.length; row++) {               // Taking input
            for (int col = 0; col < arr[row].length; col++) {      // for each column in every row
                arr[row][col] = input.nextInt();
            }
        }
        for (int row = 0; row < arr.length; row++) {               // Taking output to print it
            System.out.println(Arrays.toString(arr[row]));
        }

        // 3rd way optimised   for loop enhancement

        for (int row = 0; row < arr.length; row++) {               // Taking input
            for (int col = 0; col < arr[row].length; col++) {      // for each column in every row
                arr[row][col] = input.nextInt();
            }
        }
        for (int[] element : arr) {  // for every single array there is an array itself. int[]=array acts as a dataype
            System.out.println(Arrays.toString(element));

        }
    }
}
