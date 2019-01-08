package com_kamil_excersize.misztal_edu_pl.spotkanie_8.grupa_podstawowa.zadanie_12;

import java.util.Arrays;

public class Colors {
    private Colors[]colors = new Colors[5];
    private String color;

    public Colors() {
    }

    public Colors(String color) {
        this.color = color;
    }

    public void addColors(Colors col) {
        if (colors.length<=5) {
            for (int i = 0; i < colors.length; i++) {
                if (colors[i] == null) {
                    colors[i] = col;
                    break;
                }
            }
        }else {
            System.out.println("Zbyt duzy rozmiar talicy");
        }
    }

    public void removeColor(Colors col) {
        Integer leng = colors.length;
        for(int i = 0; i<leng; i++) {
            if (colors[i]==col) {
                colors[i] = null;
                break;
            }
        }
    }

    @Override
    public String toString() {
        return color;
    }

    public void wyswietl() {
        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }
    }

    public static void main(String[] args) {
        Colors colors = new Colors();

        Colors colors1 = new Colors("regreen");
        Colors colors2 = new Colors("blue");
        Colors colors3 = new Colors("white");
        Colors colors4 = new Colors("red");
        Colors colors5 = new Colors("orange");

        colors.addColors(colors1);
        colors.addColors(colors2);
        colors.addColors(colors3);
        colors.addColors(colors4);
        colors.addColors(colors5);
        colors.removeColor(colors2);


        colors.wyswietl();
    }
}
/*Zadanie 12. Utworz tablicę w której zapiszesz 5 wybranych przez Ciebie kolorów zdefiniowanych
jako pola statyczne w klasie Color.
Cel: tworzenie i wypełnianie tablicy obiektów*/