package com_kamil_excersize.misztal_edu_pl.spotkanie_8.grupa_podstawowa;

public class Zwraca_Indeks_Elementu {
    public static void main(String[] args) {
        int[]arr = new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println(returnIndex(arr,4));
    }

    private static Integer returnIndex(int[]arr, int indeks) {
        Integer position = 0;
        for(int i = 0; i<arr.length; i++) {
            if (i==indeks) {
                position = arr[i];
            }
        }
        return position;
    }
}
/*Zadanie 3. Proszę napisać funkcję, która zwróci element z tablicy o wskazanym indeksie.
Proszę przygotowac funkcje obsługujące tablice przechowujące zarówno double jak i int.
Pytanie: jak bardzo ogólna może być taka funkcja?
Cel: tablice jako arbumenty funkcji.*/