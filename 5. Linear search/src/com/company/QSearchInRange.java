package com.company;

public class QSearchInRange {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;
        System.out.println(linearSearch(arr, target, 1, 3));

    }
    // search for 3 in the range of index [1 and 3]

    static int linearSearch(int[] arr, int target, int start, int end) {  // used starting and ending index
        if (arr.length == 0) {   // here it is variable .length
            return -1;
        }

        //run the loop
        for (int index = start; index <= end; index++) {
            //check for element at every index if it is equal to target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        //this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;
    }
}
