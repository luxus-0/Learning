package com.w3resource.basic;

/*
* Write a Java program that accepts three integers from the user and return true
*  if two or more of them (integers ) have the same rightmost digit. The integers are non-negative.
Sample Output:

Input the first number : 5
Input the second number: 10
Input the third number : 15
The result is: true
* */

import java.util.Scanner;

public class Exercise54 {

    private static int getInt(String message) {
        System.out.println(message);
        return new Scanner(System.in).nextInt();
    }

    private static boolean isDigitTheSameInTwoOrMoreNumbers(int firstNumber, int secondNumber, int thirdNumber){
        if(firstNumber % 10 == secondNumber % 10 ||
                firstNumber % 10 == thirdNumber % 10 ||
                secondNumber % 10 == thirdNumber % 10) {

            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int first = getInt("Input first number");
        int second = getInt("Input second number");
        int third = getInt("Input third number");

        boolean theSameDigitInNumbers = isDigitTheSameInTwoOrMoreNumbers(first, second, third);
        System.out.printf("The result is: %b", theSameDigitInNumbers);
    }
}
