package com.kamil.excersize.przykladowe_zadania_proste_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Srednia_Ujemnych_Iloczyn_Dodatnich {
    public static void main(String[] args) {
        oblicz();
    }

    private static void oblicz() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ciag: ");
        Integer ciag = 0;
        Integer iloczynDodatnich = 1;
        Integer sumaUjemnych = 0;
        Integer sredniaUjemnych = 0;
        Integer liczbaElementowUjemnychCiagu = 0;

        try {
            do {
                ciag = scanner.nextInt();
                if(ciag < 0) {
                    sumaUjemnych = sumaUjemnych + ciag;
                    liczbaElementowUjemnychCiagu++;
                }else if (ciag > 0 && ciag!=0) {
                    iloczynDodatnich = iloczynDodatnich * ciag;
                }
            } while (ciag != 0);

        } catch (InputMismatchException ex) {
            System.out.println("Zly format");
            oblicz();
        }
        sredniaUjemnych = sumaUjemnych/liczbaElementowUjemnychCiagu;
        System.out.println("Srednia ujemnych: " + sredniaUjemnych + "\nilocyn dodatnich: " + iloczynDodatnich);
    }
}
/* Napisać program obliczający średnią arytmetyczną z wszystkich podanych liczb ujemnych oraz iloczyn
liczb dodatnich. Liczby wczytywane są od użytkownika, koniec wczytywania oznacza podanie liczby 0*/