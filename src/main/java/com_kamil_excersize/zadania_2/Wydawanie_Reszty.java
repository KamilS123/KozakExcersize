package com_kamil_excersize.zadania_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Wydawanie_Reszty {
    public static void main(String[] args) {
        policzReszte();
    }
    private static void policzReszte() {
        //utworzenie zmiennej dla każdego nominału
        double _5zł = 5, _2zł = 2, _1zł = 1, _50gr = 0.5, _20gr = 0.2, _10gr = 0.1, _5gr = 0.05, _2gr = 0.02, _1gr = 0.01;
        //utworzenie licznika dla każdego nominału
        int _5złCount = 0, _2złCount = 0, _1złCount = 0, _50grCount = 0, _20grCount = 0, _10grCount = 0, _5grCount = 0, _2grCount = 0, _1grCount = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj kwote przekazaną kasjerce: ");
        //obsługa wyjątku kiedy podana zostanie zła liczba z kropką, ponieważ powina być z przecinkiem
        try {
            Double kwota = scanner.nextDouble();
            //ustawienie boolena aby sprawdzac czy warunek jest prawdziwy
            Boolean check = false;
            while (true) {
                if (kwota >= _5zł) {
                    kwota = kwota - _5zł;
                    _5złCount++;
                } else if (kwota >= _2zł) {
                    kwota = kwota - _2zł;
                    _2złCount++;
                } else if (kwota >= _1zł) {
                    kwota = kwota - _1zł;
                    _1złCount++;
                } else if (kwota >= _50gr) {
                    kwota = kwota - _50gr;
                    _50grCount++;
                } else if (kwota >= _20gr) {
                    kwota = kwota - _20gr;
                    _20grCount++;
                } else if (kwota >= _10gr) {
                    kwota = kwota - _10gr;
                    _10grCount++;
                } else if (kwota >= _5gr) {
                    kwota = kwota - _5gr;
                    _5grCount++;
                } else if (kwota >= _2gr) {
                    kwota = kwota - _2gr;
                    _2grCount++;
                } else if (kwota >= _1gr) {
                    kwota = kwota - _1gr;
                    _1grCount++;
                } else {
                    break;
                }
            }
        } catch (InputMismatchException ex) {
            System.out.println("Podaj liczbe z przecinkiem");
        }

        //wyświetlenie wszystkich liczników tzn ile monet potrzeba aby wydać reszte.
        System.out.println("piatki-> " + _5złCount + " dwójki-> " + _2złCount + " jedynki-> " + _1złCount + " 50groszy-> "
                + _50grCount + " 20groszy-> " + _20grCount + " 10groszy-> " + _10grCount + " 5groszy-> " + _5grCount +
                " 2grosze-> " + _2grCount + " 1grosz->  " + _1grCount);
    }
}
/*Napisać program wspomagający pracę kasjerki/kasjera, który dla podanej kwoty
wyświetla liczbę monet poszczególnych rodzajów potrzebną do jej wydania.
Program powinien wyświetlać rozwiązanie z minimalną liczbą monet (może być
dowolne rozwiązanie z tą samą, minimalną liczbą monet). Dostępne nominały
monet to: 5zł, 2zł, 1zł, 50gr, 20gr, 10gr, 5gr, 2gr, 1gr.
Kwota podawana jest w formacie zł [spacja] gr.
Przykładowo, dla danych 12 31 (12zł 31gr) program powinien wyświetlić:
2 x 5 zł
1 x 2 zł
1 x 20 gr
1 x 10 gr
1 x 1 gr*/