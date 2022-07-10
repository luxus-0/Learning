package com.hackerrank;

/*https://www.hackerrank.com/challenges/duplicate-word/problem?isFullScreen=true&h_r=next-challenge&h_v=zen*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDuplicateWord {

    public static String deleteDuplicateWord(String input) {

        String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";

            Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
            Matcher matcher = p.matcher(input);
            while (matcher.find()) {
                input = input.replaceAll(matcher.group(), matcher.group(1));
            }
        return input;
    }
    public static void main(String[] args) {
        String removeDuplicate = deleteDuplicateWord("Good bye bye world world");
        System.out.println(removeDuplicate);

        String removeDuplicate2 = deleteDuplicateWord("Sam went went to to to his business");
        System.out.println(removeDuplicate2);

        String removeDuplicate3 = deleteDuplicateWord("Reya is is the the best player in eye eye game");
        System.out.println(removeDuplicate3);

        String removeDuplicate4 = deleteDuplicateWord("in inthe");
        System.out.println(removeDuplicate4);

        String removeDuplicate5 = deleteDuplicateWord("Hello hello Ab aB");
        System.out.println(removeDuplicate5);
    }
}
