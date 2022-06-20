package Samouczek_programisty.methods;/*
    Napisz metodę, która jako argument przyjmie trzy liczby. Metoda powinna zwrócić true jeśli z odcinków
    o długości przekazanych w argumentach można zbudować trójkąt prostokątny
*/

public class RightAngleTriangle {

    public static boolean isRightTriangle(int number1, int number2, int number3){
        if(number1 > 0 && number2 > 0 && number3 > 0) {
            int sideATriangle = number1 * number1;
            int sideBTriangle = number2 * number2;
            int sideCTriangle = number3 * number3;

            return sideATriangle == sideBTriangle + sideCTriangle || sideBTriangle == sideATriangle + sideCTriangle || sideCTriangle == sideATriangle + sideBTriangle;
        }
        return false;
    }

    public static void main(String[] args) {
        boolean right_triangle = isRightTriangle(5, 12, 13);
        System.out.print("Right triangle - ");
        System.out.print(right_triangle);
    }
}
