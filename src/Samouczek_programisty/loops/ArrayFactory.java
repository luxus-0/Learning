package Samouczek_programisty.loops;

/*
Napisz klasę ArrayFactory, która w konstruktorze pobierze liczbę całkowitą X.
Klasa powinna mieć 2 metody:
    int[] oneDimension – zwróci instancję tablicy jednowymiarowej o długości X,
    int[][] twoDimension – zwróci instację tablicy dwuwymiarowej gdzie liczba wierszy i
    liczba kolumn równa się X,
* */

public class ArrayFactory {

    private final int size;

    public ArrayFactory(int size) {
        this.size = size;
    }

    public int[] getOneDimension() {
        return new int[size];
    }

    public int[][] getTwoDimension() {
        int[][] array = new int[size][];
        for (int i = 0; i < size; i++) {
            array[i] = new int[size];
        }
        return array;
    }

    public int[][] getTwoDimensionVersion2() {
        return new int[size][size];
    }

    public static void main(String[] args) {
        ArrayFactory arrayFactory = new ArrayFactory(34);
        arrayFactory.getOneDimension();
        arrayFactory.getTwoDimension();
        arrayFactory.getTwoDimensionVersion2();
    }
}
