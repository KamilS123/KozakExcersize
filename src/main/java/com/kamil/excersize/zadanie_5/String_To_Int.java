package com.kamil.excersize.zadanie_5;

import java.util.Scanner;

public class String_To_Int {
    public static void main(String[] args) {
        System.out.println(returnInt());
    }

    private static String returnInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj tekst z liczbą: ");
        String text = scanner.next().trim();
        char[] arr = text.toCharArray();
        String newString = "";
        for (int i = 0; i < arr.length; i++) {
            if (Character.isDigit(arr[i])) {
                newString = newString + "" + arr[i];
            }
        }
        return newString;
    }
}
/*Zdefiniować funkcję int strToInt(String str) , która zamienia liczbę całkowitą
zapisaną w postaci łańcucha na liczbę całkowitą typu int. Funkcja powinna
przerywać konwersję w momencie napotkania pierwszego znaku nie należącego do
zapisu liczby, zatem np. dla strToInt("-13krowa") wynikiem powinno być -13.
Pozostałe przykłady:
11
strToInt("+12") - wynik 12
strToInt("0001") - wynik 1
strToInt("991-234-23") - wynik 991
strToInt("+zonk") - wynik 0
strToInt("") - wynik 0
strToInt("-12e5") - wynik -12*10^5 = -120000
strToInt("-12e-5") - wynik -12, tylko dodatnie wykładniki są rozpatrywane*/
