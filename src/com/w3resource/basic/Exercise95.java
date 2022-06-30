package com.w3resource.basic;

/*
 * Write a Java program to create an array (length # 0) of string values.
 * The elements will contain "0", "1", "2"... through ... n-1
 * */

import java.util.Arrays;

public class Exercise95 {
    public static void main(String[] args) {
        int n = 5;
        String[] arr = new String[n];
        for (int i = 0; i < n; i++)
            arr[i] = String.valueOf(i);
        System.out.println("Array: " + Arrays.toString(arr));
    }
}
