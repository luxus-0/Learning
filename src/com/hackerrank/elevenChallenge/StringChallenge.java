package com.hackerrank.elevenChallenge;

import java.util.Scanner;

public class StringChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.nextLine();
        String B = scanner.nextLine();

        System.out.println(A.length() + B.length());

                if (A.charAt(0) > B.charAt(0)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }

                System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1));
            }
    }
