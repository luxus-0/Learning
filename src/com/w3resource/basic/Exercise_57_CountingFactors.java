package com.w3resource.basic;

/*
*Write a Java program to accepts an integer and count the factors of the number.
* Sample Output:

Input an integer: 25
3
* */

import java.util.Scanner;

public class Exercise_57_CountingFactors {

    private static int getInt(String message) {
        System.out.println(message);
        return new Scanner(System.in).nextInt();
    }

    private static void printFactorsNumber(int number) {
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + "\t");
            }
        }
    }

    private static int countFactorsNumber(int number) {
        int counter = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int number = getInt("Input number");
        System.out.print("Factors of " + number + " : ");
        printFactorsNumber(number);
        int countFactors = countFactorsNumber(number);
        System.out.println(countFactors);
    }
}
