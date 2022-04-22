package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //syntax
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(3);
        list.add(34);
        list.add(32);
        list.add(33);
        System.out.println(list);


        // input way two
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }

        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here, list[index] syntax will not work here
        }

        System.out.println(list);


    }
}
