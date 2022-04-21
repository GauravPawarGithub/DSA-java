package com.company;

import java.util.Scanner;

public class QuestionPrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        boolean ans = isPrime(num);
        System.out.println(ans);
    }
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= num) {
            if (num % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > num;
    }
}
