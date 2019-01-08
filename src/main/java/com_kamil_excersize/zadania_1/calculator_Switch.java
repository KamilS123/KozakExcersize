package com_kamil_excersize.zadania_1;

import java.util.Scanner;

public class calculator_Switch {
    public static void main(String[] args) {
        System.out.println("Result is: " + calculate());
    }

    private static Integer calculate() {
        System.out.println("----WELCOME IN MY CALCULATOR-----");
        Scanner in = new Scanner(System.in);

        System.out.println("Give me first number: ");
        Integer firstNumber = in.nextInt();

        System.out.println("What would you like to do: (+) (-) (*) (/)___(end)");
        String action = in.next();

        System.out.println("Give me second number: ");
        Integer secondNumber = in.nextInt();

        Integer result = 0;

        switch (action) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                result = firstNumber / secondNumber;
                break;
        }
        return result;
    }
}
/*Napisać program realizujący funkcje prostego kalkulatora, pozwalającego na wykonywanie
operacji dodawania, odejmowania, mnożenia i dzielenia na dwóch liczbach
rzeczywistych. Program ma identyfikować sytuację wprowadzenia błędnego
symbolu działania oraz próbę dzielenia przez zero. Zastosować instrukcję switch
do wykonania odpowiedniego działania w zależności od wprowadzonego symbolu
operacji. Scenariusz działania programu:
a) Program wyświetla informację o swoim przeznaczeniu.
b) Wczytuje pierwszą liczbę.
c) Wczytuje symbol operacji arytmetycznej: +, -, *, /.
d) Wczytuje drugą liczbę.
e) Wyświetla wynik lub - w razie konieczności - informację o niemożności wykonania
działania.
f) Program kończy swoje działanie po naciśnięciu przez użytkownika klawisza
Enter.
*/
