package com.kamil.excersize.misztal_edu_pl.grupa_zaawansowana.Zadanie_1;

public class Human {
    int wiek;
    double waga;
    String imie;
    String plec;

    public Human(int wiek, double waga, String imie, String plec) {
        this.wiek = wiek;
        this.waga = waga;
        this.imie = imie;
        this.plec = plec;
    }

    public int getWiek() {
        return wiek;
    }

    public double getWaga() {
        return waga;
    }

    public String getImie() {
        return imie;
    }

    public String getPlec() {
        if (plec.equalsIgnoreCase("M")) {
            System.out.println("Kobieta");
        }else {
            System.out.println("Mezczyzna");
        }
        return plec;
    }

    @Override
    public String toString() {
        return "Human{" +
                "wiek=" + wiek +
                ", waga=" + waga +
                ", imie='" + imie + '\'' +
                ", plec='" + plec + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Human human = new Human(20,80,"Kaja","M");
        human.getPlec();
        System.out.println(human.getImie());
        System.out.println(human.getWiek());
    }
}
/*Zadanie 1. Proszę napisać klasę Human reprezentującą człowieka. Klasa ta powinna posiadać następujące atrybuty: wiek,
 waga, wzrost, imię i płeć. Klasa powinna także zawierać metody: getAge, getWeight, getHeight, getName, isMale.
  Po stworzeniu klasy Human, w klasie głównej, napisz przykładowe jej użycie. */

