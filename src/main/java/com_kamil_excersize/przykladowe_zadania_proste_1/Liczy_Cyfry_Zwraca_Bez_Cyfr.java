package com_kamil_excersize.przykladowe_zadania_proste_1;

public class Liczy_Cyfry_Zwraca_Bez_Cyfr {
    public static void main(String[] args) {
        String text = "asds324rsr45ffw4w3";
        System.out.println(countDigit(text));
    }
    private static String countDigit(String text) {
        char[]charArr = text.toCharArray();
        String newStrDigit = "";
        String noDigits = "";
        for(Character s : charArr) {
            if (Character.isDigit(s)) {
                newStrDigit = newStrDigit + "" + s;
            } else {
                noDigits = noDigits + "" + s;
            }
        }
        return newStrDigit + " <-> " + noDigits;
    }
}
/*Napisać funkcję, która jako parametr otrzymuje łańcuch znaków. W wyniku działania funkcja zwraca
liczbę cyfr, które znajdowały się w podanym łańcuchu. Ponadto funkcja wyświetla łańcuch z pominiętymi
znakami odpowiadającymi cyfrom.
Przykład:
lancuch='asdf23tsdcs3cz2'
Funkcja zwróci wartość:
4
oraz przez parametr:
'asdftsdcscz' */