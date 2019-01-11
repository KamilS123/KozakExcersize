package com_kamil_excersize.misztal_edu_pl.spotkanie_8.grupa_rozszerzona.zadanie_10;

public class Zadanie_2 implements Zadanie {
    double number;

    public Zadanie_2(double number) {
        this.number = number;
    }

    @Override
    public void wykonaj() {
        System.out.println("log("+number+") = " + Math.log(number));
    }
}
