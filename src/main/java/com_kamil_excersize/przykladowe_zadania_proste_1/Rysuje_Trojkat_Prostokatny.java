package com_kamil_excersize.przykladowe_zadania_proste_1;

import java.util.Scanner;

public class Rysuje_Trojkat_Prostokatny {
    public static void main(String[] args) {
        rysujTrojkat();
    }
    private static void rysujTrojkat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wysokość boku: ");
        Integer wysokosc = scanner.nextInt();
        System.out.println("Podaj symbol rysowania: ");
        String symbol = scanner.next();

        for(int i = 0; i<wysokosc; i++) {
            for (int j = 0; j<i; j++) {
                System.out.print(symbol);
            }
            System.out.println(" ");
        }
    }
}
/*Napisać program wczytujący od użytkownika liczbę x i rysujący na ekranie (przy pomocy znaku 'o')
trójkąt prostokątny, w którym obydwie przyprostokątne są długości x.
Przykład:
x=4
 o
 o o
 o o o
 o o o o */