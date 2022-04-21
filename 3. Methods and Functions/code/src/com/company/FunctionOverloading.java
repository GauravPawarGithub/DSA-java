package com.company;

public class FunctionOverloading {
    public static void main(String[] args) {
        fun(56);
        fun("Gaurav");
    }
    static void fun(int a) {
        System.out.println(a);
    }
    static void fun(String name) {
        System.out.println(name);
    }
}
