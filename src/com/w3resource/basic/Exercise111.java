package com.w3resource.basic;

/*
* Write a Java program to add two numbers without using any arithmetic operators.
Given x = 10 and y = 12; result = 22
* */

import java.util.Scanner;

public class Exercise111 {

    public static int readNumber(String input) {
        System.out.println(input);
        return new Scanner(System.in).nextInt();
    }

    public static int addTwoNumbersWithoutArithmeticOperators() {
        int x = readNumber("Input number 1");
        int y = readNumber("Input number 2");

        while (y != 0) {
            int carry = x & y;
            x = x ^ y;
            y = carry << 1;
        }
        return x;
    }

    public static void main(String[] args) {
        int sumTwoNumbers = addTwoNumbersWithoutArithmeticOperators();
        System.out.printf("Sum: %d", sumTwoNumbers);
    }
}
