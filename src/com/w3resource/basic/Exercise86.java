package com.w3resource.basic;

/*
* Write a Java program start with an integer n, divide n by 2 if n is even or multiply by 3 and add 1 if n is odd,
*  repeat the process until n = 1
* */

import java.util.Scanner;

public class Exercise86 {

    public static int readInt(String message) {
        System.out.println(message);
        return new Scanner(System.in).nextInt();
    }

    public static void printNumber() {
        int n = readInt("Input number");
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = (n * 3 + 1) / 2;
            }
        }
        System.out.println("Value n: " +n);
    }

    public static void main(String[] args) {
        printNumber();
    }
}
