package com.w3resource.basic;

/*
 * Write a Java program to get the larger value between first and last element of an array (length 3) of integers.
 * */

public class Exercise80 {
    private final static int[] array = {4, 6, 9};
    private static void maxValueInArray() {

        int max = Math.max(0, array[array.length - 1]);
        System.out.println(max);
    }
    private static void maxValueInArray2() {
        int[] array = {4, 6, 9};
        if (array[2] > array[0])
            array[0] = array[2];
        System.out.println(array[0]);
    }
    private static void maxValueInArray3() {
        array[0] = (array[2] > array[0]) ? array[0] = array[2] : 0;
        System.out.println(array[0]);
    }

    public static void main(String[] args) {
        //3 version
        System.out.print("Largest value in Array: ");
        maxValueInArray();
        System.out.print("Largest value in Array: ");
        maxValueInArray2();
        System.out.print("Largest value in Array: ");
        maxValueInArray3();
    }
}
