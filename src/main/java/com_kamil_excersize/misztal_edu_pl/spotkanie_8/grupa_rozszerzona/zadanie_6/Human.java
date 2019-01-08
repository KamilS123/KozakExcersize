package com_kamil_excersize.misztal_edu_pl.spotkanie_8.grupa_rozszerzona.zadanie_6;

public class Human extends Mammal {
    private Integer age;
    private String surname;

    public Human(int wieght, String color, String name, int height, String skinColor, Integer age, String surname) {
        super(wieght, color, name, height, skinColor);
        this.age = age;
        this.surname = surname;
    }

    public void sound() {
        super.sound();
        System.out.println("Sound after Mammal ..........Human sound");
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", surname='" + surname + '\'' +
                '}';
    }
}
