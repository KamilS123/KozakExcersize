package com.kamil.excersize.zadania_4;

import java.util.Scanner;

public class Sprawdza_Czy_Nawiasy_Zadzaja_Sie {
    public static void main(String[] args) {
        System.out.println(check());
    }

    private static String check() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyrażenie arytmetyczne: ");
        String wyrazenie = scanner.next();
        String[] w = wyrazenie.split("");

        String result = "";
        int counter = 0;
        for (int i = 0; i < w.length; i++) {
            if (w[i].equals("(") || w[i].equals(")")) {
                counter++;
            }
        }
        if (counter % 2 == 0) {
            result = "Correct";
        } else {
            result = "Not Correct";
        }
        return result;
    }
}
/*Napisz program, który sprawdzi, czy w podanym przez użytkownika wyrażeniu
arytmetycznym nawiasy są poprawnie sparowane. Wyrażenie podawane jest jako
pojedynczy łańcuch znaków. Program powinien wyświetlić stosowny komunikat.
Przykład a:
"2 * (3.4 - (-7)/2)*(a-2)/(b-1)))"
Wynik:
Błędne sparowanie nawiasów
Przykład b:
"2 * (3.4 - (-7)/2)*(a-2)/(b-1))"
Wynik:
OK*/