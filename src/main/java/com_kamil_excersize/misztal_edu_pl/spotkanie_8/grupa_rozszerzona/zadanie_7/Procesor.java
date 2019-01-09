package com_kamil_excersize.misztal_edu_pl.spotkanie_8.grupa_rozszerzona.zadanie_7;

public class Procesor {
    private Zadanie[] zadania;
    private int ileMam;

    public Procesor(int ileMam) {
        this.zadania = new Zadanie[ileMam];
        this.ileMam = 0;
    }

    public void dodajZadanie(Zadanie z) {
        if (ileMam >= zadania.length) {
            System.out.println("Za duzo zadań - mam już: " + ileMam);
        } else {
            zadania[ileMam] = z;
            ileMam++;
        }
    }

    public void wykonajZadanie() {
        for (int i = 0; i<ileMam; i++) {
            zadania[i].wykonaj();
        }
        System.out.println("\n");
    }
}
