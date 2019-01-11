package com_kamil_excersize.misztal_edu_pl.spotkanie_9.grupa_podstawowa;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pobiera_Wyswietla_Pierwiastek {
    public static void main(String[] args) throws Exception {

        System.out.println(countSqrt());
    }

    private static Double countSqrt() throws Exception {
        Scanner scanner = new Scanner(System.in);
        double n;
        double result = 0.0;
        try {
            n = scanner.nextDouble();

            if (n > 0) {
                result = Math.sqrt(n);
            } else {
                throw new IllegalArgumentException("podaleś ujemną liczbe");
            }
        }catch (InputMismatchException e) {
            System.out.println("zły typ danych");
        }

        return result;
    }
}
/*Zadanie 7

Napisz program, który pobierze od użytkownika liczbę i wyświetli jej pierwiastek. Do obliczenia pierwiastka możesz użyć
 istniejącej metody java.lang.Math.sqrt(). Jeśli użytkownik poda liczbę ujemną rzuć wyjątek
 java.lang.IllegalArgumentException.
Obsłuż sytuację, w której użytkownik poda ciąg znaków, który nie jest liczbą.
Zobacz http://javastart.pl/static/category/wyjatki/.*/