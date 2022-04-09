package com.company;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*“Take 3 integer input from keyboard, Find the largest numbers
        among them*/

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        // Approach 1

//        int max = a;
//        if (b > max) {
//            max = b;
//        }
//        if (c > max) {
//            max = c;
//        }
//        System.out.println(max);

        // Approach 2

//        int max = 0;
//        if (a > b) {
//            max = a;
//        } else {
//            max = b;
//        }
//        if (c > max) {
//            max = c;
//        }
//        System.out.println(max);

        // Approach 3
        //math.max Math is a class present in java.lang package and max is a
        //function present in it which takes two number as an argument and return maximum
        //out of them.
        int max = Math.max(c, Math.max(a, b));
        System.out.println(max);


    }
}
