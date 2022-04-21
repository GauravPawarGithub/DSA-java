package com.company;

import java.util.Scanner;

public class Sum {

    /*  syntax: making methods
               psvm {
                 Function call
                 }
              access modifier return_type name(arguments) {
                    //body
                    return statement;
     */

    public static void main(String[] args) {
        sum();                // Function call
    }
    static void sum() {                                      // Method
        Scanner input = new Scanner(System.in);              // return_type is void
        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("the sum: " + sum);
    }


}
