package Samouczek_programisty.loops;

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
        while (number > 0) {
            binaryArray[i] = number % 2;
            number = number / 2;
            i++;
        }

        //print binary array in reverse order
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binaryArray[j]);
        }
    }

    //used Math.pow without Array
    public static int getDecToBinary(int number) {

        int binaryNumber = 0;
        int power = 0;
        while (number != 0) {
            int mod = number % 2;
            double c = Math.pow(10, power);
            binaryNumber += mod * c;
            number /= 2;
            power++;
        }
        return binaryNumber;
    }

    public static void main(String[] args) {

        System.out.println("Version 1");
        String convertToBinary = convertFromDecimalToBinary(23);
        System.out.println(convertToBinary);
        System.out.println();

        System.out.println("Version 2");
        getDecimalToBinary(23);
        System.out.println("\n-------");

        System.out.println("Version 3");
        int decimalToBinary = getDecToBinary(23);
        System.out.println(decimalToBinary);
    }

}
