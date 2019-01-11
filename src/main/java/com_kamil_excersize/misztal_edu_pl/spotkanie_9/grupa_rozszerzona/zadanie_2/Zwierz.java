package com_kamil_excersize.misztal_edu_pl.spotkanie_9.grupa_rozszerzona.zadanie_2;

abstract class Zwierz {
    String name = "bezimienny";
    public Zwierz() {
    }

    public Zwierz(String name) {
        this.name = name;
    }

    public abstract String getType();

    public String getName() {
        return name;
    }

    public void speak(int...v) {
        int vol = Speakable.QUIET;
        if (v.length==1) {
            vol = v[0];
        }
        String voice;
        if (this instanceof Speakable) {
            voice = ((Speakable) this).getVoice(vol);
        }else {
            voice = "....cisza........";
            System.out.println(getType() + " " + getName() + " says " + voice);
        }
    }
}
