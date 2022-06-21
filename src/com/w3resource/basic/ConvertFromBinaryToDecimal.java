package com.w3resource.basic;

import java.util.Scanner;

/*
* Write a Java program to convert a binary number to decimal number. Go to the editor
Input Data:
Input a binary number: 100
Expected Output
Decimal Number: 4
* */
public class ConvertFromBinaryToDecimal {

    public static Long readBinaryNumber(String message) {
        System.out.println(message);
        return new Scanner(System.in).nextLong();
    }

    public static void convertBinaryToDecimal() {
        long decimalNumber = 0, binaryNumber = 0, j = 1, remainder;
        binaryNumber = readBinaryNumber("Input binary number");
        while(binaryNumber != 0) {
            remainder = binaryNumber % 10;
            binaryNumber /= 10;
            decimalNumber = decimalNumber + remainder * j;
            j = j * 2;
        }
        System.out.println(decimalNumber);
    }

    //2 version with Math.pow
    public static long convertBinaryToDecimal2() {
        long decimal = 0, binary, i = 0, remainder;
        
        binary = readBinaryNumber("Input binary number");

        while (binary != 0) {
            remainder = binary % 10;
            binary /= 10;
            decimal += remainder * Math.pow(2, i);
            ++i;
        }
        return decimal;
    }

    public static void main(String[] args) {
        convertBinaryToDecimal();
        System.out.println("\nSecond version");
        long binaryToDecimal = convertBinaryToDecimal2();
        System.out.println(binaryToDecimal);
    }
}
