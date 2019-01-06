package com.kamil.excersize.zadania_1;

import java.util.Scanner;

public class Read_3_Numbers_Show_Max_Min {
    public static void main(String[] args) {
        showMaxMIn();
    }
    public static void showMaxMIn() {
        Scanner in = new Scanner(System.in);
        System.out.println("Give first number ");
        Integer first = in.nextInt();
        System.out.println("Give second number ");
        Integer second = in.nextInt();
        System.out.println("Give third number ");
        Integer third = in.nextInt();

        Integer[]numbers = {first,second,third};

        Integer max = first;
        Integer min = first;

        for(int i = 0; i<numbers.length; i++) {
            if(max <= numbers[i]) {
                max = numbers[i];
            }
            if(min >= numbers[i]) {
                min = numbers[i];
            }
        }
        System.out.println("max: " + max + " min: " + min);
    }


}
/* Wczytać od użytkownika 3 liczby całkowite i wypisać na ekran największą oraz
najmniejszą z nich*/