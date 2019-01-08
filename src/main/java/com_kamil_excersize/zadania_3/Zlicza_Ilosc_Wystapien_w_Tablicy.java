package com_kamil_excersize.zadania_3;

import java.util.Arrays;

public class Zlicza_Ilosc_Wystapien_w_Tablicy {
    public static void main(String[] args) {
        zliczWystapienia();
    }
    private static void zliczWystapienia() {
        Integer[]arr = new Integer[20];
        Integer counter = 0;

        Integer temp = 0;

        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*10)+1;
            temp = arr[i];
            for(int j = 0; j <arr.length; j++) {        //do poprawy
                if(temp == arr[j]) {
                    counter++;
                }
        }


            System.out.println( arr[i] +  " -> " + counter + "\n");

        }


        System.out.println(Arrays.toString(arr));
        }




    }


