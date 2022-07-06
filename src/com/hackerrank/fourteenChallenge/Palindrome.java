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
    public static void main(String[] args) {
        String str = readString();
        String checkPalindrome = checkPalindrome(str);
        System.out.println(checkPalindrome);
    }
}
