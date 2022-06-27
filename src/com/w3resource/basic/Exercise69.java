package com.w3resource.basic;

/*
* Write program to extract the first half of a string of even length
* */
public class Exercise69 {

    private static void printFirstHalfString() {
        String str = "lukasz";
        System.out.println(str.substring(0, str.length() / 2));
    }

    public static void main(String[] args) {
        printFirstHalfString();
    }
}
