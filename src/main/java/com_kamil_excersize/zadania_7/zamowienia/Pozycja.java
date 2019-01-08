package com_kamil_excersize.zadania_7.zamowienia;

public class Pozycja {
    String nazwaTowaru;
    int ileSztuk;
    double cena;

    public Pozycja() {
    }

    public Pozycja(String nazwaTowaru, int ileSztuk, double cena) {
        this.nazwaTowaru = nazwaTowaru;
        this.ileSztuk = ileSztuk;
        this.cena = cena;
    }
    public Double obliczWartosc() {
        return cena * ileSztuk;
    }

    @Override
    public String toString() {
        return  nazwaTowaru + " " + ileSztuk + "szt " + cena + "zł Do zapłaty " + obliczWartosc() + "zł";
    }
}
