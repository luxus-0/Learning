package com.w3resource.basic;

/*
* Write a Java program to create a string in the form short_string + long_string + short_string from two strings.
* The strings must not have the same length.
Pictorial Presentation:
* */

public class Exercise70 {

    private static void printStr() {

        String short_string = "lukasz";
        String long_string = "Nazwisko moje to Nowogórski";
        System.out.println(short_string + long_string + short_string);
    }

    public static void main(String[] args) {
        printStr();

    }
}
