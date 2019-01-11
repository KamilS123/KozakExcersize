package com_kamil_excersize.misztal_edu_pl.spotkanie_9.grupa_rozszerzona.zadanie_4;

public class Wyjatki {
    public static void main(String[] args) {
        int licznik = 10;

        try {
            for (int mianownik = 10; mianownik <= 10; mianownik--) {
                System.out.println("Podzielę " + licznik + " przez " + mianownik);
                System.out.println("Wynik " + licznik / mianownik);
            }
        }catch (ArithmeticException e) {
            System.out.println("Pamietaj nie dziel przz zero");
        }finally {
            System.out.println("Mimo dzielenia przez zero nie wykrzaczył sie");
        }
        System.out.println("Kończe");
    }
}
/*Zadanie 4

Uruchom poniższy program, co zaobserwowałeś(-aś).*/