package com_kamil_excersize.zadania_7.lista;

import java.util.Arrays;

public class Lista {

    private int pojemnosc;  //maks liczba elementów
    private int[] liczby;  //przechowuje liczby
    private int rozmiar;  //aktalny rozmiar


    public Lista(int pojemnosc) {
        this.pojemnosc = pojemnosc;
        this.liczby = new int[pojemnosc];
    }

    public void dodajElement(int dodanaLiczba) {
            for (int i = 0; i < pojemnosc; i++) {
                if (liczby[i] == 0) {
                    liczby[i] = dodanaLiczba;
                    break;
                }
            }
    }

    public Integer find(int number) {
        Integer positionOfNumber = 0;
        for(int i = 0; i<liczby.length; i++) {
            if (liczby[i]==number) {
                positionOfNumber = i;
            }
        }
        return positionOfNumber;
    }

    public String pisz() {
        String details = "dlugosc -> " + liczby.length + " pojemnosc -> " + pojemnosc + " przechowywane elementy -> " + Arrays.toString(liczby);
        return details;
    }

    public void removeFirst(int number) {
        for(int i = 0; i<liczby.length; i++) {
            if (liczby[i]==number) {
                liczby[i] = 0;
            }
        }
    }

    public String odwroc() {
        String liczbyStr = String.valueOf(liczby);
        StringBuilder stringBuilder = new StringBuilder(liczbyStr).reverse();
        String textReversed = String.valueOf(stringBuilder);
        return textReversed;
    }
}
