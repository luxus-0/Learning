package com.hackerrank.nineChallenge;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

class DateAndTime {
    final static Scanner scanner = new Scanner(System.in);
    final static int month = scanner.nextInt();
    final static int day = scanner.nextInt();
    final static int year = scanner.nextInt();
    public static String findDay(int month, int day, int year) {
        return LocalDate.of(year, month, day).getDayOfWeek().toString();
    }

    public static String findDay2(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH, month-1);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.YEAR, year);
        return calendar.getDisplayName(Calendar.DAY_OF_WEEK,Calendar.LONG, Locale.US).toUpperCase();
    }


    public static void main(String[] args) {
        String dayOfWeek = findDay(month, day, year);
        System.out.println(dayOfWeek);

        //Second version

        String dayOfWeek2 = findDay2(month, day, year);
        System.out.println(dayOfWeek2);
    }
}
