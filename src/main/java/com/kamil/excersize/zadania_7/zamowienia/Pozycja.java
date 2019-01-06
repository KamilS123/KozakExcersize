package com.kamil.excersize.zadania_7.zamowienia;

public class Pozycja {
    String nazwaTowaru;
    int ileSztuk;
    double cena;

    public Pozycja(String nazwaTowaru, int ileSztuk, double cena) {
        this.nazwaTowaru = nazwaTowaru;
        this.ileSztuk = ileSztuk;
        this.cena = cena;
    }
    private Double obliczWartosc() {
        return cena * ileSztuk;
    }

    @Override
    public String toString() {
        return "Pozycja{" +
                "nazwaTowaru='" + nazwaTowaru + '\'' +
                ", ileSztuk=" + ileSztuk +
                ", cena=" + cena +
                '}';
    }
}
