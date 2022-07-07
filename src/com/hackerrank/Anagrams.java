package com.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

    public static boolean isAnagram(String a, String b) {
        char[] strArray1 = a.toLowerCase().toCharArray();
        char[] strArray2 = b.toLowerCase().toCharArray();

        if (a.length() == 0 && b.length() == 0 && !a.matches("[a-zA-Z]") && !b.matches("[a-zA-Z]")) {
            throw new IllegalArgumentException("Not alphabetic Strings!!");
        }
        if (a.length() != b.length()) {
            return false;
        }
        Arrays.sort(strArray1);
        Arrays.sort(strArray2);
        return Arrays.equals(strArray1, strArray2);
    }

    public static boolean isAnagram2(String a, String b) {
        char[] charArray = a.toCharArray();
        char[] charArray2 = b.toCharArray();

        for (char character : charArray) {
            for (char character2 : charArray2) {
                if (!Character.isAlphabetic(character) && !Character.isAlphabetic(character2)) {
                    throw new IllegalArgumentException("Not alphabetic Strings!!");
                }
            }
        }

        int[] count = new int[256];
        for (int i = 0; i < a.length(); i++) {
            count[a.charAt(i)]++;
            count[b.charAt(i)]--;

        }
        for (int i = 0; i < 256; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");

        boolean anagram2 = isAnagram2(a, b);
        System.out.println(anagram2);
    }
}
