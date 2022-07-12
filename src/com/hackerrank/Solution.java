package com.hackerrank;

import java.util.Scanner;

public class Solution {

    public static void add(int...arr) //int args to reprresent multiple params as one
    {
        //if ending takes equals or take plus see output
        int sum =0;
        for(int i=0; i< arr.length;i++){
            sum = sum + arr[i];
            if(i ==arr.length-1)
            {
                System.out.print(arr[i] + "=");
            }
            else
            {
                System.out.print(arr[i] + "+");
            }
        }
        System.out.println(sum);

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[6];
        for(int i=0; i<arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        add(arr[0], arr[1]);
        add(arr[0], arr[1], arr[2]);
        add(arr[0], arr[1], arr[2], arr[3], arr[4]);
        add(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]);
    }
}