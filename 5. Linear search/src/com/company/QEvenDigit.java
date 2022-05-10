package com.company;

public class QEvenDigit {
    public static void main(String[] args) {
        int[] nums = {12, 1546, 2, 489};
        System.out.println(findNumbers(nums));
    }

    // find number of numbers that have even number of digits.
    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    //function to check whether it contains an even digits or not
     static boolean even(int num) {
        int numberOfDigits = digits(num);
        if (numberOfDigits % 2 == 0) {  // or return numberOfDigits % 2 == 0:
            return true;
        }
        return false;
    }

    // count number of digits in a number
    static int digits(int num) {
        int count = 0;

        while (num > 0) {
            count ++;
            num = num / 10;  // num /= 10;
        }
        return count;
    }

}
