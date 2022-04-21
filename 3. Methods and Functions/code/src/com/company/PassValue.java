package com.company;

public class PassValue {
    public static void main(String[] args) {
        /*
        Object does not change here
        For object and reference, only Pass by value of the reference variable
        For Primitives like int short byte only Pass by value is applicable

         */
        String name = "Gaurav Pawar";
        changeName(name);          // name is pointing to the object having value Gaurav pawar
        System.out.println(name);
    }

     static void changeName(String NAME) { // here NAME and name are pointing towards the same object
        NAME = "Shri"; //Here not changing the original object but creating a new object,
    }


}
