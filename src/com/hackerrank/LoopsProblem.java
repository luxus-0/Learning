package com.hackerrank;

import java.util.Scanner;

public class LoopsProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            if (N <= 20 && N >= 2) {
                int result = N * i;
                System.out.println(N + " x " + i + " = " + result);
            }
        }
    }
}
