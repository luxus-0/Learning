package com.w3resource.basic;

/*
* Write a Java program to find the largest element between first, last,
* and middle values from an array of integers (even length)
Sample Output:

Original Array: [20, 30, 40, 50, 67]
Largest element between first, last, and middle values: 67
* */

public class Exercise82 {

    static int[] array = {20, 100, 40, 50, 67};
    public static int printLargestElement() {

        int max_val = array[0];
        if(max_val <= array[array.length-1])
            max_val = array[array.length-1];
        if(max_val <= array[array.length/2])
            max_val = array[array.length/2];

        return max_val;
    }

    public static int printLargestElement2() {
        int first = array[0];
        int middle = array[array.length / 2];
        int last = array[array.length - 1];

        return (first > middle && first > last ? first :
                middle > first && middle > last ? middle : last);
    }

    public static int printLargestElement3() {
        return Math.max(Math.max(array[0],array[array.length / 2]),array[array.length - 1]);
    }

    public static void main(String[] args) {

        int largestELement = printLargestElement();
        System.out.println(largestELement);

        int largestELement2 = printLargestElement2();
        System.out.println(largestELement2);

        int largestELement3 = printLargestElement3();
        System.out.println(largestELement3);


    }
}
