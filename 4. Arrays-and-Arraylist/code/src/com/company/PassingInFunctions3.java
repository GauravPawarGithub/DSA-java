package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class PassingInFunctions3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nums = {2, 3, 4, 5};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr) {
        arr[2] = 69; // changing the object in array hence Objects are mutable.
    }
}
