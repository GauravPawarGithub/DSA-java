package com.company;

import java.util.Arrays;

public class QMaxIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {5, 6, 8},
                {7, 9, 4}
        };


        System.out.println(max(arr));
    }
    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE; // or arr[0][0];     // minimum value an integer can hold
        for (int row = 0; row < arr.length ; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }
        return max;

    }
}
