package Samouczek_programisty.Loops_and_conditional_statements;

/*
    Utwórz metodę, która pobierze liczbę i wypisze każdy znak w osobnej linii zaczynając
    od ostatniej cyfry (np. dla liczby 123 będą to trzy linie z 3, 2, 1)
* */

public class OperationOnNumber {

    public static void main(String[] args) {
        printCharacterInSeparateLine(2367);
        printCharacterInOneLine(2367);
    }

    //palindrome
    private static void printCharacterInSeparateLine(int number) {

        while (number > 0) {
            int revertNumber = number % 10;
            number /= 10;
            System.out.println(revertNumber);
        }
    }

        private static void printCharacterInOneLine(int number) {

            while (number > 0) {
                int revertNumber = number % 10;
                number /= 10;
                System.out.print(revertNumber);
            }
    }
}
