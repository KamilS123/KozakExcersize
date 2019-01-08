package com_kamil_excersize.misztal_edu_pl.spotkanie_8.grupa_rozszerzona.zadanie_6;

public class Fish extends Animal {
    private int distance;
    private String livingPlace;

    public Fish(int wieght, String color, String name, int distance, String livingPlace) {
        super(wieght, color, name);
        this.distance = distance;
        this.livingPlace = livingPlace;
    }

    public void sound() {
        super.sound();
        System.out.println("After animal...... FISH sound");
    }
    @Override
    public String toString() {
        return "Fish{" +
                "distance=" + distance +
                ", livingPlace='" + livingPlace + '\'' +
                '}';
    }
}
