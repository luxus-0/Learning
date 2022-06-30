package com.w3resource.basic;

/*
 * Write a Java program to create a new array from a given array of integers,
 * new array will contain the elements from the given array before the last element value 10
 * */

import java.util.Arrays;

public class Exercise104 {
    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 10, 34, 78};
        System.out.println("Original Array" +Arrays.toString(arr));

        int count = 0;
        int[] newArray;
        while (arr[count] != 10)
            count++;
        newArray = new int[count];
        for (int i = 0; i < count; i++)
            newArray[i] = arr[i];
        System.out.println("New Array: " + Arrays.toString(newArray));
    }
}
