package com_kamil_excersize.misztal_edu_pl.spotkanie_8.grupa_podstawowa;

public class Losuje_Dopoki_Suma_100 {
    public static void main(String[] args) {
        System.out.println(losujDo100());
    }
    private static Integer losujDo100() {
        Integer suma = 0;

                                                            //zle brak pomysłu
        for(int i = 0; suma<100; i++) {
            Integer integer = (int)Math.random()*20;
            suma = suma + integer;

        }
        return suma;
    }
}
/*Zadanie 5. Napisz program, który losuje liczby całkowite z przedziału [0, 20] dopóki ich suma nie przekroczy 100.
Cel: pętla + klasa Random */