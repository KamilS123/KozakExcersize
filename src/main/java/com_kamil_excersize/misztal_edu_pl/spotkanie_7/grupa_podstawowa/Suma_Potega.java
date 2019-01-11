package com_kamil_excersize.misztal_edu_pl.spotkanie_7.grupa_podstawowa;

public class Suma_Potega {
    public static void main(String[] args) {
        System.out.println(suma(2,3,4));
        System.out.println(potega(2,3,4));
    }
    private static Integer suma(int a, int b, int c) {
        return a + b + c;
    }
    private static Double potega(int a, int b, int c) {
        double firstPov = Math.pow(a,b);
        return Math.pow(firstPov,c);
    }
}
/*Zadanie 3. Napisz funkcję (statyczną w klasie), która przyjmuje trzy liczby i wyznacza ich:
sumę, czyli BufferReader+b+c
potęgę abc*/