package com.w3resource.data_types;

/*
* Write a Java program to convert temperature from Fahrenheit to Celsius degree
* */

import java.math.BigDecimal;
import java.util.Scanner;

public class Exercise1 {
    public static int readFahrenheit(String input) {
        System.out.println(input);
        return new Scanner(System.in).nextInt();
    }

    public static BigDecimal convertFromFahrenheitToCelsius(int fahrenheit) {
        return BigDecimal.valueOf((fahrenheit - 32) / 1.8);
    }
    public static void main(String[] args) {
        int fahrenheit = readFahrenheit("Input fahrenheit");
        BigDecimal fromFahrenheitToCelsius = convertFromFahrenheitToCelsius(fahrenheit);
        System.out.println("Celsius : " + fromFahrenheitToCelsius);
    }
}
