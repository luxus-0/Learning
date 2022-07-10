package com.hackerrank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*https://www.hackerrank.com/challenges/valid-username-checker/problem?isFullScreen=true&h_r=next-challenge&h_v=zen*/

public class ValidUsernameChecker {

    private final static String REGEX = "^[a-zA-Z]\\w{7,29}$";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int i = 0;
        while(i < n) {
            i++;
            String username = scanner.nextLine();
            Pattern pattern = Pattern.compile(REGEX);
            Matcher matcher = pattern.matcher(username);
            if (matcher.find()) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }

        }
        scanner.close();
    }
}
