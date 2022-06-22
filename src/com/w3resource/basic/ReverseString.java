package com.w3resource.basic;
/*
* Write a Java program to reverse a string
Input Data:
Input a string: The quick brown fox
Expected Output
Reverse string: xof nworb kciuq ehT
* */

import java.util.*;

class ReverseString {

    public static String readString(String message) {
        System.out.println(message);
        return new Scanner(System.in).nextLine();
    }

    public static String printReverseString() {
        String reverse = readString("Input String");
        StringBuilder stringBuilder = new StringBuilder(reverse);//StringBuilder or StringBuffer
        return stringBuilder
                .reverse()
                .toString();
    }

    //Second version
    public static void printReverseString2(String str) {
        char[] characterArray = str.toCharArray();

        for (int i = characterArray.length - 1; i >= 0; i--) {
            System.out.print(characterArray[i]);
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

    //Fourth - Collection
    public static void printReverseString4(String str) {
        char[] charArray = str.toCharArray();
        List<Character> characterList = new ArrayList<>();

        for(Character c : charArray) {
            characterList.add(c);
        }
        Collections.reverse(characterList);

        for (Character c : characterList) {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        String str = printReverseString();
        System.out.println(str);

        String str2 = "Ala ma kota";
        printReverseString2(str2);

        System.out.println();

        String str3 = "Jutro jest pogoda";
        printReverseString3(str3);

        String str4 = "Easy day";
        printReverseString4(str4);
    }
}
