package com_kamil_excersize.zadanie_5;

import java.util.Scanner;

public class Silnia {
    public static void main(String[] args) {
        System.out.println(silnia());
    }
    private static Integer silnia() {
        Integer result = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        Integer number = scanner.nextInt();

        for (int i = 0; i<=number; i++) {
            result = result + i;
        }
        return result;
    }
}
/*Napisz funkcję, która zwraca wartość silni dla podanej liczby n. Funkcja powinna
być napisana w dwóch wersjach: iteracyjnej i rekurencyjnej.
*/