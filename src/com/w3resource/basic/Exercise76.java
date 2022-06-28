package com.w3resource.basic;

/*
* Write a Java program to test if the first or the last element of two array of integers are same.
*  The length of the array must be greater than or equal to 2. Go to the editor
Test Data: array1 = 50, -20, 0, 30, 40, 60, 12
array2 = 45, 20, 10, 20, 30, 50, 11
Sample Output:

false
* */

public class Exercise76 {
    public static void main(String[] args) {

        int[] array = {50, -20, 0, 30, 40, 60, 12};
        int[] array2 = {45, 20, 10, 20, 30, 50, 11};
        boolean equalElementsFirstAndLastInArray =
                (array.length >= 2 && array2.length >= 2 && array[0] == array2[0] ||
                        array[array.length - 1] == array2[array2.length - 1]);
        System.out.println(equalElementsFirstAndLastInArray);
    }
}
