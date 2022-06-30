package com.w3resource.basic;

/*
 * Write a Java program to check if an array of integers contains a specified number next to each other
 * or there are two same specified numbers separated by one element.
 * */

public class Exercise97 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 50, 20, 13, 50};
        int x = 10;
        int result = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == x && arr[i + 1] == 10) {
                System.out.println("Number each other");
                result = 1;
            }
            if (i < arr.length - 3 && arr[i] == x && arr[i + 2] == x) {
                System.out.println("Numbers separates specific number");
                result = 1;
            }

        }
    }
}
