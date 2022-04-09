package com.company;

import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*“ Take an input character from keyboard and check weather it
           is Upper case alphabet or lower case alphabet” */

        char ch = input.next().trim().charAt(0);      // .trim to remove extra spaces .chartAt at which index
        if (ch >= 'a' && ch <= 'z') {                 // && -  both condition should be true
            System.out.println("lowercase");          // !=  -  not equal to
        } else {                                      //  || -  OR   either of the condition should be true or false
            System.out.println("uppercase");
        }

    }
}
