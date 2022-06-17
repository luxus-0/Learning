package Samouczek_programisty.Object_and_package;/*
    Utwórz klasę o nazwie Samouczek_programisty.Object_and_package.MyNumber, której jedyny konstruktor przyjmuje liczbę. Klasa powinna mieć następujące metody
    isOdd() – true jeśli atrybut jest nieparzysty,
    isEven() – true jeśli atrybut jest parzysty,
    sqrt() – pierwiastek z atrybutu,
    pow(Samouczek_programisty.Object_and_package.MyNumber x) – atrybut podniesiony do potęgi x (przydatnej metody poszukaj w javadoc do klasy Math),
    add(Samouczek_programisty.Object_and_package.MyNumber x) – zwraca sumę atrybutu i x opakowaną w klasę Samouczek_programisty.Object_and_package.MyNumber,
    subtract(Samouczek_programisty.Object_and_package.MyNumber x) – zwraca różnicę atrybutu i x opakowaną w klasę Samouczek_programisty.Object_and_package.MyNumber.
*/

public class MyNumber {
    static int nr;

    public MyNumber(int number) {
        nr = number;
    }

    static boolean isOdd() {
        return nr % 2 != 0;
    }

    static boolean isEven() {
        return nr % 2 == 0;
    }

    static double sqrt() {
        return Math.sqrt(nr);
    }

    static double add(double x){
        return x + x;
    }

    static double substract(double x){
        return nr - x;
    }

    public static void main(String[] args) {
        System.out.println("Odd number: ");
        boolean oddNumber = isOdd();
        System.out.println(oddNumber);

        System.out.println("Even number: ");
        boolean evenNumber = isEven();
        System.out.println(evenNumber);

        System.out.println("Sqrt of number");
        double sqrt = sqrt();
        System.out.println(sqrt);

        System.out.println("Samouczek_programisty.Methods.Power of number");
        double power = Math.pow(nr, 3);
        System.out.println(power);

        System.out.println("Add numbers");
        double addNumber = add(nr);
        System.out.println(addNumber);

        System.out.println("Substract number");
        int x = 12;
        double substract = substract(x);
        System.out.println(substract);
    }
}
