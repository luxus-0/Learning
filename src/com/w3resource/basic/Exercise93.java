package com.w3resource.basic;

/*
* Write a Java program to test if an array of integers contains an element 10 next to 10 or
*  an element 20 next to 20, but not both.
* */

public class Exercise93 {
    public static void main(String[] args) {
        int[] arr = {10, 10, 20, 30, 40, 20};

        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == 10 && arr[i + 1] == 10) {
                System.out.println("Element contains 10 next to 10" );
            } else if(arr[i] == 20 && arr[i + 1] == 20) {
                System.out.println("Element contains 20 next to 20" );
            }
        }
    }
}
