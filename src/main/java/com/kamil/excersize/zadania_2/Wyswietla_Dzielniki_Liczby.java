package com.kamil.excersize.zadania_2;

import java.util.Scanner;

public class Wyswietla_Dzielniki_Liczby {
    public static void main(String[] args) {
        wyswietlDzielniki();
    }
    private static void wyswietlDzielniki() {
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj liczbe: ");
        Integer liczba = in.nextInt();

        for(int i = 1; i<=liczba; i++) {
            if(liczba%i == 0) {
                System.out.println(i);
            }
        }
    }
}
/*Napisać program, dla podanej liczby całkowitej wyświetla jej dzielniki. Przykładowo,
dla liczby 21 dzielniki to: 1, 3, 7, 21.*/