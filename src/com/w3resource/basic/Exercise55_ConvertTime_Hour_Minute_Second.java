package com.w3resource.basic;

import java.util.Scanner;
import java.util.TimeZone;

/*
* Write a Java program to convert seconds to hour, minute and seconds. Go to the editor
Sample Output:

Input seconds: 86399
23:59:59
* */
public class Exercise55_ConvertTime_Hour_Minute_Second {

    private static int getSeconds(String message) {
        System.out.println(message);
        return new Scanner(System.in).nextInt();
    }

    private static void convertToFormatTime(int sec) {
       int seconds = sec % 60;
       int hour = sec / 60;
       int minutes = hour % 60;
       hour = hour / 60;
        System.out.print(hour + ":" + minutes + ":" + seconds);
    }

    public static void main(String[] args) {
        int sec = getSeconds("Input seconds");
        convertToFormatTime(sec);
    }
}
