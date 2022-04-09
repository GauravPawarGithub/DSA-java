package com.company;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
           “ Given three input a, b, n a is the starting number of Fibonacci series and
             b is the next number after a, n is an number to find the nth Fibonacci
              number
         */

        int n = input.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while (count <= n) {
            int temp = b;
            b = b  + a;
            a = temp;
            count++;
        }
        System.out.println(b);
    }
}
