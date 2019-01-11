package com_kamil_excersize.misztal_edu_pl.spotkanie_10_Odczyt_Zapis.zadanie_6;

public class Emerytura {
    private String name;
    private String surname;
    private String male;
    private int age;

    public Emerytura(String name, String surname, String male, int age) {
        this.name = name;
        this.surname = surname;
        this.male = male;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Emerytura{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", male='" + male + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMale() {
        return male;
    }

    public void setMale(String male) {
        this.male = male;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
