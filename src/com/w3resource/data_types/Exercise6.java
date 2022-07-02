package com.w3resource.data_types;

/*
*Write a Java program to compute body mass index (BMI).
BMI: The BMI is defined as the body mass divided by the square of the body height, and is universally expressed in units of kg/m2, resulting from mass in kilograms and height in metres.

Test Data
Input weight in pounds: 452
Input height in inches: 72
* */

import java.util.Scanner;

public class Exercise6 {

    public static double readNumber(String input) {
        System.out.println(input);
        return new Scanner(System.in).nextDouble();
    }

    public static double calculateBMI(double weight, double inches) {
        return weight * 0.45359237 / (inches * 0.0254 * inches * 0.0254);
    }

    public static void main(String[] args) {
        double weightInPounds = readNumber("Input weight in pounds");
        double heightInInches = readNumber("Input height in inches");
        double BMI = calculateBMI(weightInPounds, heightInInches);
        System.out.println("BMI: " +BMI);
    }
}
