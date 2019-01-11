package com_kamil_excersize.misztal_edu_pl.spotkanie_10_Odczyt_Zapis.zadanie_2;

import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;

public class FInputStream {
    public static void main(String[] args) {
        FileInputStream fis = null;
        int bajt = 0;

        try{
            fis = new FileInputStream("zadanie_1.txt");
            bajt = fis.read();
            while (bajt!=-1) { //-1 określa koniec pliku
                System.out.println((char)bajt);
                bajt = fis.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                fis.close();
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
