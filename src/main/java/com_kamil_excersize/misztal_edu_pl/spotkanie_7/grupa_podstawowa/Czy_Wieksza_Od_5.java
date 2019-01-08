package com_kamil_excersize.misztal_edu_pl.spotkanie_7.grupa_podstawowa;

import java.util.Scanner;

public class Czy_Wieksza_Od_5 {
    public static void main(String[] args) {
        System.out.println(isGraterThan(10));
        System.out.println(isGrater());
    }
    private static Boolean isGraterThan(Integer number) {
        Boolean result = false;
        if (number>5) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
    private static Boolean isGrater() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        Integer number = scanner.nextInt();

        Boolean result = false;
        if (number>5) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

}
/*Zadanie 1. Proszę przygotować program który sprawdzi czy liczba jest większa od 5. Liczbę proszę:

wczytać ze zmiennej,
wczytać od użytkownika wykorzstując klasę Scanner.*/