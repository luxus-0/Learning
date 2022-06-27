package com.w3resource.basic;

/*
 * Write program to create new String of 4 copies the last 3 characters of the original String.The lenght of the original
 * string must be 3 and above.
 * */
public class Exercise68 {

    private static void print4CopiesLast3CharactersInString() {
        String str = "this is luk";
        String last3Charactes = str.substring(str.length() - 3);
        System.out.println(last3Charactes + " " + last3Charactes + " " + last3Charactes + " " + last3Charactes);
    }

    private static void print4CopiesLast3CharacterInString() {
        String str = "Madera is GOOD";

        for (int i = 1; i <= 4; i++) {
            System.out.print(str.charAt(str.length() - 3) + "" + str.charAt(str.length() - 2) + "" + str.charAt(str.length() - 1) + " ");
        }
    }


    public static void main(String[] args) {
        print4CopiesLast3CharactersInString();

        print4CopiesLast3CharacterInString();
    }
}
