package Samouczek_programisty.Loops_and_conditional_statements;

/*
    Utwórz metodę, która pobierze liczbę oraz zwróci ją w formie binarnej
    (2 => “10”, 4 => “100”, 5 => “101”, itd.)
*/

class BinaryNumber {

    //short version
    public static String convertFromDecimalToBinary(int number) {
        return Integer.toBinaryString(number);
    }

    //array version
    public static void getDecimalToBinary(int number) {

        int[] binaryArray = new int[1000];
        int i = 0;
        while(number > 0) {
            binaryArray[i] = number % 2;
            number = number / 2;
            i++;
        }

        //print binary array in reverse order
        for(int j = i - 1; j >= 0; j--) {
            System.out.print(binaryArray[j]);
        }
    }

    public static void main(String[] args) {

        //version 1
        String convertToBinary = convertFromDecimalToBinary(23);
        System.out.println(convertToBinary);

        //version 2
        getDecimalToBinary(23);
    }

}
