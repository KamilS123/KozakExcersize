package com.kamil.excersize.zadania_2;

import javafx.scene.transform.Scale;

import java.util.Arrays;
import java.util.Scanner;

public class Oblicza_Sume_Cyfr_I_Stosunek {
    public static void main(String[] args) {
        wykonajDzialania();
    }
    private static void wykonajDzialania() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe ");
        Integer liczba = scanner.nextInt();

        String strLiczba = String.valueOf(liczba);

        String[]arrLiczba = strLiczba.split("");

        Integer suma = 0;
        Integer liczbyParzyste = 0;
        Integer liczbyNieparzyste = 0;

        for(int i = 0; i<arrLiczba.length; i++) {
            suma = suma + Integer.parseInt(arrLiczba[i]);

            if(Integer.parseInt(arrLiczba[i])%2==0) {
                liczbyParzyste++;
            }else {
                liczbyNieparzyste++;
            }
        }
        System.out.println("Tablica  utworzona z liczby całkowitej: ->" + Arrays.toString(arrLiczba));
        System.out.println("\nsuma cyfr liczby całkowitej: ->" + suma);
        System.out.println("\nstosunek parzystych do nieparzystych wynosi ->" + liczbyParzyste/liczbyNieparzyste);
    }
}
/*Napisać program, który pobiera od użytkownika liczbę całkowitą, a następnie:
• oblicza sumę cyfr tej liczby,
• stosunek średniej arytmetycznej cyfr parzystych do średniej arytmetycznej
cyfr nieparzystych.
Wskazówka: do pobierania kolejnych cyfr liczby należy użyć operacji operacji
modulo (operator %). Przykładowo, 127 % 10 = 7. Kolejną cyfrę uzyskamy dzieląc
127 przez 10 (dzielenie całkowite) i stosując ponownie operację modulo do wyniku,
tj. 12*/