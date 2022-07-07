package com.hackerrank;

import java.util.Scanner;

public class JavaOutputFormattingChallenge {


    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");

        for(int i=0; i<3; i++) {
            String sl=sc.next();
            int x = sc.nextInt();


            System.out.printf("%-15s%03d%n", sl, x); ////left justified using 15 character, integer express 3 digit.
            // If is less than 3 digit use 0.(001,010)

        }
        System.out.println("================================");
    }
}