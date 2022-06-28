package com.w3resource.basic;

/*
* Write a Java program to test if the first and the last element of an array of integers are same.
*  The length of the array must be greater than or equal to 2
Test Data: array = 50, -20, 0, 30, 40, 60, 10
Sample Output:

false
* */

public class Exercise75 {

    public static void main(String[] args) {
        int[] array = {50, -20, 0, 30, 40, 60, 10};
        boolean isEqualElements = (array.length >= 2 && array[0] == array[array.length - 1]) ? true : false;
        System.out.println(isEqualElements);
        }
    }
