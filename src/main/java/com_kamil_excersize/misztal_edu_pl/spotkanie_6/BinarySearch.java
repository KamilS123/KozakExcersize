package com_kamil_excersize.misztal_edu_pl.spotkanie_6;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[]list = new int[]{4,3,2,6,5,2,7,3,6,9,1};
        System.out.println(binarySearch(list));
        System.out.println(Arrays.toString(arraysSort(list)));
    }
    private static Integer binarySearch(int[]list) {
        int n = 2;
       return Arrays.binarySearch(list,3);
    }

    private static int[] arraysSort(int[]list) {
        Arrays.sort(list);
        return list;
    }
}
/*Zadanie 4
Napisz funkcję wykorzystującą funkcję java.util.Arrays.binarySearch do znajdowania elementów w liście.*/
/*Zadanie 5
Napisz funkcję wykorzystującą funkcję java.util.Arrays.sortdo sortowania elementów listy.*/