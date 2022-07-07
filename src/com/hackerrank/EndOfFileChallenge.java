package com.hackerrank;

import java.util.Scanner;

public class EndOfFileChallenge {
    public static void main(String[] args) {
        int i = 0;
            Scanner sc = new Scanner(System.in);
            while (sc.hasNext()) {
                i++;
                System.out.println(i + " " + sc.nextLine());
            }
    }
}
