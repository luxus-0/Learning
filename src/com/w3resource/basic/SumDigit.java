package com.w3resource.basic;

import java.util.Scanner;

/*
* Write a Java program and compute the sum of the digits of an integer. Go to the editor
Input Data:
Input an integer: 25
Expected Output
The sum of the digits is: 7
* */
public class SumDigit {

    public static long readNumber(String message) {
        System.out.println(message);
        return new Scanner(System.in).nextLong();
    }

    public static long sumDigit(long number) {
        long sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        long number = readNumber("Input number");
        long sum = sumDigit(number);
        System.out.println(sum);
    }
}
