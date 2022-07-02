package com.w3resource.data_types;

/*
*  Write a Java program that reads a number in inches, converts it to meters.
* */

import java.util.Scanner;

public class Exercise2 {

    public static int readInches(String input) {
        System.out.println(input);
        return new Scanner(System.in).nextInt();
    }

    public static double convertInchesToMeter(int inches) {
        return inches * 0.0254;
    }

    public static void main(String[] args) {
        int inches = readInches("Input inches");
        double meters = convertInchesToMeter(inches);
        System.out.println(inches + " inches is " + meters + " meters");
    }
}
