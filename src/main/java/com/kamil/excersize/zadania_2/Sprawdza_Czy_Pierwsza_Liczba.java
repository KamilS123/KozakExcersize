package com.kamil.excersize.zadania_2;

import java.util.Scanner;

public class Sprawdza_Czy_Pierwsza_Liczba {
    public static void main(String[] args) {
        System.out.println(sprawdz());
    }
    private static Boolean sprawdz() {
        Boolean check = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        Integer liczba = scanner.nextInt();


        if(liczba>2) {
            if(liczba%2==0) {
                return false;
            } else {
                for(int i = 0; i < Math.sqrt(liczba); i++) {
                    if(liczba%i==0) {
                        return false;
                    }                                            //do poprawy
                }
                return true;
            }
        } else if(liczba==2) {
            return true;
        }


        return check;
    }
}
/*Napisać program, który sprawdza, czy podana liczba całkowita n, n > 1, jest
liczbą pierwszą.*/