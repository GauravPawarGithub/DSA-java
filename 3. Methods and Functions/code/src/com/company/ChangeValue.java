package com.company;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        /*
        here Object does change here due to modification here
         */
        //create an array
        int[] arr = {1, 2, 3,};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums) {
        nums[0] = 99; // if you make change via this reference variable, same object will change
    }
}
