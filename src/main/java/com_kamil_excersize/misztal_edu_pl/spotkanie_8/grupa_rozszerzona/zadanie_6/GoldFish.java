package com_kamil_excersize.misztal_edu_pl.spotkanie_8.grupa_rozszerzona.zadanie_6;

public class GoldFish extends Fish{
    private String fishName;
    private Integer age;


    public GoldFish(int wieght, String color, String name, int distance, String livingPlace, String fishName, Integer age) {
        super(wieght, color, name, distance, livingPlace);
        this.fishName = fishName;
        this.age = age;
    }

    public void sound() {
        super.sound();
        System.out.println("After Fish ..........goldFish");
    }

    @Override
    public String toString() {
        return "GoldFish{" +
                "fishName='" + fishName + '\'' +
                ", age=" + age +
                '}';
    }
}
