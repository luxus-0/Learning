package com.w3resource.basic;

/*
* Write a Java program to print the ascii value of a given character.
* */
public class ConversionFromCharToAscii {

    private static void convertToAscii(char asciiChar) {
        System.out.println("The ascii value of " + asciiChar +" : " +(int) asciiChar);
    }

    public static void main(String[] args) {
        char asciiCharacter = 'Z';
        convertToAscii(asciiCharacter);
    }
}
