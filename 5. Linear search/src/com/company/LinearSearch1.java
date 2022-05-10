package com.company;

public class LinearSearch1 {

    public static void main(String[] args) {
        int[] num = {2, 3, 5, 7};
        int target = 5;
        int ans = linearSearch(num, target);
        System.out.println(ans);
    }
    //search in the array: return the index if found
    // otherwise if the item not found RETURN -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {   // here it is variable .length
            return -1;
        }
        
        //run the loop 
        for (int index = 0; index < arr.length; index++) {
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

