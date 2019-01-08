package com_kamil_excersize.przykladowe_zadania_proste_1;


import java.util.Arrays;

public class Wyznacza_Druga_Najwieksza_Liczbe {
    public static void main(String[] args) {
        String string = "123442219664123";
        wyznaczDrugaNajwieksza(string);
    }
    private static void wyznaczDrugaNajwieksza(String string) {
        String newStr = string.substring(0,string.length()-3);

        String[]str = newStr.split("");
        int[]arrInt = new int[str.length];

        for(int i = 0; i<str.length; i++) {
            arrInt[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(arrInt);

        System.out.println("ciag bez 123 na końcu: " + newStr + "\nnajwieksza liczba w ciagu: " + arrInt[arrInt.length-1]);
    }
}
/* Napisać program, który nie używając tablic wyznacza drugą co do wielkości (lub przedostatnią) liczbę
w ciągu. Ciąg zakończony jest liczbą 123, która nie jest brana pod uwagę w obliczeniach. */