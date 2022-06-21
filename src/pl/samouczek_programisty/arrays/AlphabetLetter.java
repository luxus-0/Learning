package pl.samouczek_programisty.arrays;
/*
    1.Napisz metodę, która zwróci tablicę String[] zawierającą pierwsze 5 liter alfabetu
    2.Napisz metodę pobierającą trójelementową tablicę liczb, która zwróci tablicę zawierającą te same elementy w odwróconej kolejności
*/

import java.util.Arrays;

public class AlphabetLetter {

    public static void main(String[] args) {
        String[] letterAlphabet = getFiveAlphabetLetter();
        System.out.println(Arrays.toString(letterAlphabet));

        double[] revertArray = revert(new double[]{1, 2, 3});
        System.out.println(Arrays.toString(revertArray));
    }

    private static String[] getFiveAlphabetLetter() {
        return new String[] {"a", "ą", "b", "c", "ć"};
    }

    private static double[] revert(double[] array) {
        return new double[] {array[2], array[1], array[0]};
    }
}

