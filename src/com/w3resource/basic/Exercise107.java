package com.w3resource.basic;

/*
* Write a Java program to check if an array of integers contains three increasing adjacent numbers
* */

import java.util.Arrays;

public class Exercise107 {
    public static void main(String[] args) {
        int[] arr = {90, 11, 12, 13, 45, 20};
        System.out.println("Original array: " +Arrays.toString(arr));
        boolean isIncreasingThreeNumbers = true;

        for(int i = 0; i < arr.length - 3; i++)
        if(arr[i] + 1 == arr[i + 1] && arr[i + 1] + 1 == arr[i + 2]) {
            System.out.println("3 increasing adjacent numbers?: " +isIncreasingThreeNumbers);
        }

    }
}
