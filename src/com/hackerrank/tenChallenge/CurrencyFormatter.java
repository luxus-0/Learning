package com.hackerrank.tenChallenge;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();

        Locale indiaLocale = new Locale("en", "in");

        NumberFormat u = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat i = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat c = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat f = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + u.format(payment));
        System.out.println("India: " + i.format(payment));
        System.out.println("China: " + c.format(payment));
        System.out.println("France: " + f.format(payment));

    }
}
