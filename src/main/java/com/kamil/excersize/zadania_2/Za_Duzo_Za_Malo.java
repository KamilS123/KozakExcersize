package com.kamil.excersize.zadania_2;

import java.util.Scanner;

public class Za_Duzo_Za_Malo {
    public static void main(String[] args) {
        moreORless();
    }

    public static void moreORless() {
        Scanner scanner = new Scanner(System.in);

        Integer randomNumber = (int) (Math.random() * 100) + 1;

        System.out.println("---WELCOME IN --toLow toHigh-- GAME---");
        //variable to check if true
        boolean playing = true;

        while (playing) {
            //choosing number to check
            System.out.println("Pass me your number from 1......100 ");
            Integer choosenNumber = scanner.nextInt();

            //contitions to heck if number is lower or higher or equals
            if (choosenNumber > randomNumber) {
                System.out.println("To high!!!");
            } else if (choosenNumber < randomNumber) {
                System.out.println("To low!!!");
            } else if (choosenNumber == randomNumber) {
                System.out.println("Correct");
                //breaking conditions because this is correct anserw
                break;
            }
        }
    }
}
/*Gra w ”Za dużo, za mało”. Komputer losuje liczbę z zakresu 1 . . . 100, a gracz
(użytkownik) ma za zadanie odgadnąć, co to za liczba poprzez podawanie kolejnych
wartości. Jeżeli podana wartość jest:
• większa – wyświetlany jest komunikat „Podałeś za dużą wartość”,
• mniejsza – wyświetlany jest komunikat „Podałeś za małą wartość”,
• identyczna z wylosowaną – wyświetlany jest komunikat „Gratulacje” i gra
się kończy.
*/