//Napisz metodę, która jako argument przyjmuje 2 liczby i wypisuje ich sumę, różnicę i iloczyn

import java.util.Scanner;

public class SumSubstractMultiplyTwoNumbers {

    static int x;
    static int y;

    public static void readSum() {
        System.out.println("Sum");
        x = getFirstNumber();
        y = getSecondNumber();

        int sum = x + y;
        System.out.println(x +" + "+ y + " = " +sum);
    }

    public static void readSubstract() {
        System.out.println("\nSubstract");
        x = getFirstNumber();
        y = getSecondNumber();

        int substract = x - y;
        System.out.println(x + " - " + y + " = " +substract);
    }

    public static void readMultiply() {
        System.out.println("\nMultiply");
        x = getFirstNumber();
        y = getSecondNumber();

        int multiply = x * y;
        System.out.println(x + " * " + y + " = " +multiply);
    }

    private static int getFirstNumber() {
        System.out.println("Get x");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    private static int getSecondNumber() {
        System.out.println("Get y");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static void main(String[] args) {
        readSum();
        readSubstract();
        readMultiply();
    }
}
