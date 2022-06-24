package com.w3resource.basic;

import java.util.Scanner;

/*
* Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn
* Sample Output:
*
* Input number: 5
5 + 55  + 555
* */
public class AddOneDigitToTwoDigitToThreeDigit {

    private static void addDigits() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
        int n = scanner.nextInt();
        System.out.printf("%d + %d%d + %d%d%d", n, n, n, n, n, n);
    }

    public static void main(String[] args) {
        addDigits();
    }
}
