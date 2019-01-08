package com_kamil_excersize.misztal_edu_pl.spotkanie_7.grupa_zaawansowana.zadania_9;

public class Main {
    public static void main(String[] args) {
        //utworzenie nowych obiektw klas
        Punkt3D punkt3D = new Punkt3D(2,4,7);
        Punkt2D punkt2D = new Punkt2D(2,4);

        System.out.println(punkt3D.toString());
        System.out.println(punkt2D.toString());

//        Punkt2D punkt2D1 = new Punkt3D(2,3,4);
        System.out.println(punkt2D.wyliczOdleglosc());

    }
}
/*Zadanie 9. (Dziedziczenie) Stwórz klasę Punkt2D, która przechowuje informacje na temat punktu na przestrzeni
 dwuwymiarowej (współrzędne x oraz y). Zawierająca dwa konstruktory: bezparametrowy ustawiający pola na wartość 0,
  oraz przyjmujący dwa argumenty i ustawiający pola obiektu zgodnie z podanymi parametrami. Napisz klasę Punkt3D
  dziedziczącą po Punkt2D, reprezentującą punkt w trójwymiarze (dodatkowe pole z). W klasie testowej utwórz obiekty
  obu klas i przetestuj działanie.*/