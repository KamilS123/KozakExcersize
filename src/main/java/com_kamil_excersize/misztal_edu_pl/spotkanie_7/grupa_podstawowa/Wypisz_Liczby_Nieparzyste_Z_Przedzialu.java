package com_kamil_excersize.misztal_edu_pl.spotkanie_7.grupa_podstawowa;

public class Wypisz_Liczby_Nieparzyste_Z_Przedzialu {
    public static void main(String[] args) {
        wypisz10_35();
        wypiszKwadraty();
        wypiszParzyste10_35();
    }
    //wypisz liczy z przedziału 10- 35
    private static void wypisz10_35() {
        for(int i = 10; i <=35; i++) {
            System.out.println("z przedziału 10 - 35 -> " + i);
        }
    }
    //wypisz parzyste z przedziału 10 - 35
    private static void wypiszParzyste10_35() {
        for(int i = 10; i <=35; i++) {
            if (i%2==0) {
                System.out.println("parzysta z przedziału 10 - 35 -> " + i);
            }
        }
    }
    //wypisz kwadraty liczb z przedziału 10-35
    private static void wypiszKwadraty() {
        for(int i = 10; i <=35; i++) {
            System.out.println("kwadrat " + i + " = " + i*i);
        }
    }


}
/*Zadanie 2. Proszę napisać program, który wykorzystując pętle for wypisze:
liczby nieparzyste w przedziale od 10 do 35
czyli 11, 13, 15, ...itd.
liczby parzyste w przedziale od 10 do 35
czyli 10, 12, 14, ...itd.
kwadraty liczb z przedziału od 10 do 35
czyli 100, 121, 144, ....itd.
Cel: uzywanie pętli for, jak działa operator %, jak wygenerować kwadrat liczby.*/