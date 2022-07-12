package com.hackerrank;

import java.util.Scanner;

public class PrimeNumber2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.nextBigInteger().isProbablePrime(1) ? "prime" : "not prime");
    }
}
