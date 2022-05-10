package com.company;

public class LinearSearch2 {
    public static void main(String[] args) {
        int[] num = {2, 3, 5, 7};
        int target = 5;
        int ans = linearSearch(num, target);
        System.out.println(ans);
    }

    //Search the target and return the element
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // run for-each loop
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        //this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;
    }
}
