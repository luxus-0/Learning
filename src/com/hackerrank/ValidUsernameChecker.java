package com.hackerrank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*https://www.hackerrank.com/challenges/valid-username-checker/problem?isFullScreen=true&h_r=next-challenge&h_v=zen*/
public class ValidUsernameChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n <= 100 && n >= 1) {
            String input = scanner.nextLine();
            String regex = "\\w{3,8}";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                System.out.println("Valid");
            }
            System.out.println("Invalid");
        }
    }
}
