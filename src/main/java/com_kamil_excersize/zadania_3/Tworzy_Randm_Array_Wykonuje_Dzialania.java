package com_kamil_excersize.zadania_3;

import java.util.Arrays;

public class Tworzy_Randm_Array_Wykonuje_Dzialania {
    public static void main(String[] args) {
        createArray();
    }
    private static void createArray() {
        Integer[]arr = new Integer[10];
        int suma = 0;

        for(int i = 0; i < arr.length; i++) {
            Integer randomNumber = (int)(Math.random()*20)-10;
            arr[i] = randomNumber;

            suma = suma + arr[i];
        }
        int max = arr[0];
        int min = arr[0];

        int srednia = suma/arr.length;
        int liczbaMniejszychOdSredniej = 0;
        int liczbaWiekszychOdSredniej = 0;

        for(Integer i : arr) {

            if(i>max) {
                max = i;
            }else if(i<min) {
                min = i;
            }
        }
        StringBuilder stringBuilder = new StringBuilder(Arrays.toString(arr));
        stringBuilder.reverse();

        System.out.println("Tablica wypełniona losowymi wartościami: " + Arrays.toString(arr) + "\nmax-> " + max +
                "\nmin-> " + min + "\nsuma-> " + suma + "\nsrednia-> " + srednia + "\nreversed array-> " + stringBuilder);
    }
}
/*Napisać program, który:
• utworzy tablicę 10 liczb całkowitych i wypełni ją wartościami losowymi z
przedziału [−10, . . . , 10],
• wypisze na ekranie zawartość tablicy,
• wyznaczy najmniejszy oraz najwięszy element w tablicy,
• wyznaczy średnią arytmetyczną elementów tablicy,
• wyznaczy ile elementów jest mniejszych, ile większych od średniej.
• wypisze na ekranie zawartość tablicy w odwrotnej kolejności, tj. od ostatniego
do pierwszego.
Wszystkie wyznaczone wartości powinny zostać wyświetlone na ekranie.
Wylosowane liczby:
-3 9 2 -10 -3 -4 -1 -5 -10 8
Min: -10, max: 9
Średnia: -1,00
Mniejszych od śr.: 6
Większych od śr.: 3
Liczby w odwrotnej kolejności:
8 -10 -5 -1 -4 -3 -10 2 9 -3*/