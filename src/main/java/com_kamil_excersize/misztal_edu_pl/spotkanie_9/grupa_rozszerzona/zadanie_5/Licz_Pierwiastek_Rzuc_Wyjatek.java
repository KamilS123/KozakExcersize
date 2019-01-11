package com_kamil_excersize.misztal_edu_pl.spotkanie_9.grupa_rozszerzona.zadanie_5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Licz_Pierwiastek_Rzuc_Wyjatek {
    public static void main(String[] args) {

        System.out.println(liczSqrt());
       }

    private static double liczSqrt() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        double sqrt = 0;
           try {
               Integer liczba = scanner.nextInt();
               sqrt = Math.sqrt(liczba);
               if(liczba<0) {
                   throw new IllegalArgumentException("ujemną podałeś");
               }
           }catch (InputMismatchException e) {
               System.out.println("Złapałem InputMismatchException " + e);
           }

        return sqrt;
    }
}
/*Napisz program, który pobierze od użytkownika liczbę i wyświetli jej pierwiastek.
 Do obliczenia pierwiastka możesz użyć istniejącej metody java.lang.Math.sqrt().
 Jeśli użytkownik poda liczbę ujemną rzuć wyjątek java.lang.IllegalArgumentException
 . Obsłuż sytuację, w której użytkownik poda ciąg znaków, który nie jest liczbą.
 Zobacz http://javastart.pl/static/category/wyjatki/.*/