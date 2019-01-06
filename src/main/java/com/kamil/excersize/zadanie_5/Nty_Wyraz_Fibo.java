package com.kamil.excersize.zadanie_5;

import java.util.Scanner;

public class Nty_Wyraz_Fibo {
    public static void main(String[] args) {

    }
    private static Integer returnFibo() {
        Integer result = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj numer Fibo do obliczenie: ");
        Integer number = scanner.nextInt();

        if(number==0) {
            result = 1;
        }else if (number==1) {
            result = 2;
        }else if(number > 1) {
            result =
        }


        return result;
    }
}
