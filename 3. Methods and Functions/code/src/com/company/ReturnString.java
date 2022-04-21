package com.company;

public class ReturnString {
    public static void main(String[] args) {
        String message = greet();
        System.out.println(message);
    }
    static String greet() {                   //return_type is String and function call is greet.
        String greeting = "How are you";
        return greeting;

    }
}
