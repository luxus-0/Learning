package com.w3resource.basic;

/*
* Write a Java program to swap the first and last elements of an array (length must be at least 1)
* and create a new array.
* */

import java.util.Arrays;

public class Exercise81 {

    public void swapFirstAndLastElementInArray() {
        int[] array = {2, 5, 9, 14, 17};
        System.out.println("Swap array: [" +array[array.length - 1] + ", " + array[1] + ", " + array[2] + ", " + array[3] + ", " + array[0] +"]");
    }

    public void swapFirstAndLastElementInArray2() {
        int[] array = {2, 5, 9, 14, 17};
        int first = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = first;
        System.out.println("Swap array: " + Arrays.toString(array));
    }


    public static void main(String[] args) {
        Exercise81 ex = new Exercise81();
        ex.swapFirstAndLastElementInArray();

        System.out.println("-------");
        ex.swapFirstAndLastElementInArray2();
    }
}
