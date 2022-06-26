package com.w3resource.basic;

/*
* Write a Java program that accepts two integer values between 25 to 75 and return true
* if there is a common digit in both numbers.
Sample Output:

Input the first number : 35
Input the second number: 45
Result: true
* */

import java.util.Scanner;

public class Exercise64 {

    private static int getInt(String message) {
        System.out.println(message);
        return new Scanner(System.in).nextInt();
    }

    private static boolean checkConditionByResult(int number1, int number2) {
        if((number1 >= 25 && number1 <= 75) && (number2 >= 25 && number2 <= 75)) {
            int digitNumber1 = number1 % 10;
            int digitNumber2 = number2 % 10;
            number1 /= 10;
            number2 /= 10;
            return (number1 == number2 || number1 == digitNumber2 || number2 == digitNumber1 || digitNumber1 == digitNumber2);
        }
        return false;
    }

    public static void main(String[] args) {
        int number1 = getInt("Input the first number: ");
        System.out.println(number1);

        int number2 = getInt("Input the second number: ");
        System.out.println(number2);

        boolean checkCommonDigitInBothNumbers = checkConditionByResult(number1, number2);
        System.out.println(checkCommonDigitInBothNumbers);
    }
}
