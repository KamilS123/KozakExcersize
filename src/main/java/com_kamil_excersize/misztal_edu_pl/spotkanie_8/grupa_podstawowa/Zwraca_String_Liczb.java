package com_kamil_excersize.misztal_edu_pl.spotkanie_8.grupa_podstawowa;

public class Zwraca_String_Liczb {
    public static void main(String[] args) {
        System.out.println(returnString(3,6));
    }
    private static String returnString(int a, int b) {
        String text = "dla a równego " + a + " b równego " + b + " " + a + "/" + b + "=" + b + "r1";
        return text;
    }
}
/*Zadanie 2. Proszę napisać funkcję, która dla dwóch liczb całkowitych a i b zwróci string zawierający następujący tekst, np. dla a = 5 oraz b = 2:
5/2=2 r 1
Cel: pisanie funkcji, operator modulo */