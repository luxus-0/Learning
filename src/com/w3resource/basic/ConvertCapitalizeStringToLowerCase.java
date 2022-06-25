package com.w3resource.basic;

/*
* Write a Java program to convert a given string  into lowercase
* */

public class ConvertCapitalizeStringToLowerCase {

    private static String swapCase(String expression) {
        if(expression == null || expression.isEmpty()) {
            throw new IllegalArgumentException("Expression is null or empty");
        }

        char[] chars = expression.toCharArray();
        for(int i = 0; i < chars.length; i++)
        if(Character.isUpperCase(chars[i])) {
            chars[i] = Character.toLowerCase(chars[i]);
        }

        return String.valueOf(chars);
    }

    private static String convertLetterToLowerCase(String str){

        if(str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Expression is null or empty");
        }

        char[] chars = str.toCharArray();
        for(char c: chars) {
        if(Character.isUpperCase(c))
            return str.replace("[A-Z]","[a-z]");

        }

        return str;
    }

    public static void main(String[] args) {
        String expression = "MIALA BABKA MAK";
       String lowerLetter = swapCase(expression);
        System.out.println(lowerLetter);

        String convertToLowerCase = convertLetterToLowerCase(expression);
        System.out.println(convertToLowerCase);
    }
}
