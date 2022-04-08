package com.company;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // literals are the syntactical representation of primitive data types
        //identifiers are the name of variables, methods, packages and interfaces

        // For integer
        System.out.print("Please enter some input: ");
        int roll = input.nextInt();
        System.out.println("Your roll no is : " + roll);

        // string input program
        String name = input.next();      // input.nextLIne();
        System.out.print("My name is : " + name);

        //float input program
        System.out.print("please enter input : ");
        Float marks = input.nextFloat();
        System.out.println("Your End sem marks is :" + marks);

        // Sum of the two integer
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("sum :" + sum);




    }
}
