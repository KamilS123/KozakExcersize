package com.kamil.excersize.zadania_7.zamowienia;

public class Zamowienia {
    Pozycja[]pozycja;
    int ileDodanych;
    int maksRozmiar;

    public Zamowienia() {
        maksRozmiar = 10;
    }

    public Zamowienia(Pozycja[] pozycja, int ileDodanych, int maksRozmiar) {
        this.pozycja = pozycja;
        this.ileDodanych = ileDodanych;
        this.maksRozmiar = maksRozmiar;
    }

    public void dodajPozycje(Pozycja pozycja) {
    }
}
