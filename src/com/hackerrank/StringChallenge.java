package com.hackerrank;

import java.util.Scanner;

public class StringChallenge {
    public static String readString() {
        return new Scanner(System.in).nextLine();
    }
    public static void checkLexicographicallyLarger(String A, String B) {
        if (A.charAt(0) > B.charAt(0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        //or
        //String lexicographically = A.compareTo(B) > 0 ? "Yes" : "No";
        //System.out.println(lexicographically);

    }

    public static int sumLength(String A, String B) {
        return A.length() + B.length();
    }

    public static String printCapitalizeFirstLetter(String A, String B) {
        return A.substring(0, 1).toUpperCase() + A.substring(1) + " "
                + B.substring(0, 1).toUpperCase() + B.substring(1);
    }

    public static void main(String[] args) {
        String A = readString();
        String B = readString();

        int sumLengthString = sumLength(A, B);
        System.out.println(sumLengthString);

        checkLexicographicallyLarger(A, B);

        String capitalizeFirstLetterInString =  printCapitalizeFirstLetter(A, B);
        System.out.println(capitalizeFirstLetterInString);
    }
}
