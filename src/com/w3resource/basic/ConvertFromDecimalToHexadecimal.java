package com.w3resource.basic;

/*
*Write a Java program to convert a decimal number
* to hexadecimal number
* Input Data:
Input a decimal number: 15
* */

import java.util.Scanner;

class ConvertFromDecimalToHexadecimal {

    public static int readDecimal(String message) {
        System.out.println(message);
        return new Scanner(System.in).nextInt();
    }

    public static String printHexadecimalNumbers() {
        StringBuilder hexadecimalNumber= new StringBuilder();
        char[] hexadecimalArray = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int decimalNumber = readDecimal("Input decimal number");

        while (decimalNumber > 0) {
            int remainingNumber = decimalNumber % 16;
            hexadecimalNumber.insert(0, hexadecimalArray[remainingNumber]);
            decimalNumber /= 16;
        }
        return hexadecimalNumber.toString();
    }

    public static void main(String[] args) {
        String hexadecimal = printHexadecimalNumbers();
        System.out.println(hexadecimal);
    }
}
