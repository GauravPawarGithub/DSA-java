package com.company;

public class ParameterInteger {
    public static void main(String[] args) {
        int ans = sum3(20,30);        // a and b are not a part of the codebase, it appears automatically
        System.out.println(ans);

    }
    //pass the value of function when you are calling the method in main()
    static int sum3(int a, int b) {       // used when you don't want to use Scanner again and again
        int sum = a + b;
        return sum;

    }
}
