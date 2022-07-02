package com.w3resource.basic;

/*
* Write a Java program to check if a positive number is a palindrome or not.
Input a positive integer: 151
Is 151 is a palindrome number?
true
* */

public class Exercise115 {
    public static boolean isPalindrome() {
        int number = 151;
        int remainder, reverseNumber = 0;
        int originalNumber = number;

        while (number > 0) {
            remainder = number % 10;
            reverseNumber = (reverseNumber * 10) + remainder;
            number /= 10;
        }
        if (originalNumber == reverseNumber) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        boolean checkPalindrome = isPalindrome();
        System.out.printf("Number is palindome? : %b ", checkPalindrome);
    }
}
