package Samouczek_programisty.loops;

/*
 * Napisz metodę, która pobierze tablicę liczb całkowitych i wyświetli ją w postaci
 * “[liczba, liczba, liczba]”
 * */

class IntegerArray {

    public static void printArray(int number1, int number2, int number3) {
        if (number1 > 0 && number2 > 0 && number3 > 0) {

            int[] array = new int[]{number1, number2, number3};
            System.out.print("[");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);
                System.out.print(", ");
            }
            System.out.println("]");
        }
    }

    public static void main(String[] args) {
        printArray(1, 2, 3);
    }
}
