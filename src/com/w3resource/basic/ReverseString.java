package com.w3resource.basic;
/*
* Write a Java program to reverse a string
Input Data:
Input a string: The quick brown fox
Expected Output
Reverse string: xof nworb kciuq ehT
* */

import java.util.Scanner;

class ReverseString {

    public static String readString(String message) {
        System.out.println(message);
        return new Scanner(System.in).nextLine();
    }

    public static String printReverseString() {
        String reverse = readString("Input String");
        StringBuilder stringBuilder = new StringBuilder(reverse);
        return stringBuilder.reverse().toString();
    }

    //Second version
    public static void printReverseString2(String str) {
        char[] stringArray = str.toCharArray();

        for(int i = stringArray.length - 1; i >= 0; i--) {
            System.out.println(stringArray[i]);
        }
    }

    public static void main(String[] args) {
        String reverseStr = printReverseString();
        System.out.println(reverseStr);

        String str = "Ala ma kota a kot ma Alę";
        printReverseString2(str);
    }
}
