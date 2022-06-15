/*
    Napisz metodę, która jako argument przyjmuje liczbę i zwraca jej pierwiastek kwadratowy
*/

public class Square {
    public static int square(int number) {
        return (int) Math.sqrt(number);
    }

    public static void main(String[] args) {
        int sqrt = square(4);
        System.out.println(sqrt);
    }
}
