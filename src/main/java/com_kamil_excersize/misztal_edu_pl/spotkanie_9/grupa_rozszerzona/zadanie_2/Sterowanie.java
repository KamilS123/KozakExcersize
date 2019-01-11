package com_kamil_excersize.misztal_edu_pl.spotkanie_9.grupa_rozszerzona.zadanie_2;

public class Sterowanie {

    static void say(String str) {
        System.out.println(str);
    }

    static void info(Zwierz zwierz) {
        say(zwierz.getType() + " " + zwierz.getName());

        if (zwierz instanceof Speakable) {
            Speakable speakable = (Speakable) zwierz;
            say(speakable.getVoice(Speakable.LOUD));
        }
        if (zwierz instanceof Pies) {
            ((Pies) zwierz).merda();
        }
    }

    static void wyscig(Moveable...moveables) {
        for(Moveable moveable  : moveables) {
            moveable.start();
        }
    }

    static void animalDialog(Zwierz zwierz1, Zwierz zwierz2) {
        zwierz1.speak();
        zwierz2.speak();
        System.out.println("---------------------------");
    }
}
