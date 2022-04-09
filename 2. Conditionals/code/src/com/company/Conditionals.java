package com.company;

import java.util.Scanner;

public class Conditionals {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // if - else statement syntax

        int salary= 2000;
        if (salary > 3000) {                       //conditionals = it provides the check to the statement
            salary += 1000;                       // if - else provides the boolean check ( true or false )
        } else {
            salary -= 1000;
        }
        System.out.println(salary);

        // multiple if - else statement syntax

        int pay = 2000;
        if (pay > 10000) {
            pay += 1000;
        } else if (pay < 10000) {
            pay -= 300;
        } else {
            pay += 200;
        }
        System.out.println(pay);


    }
}
