package com_kamil_excersize.misztal_edu_pl.spotkanie_8.grupa_rozszerzona.zadanie_10;

import java.util.ArrayList;
import java.util.List;

public class Procesor {
    private Zadanie[]zadanies;
    private int ileZadan;
    private List<Zadanie>zadanieList;

//modyfikacja pod ArrayList
    public Procesor() {
        this.zadanieList = new ArrayList<>();
        this.ileZadan = 0;
    }

    public void dodajZadanieDoListy(Zadanie zadanie) {
            zadanieList.add(zadanie);
            ileZadan++;
    }

    public void wykonajZadanieZListy() {
        for(int i = 0; i<ileZadan; i++) {
            zadanieList.get(i).wykonaj();
        }
        System.out.println("\n");
    }

//modyfikacja pod tablice

   /* public void dodajZadanie(Zadanie zadanie) {
        if (ileZadan>=zadanies.length) {
            System.out.println("Za duzo zadan podanych - podałeś " + ileZadan + " zadan");
        }else {
            zadanies[ileZadan] = zadanie;
            ileZadan++;
        }
    }

    public void wykonajZadanie() {
        for(int i = 0; i<ileZadan; i++) {
            zadanies[i].wykonaj();
        }
        System.out.println("\n");
    }*/
}
