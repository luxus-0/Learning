package com.w3resource.basic;

/*
*Write a Java program to convert a decimal number
* to octal number
* Input Data:
Input a decimal number: 15
* */

import java.util.Scanner;

class DecimalToOctal {

    public static int readDecimal(String message) {
        System.out.println(message);
        return new Scanner(System.in).nextInt();
    }

    public static void printOctalNumber() {
        int i= 1,j;
        int decimalNumber = readDecimal("Input  decimal number");
        int[] octalArray = new int[40];
        while(decimalNumber > 0) {
            octalArray[i++] = decimalNumber % 8;
            decimalNumber /= 8;
        }
        System.out.print("Octal number is: ");
        for(j=i-1; j>0; j--) {
            System.out.print(octalArray[j]);
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        printOctalNumber();
    }
}
