package com.kamil.excersize.zadanie_5;

public class Prefix {
    public static void main(String[] args) {
        System.out.println(isPrefix("dalamakota","ala"));
    }
    private static Boolean isPrefix(String str1, String str2) {
        Boolean result = false;

        if (str1.startsWith(str2)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
/*Zdefiniować funkcję boolean startsWith(String str1, String str2) , która
sprawdza, czy łańcuch str2 jest prefiksem łańcucha str1 .
Przykłady:
startsWith("Alibaba", "Ali") - wynik true, ponieważ wyraz
"Alibaba" zaczyna się wyrazem "Ali".
startsWith("Alibaba", "Alibaba") - wynik true, ponieważ wyraz jest
zawsze swoim prefiksem.
startsWith("Kot", "Pies") - wynik false, ponieważ wyraz "Pies"
nie jest prefiksem wyrazu "Kot"*/