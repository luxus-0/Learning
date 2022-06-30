package com.w3resource.basic;

/*
 * Write a Java program to count the number of even and odd elements in a given array of integers.
 * */

import java.util.Arrays;

public class Exercise92 {
    public static void main(String[] args) {
        int[] arr = {3, 11, 78, 12, 90, 37};
        System.out.println("Array: " + Arrays.toString(arr));
        int counterEven = 0;
        int counterOdd = 0;
        for (int number : arr) {
            if (number % 2 == 0) {
                counterEven++;
            } else
                counterOdd++;
        }

        System.out.printf("Number of even: %d ", counterEven);
        System.out.printf("\nNumber of odd: %d ", counterOdd);
    }
}
