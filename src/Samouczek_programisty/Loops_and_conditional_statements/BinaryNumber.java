package Samouczek_programisty.Loops_and_conditional_statements;

/*
    Utwórz metodę, która pobierze liczbę oraz zwróci ją w formie binarnej
    (2 => “10”, 4 => “100”, 5 => “101”, itd.)
*/

class BinaryNumber {

    public static String convertFromDecimalToBinary(int number) {
        return Integer.toBinaryString(number);
    }

    public static void main(String[] args) {
        String convertToBinary = convertFromDecimalToBinary(23);
        System.out.println(convertToBinary);
    }

}
