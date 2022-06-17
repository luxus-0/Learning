package Samouczek_programisty.Loops_and_conditional_statements;

/*
    1.Utwórz metodę pobierającą dodatnią liczbę całkowitą X, która wyświetli na ekranie liczby od zera do X,
    2.Jeśli w zadaniu 1. użyłeś pętli for przerób tę metodę na while (lub odwrotnie),
* */

public class PositiveInteger {
    public static void main(String[] args) {
        getNumberFrom0ToN(10);
        getNumberFrom0ToNWhileLoop(20);
    }

    private static void getNumberFrom0ToN(int X) {
        for (int index = 0; index <= X; index++) {
            System.out.println(index);
        }
    }

    private static void getNumberFrom0ToNWhileLoop(int X) {
        int index = 0;
        while (index <= X) {
            System.out.println(index);
        }
    }
}