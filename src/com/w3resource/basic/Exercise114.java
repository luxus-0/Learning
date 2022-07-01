package com.w3resource.basic;

/*
 * Write a Java program to given a string and an offset, rotate string by offset (rotate from left to right)
 * */

import java.util.Arrays;

public class Exercise114 {
    public static void main(String[] args) {
        String str = "Lukasz";
        int offset = 3;
        char[] arr = str.toCharArray();
        offset %= arr.length;
        reverse(arr,0, arr.length - offset - 1);
        reverse(arr, arr.length - offset, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(char[] array, int start, int end) {
        while (start < end) {
            char temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
