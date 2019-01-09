package com_kamil_excersize.misztal_edu_pl.spotkanie_8.grupa_rozszerzona.zadanie_7;

import java.util.Scanner;

public class Temp {
    private Procesor procesor;

    public Temp() {
        this.procesor = new Procesor(10);
    }

    public void menu() {
        String wybor;

        System.out.println("1 - Dodaj nowe Zadanie1");
        System.out.println("2 - Dodaj nowe Zadanie2");
        System.out.println("3 - Wykonaj zadania");
        System.out.println("4 - Koniec");
        System.out.println("------------------------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        wybor = scanner.next();
        System.out.println();

        /*if (wybor.equals("1")) {
            procesor.dodajZadanie(new Zadanie_1());
        } else if (wybor.equals("2")) {
            double v;
            System.out.print("Podaj wartosc do zlogarytmowania: ");
            v = scanner.nextDouble();

            procesor.dodajZadanie(new Zadanie_2(v));
        } else if (wybor.equals("3")) {
            procesor.wykonajZadanie();
            return;
        } else if (wybor.equals("4")) {
            System.exit(0);
        }*/
        switch (wybor) {
            case "1":
                procesor.dodajZadanie(new Zadanie_1());
                break;
            case "2":
                System.out.println("Podaj wartosc do logarytmowania: ");
                Double value = scanner.nextDouble();
                procesor.dodajZadanie(new Zadanie_2(value));
                break;
            case "3":
                procesor.wykonajZadanie();
                return;
            case "4":
                System.exit(0);
        }
    }
}
