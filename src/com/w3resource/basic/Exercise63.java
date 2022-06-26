package com.w3resource.basic;

/*
*Write a Java program that accepts two integer values from the user
* and return the larger values. However if the two values are the same, return 0 and return
*  the smaller value if the two values have the same remainder when divided by 6.
Sample Output:
*
* Input the first number : 12
  Input the second number: 13
* */

import java.util.Scanner;

public class Exercise63 {

    private static int readInt(String message) {
        System.out.println(message);
        return new Scanner(System.in).nextInt();
    }

    private static int readCondition(int firstNumber, int secondNumber) {
        if (firstNumber == secondNumber)
            return 0;

        if (firstNumber % 6 == secondNumber % 6)
            return Math.min(firstNumber, secondNumber);
        return Math.max(firstNumber, secondNumber);
    }

    public static void main(String[] args) {
        int number1 = readInt("Input the first number : ");
        System.out.println(number1);

        int number2 = readInt("Input the second number : ");
        System.out.println(number2);

        int result = readCondition(number1, number2);
        System.out.println("Result: " +result);
    }

}
