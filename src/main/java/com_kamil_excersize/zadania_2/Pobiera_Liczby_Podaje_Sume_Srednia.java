package com_kamil_excersize.zadania_2;

import java.util.Arrays;
import java.util.Scanner;

public class Pobiera_Liczby_Podaje_Sume_Srednia {
    public static void main(String[] args) {
        pobierzLiczbe();
    }

    public static void pobierzLiczbe() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podawaj liczby. (0) konczy i podaje wyniki");

        Integer number = scanner.nextInt();
        String strNumber = String.valueOf(number);
        String separator = ";";

        while (number != 0) {
            number = scanner.nextInt();
            strNumber = strNumber + separator + number;
        }

        //removing 0 and last semicolon
        strNumber = strNumber.substring(0, strNumber.length() - 2);

        String[] newArr = strNumber.split(";");
        int[] arrInt = new int[newArr.length];

        //creating array of inegers
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = Integer.parseInt(newArr[i]);
        }
        System.out.println(Arrays.toString(arrInt));

        //find max min and arithmetic
        int max = arrInt[0];
        int min = arrInt[0];
        int suma = 0;
        double average = 0;
        int maxMinusMin = 0;

        for (int i = 0; i < arrInt.length; i++) {
            suma = suma + arrInt[i];

            if (arrInt[i] < min) {
                min = arrInt[i];
            } else if (arrInt[i] > max) {
                max = arrInt[i];
            }
            average = suma / arrInt.length;
            maxMinusMin = max - min;
        }
        System.out.println("max -> " + max + "\nmin -> " + min + "\nmax minus min -> " + maxMinusMin + "\nsuma -> " + suma + "\nsrednia -> " + average);
    }
}
/*Napisać program, który pobiera od użytkownika ciąg liczb całkowitych. Pobieranie
danych kończone jest podaniem wartości 0 (nie wliczana do danych). W następnej
kolejności program powinien wyświetlić sumę największej oraz najmniejszej z
podanych liczb oraz ich średnią arytmetyczną*/