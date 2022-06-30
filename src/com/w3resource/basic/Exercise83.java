package com.w3resource.basic;

/*
* Write a Java program to multiply corresponding elements of two arrays of integers. Go to the editor
Sample Output:
Array1: [1, 3, -5, 4]
Array2: [1, 4, -5, -2]
Result: 1 12 25 -8
* */

public class Exercise83 {

    public static void multiplyElementsArray() {
        int[] array = {1, 3, -5, 4};
        int[] array2 = {1, 4, -5, -2};

        for(int i = 0; i < array.length; i++) {
                System.out.print(array[i] * array2[i] +", ");
            }
        }

    public static void main(String[] args) {
        System.out.print("Result: ");
        multiplyElementsArray();
    }
}
