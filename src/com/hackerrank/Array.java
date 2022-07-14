package com.hackerrank;

import java.util.Scanner;

/*
*https://www.hackerrank.com/challenges/java-1d-array-introduction/problem?isFullScreen=true
* */

public class Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            int val = sc.nextInt();
            a[i] = val;
        }

        sc.close();

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
