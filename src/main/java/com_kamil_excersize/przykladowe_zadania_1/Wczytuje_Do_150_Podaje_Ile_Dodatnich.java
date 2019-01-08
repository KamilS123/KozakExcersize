package com_kamil_excersize.przykladowe_zadania_1;

import java.util.Scanner;

public class Wczytuje_Do_150_Podaje_Ile_Dodatnich {
    public static void main(String[] args) {
        wzytaj();
    }
    private static void wzytaj() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podawaj liczby. 150 kończy program");

        Integer number;
        Integer suma = -150;
        double liczbaDodatnich = 0;
        double numberCounter = -1;
        double srednia = 0;



       do {
            number = scanner.nextInt();
            numberCounter++;
            suma = suma + number;

            if(number%2==0 && number!=150) {
                liczbaDodatnich++;
            }
        }while (number!=150);
        srednia = suma/numberCounter;
        System.out.println("counter -> " + numberCounter + "\nsuma -> " + suma + "\nile dodatnich -> " + liczbaDodatnich + "\nsrednia -> " + srednia);
    }
}
/* Napisać program, który wczytuje od użytkownika liczby, do momentu aż zostanie podana liczba 150 (którą
pomijamy przy wszelkich statystykach). Po zakończeniu działania ma zostać wyświetlona informacja o
wartości średniej arytmetycznej wszystkich podanych liczb oraz ile z tych liczb było dodatnich.
Przykład:
4 -2 3 6 1 -6 31 -23 4 -31 150
Wynik:
-1.30 6*/