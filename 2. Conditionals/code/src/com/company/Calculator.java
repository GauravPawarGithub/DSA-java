package com.company;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take the input from the user till the user does not press X or x
        int ans = 0;
        while (true) {
            //take the operator as an input
            System.out.print("Enter the operator: ");
            char op = input.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '/' || op == '*' || op == '%') {
                // input two numbers
                System.out.print("Enter two numbers: ");
                int num1 = input.nextInt();
                int num2 = input.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '/') {
                    ans = num1 / num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '%') {
                    ans = num1 % num2;
                }



            } else if (op == 'X' || op == 'x') {
                break;
            } else {
                System.out.println("Invalid Program!!");
            }
            System.out.println(ans);


        }
    }
}
