package com.hackerrank;

/*https://www.hackerrank.com/challenges/java-regex/problem?isFullScreen=true*/

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexString {
    private final static String REGEX = "[0-256]{0,3}[.][0-256]{0,3}[.][0-256]{0,3}";
    public static String readIpAddress() {
        return new Scanner(System.in).next();
    }

    public static boolean checkIpAddressWithoutRegex(String ipAddress) {
        String[] words = ipAddress.split("[.]");
        int A = Integer.parseInt(words[0]);
        int B = Integer.parseInt(words[1]);
        int C = Integer.parseInt(words[2]);

        if(words.length <= 3) {
            if(A >= 0 && A <= 255 &&
                    B >= 0 && B <= 255  &&
                    C >= 0 && C <= 255) {
                return true;
            }

        }
        return false;
    }

    public static void checkIpAddressWithRegex() {
        Pattern pattern = Pattern.compile(REGEX);
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String ipAddress = sc.next();
            Matcher matchIpAddress = pattern.matcher(ipAddress);
            System.out.println(matchIpAddress.matches());
        }
    }

    public static boolean checkIpAddressWithRegex2() {
        Scanner sc = new Scanner(System.in);
            while (sc.hasNext()) {
                String ipAddress = sc.next();
                if (ipAddress.matches(REGEX)) {
                    return true;
                }
            }
            sc.close();
            return false;
    }

    public static void main(String[] args) {
       String ip = readIpAddress();

        boolean checkIp = checkIpAddressWithoutRegex(ip);
        System.out.println(checkIp);

        checkIpAddressWithRegex();

        boolean isCorrectIp = checkIpAddressWithRegex2();
        System.out.println(isCorrectIp);
    }
}
