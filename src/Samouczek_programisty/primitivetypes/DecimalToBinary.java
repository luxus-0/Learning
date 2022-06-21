package Samouczek_programisty.primitivetypes;

import java.util.Scanner;

public class DecimalToBinary {

    private final static Scanner sc = new Scanner(System.in);

    public static int getInt() {
        System.out.println("Get number");
        return sc.nextInt();
    }

    public static void getDecimalToBinary(int number) {

        int[] arr = new int[800];
        int index = 0;
        while (number > 0) {
            arr[index] = number % 2;
            number = number / 2;
            index++;
        }

        //print binary array in reverse order
        for (int j = index - 1; j >= 0; j--) {
            System.out.print(arr[j]);
        }
    }

    public static void convertFromDecimalToBinary() {
        int number = getInt();
        getDecimalToBinary(number);
    }

    public static void main(String[] args) {
       convertFromDecimalToBinary();
    }
}
