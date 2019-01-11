package com_kamil_excersize.misztal_edu_pl.spotkanie_10_Odczyt_Zapis.zadanie_2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferAndFileReader {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferReader = null;
        String linia = "";

        try{
            bufferReader = new BufferedReader(new FileReader("zadanie_1.txt"));
            while ((linia = bufferReader.readLine())!=null) {
                System.out.println(linia);
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferReader.close();
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
