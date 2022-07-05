package com.hackerrank.SevenChallenge;

import java.util.Scanner;

public class JavaStaticInitializerBlock {
    static Scanner scanner = new Scanner(System.in);
    static int B = scanner.nextInt();
    static int H = scanner.nextInt();
    static int parallelogramArea = B * H;

    public static void checkCondition() {
        try {
            if (B <= 0 || H <= 0) {
                throw new Exception("java.lang.Exception: Breadth and height must be positive");
            } else {
                System.out.println(parallelogramArea);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        checkCondition();
    }
}
