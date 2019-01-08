package com_kamil_excersize.misztal_edu_pl.spotkanie_8.grupa_podstawowa;

import java.util.Scanner;

public class Gra_W_Zgadywanie_Liczb {
    public static void main(String[] args) {
        zagraj();
    }
    private static void zagraj() {
        Scanner scanner = new Scanner(System.in);
        //utworzenie dwóch randomowych zmienych
        Integer randomNumber = (int)(Math.random()*100);
        Integer nuberOfTry = (int)((Math.random()*10)+5);

        System.out.println("Podaj swoją liczbe");
        System.out.println(randomNumber);
        Integer myNumber;

        System.out.println("liczba " + randomNumber + " Masz " + nuberOfTry + " prob ");
        Integer counter = nuberOfTry;
        //do while gdzie uzyte sa warnki i mechanizm działania
        do{
            myNumber = scanner.nextInt();
            if (myNumber > randomNumber) {
                System.out.println("za duża liczba");
                counter--;
            } else if (myNumber < randomNumber) {
                System.out.println("Za mała lczba");
                counter--;
            } else if (myNumber == randomNumber) {
                System.out.println("Zgadles");
                break;
            } else {
                System.out.println("Inna opcja");
                counter--;
            }
        }while (counter>0);
        System.out.println("Koniec");
            }
        }
/*Zadanie 9. Przygotuj program który zagra z użytkownikiem w grę polegającą na zgadywaniu liczby. Na początku komputer
losuje liczbę z przedziału [0,100] oraz losuje ile razy użytkownik może zgadywać z przedziału [5,15]. Za każdym razem
program pyta o liczbę i jeśli:

użytkownik odgadnie, wypisuje "Zgdałeś. Koniec gry"
użytkownik poda liczbę mniejszą od wylosowanej przez komputer to program wypisuje "Podałeś za małą liczbę. Spróbuj
 jeszcze raz!"
użytkownik poda liczbę większą od wylosowanej przez komputer to program wypisuje "Podałeś za dużą liczbę. Spróbuj
 jeszcze raz!"
http://misztal.edu.pl/for-students/20162017/programowanie-obiektowe-w-javie/spotkanie-8/
Cel: tworzenie menu + pętle + funckje*/