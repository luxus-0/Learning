package Methods;/*
    Utwórz klasę o nazwie Methods.MyNumber, której jedyny konstruktor przyjmuje liczbę. Klasa powinna mieć następujące metody
    Methods.MyNumber isOdd() – true jeśli atrybut jest nieparzysty,
    Methods.MyNumber isEven() – true jeśli atrybut jest parzysty,
    Methods.MyNumber sqrt() – pierwiastek z atrybutu,
    Methods.MyNumber pow(Methods.MyNumber x) – atrybut podniesiony do potęgi x (przydatnej metody poszukaj w javadoc do klasy Math),
    Methods.MyNumber add(Methods.MyNumber x) – zwraca sumę atrybutu i x opakowaną w klasę Methods.MyNumber,
    Methods.MyNumber subtract(Methods.MyNumber x) – zwraca różnicę atrybutu i x opakowaną w klasę Methods.MyNumber.
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

        System.out.println("Methods.Power of number");
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
