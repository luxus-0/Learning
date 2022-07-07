package com.hackerrank;

import java.util.Scanner;

public class StringChallengeVersion2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.nextLine();
        String B = scanner.nextLine();

        System.out.println(A.length() + B.length());

        //or
        //System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
        if (A.charAt(0) < B.charAt(0)) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }

        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " "
                + B.substring(0, 1).toUpperCase() + B.substring(1));
    }
}

