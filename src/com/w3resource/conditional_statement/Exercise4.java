package com.w3resource.conditional_statement;

/*
* Write a Java program that reads a floating-point number and prints "zero" if the number is zero.
* Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1,
* or "large" if it exceeds 1,000,000.
 * */

import java.util.Scanner;

public class Exercise4 {

    public static float readFloat(String input) {
        System.out.println(input);
        return new Scanner(System.in).nextFloat();
    }

    public static void main(String[] args) {
        float number = readFloat("Input number");
        if(number == 0) {
            System.out.println("zero");
        } else if(number >= 1) {
            System.out.println("Positive");
        } else if(number < 0) {
            System.out.println("Negative");
        } else if(number < 1) {
            System.out.println("Small");
        } else if(number > 1000000) {
            System.out.println("Large");
        }
    }
}
