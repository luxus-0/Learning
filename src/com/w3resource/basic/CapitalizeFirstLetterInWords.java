package com.w3resource.basic;

/*
* Write a Java program to capitalize the first letter of each word in a sentence.
* */
public class CapitalizeFirstLetterInWords {

    private static String capitalizeFirstLetterInWords() {
        StringBuilder capitalizeLetterBuilder = new StringBuilder();
        String str = "what is the weather today?";
        String[] words = str.split(" ");//or split("//s")
        for(String word : words) {
            String firstLetter = word.substring(0, 1);
            String remainingLetter = word.substring(1);
            capitalizeLetterBuilder
                    .append(firstLetter.toUpperCase())
                    .append(remainingLetter)
                    .append(" ");
        }
        return capitalizeLetterBuilder.toString();
    }

    private static String capitalizeFirstLetterInWordsV2(String str) {
        char firstLetter = str.charAt(0);
        char capitalizeFirstLetter = Character.toUpperCase(firstLetter);
        return str.replace(firstLetter, capitalizeFirstLetter);
    }
    
    public static void main(String[] args) {
        String capitalizeLetter = capitalizeFirstLetterInWords();
        System.out.println(capitalizeLetter);

        String str = "what you do in free time?";
        String capitalize = capitalizeFirstLetterInWordsV2(str);
        System.out.println(capitalize);
    }
}
