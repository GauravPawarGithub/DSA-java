package com.company;

import java.util.Scanner;

public class ReturnSum {
    public static void main(String[] args) {
        int ans = sum2();
        System.out.println(ans);
    }
    static int sum2() {                     // return type is integer
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value 1 ");
        int num1 = input.nextInt();
        System.out.print("Enter value 2 ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        return sum;                 // Returning the integer sum

    }

}
