package com.kamil.excersize.zadanie_5;

import java.util.Scanner;

public class Zwraca_Duze_Male_Stringi {
    public static void main(String[] args) {
        System.out.println(returnString());
    }
    private static String returnString() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadz Stringa: ");
        String str = scanner.next();
        System.out.println("(Upper) or (Lower)Case");
        String upperOrLower = scanner.next();
        String newStr = "";

        if(upperOrLower.equalsIgnoreCase("Upper")) {
            newStr = str.toUpperCase();
        }else if (upperOrLower.equalsIgnoreCase("Lower")) {
            newStr = str.toLowerCase();
        }
        return newStr;
    }
}
/* Napisać funkcję String flipCase(String text) , która zamieni małe litery na
duże i odwrotnie w łańcuchu podanym jako parametr. Wynikiem ma być łańcuch
znaków zawierający kopię łańcucha po zmianie wielkości liter*/