package com_kamil_excersize.zadania_2;

import java.util.Scanner;

public class Silnia_A_B {
    public static void main(String[] args) {
        System.out.println(obliczSilnie());
    }
    public static Integer obliczSilnie() {
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbe: ");
        Integer pierwsza = in.nextInt();

        System.out.println("Podaj drugą liczbe: ");
        Integer druga = in.nextInt();

        Integer silnia = 0;

        for(int i = pierwsza; i <= druga; i++) {
            silnia = silnia + i;
        }
        return silnia;
    }
}
/*Napisać program pobierający od użytkownika dwie liczby całkowite A oraz B,
A < B, a następnie wyznaczający sumę ciągu liczb od A do B, czyli sumę ciągu
(A, A + 1, . . . , B). Obliczenia należy wykonać trzykrotnie stosując kolejno pętle:
while, do-while, for.
Przykład:
Dla A = 4 i B = 11 program powinien wyświetlić:
60
60
60
*/