package com_kamil_excersize.misztal_edu_pl.spotkanie_10_Odczyt_Zapis.zadanie_2;

import java.awt.*;
import java.io.*;

public class OdczytPlikuTekstowego {

    public static void odczytPliku(String nazwa) throws IOException {
        // klasa FileReader służy do odczytu plików tekstowych
        // następuje automatyczna konwersja odczytanych bajtów na znaki
        // unicode (16 bitowe)
        FileReader fileReader = null;

        try {
            fileReader = new FileReader(nazwa);
            System.out.println("odczyt znak po znaku");
            int c;
            while ((c = fileReader.read()) != -1) {
                System.out.println((char)c);
            }
        } finally {
            if (fileReader != null) {
                fileReader.close();
            }
        }
        FileDialog a = new FileDialog(new Frame("okno"),"wczytaj",FileDialog.LOAD);


        FileDialog fd = new FileDialog(new Frame("Okno wyboru"), "Wybierz coś", FileDialog.LOAD);
        fd.setVisible(true);
        String plik = fd.getFile();
        //odczyt wiersz po wierszu
        BufferedReader plik2 = null;
        try {
            plik2 = new BufferedReader(new FileReader(plik));
            String text = plik2.readLine();
            while (text!=null) {
                System.out.println(text);
                text = plik2.readLine();
            }
        }finally {
            if (plik2!=null) {
                plik2.close();
            }
        }
    }
    public static void zapisDoPliku(String nazwa) throws IOException {
        BufferedWriter writer = null;

        try {
            //tworze nowy plik tekstowy
            writer = new BufferedWriter(new FileWriter(nazwa));

            for(char z = 'a'; z<='z'; z++){
                writer.write(z);
                writer.newLine();
            }
        }finally {
            if(writer!=null) {
                writer.close();
            }
        }
    }
    public static boolean czyPlikIstnieje(String nazwa) {
        File file = new File(nazwa);
        return  (file.exists() && file.isFile());
    }

    public static void main(String[] args) throws IOException {
        OdczytPlikuTekstowego odczyt = new OdczytPlikuTekstowego();
        odczytPliku("zadanie_1.txt");
        zapisDoPliku("zadanie_1.txt");
        System.out.println(czyPlikIstnieje("zadanie_1.txt"));
    }
}
