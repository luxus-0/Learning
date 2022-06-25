package com.w3resource.basic;

/*
* Write a Java program to calculate the sum of two integers and return true if the sum
*  is equal to a third integer.
Sample Output:

Input the first number : 5
Input the second number: 10
Input the third number : 15
The result is: true
* */

import java.util.Scanner;

public class SumIntegers {

    private static int getInt(String message) {
        System.out.println(message);
        return new Scanner(System.in).nextInt();
    }

    private static boolean isSumOfTwoAreEqualThirdNumber(int first, int second, int third) {

        if(first + second == third || first + third == second || second + third == first) {
           return true;
       }
        return false;
    }

    public static void main(String[] args) {
        int first = getInt("Input first number");
        int second = getInt("Input second number");
        int third = getInt("Input third number");

        boolean checkThirdNumber = isSumOfTwoAreEqualThirdNumber(first, second, third);
        System.out.printf("Result is: %b ", checkThirdNumber);
    }
}
