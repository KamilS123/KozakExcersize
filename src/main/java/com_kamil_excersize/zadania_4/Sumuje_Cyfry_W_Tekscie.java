package com_kamil_excersize.zadania_4;

import java.util.Scanner;

public class Sumuje_Cyfry_W_Tekscie {
    public static void main(String[] args) {
        sumujCyfry();
    }

    private static void sumujCyfry() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text: ");
        String inputText = sc.nextLine();
        int result = 0;
        for (int i = 0; i < inputText.length(); i++) {
            char c = inputText.charAt(i);
            if (c >= 48 && c <= 57) {
                result += c - 48;
            }
        }
        System.out.println("Sum of decimal integers in input text: " + result);
    }
}
/*. Napisać program, który sumuje cyfry w tekście podanym przez użytkownika.
Przykład:
"Ala ma 1 psa i 2 koty. Jola ma 10 rybek i 2 papugi."
Wynik:
6
*/