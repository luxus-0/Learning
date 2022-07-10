package com.hackerrank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*https://www.hackerrank.com/challenges/valid-username-checker/problem?isFullScreen=true&h_r=next-challenge&h_v=zen*/

public class ValidUsernameChecker {

    private static final String REGEX = "^[a-zA-Z]\\w{7,29}$";
    private static final Scanner scanner = new Scanner(System.in);

    public static void validUsername() {
        int n = Integer.parseInt(scanner.nextLine());
        int i = 0;
        while (i < n) {
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

    public static void validUsernameV2() {
        int n = Integer.parseInt(scanner.nextLine());
        int i = 0;
        while (i < n) {
            i++;
            String username = scanner.nextLine();
            if (username.matches(REGEX)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }

        }
        scanner.close();
    }

    public static void main(String[] args) {
        validUsername();
        validUsernameV2();
    }
}
