package com.w3resource.basic;
/*
* Write a Java program to reverse a string
Input Data:
Input a string: The quick brown fox
Expected Output
Reverse string: xof nworb kciuq ehT
* */

import java.util.Arrays;
import java.util.Scanner;

class ReverseString {

    public static String readString(String message) {
        System.out.println(message);
        return new Scanner(System.in).nextLine();
    }

    public static String printReverseString() {
        String reverse = readString("Input String");
        StringBuilder stringBuilder = new StringBuilder(reverse);
        return stringBuilder
                .reverse()
                .toString();
    }

    //Second version
    public static void printReverseString2(String str) {
        char[] stringArray = str.toCharArray();

        for (int i = stringArray.length - 1; i >= 0; i--) {
            System.out.print(stringArray[i]);
        }
    }

    //Third version
    public static void printReverseString3(String str) {
        byte[] byteArray = str.getBytes();
        byte[] result = new byte[byteArray.length];

        for (int i = 0; i < byteArray.length; i++) {
            result[i] = byteArray[byteArray.length - i - 1];
        }
        System.out.println(new String(result));
    }

    public static void main(String[] args) {
        String reverseStr = printReverseString();
        System.out.println(reverseStr);

        String str = "Ala ma kota";
        printReverseString2(str);

        System.out.println();

        String str2 = "Jutro jest pogoda";
        printReverseString3(str2);
    }
}
