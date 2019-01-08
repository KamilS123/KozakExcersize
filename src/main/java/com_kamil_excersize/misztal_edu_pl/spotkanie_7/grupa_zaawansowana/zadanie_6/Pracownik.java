package com_kamil_excersize.misztal_edu_pl.spotkanie_7.grupa_zaawansowana.zadanie_6;

public class Pracownik {
    private String name;
    private String surname;
    private int age;

    public Pracownik(String name) {
        this.name = name;
        this.surname = "Kowalski";
        this.age = 30;
    }

    public Pracownik(int age) {
        this.age = age;
        this.name = "Włądek";
        this.surname = "Wołosz";
    }

    public Pracownik(String surname,int age) {
        this.surname = surname;
        this.age = age;
        this.name = "Jan";
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + age;
    }
}
