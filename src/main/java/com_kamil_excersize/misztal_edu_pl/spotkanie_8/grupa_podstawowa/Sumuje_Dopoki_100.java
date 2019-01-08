package com_kamil_excersize.misztal_edu_pl.spotkanie_8.grupa_podstawowa;

import java.util.Scanner;

public class Sumuje_Dopoki_100 {
    public static void main(String[] args) {
        System.out.println(sumujDo100());
    }
    private static Integer sumujDo100() {
        Scanner scanner = new Scanner(System.in);
        Integer suma = 0;
        System.out.println("Podaj liczbe");
        Integer number;
        do {
            number = scanner.nextInt();
            suma = suma + number;
        }while (suma<100);
        return suma;
    }
}
/*Zadanie 4. Napisz program, który wczytuje liczby od użytkownika dopóki ich suma nie przekoczy 100.
Cel: pętle */