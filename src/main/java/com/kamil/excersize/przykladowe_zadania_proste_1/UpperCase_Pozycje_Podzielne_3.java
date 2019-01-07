package com.kamil.excersize.przykladowe_zadania_proste_1;

import java.util.Arrays;

public class UpperCase_Pozycje_Podzielne_3 {
    public static void main(String[] args) {
        String text = "cotojassafafgvdxfbcvbvnvbndgsldjadgzfgjjhgkghzghaspfapsitzagszzdzesttocos";
        returnUpperCase(text);
    }

    private static void returnUpperCase(String text) {
        String[] strtoArr = text.split("");
        Integer counter = 0;
        for (int i = 0; i < strtoArr.length; i++) {
            if (i % 3 == 0) {
                strtoArr[i] = strtoArr[i].toUpperCase();
            } else if (strtoArr[i].equalsIgnoreCase("a") || strtoArr[i].equalsIgnoreCase("j") || strtoArr[i].equalsIgnoreCase("g") || strtoArr[i].equalsIgnoreCase("c") || strtoArr[i].equalsIgnoreCase("z")) {
                counter++;
            }
        }
        String newText = Arrays.toString(strtoArr);
        System.out.println("new String -> " + newText + "\ncounter -> " + counter);
    }
}
/*Napisać wczytujący łańcuch liter, a następnie zamieniający litery (z małych na duże) znajdujące się na
pozycjach podzielnych przez 3. Ponadto program zlicza liczbę wystąpień liter 'a', 'c', 'g', 'j' oraz 'z'. */