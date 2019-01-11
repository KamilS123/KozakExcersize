package com_kamil_excersize.misztal_edu_pl.spotkanie_9.grupa_rozszerzona.zadanie_2;

//nie implementuje interfejsów ponieważ kot nie potrzebuje metod spekable moveable
public class Kot extends Zwierz{
    public Kot() {
    }

    public Kot(String name) {
        super(name);
    }

    public String getVoice() {
        return "Miauuu";
    }

    @Override
    public String getType() {
        return "Kot";
    }
}
