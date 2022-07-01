package com.w3resource.basic;

/*
* Write a Java program to compute the number of trailing zeros in a factorial.
7! = 5040, therefore the output should be 1
* */

public class Exercise112 {

    //recursion
    public static long calculateFactorial(int number) {
        if(number <= 2) {
            return number;
        }
        return number * calculateFactorial(number - 1);
    }


    public static long calculateFactorialVersion2(int number) {
        long fact = 1;
        for(int i = 2; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }

    public static long computeNumberOfTrailingZeroInFactorial(int number) {
        long countTrailing = 0;
        while (number != 0)
        {
            countTrailing += number / 5;
            number /= 5;
        }
        return countTrailing;
    }

    public static void main(String[] args) {
        int number = 14;
        long factorial = calculateFactorial(number);
        System.out.printf("factorial: %d" , factorial);
        long countTrailingZero = computeNumberOfTrailingZeroInFactorial(number);
        System.out.println("   " +countTrailingZero);
    }
}
