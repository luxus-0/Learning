package com.w3resource.basic;

/*
* Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both.
Sample Output:

Divided by 3:
3, 6, 9, 12, 15 etc

Divided by 5:
5, 10, 15, 20 etc

Divided by 3 & 5:
15, 30, 45, 60, 75, 90, etc
* */

public class DivisibleNumber {

    private static void printDivisibleBy3() {
        System.out.println("Divided by 3");
        for(int i = 1; i <= 100; i++) {
            if(i % 3 == 0) {
                System.out.print(i + ", ");
            }
        }
    }

    private static void printDivisibleBy5() {
        System.out.println("\nDivided by 5");
        for(int i = 1; i <= 100; i++) {
            if(i % 5 == 0) {
                System.out.print(i + ", ");
            }
        }
    }

    private static void printDivisibleBy3And5() {
        System.out.println("\nDivided by 3 and 5");
        for(int i = 1; i <= 100; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + ", ");
            }
        }
    }

    public static void main(String[] args) {
        printDivisibleBy3();
        printDivisibleBy5();
        printDivisibleBy3And5();
    }
}
