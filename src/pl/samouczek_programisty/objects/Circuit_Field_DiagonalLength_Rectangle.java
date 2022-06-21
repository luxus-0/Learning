package pl.samouczek_programisty.objects;/*
    Utwórz klasę reprezentującą prostokąt, musi posiadać atrybuty długość i szerokość.
    Klasa powinna posiadać metody obliczające pole, obwód i długość przekątnej
*/

class Circuit_Field_DiagonalLength_Rectangle{

    //pole prostokąta
    static double calculateFieldRectangle(double length, double weight){
         return length * weight;
    }

    //obwód prostokąta
    static double calculateCircuitRectangle(double length, double weight){
        return (2 * length) + (2 * weight);
    }

    //długość przekątnej prostokąta
    static double calculateDiagonalLengthRectangle(double length, double weight){
        return Math.sqrt((length * length) + (weight * weight));
    }

    public static void main(String[] args) {
        int length = 3;
        int weight = 7;

        System.out.println("Field rectangle");
        double fieldRectangle = calculateFieldRectangle(length, weight);
        System.out.println(fieldRectangle);

        System.out.println("Circuit rectangle");
        double circuitRectangle = calculateCircuitRectangle(length, weight);
        System.out.println(circuitRectangle);

        System.out.println("Diagonal length rectangle");
        double diagonalLengthRectangle = calculateDiagonalLengthRectangle(length, weight);
        System.out.println(diagonalLengthRectangle);
    }
}
