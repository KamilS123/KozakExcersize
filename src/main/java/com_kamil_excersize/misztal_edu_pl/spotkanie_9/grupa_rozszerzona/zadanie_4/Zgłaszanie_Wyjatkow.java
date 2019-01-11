package com_kamil_excersize.misztal_edu_pl.spotkanie_9.grupa_rozszerzona.zadanie_4;

public class Zgłaszanie_Wyjatkow {
    public static void main(String[] args) {
        try{
            int i = 5;
            if (i==5) {
                throw new ArithmeticException("Wyyyyjatek w srodku");
            }
        }catch (ArithmeticException e) {
            System.out.println("Wyjatek " + e);
        }
    }
}
