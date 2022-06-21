package pl.samouczek_programisty.loops;

/*
    Utwórz metodę, pobierającą łańcuch znaków, która sprawdzi czy jest on palindromem.
    Np. “kajak” jest palindromem (to samo czytane “od przodu i od tyłu”) jednak “kotek” już nie.
    Może przydać Ci się metoda String#toCharArray
*/

public class Palindrom {

    public static void getPalindrom(String str) {
        char[] palindromArray = str.toCharArray();
        StringBuilder temp = new StringBuilder();
        for (char c : palindromArray) {
            if (Character.isAlphabetic(c) || Character.isDigit(c)) {
                temp.append(c);
            }
        }
        System.out.println(
                temp.toString().
                        equalsIgnoreCase(
                                temp.reverse().toString()
                        ));
    }

    public static boolean isPalindrom(String palindrom) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int index = 0; index < palindrom.length(); index++) {
            char characterPalindrom = palindrom.charAt(index);
            if (Character.isDigit(characterPalindrom) || Character.isAlphabetic(characterPalindrom)) {
                stringBuilder.append(characterPalindrom);
            }
        }
        return palindrom
                .equalsIgnoreCase(
                        stringBuilder.reverse().toString()
                );
    }

    public static void main(String[] args) {
        System.out.println("Is palindrom 'kajak' ?");
        getPalindrom("kajak");

        System.out.println("-------------------");

        System.out.println("Is palindrom 'kotek' ?");
        boolean checkPalindrom = isPalindrom("kotek");
        System.out.println(checkPalindrom);
    }
}
