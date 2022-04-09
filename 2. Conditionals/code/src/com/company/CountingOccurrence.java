package com.company;

import java.util.Scanner;

public class CountingOccurrence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /* find how many times the number 2 occurs */

        int n = 1223422;
        int count = 0;
        while (n > 0) {
            int rem = n % 10;      // last digit as remainder
            if (rem == 2) {        // if rem is equal to 2 then count increase by 1
                count++;
            }
            n = n/10;               // used to reduce the number )
        }
        System.out.println(count);

    }
}
