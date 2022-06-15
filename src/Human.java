/*
   Utwórz klasę Human reprezentującą człowieka, musi posiadać atrybuty takie jak wiek, waga, wzrost, imię i płeć.
   Klasa powinna także zawierać metody getAge, getWeight, getHeight, getName, isMale
*/

class Human {
    private String name;
    private int age;
    private float wage;
    private double height;
    private boolean isMale;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getWage() {
        return wage;
    }

    public double getHeight() {
        return height;
    }

    public boolean isMale() {
        return isMale;
    }
}
