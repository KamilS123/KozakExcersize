package com_kamil_excersize.zadania_7.czas;

public class Czas {
    private int godz;
    private int minuty;

    public Czas(int godz, int minuty) {
        this.godz = godz;
        this.minuty = minuty;
    }

    public String CzasWyswietl() {
       String time = godz + "h " + minuty + "min";
    return time;
    }
    public Czas dodaj(Czas t) {
        t = new Czas(t.godz + godz,t.minuty + minuty);
        return t;
    }

    public Czas odejmij(Czas t) {
        t = new Czas( godz - t.godz, minuty - t.minuty);
        return t;
    }
    @Override
    public String toString() {
        return godz +"h " + minuty + "min";
    }

}
