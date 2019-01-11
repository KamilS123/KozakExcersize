package com_kamil_excersize.zadanie_5;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("kokt","tokk"));
    }
    private static Boolean isAnagram(String text1, String text2) {
        Boolean chcek = false;
        String[]text1Arr = text1.split("");
        String[]text2Arr = text2.split("");

        Arrays.sort(text1Arr);
        Arrays.sort(text2Arr);

        for(int i = 0; i<text1Arr.length; i++) {
            if (text1Arr[i].equals(text2Arr[i])) {
                chcek = true;
            }else {
                chcek = false;
            }
        }
        return chcek;
    }
}
/*Napisać funkcję boolean czyAnagram(String t1, String t2) , która sprawdza,
czy łańcuch t2 jest anagramem tekstu t1 , czyli czy składa się z tych
samych znaków, ale ustawionych niekoniecznie w tej samej kolejności
Uwaga, należy sprawdzać jedynie małe i duże litery alfabetu angielskiego, jednak
bez względu na ich wielkość, tzn. zarówno małe ’BufferReader’ jak i duże ’A’ liczone są tak
samo. Pozostałe znaki nie są sprawdzane, BufferReader więc nie mają wpływu na to, czy
słowo będzie uznane za anagram innego.
Przykładowo, dla poniższego fragmentu programu:
System.out.println(czyAnagram("kolej", "olejk"));
System.out.println(czyAnagram("kolej", "kole"));
System.out.println(czyAnagram("kolej", "K O L E J"));
System.out.println(czyAnagram("Gregory House", "Huge ego, sorry"));
na ekranie powinno zostać wyświetlone:
true
false
true
true*/