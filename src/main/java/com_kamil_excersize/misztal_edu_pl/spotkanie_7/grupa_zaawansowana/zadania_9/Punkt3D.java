package com_kamil_excersize.misztal_edu_pl.spotkanie_7.grupa_zaawansowana.zadania_9;

public class Punkt3D extends Punkt2D {
    private int z;

    public Punkt3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "Punkt3D{" +
                "z=" + z +
                '}';
    }
}
