package com.hackerrank;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class BigDecimalProblem2 {
    private final static Scanner scanner = new Scanner(System.in);

    public static void sortDescendingOrder() {
        int size = scanner.nextInt();
        String[] array = new String[size];

        for(int i = 0; i < array.length; i++) {
            array[i] = scanner.next();
        }

        scanner.close();

        Arrays.sort(array, Collections.reverseOrder());

        for(String a : array){
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        sortDescendingOrder();
    }
}
