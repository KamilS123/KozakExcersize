package com_kamil_excersize.misztal_edu_pl.spotkanie_8.grupa_rozszerzona.zadanie_10;

import java.util.Scanner;

public class Temp {
    private Procesor procesor;

    public Temp() {
        this.procesor = new Procesor();
    }

    public void menu() {
        System.out.println("1 - Dodaj nowe Zadanie1");
        System.out.println("2 - Dodaj nowe Zadanie2");
        System.out.println("3 - Wykonaj zadania");
        System.out.println("4 - Koniec");
        System.out.println("------------------------------------");

        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();

        switch (number) {
            case "1":
                procesor.dodajZadanieDoListy(new Zadanie_1());
                break;
            case "2":
                System.out.println("Podaj liczbe do wyliczenie logarytmu ");
                double numberToCount = scanner.nextDouble();
                procesor.dodajZadanieDoListy(new Zadanie_2(numberToCount));
                break;
            case "3":
                procesor.wykonajZadanieZListy();
                break;
            case "4":
                System.exit(0);
        }

        /*switch (number) {
            case "1":
                procesor.dodajZadanie(new Zadanie_1());
                break;
            case "2":
                System.out.println("Podaj numer do obliczenia logarytmu: ");
                double numberToCount = scanner.nextDouble();
                procesor.dodajZadanie(new Zadanie_2(numberToCount));
                break;
            case "3":
                procesor.wykonajZadanie();
                return;
            case "4":
                System.exit(0);
                break;
        }*/
    }
}
