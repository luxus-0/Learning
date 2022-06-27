package com.w3resource.basic;

/*
* Write java program to calculate the modules of two numbers without using any inbuilt modulus operator
* */

import java.util.Scanner;

public class Exercise65 {

    private static int getInt(String input) {
        System.out.println(input);
        return new Scanner(System.in).nextInt();
    }
    private static void calculateModulus(int number1, int number2) {
        int divide = number1 / number2;
        int result = number1 - (divide * number2);
        System.out.println(result);
    }

    public static void main(String[] args) {

        int number1 = getInt("Input the first number");
        int number2 = getInt("Input the second number");

        System.out.print("Modulo: ");
        calculateModulus(number1,number2);
    }
}
