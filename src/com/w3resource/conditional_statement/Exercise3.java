package com.w3resource.conditional_statement;

/*
* Take three numbers from the user and print the greatest number.

Test Data
Input the 1st number: 25
Input the 2nd number: 78
Input the 3rd number: 87
* */

import java.util.Scanner;

public class Exercise3 {

    public static int readNumber(String input) {
        System.out.println(input);
        return new Scanner(System.in).nextInt();
    }

    public static int findMax(int number1, int number2, int number3) {
        if(number1 > number2 && number1 > number3) {
            return number1;
        } else if(number2 > number1 && number2 > number3) {
            return number2;
        } else if(number3 > number1 && number3 > number2) {
            return number3;
        }
        return 0;
    }

    public static void main(String[] args) {
        int no1 = readNumber("Input the 1st number");
        int no2 = readNumber("Input the 2nd number");
        int no3 = readNumber("Input the 3rd number");

        int checkMax = findMax(no1, no2, no3);
        System.out.println("The greatest: " +checkMax);
    }
}
