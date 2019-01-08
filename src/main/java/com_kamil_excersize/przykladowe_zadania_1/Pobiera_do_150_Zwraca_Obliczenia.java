package com_kamil_excersize.przykladowe_zadania_1;

import java.util.Arrays;
import java.util.Scanner;

public class Pobiera_do_150_Zwraca_Obliczenia {
    public static void main(String[] args) {
        zwrocStatystyki();
    }

    private static void zwrocStatystyki() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podajwa liczby");
        Integer number;
        Integer suma = -150;
        Integer srednia = 0;
        Integer podzielnePrzez3 = 0;

        do {
            number = scanner.nextInt();
            Integer[] arrnNumber = {number};
            for (Integer i : arrnNumber) {
                suma += i;

                if(i%3==0 && i!=150) {
                    podzielnePrzez3++;
                }
            }
        } while (number != 150);

        System.out.println("suma -> " + (suma) + "\npodzielne przez 3 -> " + podzielnePrzez3);
    }
}
    /*Napisać program, który wczytuje od użytkownika liczby, do momentu aż zostanie podana liczba 150.
        Po zakończeniu działania programu wyświetlona zostaje informacja o sumie oraz średniej z wszystkich
        podanych liczb (poza 150) oraz jak wiele podanych zostało liczb dodatnich, podzielnych przez 3.
        Przykład:
        4 2 3 6 1 6 1 0
        Wynik:
        7 1 2 */