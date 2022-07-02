package com.w3resource.data_types;

/*
* Write a Java program that prints the current time in GMT

Test Data
Input the time zone offset to GMT: 256
Expected Output:
Current time is 23:40:24
* */

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the time zone offset to GMT: ");
        long timeZoneChange = input.nextInt();

        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 60;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = (timeZoneChange + totalHours) % 24;

        System.out.println("Current time is " + currentHour + " : " +currentMinute + " : " +currentSecond);
    }
}
