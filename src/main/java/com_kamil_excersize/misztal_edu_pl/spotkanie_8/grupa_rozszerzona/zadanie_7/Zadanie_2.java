package com_kamil_excersize.misztal_edu_pl.spotkanie_8.grupa_rozszerzona.zadanie_7;

public class Zadanie_2 implements Zadanie {
    private Double val;

    public Zadanie_2(Double val) {
        this.val = val;
    }

    @Override
    public void wykonaj() {
        System.out.println("log(" + val + ")= " + Math.log(val));
    }
}
