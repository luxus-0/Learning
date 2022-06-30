package com.w3resource.basic;

/*
* Write a Java program to check if a specified number appears in every pair of adjacent
*  element of a given array of integers.
* */

public class Exercise99 {

    public static boolean isAppearedNumberInEveryPair() {
        int[] array_numb = {10, 20, 10, 20, 40, 20, 50};

        for (int i = 0; i < array_numb.length; i++) {
            if (array_numb[i] == array_numb[i + 2])
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
boolean z = isAppearedNumberInEveryPair();
        System.out.println(z);
        }

    }
