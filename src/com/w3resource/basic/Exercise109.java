package com.w3resource.basic;

/*
* Write a Java program to check whether a given integer is a power of 4 or not.
* */

import java.util.Scanner;

public class Exercise109 {

    public static int readNumber(String message){
        System.out.println(message);
        return new Scanner(System.in).nextInt();
    }

    public static boolean isPowerOfFor(int number) {
        while (number % 4 == 0) {
            number /= 4;
        }
        if(number == 1)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        int number = readNumber("Input number");
        boolean checkIfNumberIsPowerOf4 = isPowerOfFor(number);
        System.out.printf("Number is power of 4? :  %b" ,checkIfNumberIsPowerOf4);
    }
}
