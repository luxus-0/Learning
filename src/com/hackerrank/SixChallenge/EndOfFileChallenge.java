package com.hackerrank.SixChallenge;

import java.util.Scanner;

public class EndOfFileChallenge {
    public static void main(String[] args) {
        int i = 1;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            System.out.println(i++ + " " + sc.nextLine() + "\n" + i++ + " " + sc.nextLine() + "\n" + i++ + " " + sc.nextLine());
            }
        }
    }
