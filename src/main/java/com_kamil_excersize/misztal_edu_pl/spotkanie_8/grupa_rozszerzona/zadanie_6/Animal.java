package com_kamil_excersize.misztal_edu_pl.spotkanie_8.grupa_rozszerzona.zadanie_6;

abstract class Animal {
    private int wieght;
    private String color;
    private String name;

    public Animal(int wieght, String color, String name) {
        this.wieght = wieght;
        this.color = color;
        this.name = name;
    }
    public void sound() {
        System.out.println("Animal sound......");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "wieght=" + wieght +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

