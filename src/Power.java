/*
    Napisz metodę, która jako argument przyjmuje liczbę i zwraca go podniesionego do 3 potęgi
*/

public class Power {
    public static int power(int number) {
        return (int) Math.pow(number, 3);
    }

    public static void main(String[] args) {
        int powerOfNumber = power(7);
        System.out.println(powerOfNumber);
    }
}
