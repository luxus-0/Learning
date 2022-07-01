package com.w3resource.basic;
/*
* Write a Java program to add all the digits of a given positive integer until the result has a single digit.
* */

import java.util.Scanner;

public class Exercise108 {

    private static final Scanner scanner = new Scanner(System.in);

    public static int sumDigit(String input) {
        System.out.println(input);

        int sum = 0;
        int number = scanner.nextInt();
        while(number > 0) {
            sum = sum + number % 10;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int sum = sumDigit("Input number");
        System.out.printf("Sum Digit: %d " ,sum);
    }
}
