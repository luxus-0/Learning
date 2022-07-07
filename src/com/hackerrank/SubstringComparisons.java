package com.hackerrank;

import java.util.Scanner;

public class SubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {

        String current = s.substring(0, k);
        String min = current;
        String max = current;

        for (int i = k; i < s.length(); i++) {
            if (Character.isAlphabetic(s.charAt(i)) && s.length() <= 1000) {
                current = current.substring(1, k) + s.charAt(i);
            }
            if (max.compareTo(current) < 0) {
                max = current;
            }
            if(min.compareTo(current) > 0){
                min = current;
            }
        }
        return min + "\n" + max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int k = scanner.nextInt();

        String smallestAndLargest = getSmallestAndLargest(s, k);
        System.out.println(smallestAndLargest);
    }
}
