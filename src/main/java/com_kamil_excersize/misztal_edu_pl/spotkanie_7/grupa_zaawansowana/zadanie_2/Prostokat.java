package com_kamil_excersize.misztal_edu_pl.spotkanie_7.grupa_zaawansowana.zadanie_2;

public class Prostokat {
    private double dlugosc;
    private double szerokosc;

    public Prostokat(int dlugosc, int szerokosc) {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
    }

    private double obliczPole() {
        return dlugosc * szerokosc;
    }

    private double obliczObwod() {
        return (dlugosc + szerokosc)*2;
    }

    private double obliczDlugoscPrzekatnej() {
        double parameter = Math.pow(dlugosc,2) + Math.pow(szerokosc,2);
        return Math.sqrt(parameter);
    }
    public static void main(String[] args) {
        Prostokat prostokat = new Prostokat(10,20);
        System.out.println(prostokat.obliczObwod());
    }
}
/*Zadanie 2. Utwórz klasę reprezentującą prostokąt, musi posiadać atrybuty długość i szerokość. Klasa powinna posiadać
metody obliczające pole, obwód i długość przekątnej. Przetestuj jej działanie.*/
