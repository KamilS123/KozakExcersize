package com_kamil_excersize.przykladowe_zadania_1;

import java.util.Arrays;
import java.util.Scanner;

public class Wczytuje_do_Ujemnej_losuje_Random_Maxa {
    public static void main(String[] args) {
        getRandom();
    }
    private static void getRandom() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podawaj liczby. Mniejsza od 1 kończy program ");
        Integer number;
        int max = 0;

        do{
            number = scanner.nextInt();    //do lekiej poprawy
            int[]numbers = {number};
            for(Integer i : numbers) {
                if(i>max) {
                    max = i;
                }
            }
            int[]newArr = new int[max];
            for(int i = 0; i<newArr.length; i++) {
                newArr[i] = (int)(Math.random()*398)-199;
            }
            System.out.println(Arrays.toString(newArr));
        }while (number>=1);
    }
}
/*Napisać program, który wczytuje od użytkownika liczby dopóty, dopóki nie zostanie podana liczba
mniejsza od 1. Następnie dokonuje losowania tylu liczb, ile wynosiła maksymalna z wartości podanych przez
użytkownika. Zakres losowanych liczb, to -199 do 199. W wyniku powinien zostać wyświetlony stosunek
średniej arytmetycznej wszystkich „co drugich" wylosowanych liczb dodatnich do wszystkich co trzecich
wylosowanych liczb (można zacząć od dowolnego momentu, ale nie później niż od 2 i 3 z podanych liczb).
W programie nie należy używać tablic.
Przykład podany przez użytkownika:
4 2 -5
Wylosowane liczby:
3 -12 22 5
Wynik:
0,227 // bo 5 / 22*/