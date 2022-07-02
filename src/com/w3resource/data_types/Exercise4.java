package com.w3resource.data_types;

/*
*  Write a Java program to convert minutes into a number of years and days.
* */

import java.util.Scanner;

public class Exercise4 {

    public static int readMinutes(String input) {
        System.out.println(input);
        return new Scanner(System.in).nextInt();
    }

    public static void convertMinutesToNumberYearsAndDays(int minutes) {
        if(minutes > 0) {
            double minInYears = 60 * 24 * 365;

            long years = (long) (minutes / minInYears);
            int days = (minutes / 60 / 24) % 365;

            System.out.println(minutes + " minutes is approximately " + years +  " years and " + days + " days");
        }
    }
    public static void main(String[] args) {
        int minutes = readMinutes("Input minutes");
        convertMinutesToNumberYearsAndDays(minutes);
    }
}
