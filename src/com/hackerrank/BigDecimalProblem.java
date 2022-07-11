package com.hackerrank;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*https://www.hackerrank.com/challenges/java-bigdecimal/problem?isFullScreen=true*/

public class BigDecimalProblem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] s = new String[n];

       for(int i = 0; i < s.length; i++) {
            s[i] = scanner.next();
        }

       scanner.close();

        Arrays.sort(s, Collections.reverseOrder(Comparator.comparing(BigDecimal::new)));
        for(String z : s){
            System.out.println(z);
        }
    }
}
