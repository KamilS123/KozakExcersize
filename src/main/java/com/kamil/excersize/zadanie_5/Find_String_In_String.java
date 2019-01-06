package com.kamil.excersize.zadanie_5;

public class Find_String_In_String {
    public static void main(String[] args) {
        System.out.println(strFind("co", "ktocoJakCo"));
    }

    private static Integer strFind(String what, String where) {
        Integer position = 0;
        if (where.contains(what)) {
            position = where.indexOf(what);
        } else if (what.equals(" ")) {
            return 0;
        } else {
            position = -1;
        }
        return position;
    }
}
/*Zdefiniować funkcję int strfind(String gdzie, String co) , która szuka łańcucha
co w łańcuchu gdzie i jeżeli go znajdzie, to jej wynikiem jest pozycja,
na której ten łańcuch zaczyna się w łańcuchu gdzie . Jeżeli nie udało się znaleźć
łańcucha to wtedy wynikiem ma być -1.
Przykłady:
strfind("Ala ma kota", "ma") - wynik to 4
strfind("Ala ma kota", "Ala ma kota") - wynik to 0
strfind("Ala ma kota", "") - wynik to 0, bo pusty łańcuch jest
podłańcuchem każdego innego łańcucha
strfind("Pies", "jakis napis") - wynik to -1
strfind("Ala ma kota", "pies") - wynik to -1
*/
