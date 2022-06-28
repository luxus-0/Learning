package com.w3resource.basic;

/*
* Write a Java program to create a new string taking first three characters from a given string.
* If the length of the given string is less than 3 use "#" as substitute characters. Go to the editor
Test Data: Str1 = " "
Sample Output:
###
* */

import java.util.Scanner;

public class Exercise72 {

    public static void main(String[] args) {
        System.out.println("Input String");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int len = str.length();
        if(len >= 3)
            System.out.println(str.substring(0,3));
        else if(len == 1)
            System.out.println(str.charAt(0) + "##");
        else
            System.out.println("###");
    }
}
