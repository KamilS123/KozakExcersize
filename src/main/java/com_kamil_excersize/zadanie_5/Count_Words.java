package com_kamil_excersize.zadanie_5;

public class Count_Words {
    public static void main(String[] args) {
        System.out.println(countWords("co jak co ale późno już jest bo taka sytuacja"));
    }
    private static Integer countWords(String words) {
        Integer numberOfWords = 0;
        char[]arr = words.toCharArray();
        for (int i = 0; i<words.length(); i++) {
            if(Character.isWhitespace(arr[i])) {
                numberOfWords++;
            }
        }
        return numberOfWords + 1;
    }
}
/* Napisać funkcję int wordCount(String text) , której wynikiem jest liczba wszystkich
słów występujących w podanym jako parametr tekście. Do sprawdzania, czy
dany znak tekstu jest „białym znakiem” można zastosować metodę
Character.isWhitespace . Za słowo przyjmujemy każdy ciąg znaków niezawierający
białego znaku.
*/