package com.w3resource.conditional_statement;

import java.util.Scanner;

/**
 * Write a Java program that reads in two floating-point numbers and tests whether they are the same up to three decimal places. Go to the editor
 * <p>
 * Test Data
 * Input floating-point number: 25.586
 * Input floating-point another number: 25.589
 * Expected Output :
 * They are different
 */

public class Exercise6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input floating-point number: ");
        double x = in.nextDouble();
        System.out.print("Input floating-point another number: ");
        double y = in.nextDouble();

        x = Math.round(x * 1000);
        x /= 1000;

        y = Math.round(y * 1000);
        y /= 1000;

        if (x == y) {
            System.out.println("They are the same");
        } else {
            System.out.println("They are different");
        }
    }
}
