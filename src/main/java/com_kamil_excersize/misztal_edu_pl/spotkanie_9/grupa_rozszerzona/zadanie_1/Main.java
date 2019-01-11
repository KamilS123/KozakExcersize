package com_kamil_excersize.misztal_edu_pl.spotkanie_9.grupa_rozszerzona.zadanie_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Figure[]figure = new Figure[3];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dwa boki trojkata: ");
        figure[0]= new Triangle(scanner.nextDouble(),scanner.nextDouble());

        System.out.println("podaj dwa boki prostokata: ");
        figure[1]= new Rectangle(scanner.nextDouble(), scanner.nextDouble());

        System.out.println("Podaj promień koła: ");
        figure[2] = new Circle(scanner.nextDouble());

        for(Figure f : figure) {
            System.out.println(f.getType());
            System.out.println("pole -> " + f.getArea());
            System.out.println("obwód -> " + f.getPerimeter());
        }
    }
}
/*Zadanie 1

Stwórz interfejs Figure, który powinien zawierać metody getPerimeter (zwracającą obwód) oraz getArea
(zwracającą powierzchnię). Następnie utwórz klasy Circle, Triangle i Rectangle, niech każda z klas implementuje interfejs Figure. Napisz program, który pobierze od użytkownika:

długość promienia koła,
długości boków trójkąta prostokątnego (boki przy kącie prostym),
długość boków prostokąta.*/
