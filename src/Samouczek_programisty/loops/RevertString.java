package Samouczek_programisty.loops;

/*
Utwórz metodę, która jako argument pobierze obiekt klasy String i zwróci “odwrócony” argument.
Na przykład “pies” przekształci w “seip”,
* */

public class RevertString {

    public static void getRevertString(String str) {
        char[] characterArray = str.toCharArray();

        for(int index = characterArray.length - 1; index >= 0; index--) {
            System.out.print(characterArray[index]);
        }
    }

    public static String getRevertStringVersion2(String str) {
        StringBuilder stringBuilder = new StringBuilder(str).reverse();
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        getRevertString("pies");
        String revertString = getRevertStringVersion2("piesek");
        System.out.println("\n"+revertString);
    }
}
