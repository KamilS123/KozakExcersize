package com_kamil_excersize.misztal_edu_pl.spotkanie_8.grupa_rozszerzona.zadanie_8;

import java.util.Scanner;

public class Main {
    private double argument_1;
    private double argument_2;
    Computation computation;

    private double getArgument(double argument) {
        return argument;
    }
//metoda która sprawdza co chcemy robić. Ustawia Computation na new Multiplication albo new Addiction;
    public void shouldMultiply() {
        System.out.println("Chcesz mnożyć (1) dodawać (2)");
        Scanner scanner = new Scanner(System.in);
        Integer nuberChoosen = scanner.nextInt();

        if (nuberChoosen==1) {
            computation = new Multiplication();
        }else if (nuberChoosen==2){
            computation = new Addition();
        }
    }
    public static void main(String[] args) {
        Main main = new Main();
        Computation computation = new Multiplication();

        //rsja gdzie argumenty podawane są ze scannera

        main.shouldMultiply();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbe");
        Integer firstNumber = scanner.nextInt();
        System.out.println("Podaj drugą liczbe");
        Integer secondNumber = scanner.nextInt();

        double resul = computation.compute(firstNumber,secondNumber);

        System.out.println(resul);

        //wersja gdzie argumenty podawane są z metody getArgument
        /*main.shouldMultiply();
        double arg_1 = main.getArgument(10);
        double arg_2 = main.getArgument(30);

        double result = computation.compute(arg_1,arg_2);
        System.out.println("Wynik : " + result);*/
    }
}
