package com.w3resource.basic;

/*
* Write a Java program to take the last three characters from a given string and add the three characters at both the front and back of the string. String length must be greater than three and more. Go to the editor
Test data: "Python"
Sample Output:
honPythonhon
* */

public class Exercise84 {

    public static void addLastThreeCharInString() {
        String str = "Python";
        String last3Character = str.substring(str.length() - 3);
        System.out.println(last3Character + str + last3Character);
    }

    public static void main(String[] args) {
        addLastThreeCharInString();
    }
}
