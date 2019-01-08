package com_kamil_excersize.misztal_edu_pl.spotkanie_6;

public class Wypisz_Elementy_Tablicy {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        wypisz(arr);
        maxMin(arr);
    }

    private static void wypisz(int[] arr) {
        for (Integer i : arr) {
            System.out.println(i);
        }
    }
//wyznacza min i max
    private static void maxMin(int[]arr) {
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i<arr.length; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }else if(arr[i]<min) {
                min = arr[i];
            }
        }
        System.out.println("min: " + min + " max " + max);
    }
}
/*Zadanie 1
Napisz funkcję wypisująca elemety tablicy.*/
/*Zadanie 3
Przygotuj funkcję wyznaczającą maksimum i minimum z tablicy.*/