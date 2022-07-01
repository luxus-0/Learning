package com.w3resource.basic;

/*
* Write a Java program to check if a group of numbers (l) at the start and end of a given array are same.
* */

public class Exercise105 {
    static int[] array = {30, 70, 11, 12, 40, 17, 30, 70};

    public static boolean isSameGroupElementOnStartAndEnd() {
        if(array[0] == array[array.length - 2] && array[1] == array[array.length - 1])
            return true;
        return false;
    }
    public static void main(String[] args) {
        boolean isSame = isSameGroupElementOnStartAndEnd();
        System.out.println(isSame);
        }
    }
