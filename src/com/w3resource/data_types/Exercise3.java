package com.w3resource.data_types;

/*
* Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.
* */

import java.util.Scanner;

public class Exercise3 {

    public static int readInt(String input) {
        System.out.println(input);
        return new Scanner(System.in).nextInt();
    }

    public static int sumDigit(int number) {
        int sum = 0, digit = 0;
        while(number > 0 && number <= 1000) {
            digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int number = readInt("Input number");
        int sum = sumDigit(number);
        System.out.println(sum);
    }
}
