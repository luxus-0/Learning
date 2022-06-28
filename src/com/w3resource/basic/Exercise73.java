package com.w3resource.basic;

/*
* Write a Java program to create a new string taking first and last characters from two given strings.
*  If the length of either string is 0 use "#" for missing character. Go to the editor
Test Data: str1 = "Python"
str2 = " "
Sample Output:

P#
* */

public class Exercise73 {

    public static void main(String[] args) {
        String firstStr = "Piotr";
        String secondStr = "";

        String result = "";
        result += (firstStr.length() >= 1) ? firstStr.charAt(0) : '#';
        result += (secondStr.length() >= 1) ? secondStr.charAt(secondStr.length() - 1) : '#';
        System.out.println(result);
    }
}
