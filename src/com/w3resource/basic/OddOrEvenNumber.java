package com.w3resource.basic;

/*
* Write a Java program to accept a number and check the number is even or not.
* Prints 1 if the number is even or 0 if the number is odd.
Sample Output:
Input a number: 20
1
* */

import java.util.Scanner;

public class OddOrEvenNumber {

    private static int getNumber(String message) {
        System.out.print(message);
        return new Scanner(System.in).nextInt();
    }

    private static void printEvenOrOdd(int number) {
        if(number % 2 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    public static void main(String[] args) {
        int number = getNumber("Input number: ");
        printEvenOrOdd(number);
    }

}
