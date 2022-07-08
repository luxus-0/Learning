package com.hackerrank;

import java.util.*;

public class StringTokens {

   private final static String  REGEX = "[\\s,?'!_.@]+";

    public static  String getString() {
        return new Scanner(System.in).nextLine();
    }

    public static void printTokensInString(String s) {
        if(s.length() == 0 || s.length() > 400000) {
            System.out.println("Wrong range length String! between 1 and 400000!");
        }
        if(isConditionLength(s)) {
            String[] words = s.trim().split(REGEX);
            System.out.println(words.length);
            for(String word : words) {
                System.out.println(word);
            }
        }
    }

    public static void printTokensInString2(String s) {
        if (s.length() == 0 || s.length() > 400000) {
            System.out.println("Wrong range length String! between 1 and 400000!");
        }
        StringTokenizer st = new StringTokenizer(s);
        int count = st.countTokens();
        System.out.println(count);
        for (int i = 0; i < count; i++) {
                System.out.println(st.nextToken());
            }
        }

        public static void printTokensWithCollection(String s) {
            if (s.length() == 0 || s.length() > 400000) {
                System.out.println("Wrong range length String! between 1 and 400000!");
            }

            String[] words = s.split(REGEX);
            System.out.println(words.length);
            List<String> wordsList = Arrays.asList(words);
            for(int i = 0; i < wordsList.size(); i++) {
                System.out.println(wordsList.get(i));
            }
        }

    private static boolean isConditionLength(String s) {
        return s.length() >= 1 &&
                s.length() <= 400000;
    }

    public static void main(String[] args) {
        String regex = "[!,?._'@\\s]+";
        String str = getString();
        printTokensInString(str);
        System.out.println("--------------------------");
        String str2 = getString().replaceAll(regex," ");
        printTokensInString2(str2);
        System.out.println("-------------------------");
        printTokensWithCollection(str);
    }
}
