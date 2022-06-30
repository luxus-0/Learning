package com.w3resource.basic;

/*
* Write a Java program to get the current system environment and system properties.
* */

import java.util.Properties;

public class Exercise88 {
    public static void main(String[] args) {
        System.out.println("System environment: \n" +System.getenv());
        System.out.println("System properties: \n" +System.getProperties());
    }
}
