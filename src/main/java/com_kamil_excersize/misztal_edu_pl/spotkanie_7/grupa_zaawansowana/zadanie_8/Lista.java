package com_kamil_excersize.misztal_edu_pl.spotkanie_7.grupa_zaawansowana.zadanie_8;

import java.util.Arrays;

public class Lista {
    private int[] liczby = new int[]{};        //lista liczb
    private int pojemnosc;   //maks liczba przechowywanych elementów
    private int rozmiar;     //aktualny rozmiar listy

    public Lista(int pojemnosc) {
        this.pojemnosc = pojemnosc;
    }

    //metoda dodje element do listy
    public void dodajElement(int number) {
        if (liczby.length < pojemnosc) {                         //do poprawy odrobine
            for (int i = 0; i < pojemnosc; i++) {
                if (liczby[i] == 0) {
                    liczby[i] = number;
                }
            }
        } else {
            System.out.println("przepełniona tablica");
        }
    }

    //metoda znajduje indeks szukanej liczby
    public void znajdz(Integer number) {
        for (int i = 0; i < liczby.length; i++) {
            if (liczby[i] == number) {
                System.out.println(i);
            }
        }
    }

    @Override
    public String toString() {
        return "Lista{" +
                "liczby=" + Arrays.toString(liczby) +
                ", pojemnosc=" + pojemnosc +
                ", rozmiar=" + rozmiar +
                '}';
    }
}
