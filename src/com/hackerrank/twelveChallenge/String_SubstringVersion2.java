package com.hackerrank.twelveChallenge;

import java.util.Scanner;

public class String_SubstringVersion2 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.next();

            int start = scanner.nextInt();
            int end = scanner.nextInt();

            System.out.println(s.substring(start, end));

        }
}
