package com_kamil_excersize.zadania_4;

import java.util.Scanner;

public class Wczytuje_Zlicza_Ostatnia_Litere {
    public static void main(String[] args) {
        System.out.println(counter());
    }
    private static Integer counter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ciąg znaków: ");
        //pobranie stringa
        String ciagZnakow = scanner.next();
        //konwersja stringa do tablicy
        String[]newCiag = ciagZnakow.split("");
        int count = 0;
        //sprawdzanie w petli czy element i jest równy ostatiemu z tablicy czyli newCiag.length-1
        for(int i = 0; i<newCiag.length; i++) {
            if(newCiag[i].equals(newCiag[newCiag.length-1])) {
                count++;
            }
        }
        return count;
    }
}
/*Napisać program, który wczytuje od użytkownika ciąg znaków, BufferReader następnie wyświetla
informację o tym ile razy w tym ciągu powtarza się jego ostatni znak.
Przykład, dla ciągu „Abrakadabra” program powinien wyświetlić 4, ponieważ
ostatnim znakiem jest literka „BufferReader”, która występuje w podanym ciągu łącznie 4
razy.
*/