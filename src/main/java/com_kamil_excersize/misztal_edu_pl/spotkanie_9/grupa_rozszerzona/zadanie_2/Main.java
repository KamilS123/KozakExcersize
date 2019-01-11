package com_kamil_excersize.misztal_edu_pl.spotkanie_9.grupa_rozszerzona.zadanie_2;

import static com_kamil_excersize.misztal_edu_pl.spotkanie_9.grupa_rozszerzona.zadanie_2.Sterowanie.animalDialog;
import static com_kamil_excersize.misztal_edu_pl.spotkanie_9.grupa_rozszerzona.zadanie_2.Sterowanie.info;
import static com_kamil_excersize.misztal_edu_pl.spotkanie_9.grupa_rozszerzona.zadanie_2.Sterowanie.wyscig;
import static java.awt.SystemColor.info;

public class Main {
    public static void main(String[] args) {
        Pies kuba = new Pies("Kuba");
        Pies reksio = new Pies("Reksio");
        Kot mruczek = new Kot("Mruczek");

        kuba.start();
        System.out.println(kuba.getVoice(Speakable.LOUD));
        kuba.stop();
        System.out.println("------------------");

        info(kuba);
        System.out.println("-------------------");

        animalDialog(kuba,reksio);
        animalDialog(kuba,mruczek);

        wyscig(kuba,reksio,new Pies("Azor"));
    }
}
