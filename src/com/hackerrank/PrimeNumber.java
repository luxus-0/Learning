package com.hackerrank;

/*
 * https://www.hackerrank.com/challenges/java-primality-test/problem?isFullScreen=true
 * */

import java.math.BigInteger;
import java.util.Scanner;

public class PrimeNumber {

    public static int readInt() {
        return new Scanner(System.in).nextInt();
    }

    public static boolean checkPrime(int number) {
        if (number <= 1)
            return false;

        for (int i = 2; i < number; i++)
            if (number % i == 0)
                return false;

        return true;
    }

    public static void main(String[] args) {
     int number = readInt();
     boolean isPrime = checkPrime(number);
        System.out.println(isPrime);
    }
}