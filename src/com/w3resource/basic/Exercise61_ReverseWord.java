package com.w3resource.basic;

/*
*Write a Java program to reverse a word. Go to the editor
Sample Output:

Input a word: dsaf
Reverse word: fasd
* */

import java.util.Scanner;

public class Exercise61_ReverseWord {

    private static String getString(String message) {
        System.out.println(message);
        return new Scanner(System.in).nextLine();
    }

    private static String reverseWord(String str) {
        if(str == null) {
            throw new IllegalArgumentException("String is null");
        }

        StringBuilder reverseBuilder = new StringBuilder(str).reverse();
        return reverseBuilder.toString();
    }

    private static String reverseWordV2(String str) {
        if(str == null) {
            throw new IllegalArgumentException("String is null");
        }

        StringBuilder output = new StringBuilder();
        for(int i = str.length() - 1; i >= 0 ; i--) {
            output.append(str.charAt(i));
        }
        return output.toString();
    }

    public static void main(String[] args) {
        String str = getString("Input String");
        String reverse = reverseWord(str);
        System.out.println(reverse);

        System.out.println("----------------");

        String reverse2 = reverseWordV2(str);
        System.out.println(reverse2);
    }
}
