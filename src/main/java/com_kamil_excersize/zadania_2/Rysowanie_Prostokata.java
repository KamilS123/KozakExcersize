package com_kamil_excersize.zadania_2;

import java.util.Scanner;

public class Rysowanie_Prostokata {
    public static void main(String[] args) {
        rysujProstokat();
    }
    private static void rysujProstokat() {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj długosc boku A");
        int bokA = in.nextInt();
        System.out.println("Podaj długosc boku B");
        int bokB = in.nextInt();
        System.out.println("Podaj znak wypełnienia");
        String znak = in.next();

        for(int i = 0; i<bokB; i++) {
            for(int j = 0; j<bokA; j++) {
                System.out.print(znak);
            }
            System.out.println();
        }
    }
}
/*Napisać program działający w trybie konsolowym (tekstowym) i rysujący na ekranie
prostokąt. Użytkownik podaje znak wypełnienia prostokąta, pozycję lewego
górnego rogu prostokąta (x, y) oraz długości boków prostokąta (ab). Przyjmujemy,
że lewy górny narożnik konsoli ma współrzędne (x, y) = (1, 1).
Przykład: x=6, y=3, BufferReader=4, b=6, zn=’x’
>
>
> _____xxxxxx
> _____xxxxxx
> _____xxxxxx
> _____xxxxxx
ozn.
> - nowa linia,
_ - znak spacji.
*/
