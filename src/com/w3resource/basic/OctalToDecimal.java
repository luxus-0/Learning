package com.w3resource.basic;

import java.util.Scanner;

/*
* Convert octal to decimal
* */
public class OctalToDecimal {

    public static int readOctal(String message) {
        System.out.println(message);
        return new Scanner(System.in).nextInt();
    }

    public static int convertOctalToDecimal() {
        int decimal = 0,i = 0;
        int octal = readOctal("Input octal number");
        while (octal != 0) {
            decimal += octal % 10 * Math.pow(8, i++);
            octal /= 10;
        }
        return decimal;
    }

    public static void main(String[] args) {
        int decimal = convertOctalToDecimal();
        System.out.println(decimal);
    }
}
