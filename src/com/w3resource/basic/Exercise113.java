package com.w3resource.basic;

/*
* Write a Java program to merge two given sorted array of integers and create a new sorted array.
array1 = [1,2,3,4]
array2 = [2,5,7, 8]
result = [1,2,2,3,4,5,7,8]
* */

import java.util.Arrays;

public class Exercise113 {
    public static int[] mergeTwoSortedArray() {
        int[] arr = {7, 8, 9, 10};
        int[] arr2 = {3, 1, 4, 9};

        int[] mergeArray = Arrays.copyOf(arr, arr.length + arr2.length);
        System.arraycopy(arr2, 0, mergeArray, arr.length, arr2.length);
        Arrays.sort(mergeArray);
        return mergeArray;
    }

    public static void main(String[] args) {
        int[] mergeArray = mergeTwoSortedArray();
        System.out.println(Arrays.toString(mergeArray));
    }
}
