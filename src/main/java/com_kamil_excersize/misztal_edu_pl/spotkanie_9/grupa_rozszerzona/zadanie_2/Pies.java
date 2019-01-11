package com_kamil_excersize.misztal_edu_pl.spotkanie_9.grupa_rozszerzona.zadanie_2;

public class Pies extends Zwierz implements Speakable,Moveable{
    public Pies() {
    }

    public Pies(String name) {
        super(name);
    }

    @Override
    public void start() {
        System.out.println("Pies " + getName() + " is starting");
    }

    @Override
    public void stop() {
        System.out.println("Pies " + getName() + " is stopping");
    }

    public void merda() {
        System.out.println("Pies " + getName() + " merda");
    }

    @Override
    public String getVoice(int voice) {
        if (voice==QUIET) {
            return "quiet hau";
        }else {
            return "loud hou hou hou";
        }
    }

    @Override
    public String getType() {
        return "Pies";
    }
}
