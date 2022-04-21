package com.company;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(isArmstrong(num));
    }
    // print all the  3 digit armstrong number
    static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;

        while (num > 0) {
            int rem = num % 10;
            num = num / 10;
            sum = sum + rem*rem*rem;
        }

        return sum == original;
    }
}
