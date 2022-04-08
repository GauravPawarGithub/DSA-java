package com.company;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Automatic Type Casting :    small to large
        Float num = input.nextFloat();   // input integer output float
        System.out.println(num);

        // 2. Type casting and Explicit or narrowing conversion : large to small
        int roll = (int)(25.25f);
        System.out.println(roll);

        // 3. Automatic type promotion
        int a = 257;
        byte b = (byte)(a); //257 % 256 = 1
        System.out.println(b);

//        byte a = 40;         // automatically convert the byte datatype into integer in while processing condition
//        byte b = 50;
//        byte c = 100;
//        int d = a * b / c;
//        System.out.println(d);

        int number = 'a';
        System.out.println(number); // it will give ascii value of a

        int mark = 'a';
        System.out.println("안녕하세요");  // Java Follows unicode value : Unicode is an International character encoding standard that includes different languages, scripts and symbols
        // rules for type promotion : 1 byte char short ---> int  2. double float long ---> double float long

        // Rules eg:

        float f = 12.12f;
//        byte b = 65;
        int i = 45;
        char c = 'v';
        double d = 0.3132132;
        short s = 4561;
        double result = (f * b) + (i / c) + (d * s);
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println(result);



    }
}
