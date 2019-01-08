package com_kamil_excersize.zadania_7.zamowienia;

import java.util.Arrays;

public class Zamowienia {
    Pozycja[] pozycje;
    private int ileDanych;
    private int maksRozmiar;

    public Zamowienia() {
        this.maksRozmiar=10;
    }

    Zamowienia(int ileDanych){
        this.ileDanych = ileDanych;
    }
    public void dodajPozycje(Pozycja p) {
        for(int i = 0; i<maksRozmiar; i++) {
           if (pozycje.length<maksRozmiar){
               pozycje[ileDanych]=p;
           }
        }
    }
    public double obliczWartosc(){
        double lacznie = 0.0;
        /*for(int i=0; i<ileDanych; i++){
            lacznie += pozycje[i].obliczWartosc();
        }*/
        return lacznie;
    }

    @Override
    public String toString() {
        return "\nZamowienie: \n" + Arrays.toString(pozycje) + "\n" + obliczWartosc() + "zł";
    }
}
