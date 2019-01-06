package com.kamil.excersize.zadania_2;

import java.util.Arrays;
import java.util.Scanner;

public class wyswietla_nieparzyste_do_podanej {
    public static void main(String[] args) {
        oddNumber();
    }
    public static void oddNumber() {
        Scanner in = new Scanner(System.in);
        System.out.println("Pass number");
        Integer number = in.nextInt();
        for (int i = 0; i <= number; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
/*Napisać program, który pobiera od użytkownika liczbę całkowitą dodatnią, a następnie
wyświetla na ekranie kolejno wszystkie liczby niepatrzyste nie większe od
podanej liczby. Przykład, dla 15 program powinien wyświetlić 1, 3, 5, 7, 9, 11, 13,
15.
*/