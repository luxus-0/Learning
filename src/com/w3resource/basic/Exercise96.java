package com.w3resource.basic;

/*
 * Write a Java program to check if there is a 10 in a given array of integers with a 20 somewhere later in the array.
 * */

public class Exercise96 {

    public static boolean isNumberInArray() {
        final int[] arr = {1, 56, 78, 12, 33, 10, 11, 7, 20};
        boolean isNumber = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 10)
                isNumber = true;
            if (arr[i] == 20)
                return isNumber;
        }
        return false;
    }

    public static void main(String[] args) {
        boolean isNumber10And20 = isNumberInArray();
        System.out.println(isNumber10And20);
    }
}
