package com_kamil_excersize.misztal_edu_pl.spotkanie_10_Odczyt_Zapis.zadanie_2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream outputStream = null;
        String str = "Ala ma kota";

        try{
            outputStream = new FileOutputStream("zadanie_1.txt");
            for(int i = 0; i<str.length(); i++) {
                outputStream.write((int) str.charAt(i));  //zapis bajt po bajcie
            }
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                outputStream.close();
            }catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
