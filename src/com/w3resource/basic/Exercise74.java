package com.w3resource.basic;

/*
*Write a Java program to test if 10 appears as either the first or last element of an array of integers.
* The length of the array must be greater than or equal to 2.
Sample Output:
Test Data: array = 10, -20, 0, 30, 40, 60, 10

true
* */

public class Exercise74 {

    public static void checkAppears10inArray() {
        int[] array = {10, -20, 0, 30, 1, 60, 10};
        boolean result = (array[0] == 10 || array[array.length - 1] == 10) ? true : false;
        System.out.println(result);
    }

    public static void main(String[] args) {
        checkAppears10inArray();
    }
}
