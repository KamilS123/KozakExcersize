package com_kamil_excersize.zadanie_5;

import java.util.Arrays;

public class Podziel_Na_Slowa {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(podzielNaSlowa("co to do diabła jest")));
    }
    private static String[] podzielNaSlowa(String text) {
        String[]separetedText = text.split(" ");
        return separetedText;
    }
}
/* Napisać funkcję String[] podzielNaSlowa(String tekst) , która dzieli podany
tekst na słowa i zapisuje je w tablicy. Wynikiem funkcji jest tablica zawierające
kolejno słowa z tekstu. Za słowo przyjmujemy każdy ciąg znaków niezawierający
białego znaku.*/