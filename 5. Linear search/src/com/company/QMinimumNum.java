package com.company;

public class QMinimumNum {
    public static void main(String[] args) {
        int[]arr = {2, 13, 40, 1, 34};
        System.out.println(min(arr));
    }
    // assume arr.length != 0
    // return the minimum value of array
    static int min(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;

    }
}
