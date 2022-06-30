package com.w3resource.basic;

/*
 * Write a Java program than read an integer and calculate the sum of its digits
 *  and write the number of each digit of the sum in English
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise87 {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        try {
            String str = bufferedReader.readLine();
            char[] numberStr = str.toCharArray();

            for (int i = 0; i < numberStr.length; i++) {
                sum += numberStr[i] - '0';
            }
            System.out.println("Original number: " + str);
            printNumber(sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void printNumber(int n) {
        int x, y, z;
        String[] number = {"zero", "one", "two", "three", "for", "five", "six", "seven", "eight", "nine"};
        System.out.println("Sum of digit: " + n);
        if (n < 10) {
            System.out.println(number[n]);
        } else if (n < 100) {
            x = n / 10;
            y = n - x * 10;
            System.out.println("In english: " + number[x] + " " + number[y]);
        } else {
            x = n / 100;
            y = (n - x * 100) / 10;
            z = n - x * 100 - y * 10;
            System.out.println("In english: " + number[x] + " " + number[y] + " " + number[z]);
        }

    }
}
