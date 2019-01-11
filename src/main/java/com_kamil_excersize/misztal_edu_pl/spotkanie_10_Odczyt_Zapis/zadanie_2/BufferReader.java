package com_kamil_excersize.misztal_edu_pl.spotkanie_10_Odczyt_Zapis.zadanie_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Podaj imie");
        String imie = in.readLine();
        System.out.println(imie);
    }
}
