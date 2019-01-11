package com_kamil_excersize.zadania_4;

import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
        System.out.println(reverse());
    }
    private static StringBuilder reverse() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pas word to reverse: ");
        String wordsToReverse = scanner.next();

        StringBuilder stringBuilder = new StringBuilder(wordsToReverse).reverse();

        return stringBuilder;
    }
}
/*Napisać program, który wczytuje od użytkownika ciąg znaków, BufferReader następnie tworzy
łańcuch będący odwróceniem podanego łańcucha i wyświetla go na ekranie.
Przykładowo, dla łańcucha „Kot” wynikiem powinien być łańcuch „toK”.*/