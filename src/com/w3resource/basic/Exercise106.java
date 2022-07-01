package com.w3resource.basic;

/*
 * Write a Java program to create a new array that is left shifted from a given array of integers.
 * */

import java.util.Arrays;

public class Exercise106 {
    public static void main(String[] args) {
        int[] arr = {23, 45, 17, 90, 105, 33};

        int first = arr[0];
        for(int i = 1; i < arr.length; i++)
             arr[i - 1] = arr[i];

            arr[arr.length - 1] = first;
            System.out.println(Arrays.toString(arr));
        }
    }
