package com.kamil.excersize.zadanie_5;

public class Cut_From_String {
    public static void main(String[] args) {
        System.out.println(cut("ana ma kota",3,7));
    }
    private static String cut(String text, Integer start, Integer end) {
        String t = text.substring(start,end);
        String newtext = text.replaceAll(t,"");

        return newtext;
    }
}
/*Zdefiniować procedurę String strcut(String str, int start, int ile) , która
wycina z podanego łańcucha wszystko co znajduje się w podanym zakresie. Wynikiem
funkcji powinien być łańcuch bez znaków znajdujących się na pozycjach
od start do start+ile-1 .
Przykłady:
strcut("Ala ma kota", 4, 3) - wynik to "Ala kota"
strcut("Ala ma kota", 0, 4) - wynik to "ma kota"
strcut("Ala ma kota", 0, 11) - wynik to ""*/