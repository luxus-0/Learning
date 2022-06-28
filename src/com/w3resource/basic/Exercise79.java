package com.w3resource.basic;

/*
* Write a Java program to rotate an array (length 3) of integers in left direction. Go to the editor
Sample Output:
Original Array: [20, 30, 40]
Rotated Array: [30, 40, 20]
* */

import java.util.Arrays;

/*
* Write a Java program to rotate an array (length 3) of integers in left direction.
Test Data: {20, 30, 40}
Expected output: {30, 40, 20}
* */

public class Exercise79 {
    public static void main(String[] args) {
        int[] array = {20, 30, 40};
        System.out.println("Original Array: " + Arrays.toString(array));

        int[] rotatedArray = new int[3];
        rotatedArray[0] = array[1];
        rotatedArray[1] = array[2];
        rotatedArray[2] = array[0];

        System.out.println("Rotated array: [" +rotatedArray[0]+ ", " + rotatedArray[1] + ", " + rotatedArray[2]+"]");
    }

}
