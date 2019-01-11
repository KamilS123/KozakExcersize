package com_kamil_excersize.misztal_edu_pl.spotkanie_9.grupa_rozszerzona.zadanie_4;

public class Wyjatek_Dzielenie {
    public static void main(String[] args) {
        try{
            dziel();
        }catch (ArithmeticException e) {
            System.out.println("Wyjatek:---: " + e);
        }finally {
            System.out.println("Dzieliłeś przez zero");
        }
    }
    public static void dziel() {
        int licznik = 10;
        for (int mianownik = 10; mianownik <= 10; mianownik--) {
            System.out.println(" Podzielę " + licznik + " przez " + mianownik);
            System.out.println(" Wynik: " + licznik / mianownik);

        }
    }
}
