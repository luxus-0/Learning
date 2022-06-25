package com.w3resource.basic;

/*
* Write a Java program to print the odd numbers from 1 to 99. Prints one number per line
* */
class OddNumbers {

    private static void printOddNumbers() {
        for(int i = 1; i < 100; i += 2) {
            System.out.println(i);
        }
    }

    private static void printOddNumbersV2() {
        for(int i = 1; i < 100; i++) {
            if(i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        printOddNumbers();
        System.out.println("-----------------");
        printOddNumbersV2();
    }
}
