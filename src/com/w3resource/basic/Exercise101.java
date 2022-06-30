package com.w3resource.basic;

import java.util.Arrays;

/*
* Write a Java program to check if the number of 10 is greater than number to 20s in a given array of integers.
* */
public class Exercise101 {
    public static void main(String[] args) {
        int[] arr = {12, 17, 10, 14, 20, 20};
        int result = 0;
        int x = 0,y = 0;
        System.out.println(Arrays.toString(arr));

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 10)
                x++;
            if(arr[i] == 20)
                y++;
        }

        System.out.println(x > y);
    }
}
