package com.hackerrank.fourteenChallenge;

import java.util.Scanner;

public class Palindrome {
    public static String readString() {
        return new Scanner(System.in).nextLine();
    }

    public static String checkPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        if(str.isEmpty()) {
            throw new IllegalArgumentException("String is empty");
        }
        if(str.equals(reversed)) {
            return "Yes";
        }
        return "No";

    }

    public static String checkPalindrome2(String str) {
        String clean = str.replace("\\s+","").toLowerCase();
        int length = str.length();
        int forward = 0;
        int backward = length - 1;
        while (backward > forward) {
            char forwardChar = clean.charAt(forward++);
            char backwardChar = clean.charAt(backward--);
            if(forwardChar != backwardChar)
                return "No";
        }
        return "Yes";
    }
    public static void main(String[] args) {
        String str = readString();
        String checkPalindrome = checkPalindrome(str);
        System.out.println(checkPalindrome);

        String checkPalindrome2 = checkPalindrome2(str);
        System.out.println(checkPalindrome2);
    }
}
