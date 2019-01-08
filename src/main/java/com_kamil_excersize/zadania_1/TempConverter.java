package com_kamil_excersize.zadania_1;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        System.out.println(convert() + " Farenheits");
    }
    public static double convert() {
        System.out.println("Pass Celcious to convert on Farenheit: ");
        Scanner in = new Scanner(System.in);
        double celcious = in.nextDouble();
        double farenheit = (celcious*1.8)+32;
        return farenheit;
    }
}


/*Napisać program służący do konwersji wartości temperatury podanej w stopniach
Celsjusza na stopnie w skali Fahrenheita (stopnie Fahrenheita = 1.8 * stopnie
Celsjusza + 32.0)
*/