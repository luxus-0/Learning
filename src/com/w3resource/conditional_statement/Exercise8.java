package com.w3resource.conditional_statement;

/*
*Write a Java program that takes the user to provide a single character from the alphabet. Print Vowel or Consonant,
* depending on the user input. If the user input is not a letter (between a and z or A and Z),
* or is a string of length > 1, print an error message.

Test Data
Input an alphabet: p
Expected Output :
Input letter is Consonant
* */

import java.util.Scanner;

public class Exercise8 {

    public static String readString(String input) {
        System.out.println(input);
        return new Scanner(System.in).nextLine();
    }

    public static void main(String[] args) {
        String str = readString("Input character");

        boolean uppercase = str.charAt(0) >= 65 && str.charAt(0) <= 90;
        boolean lowercase = str.charAt(0) >= 97 && str.charAt(0) <= 122;

        if (str.length() > 1) {
            System.out.println("Error.Not a single character");
        } else if (!(uppercase || lowercase)) {
            System.out.println("Error. Not a letter. Enter uppercase or lowercase letter.");
        } else if (isVowel(str)) {
            System.out.println("Vowel");
        } else {
                System.out.println("Consonant");
            }
        }

        private static boolean isVowel (String c){
            return c.equals("a") || c.equals("e") || c.equals("i") || c.equals("o") || c.equals("u") || c.equals("ó") || c.equals("y");
        }
    }
