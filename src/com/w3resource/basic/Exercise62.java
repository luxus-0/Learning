package com.w3resource.basic;

/*
* Write a Java program that accepts three integer values and return true if one of them is 20 or more and less than the subtractions of others. Go to the editor
Sample Output:

Input the first number : 15
Input the second number: 20
Input the third number : 25
false
* */

import java.util.Scanner;

public class Exercise62 {

    private static int getInt(String message) {
        System.out.println(message);
        return new Scanner(System.in).nextInt();
    }

    private static void printCondition(int firstNumber, int secondNumber, int thirdNumber) {
        System.out.println(Math.abs(firstNumber - secondNumber) >= 20 || Math.abs(secondNumber - thirdNumber) >= 20 || Math.abs(thirdNumber - firstNumber) >= 20);
    }

    public static void main(String[] args) {
        int firstNumber = getInt("Input the first number : ");
        int secondNumber = getInt("Input the second number : ");
        int thirdNumber = getInt("Input the third number : ");

        printCondition(firstNumber, secondNumber, thirdNumber);
    }
}
