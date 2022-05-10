package com.company;

import java.util.Arrays;

public class QSearchInString {
    public static void main(String[] args) {
        String name = "java";
        char target = 'a';
        System.out.println(search(name, target));        // for search 1

        System.out.println(Arrays.toString(name.toCharArray()));     // for search2

    }
    static boolean search(String str, char target) {
        if (str.length() == 0) {    // here it is the function .length()
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {    // character at ith index
                return true;
            }
        }
        return false;
    }


    static boolean search2(String str, char target) {
        if (str.length() == 0) {    // here it is the function .length()
            return false;
        }

       for (char ch : str.toCharArray()) {
           if (ch == target) {
               return true;
           }
       }
        return false;
    }
}
