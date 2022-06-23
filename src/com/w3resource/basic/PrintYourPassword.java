package com.w3resource.basic;

/*
* Write a Java program to input and display your password
* Expected Output
Input your Password:
Your password was: abc@123
* */

import java.io.Console;
import java.util.Arrays;

class PrintYourPassword {

    private static void printPassword() {

        Console console;
        if ((console = System.console()) != null) {
            char[] password = null;
            try {
                password = console.readPassword("Input password");
                System.out.println("Your password was: " + Arrays.toString(password));
            } finally {
                if (password != null) {
                    Arrays.fill(password, ' ');
                }
            }

        } else {
                throw new RuntimeException("Can't get password...No console");
            }
        }

    public static void main(String[] args) {
        printPassword();
    }
}
