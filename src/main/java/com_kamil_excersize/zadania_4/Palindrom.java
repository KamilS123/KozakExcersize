package com_kamil_excersize.zadania_4;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        System.out.println(checkPalindrom());;
    }
    private static Boolean checkPalindrom() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pass word to check if palindrom: ");
        String wordToCheck = scanner.next();
        StringBuilder stringBuilder = new StringBuilder(wordToCheck).reverse();
        boolean check = true;

        if(wordToCheck.equalsIgnoreCase(String.valueOf(stringBuilder))) {
            check = true;
        } else {
            check = false;
        }
    return check;
    }
}
/*Napisać program, który wczytuje od użytkownika ciąg znaków, BufferReader następnie sprawdza,
czy podany ciąg jest palindromem.
*/