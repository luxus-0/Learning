package com.w3resource.basic;

/*
* Write a Java program to find the penultimate (next to last) word of a sentence
Sample Output:

Input a String: The quick brown fox jumps over the lazy dog.
Penultimate word: lazy
* */

import java.util.Scanner;

public class Exercise60_NextToLastWordInString {

    private static String getString(String message) {
        System.out.println(message);
        return new Scanner(System.in).nextLine();
    }

    private static void printNextToLastWord(String str) {
        String[] words = str.split(" ");
        System.out.println(words[words.length - 2]);
    }

    public static void main(String[] args) {
        String str = getString("Input String");
        printNextToLastWord(str);
    }
}
