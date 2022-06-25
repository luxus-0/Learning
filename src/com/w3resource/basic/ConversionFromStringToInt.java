package com.w3resource.basic;

/*
* Write a Java program to convert a string to an integer in Java. Go to the editor
Sample Output:

Input a number(string): 25
The integer value is: 25
* */

import java.util.Scanner;

public class ConversionFromStringToInt {

    private static String getString(String message) {
        System.out.println(message);
        return new Scanner(System.in).nextLine();
    }

    private static void convertFromStringToInt(String str) {
            int number = Integer.parseInt(str);//or valueOf(str);
            System.out.println(number);
        }

    public static void main(String[] args) {
        String read = getString("Input number(String)");
        convertFromStringToInt(read);
    }
}
