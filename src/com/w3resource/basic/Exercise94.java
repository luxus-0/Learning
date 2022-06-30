package com.w3resource.basic;

/*
* Write a Java program to rearrange all the elements of an given array of integers so that all the odd numbers
* come before all the even numbers.
* */

public class Exercise94 {
    public static void main(String[] args) {
        int[] arr = {12, 11, 10, 30, 17, 26, 40, 57};

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }

        for(int j = 0; j < arr.length; j++) {
            if(arr[j] % 2 == 0) {
                System.out.print(arr[j] + " ");
            }
        }
    }
}
