package com_kamil_excersize.misztal_edu_pl.spotkanie_8.grupa_rozszerzona.zadanie_6;

public class Mammal extends Animal{
    private int height;
    private String skinColor;

    public Mammal(int wieght, String color, String name, int height, String skinColor) {
        super(wieght, color, name);
        this.height = height;
        this.skinColor = skinColor;
    }

    public void sound() {
        super.sound();
        System.out.println("After animal ...........Mamal Sound ");
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "height=" + height +", skinColor='" + skinColor + '\'' +
                '}';
    }
}
