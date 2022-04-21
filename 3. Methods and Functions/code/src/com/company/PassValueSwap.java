package com.company;

public class PassValueSwap {
    public static void main(String[] args) {
        /* swap numbers code program
        int a = input.nextInt();
        int b = input.nextInt();

         int temp = a;
         a = b;
         b = temp;

         system.out.println(a + " " + b)
         */
        /* swap number by using methods will not swap
        because java supports pass by value for int

         */

        int a = 10;
        int b = 30;

        swap(a, b);
        System.out.println(a + " " + b);
    }
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        // this change will only be valid in this function scope only.
    }
}
