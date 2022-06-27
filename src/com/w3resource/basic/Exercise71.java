package com.w3resource.basic;

/*
* Write a Java program to create the concatenation of the two strings except removing the first character of each string.
* The length of the strings must be 1 and above.
* */

public class Exercise71 {

    private static void printRemoveAndConcatString() {
        String str = "Java";
        String str2 = "Python";

        System.out.println(str.substring(1).concat(str2.substring(1)));
    }

    public static void main(String[] args) {
        printRemoveAndConcatString();
    }
}
