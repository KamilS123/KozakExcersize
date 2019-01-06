package com.kamil.excersize.zadanie_5;

import java.util.Arrays;

public class Zwraca_Indeks_Podanej_Litery {
    public static void main(String[] args) {
        str("azakaz", 'z');
    }
    private static void str(String str, char z) {
        if (str.contains(String.valueOf(z))) {
                System.out.println(str.indexOf(z));
            }else if (!str.contains(String.valueOf(z))) {
                System.out.println(-1);
            }
        }
    }

/* Zdefiniować funkcję int strpos(String text, char z) , która zwraca indeks
na którym znajduje się znak z (drugi parametr) w podanym łańcuchu text .
Jeżeli znak z nie występuje w łańcuchu, to wynikiem funkcji powinno być -1.
Uwaga - pozycje znaków numerujemy począwszy od 0.
*/