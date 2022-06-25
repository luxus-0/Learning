package com.w3resource.basic;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.util.Calendar;
import java.util.TimeZone;

/*
* Write a Java program to display the system time. Go to the editor
Sample Output:
Current Date time: Fri Jun 16 14:17:40 IST 2017
* */
public class SystemTime {

    private static void printSystemTime() {
        System.out.format("Current date time: %tc%n\n", System.currentTimeMillis());
    }

    private static void printSystemTimeInSpecificFormat() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
        sdf.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));

        System.out.println("\nNow: "+sdf.format(System.currentTimeMillis()));
    }

    public static void main(String[] args) {
        printSystemTime();
        printSystemTimeInSpecificFormat();
    }
}
