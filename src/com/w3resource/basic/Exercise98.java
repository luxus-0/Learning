package com.w3resource.basic;

/*
* Write a Java program to check if the value 20 appears three times and no 20’s
*  are next to each other in a given array of integers.
* */

public class Exercise98 {

    public static void main(String[] args) {
        int[] array_nums = {10, 20, 10, 20, 40, 13, 20};
        boolean checkAppearsNumber = false;
        int count = 0, result =0;

        if(array_nums.length >= 1 && array_nums[0] == 20)
            count++;

        for(int i = 1; i < array_nums.length; i++) {
            if(array_nums[i - 1] == 20 && array_nums[i] == 20)
            {
                System.out.print(false);
                result = 1;
            }
            if(array_nums[i] == 20)
                count++;
        }

        if (result==0)
        {
            System.out.print(count == 3);
        }
        System.out.print("\n");
    }
}