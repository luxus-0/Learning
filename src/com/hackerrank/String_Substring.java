package com.hackerrank;

import java.util.Scanner;

public class String_Substring {
    private final static String REGEX = "^[a-zA-Z]*$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        int start = scanner.nextInt();
        int end = scanner.nextInt();

        try {
            if (s.matches(REGEX) && s.length() >= 1 && s.length() <= 100) {
                System.out.println(s.substring(start, end));
            } else {
                throw new Exception("Not alphabetic letters");
            }
        } catch (Exception e) {
            e.fillInStackTrace();
        }
    }
}
