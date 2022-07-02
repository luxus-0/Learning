package com.w3resource.data_types;

/*
 *   Write a Java program to takes the user for a distance (in meters) and the time was taken
 * (as three numbers: hours, minutes, seconds), and display the speed, in meters per second, kilometers per hour
 *  and miles per hour (hint: 1 mile = 1609 meters).
 *
 * Input distance in meters: 2500
Input hour: 5
Input minutes: 56
Input seconds: 23
Expected Output :
Your speed in meters/second is 0.11691531
Your speed in km/h is 0.42089513
Your speed in miles/h is 0.26158804
 * */

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input distance in meters");
        float meters = scanner.nextFloat();
        System.out.println("Input hour");
        float hour = scanner.nextFloat();
        System.out.println("Input minutes");
        float minutes = scanner.nextFloat();
        System.out.println("Input seconds");
        float seconds = scanner.nextFloat();

        float allSeconds = (hour * 3600) + (minutes * 60) + seconds;
        float meters_seconds = meters / allSeconds;
        float kilometers_hour = ( meters / 1000.0f ) / ( seconds /3600.0f );
        float miles_hour = kilometers_hour / 1.609f;

        System.out.println("Your speed in meters/second is " +meters_seconds);
        System.out.println("Your speed in km/h is " + kilometers_hour);
        System.out.println("Your speed in miles/h is " + miles_hour);
    }
}
