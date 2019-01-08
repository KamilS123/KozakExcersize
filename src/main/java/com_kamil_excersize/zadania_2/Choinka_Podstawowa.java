package com_kamil_excersize.zadania_2;


import java.util.Scanner;

public class Choinka_Podstawowa {
    public static void main(String[] args) {
        rysujChoinke();
    }
    private static void rysujChoinke() {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj wysokośc choinki ");
        Integer height = in.nextInt();                          //do poprawy
        char znak = '*';
        for(int i = 0; i<height; i++) {
            System.out.println(znak);

        }
    }
}
/*Napisać program rysujący w konsoli „choinkę” złożoną ze znaków gwiazdki (*).
Użytkownik programu powinien podać liczbę całkowitą n, n > 0, określającą
wysokość choinki (liczbę wierszy).
Przykład: dla n = 5 wynik powinien wyglądać następująco:
*
***
*****
*******
**********/