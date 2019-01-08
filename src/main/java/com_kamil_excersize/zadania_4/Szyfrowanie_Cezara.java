package com_kamil_excersize.zadania_4;

import java.util.Scanner;

public class Szyfrowanie_Cezara {
    public static void main(String[] args) {

    }
    private static void szyfruj() {
        Scanner scanner = new Scanner(System.in);                                   //do poprawy
        System.out.println("Podaj tekst do zaszyfrowania: ");
        String text = scanner.next();
        char znak = 'a';
        for(int i = 0; i<text.length(); i++) {

        }

    }
}
/*Napisz program, który umożliwia szyfrowanie podanego ciągu znaków przy użyciu
szyfru Cezara, który jest szczególnym przypadkiem szyfru podstawieniowego
monoalfabetycznego.
Użytkownik program podaje tekst do zaszyfrowania oraz liczbę n, o którą przesunięty
jest alfabet za pomocą którego szyfrujemy tekst. Dla uproszczenia można
przyjąć, że łańuch wejściowy składa się tylko z małych liter alfabetu angielskiego,
tj. ’a’ – ’z’ (26 znaków) oraz spacji.
Przykład 1.
Podaj łańcuch znaków do zaszyfrowania: abrakadabraz
Podaj przesunięcie: 2
Zaszyfrowany tekst: cdtcmcfcdtcb
Przykład 2.
Podaj łańcuch znaków do zaszyfrowania: cdtcmcfcdtcb
Podaj przesunięcie: -2
Zaszyfrowany tekst: abrakadabraz
*/