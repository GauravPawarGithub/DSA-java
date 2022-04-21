package com.company;

public class ParameterString {
    public static void main(String[] args) {
        String personalised = myGreat("Gaurav Pawar");
        System.out.println(personalised);

    }
    static String myGreat(String name) {
        String message = "Hello " + name;
        return message;

    }


}
