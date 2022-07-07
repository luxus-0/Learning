package com.hackerrank;

import java.util.Scanner;

public class IntToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = String.valueOf(n);

        try {
            if (!s.isEmpty() && n >= -100 && n <= 100) {
                System.out.println("Good job");
            } else {
                throw new Exception("Give number in range <-100,100> !!!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
