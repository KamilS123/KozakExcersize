package com_kamil_excersize.misztal_edu_pl.spotkanie_7.grupa_zaawansowana.zadania_9;

public class Punkt2D {
    private int x;
    private int y;

    public Punkt2D() {
    }

    public Punkt2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Integer wyliczOdleglosc() {
        return x-y;
    }

    @Override
    public String toString() {
        return "Punkt2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
