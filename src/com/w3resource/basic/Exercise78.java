package com.w3resource.basic;

/*
* Write a Java program to test that a given array of integers of length 2 contains a 4 or a 7. Go to the editor
Sample Output:

Original Array: [5, 7]
true
* */

public class Exercise78 {
    public static void main(String[] args) {
        int[] array = {5, 7};
        boolean containsArray4Or7 = (array[0] == 4 || array[array.length - 1] == 7) ? true : false;
        System.out.println(containsArray4Or7);
    }
}
