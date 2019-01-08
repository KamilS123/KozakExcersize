package com_kamil_excersize.misztal_edu_pl.spotkanie_8.grupa_podstawowa.zadanie_13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pomidor {
    private List<String> pomidorList = new ArrayList<>();
    private String[] colors = new String[]{"red", "green", "blue"};

    public void addColor() {
        for (int i = 0; i < 20; i++) {
            pomidorList.add(colors[(int) (Math.random() * colors.length)]);
        }

    }

    private void showList() {
        for (String s : pomidorList) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Pomidor pomidor = new Pomidor();
        pomidor.addColor();
        pomidor.showList();
    }
}
/*Zadanie 13. Korzystając z tablicy z zadania poprzedniego utwórz listę ArrayList która przechowije obiekty typu Pomidor.
 Wypełniej tą listę 10 obiektami typu Pomidor nadając im losowy kolor z tablicy utworzonej w zadaniu 12.
 Wykorzystaja pętle oraz klasę Random. Na koniec wypisz wszystkie obiekty z listy.
Cel: zapoznanie z ArrayList*/