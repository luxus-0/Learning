/*
    Utwórz klasę reprezentującą prostokąt, musi posiadać atrybuty długość i szerokość.
    Klasa powinna posiadać metody obliczające pole, obwód i długość przekątnej
*/

class Circuit_Field_DiagonalLength_Rectangle_v2 {

    private final static double length = 3;
    private final static double weight = 7;

    //pole prostokąta
    static double calculateFieldRectangle(){
        return length * weight;
    }

    //obwód prostokąta
    static double calculateCircuitRectangle(){
        return (2 * length) + (2 * weight);
    }

    //długość przekątnej prostokąta
    static double calculateDiagonalLengthRectangle(){
        return Math.sqrt((length * length) + (weight * weight));
    }

    public static void main(String[] args) {

        System.out.println("Field rectangle");
        double fieldRectangle = calculateFieldRectangle();

        System.out.println(fieldRectangle);System.out.println("Circuit rectangle");
        double circuitRectangle = calculateCircuitRectangle();
        System.out.println(circuitRectangle);

        System.out.println("Diagonal length rectangle");
        double diagonalLengthRectangle = calculateDiagonalLengthRectangle();
        System.out.println(diagonalLengthRectangle);

    }
}