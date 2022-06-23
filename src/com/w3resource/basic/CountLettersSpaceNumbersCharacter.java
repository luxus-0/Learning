package com.w3resource.basic;

/*
* Write a Java program to count the letters, spaces, numbers
* and other characters of an input string
* Expected Output
The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
letter: 23
space: 9
number: 10
* */

public class CountLettersSpaceNumbersCharacter {

    public static int countLetter(String letter) {
        int counterLetter = 0;
        char[] charArray = letter.toCharArray();

        for (char c : charArray) {
            if (Character.isLetter(c)) {
                counterLetter++;
            }
        }
        return counterLetter;
    }

    public static int countDigit(String digit) {
        int counterDigit = 0;
        char[] charArray = digit.toCharArray();

        for (char digitCharacter : charArray) {
            if (Character.isDigit(digitCharacter))
                counterDigit++;
        }
        return counterDigit;
    }

    public static int countSpace(String space) {
        int counterSpace = 0;
        char[] charArray = space.toCharArray();

        for (char digitCharacter : charArray) {
            if (Character.isSpaceChar(digitCharacter))
                counterSpace++;
        }
        return counterSpace;
    }

    public static void main(String[] args) {
        String str = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
        int count = countLetter(str);
        System.out.printf("Letters%s%n", " : " + count);

        int count2 = countDigit(str);
        System.out.printf("Digit%s%n", " : " + count2);

        int count3 = countSpace(str);
        System.out.printf("Space%s%n", " : " + count3);

    }
}
