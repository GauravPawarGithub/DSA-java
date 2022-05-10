package com.company;

public class LinearSearch3 {
    public static void main(String[] args) {
        int[] num = {2, 3, 5, 7};
        int target = 5;
        boolean ans = linearSearch(num, target);
        System.out.println(ans);
    }

    //Search the target and return true or false
    static boolean linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }

        // run for-each loop
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        //this line will execute if none of the return statements above have executed
        // hence the target not found
        return false;
    }
}
