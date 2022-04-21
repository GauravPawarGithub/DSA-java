package com.company;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1, 213, 23, 23);

    }
    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
