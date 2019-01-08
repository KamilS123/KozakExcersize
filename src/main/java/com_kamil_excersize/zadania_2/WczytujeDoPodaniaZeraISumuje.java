package com_kamil_excersize.zadania_2;

import java.util.Arrays;
import java.util.Scanner;

public class WczytujeDoPodaniaZeraISumuje {
    public static void main(String[] args) {
        readToZero();
    }
    public static void readToZero() {
        Scanner in = new Scanner(System.in);
        System.out.println("Podawaj liczby (0) kończy i sumuje: ");
        Integer liczba;
        Integer suma = 0;

        do {
            liczba = in.nextInt();
            suma = suma + liczba;
        }
        while(liczba!=0);
        System.out.println("suma liczb wynosi -> " + suma);
    }
}
/*Napisać program, który wczytuje liczby podawane przez użytkownika dotąd, dopóki
nie podana zostanie liczba 0. Następnie wyświetlić sumę wszystkich podanych
liczb.
*/