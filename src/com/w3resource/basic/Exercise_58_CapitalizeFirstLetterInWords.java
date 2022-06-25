package com.w3resource.basic;

/*
* Write a Java program to capitalize the first letter of each word in a sentence.
Sample Output:

Input a Sentence: the quick brown fox jumps over the lazy dog.
The Quick Brown Fox Jumps Over The Lazy Dog.
* */
public class Exercise_58_CapitalizeFirstLetterInWords {

    private static String capitalizeFirstLetter() {
        String str = "the quick brown fox jumps over the lazy dog";
        StringBuilder capitalizeString = new StringBuilder();
        String[] words = str.split("\\s");
        for(String word : words) {
            String firstLetter = word.substring(0,1);
            String remainingLetter = word.substring(1);
            capitalizeString
                    .append(firstLetter.toUpperCase())
                    .append(remainingLetter)
                    .append(" ");
        }
        return capitalizeString.toString();
    }

    public static void main(String[] args) {
        String firstLetterUpperCase = capitalizeFirstLetter();
        System.out.println(firstLetterUpperCase);
    }
}
