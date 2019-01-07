package com.kamil.excersize.przykladowe_zadania_2;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Podaje_Ile_Liczb_Wylosowac {
    public static void main(String[] args) {
        wylosuj();
    }
    private static void wylosuj() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ile liczb wylosować: ");
        Integer number = scanner.nextInt();
        Integer randomNumber = 0;
        Integer max = 0;
        Integer min = 0;
        double dodatnie = 0;
        double ujemne = 0;
        for(int i = 0; i<number; i++) {
            randomNumber = (int)(Math.random()*200)-100;
            System.out.println("liczba -> " + randomNumber);

            if(randomNumber%2==0) {
                dodatnie++;
            }else if (randomNumber%2!=0) {
                ujemne++;
            }

            if(randomNumber > max) {
                max = randomNumber;
            }else if (randomNumber < min) {
                min = randomNumber;
            }
        }
        System.out.println("Max -> " + max + "\nMin -> " + min + "\ndodatnie do ujemnych -> " + dodatnie/ujemne);
    }
}
/*Napisać program, który wczytuje od użytkownika liczbę oznaczającą, ile należy wylosować liczb z zakresu od -100 do
100. Następnie dokonuje obliczeń stosunku wylosowanych liczb dodatnich do liczb ujemnych oraz najmniejsze i
największej znalezionej liczby. Wynikiem działania programu powinna być informacja na temat wszystkich trzech
wartości.
W programie nie należy używać tablic.
Przykład dla liczby podanej przez użytkownika 3, następuje losowanie:
11 -5 93
W wyniku na ekran zostaje wyświetlona informacja:
2 -5 93 // bo stosunek 2/1 min: -5, max: 93
*/