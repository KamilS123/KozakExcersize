package com_kamil_excersize.zadanie_5;

public class Przestawia_Litery_W_Stringu {
    public static void main(String[] args) {
        int[]kolejnosc = {3,2,1,5,4};
        System.out.println(poprzestawiaj("Kowal",kolejnosc));
    }
    private static String poprzestawiaj(String text, int[]kolejnosc) {
        String[]textArr = text.split("");

        for(int i = 0; i<textArr.length; i++) {
            kolejnosc[i] = Integer.parseInt(textArr[i]);   //do poprawy
        }
        String changedText = String.valueOf(textArr);
        return changedText;
    }
}
/*Napisać funkcję String poprzestawiaj(String tekst, int [] kolejnosc) ,
której wynikiem jest łańcuch złożony ze znaków w zmiennej tekst ułożonych wg
kolejności podanej w tablicy kolejnosc , tzn. i-ty znak tekstu powinien znaleźć
się w wynikowym łańcuchu na pozycji kolejnosc[i] .
Przykład, dla poniższego wywołania funkcji:
13
String tekst = "Egzamin";
int [] kol = { 0, 1, 4, 3, 2, 6, 5 };
System.out.println(poprzestawiaj(tekst, kol));
wynikiem powinien być łańcuch:
Egmazni
*/