package com_kamil_excersize.zadanie_5;

public class Liczy_Wystapienia_Slowa {
    public static void main(String[] args) {
        System.out.println(liczWystapienia("co", "co jak co ale co co"));
    }
    private static Integer liczWystapienia(String what, String where) {
        Integer counter = 0;
        String[]strArr = where.split(" ");

        for(String s : strArr) {
            if (s.contains(what)) {
                counter++;
            }
        }
        return counter;
    }
}
/* Zdefiniować funkcję int strFindAndCount(String gdzie, String co) , która
zlicza wystąpienia łańcucha co w łańcuchu gdzie . Jej wynikiem jest wyznaczona
liczba wystąpień. Jeżeli nie udało się znaleźć łańcucha, to wtedy wynikiem
jest, oczywiście, 0.
Przykłady:
strFindAndCount("Ala ma kota", "ma") - wynik to 1
strFindAndCount("mama ma kota", "ma") - wynik to 3
strFindAndCount("Ala mmaa ma kota", "ma") - wynik to 2
strFindAndCount("Ala ma kota", "Asia") - wynik to 0*/