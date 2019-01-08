package com_kamil_excersize.misztal_edu_pl.spotkanie_8.grupa_podstawowa;

import java.util.Scanner;

public class Pole_Prostokata {
    public static void main(String[] args) {
        System.out.println(poleProstokata());
    }
    private static Integer poleProstokata() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj bok a");
        Integer a = scanner.nextInt();
        System.out.println("Podaj bok b");
        Integer b = scanner.nextInt();

        return a*b;
    }
}
/*Zadanie 1. Proszę napisać program, który wyznaczy pole prostokąta. Wartości boków a i b wprowadzamy z klawiatury.
 W programie należy przyjąć, ze zmienne a, b oraz pole są typu double.
Cel: klasa Scanner */