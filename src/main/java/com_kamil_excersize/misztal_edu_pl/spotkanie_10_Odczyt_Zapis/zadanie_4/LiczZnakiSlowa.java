package com_kamil_excersize.misztal_edu_pl.spotkanie_10_Odczyt_Zapis.zadanie_4;

import java.awt.*;
import java.io.*;

public class LiczZnakiSlowa {
    public static void main(String[] args) throws IOException {
        FileDialog fd = new FileDialog(new Frame("Wybierz"), "Wybierz", FileDialog.LOAD);
        fd.setVisible(true);
        String plik = fd.getFile();
        saveToFile(plik);
        liczLinie(plik);
        liczZnaki(plik);
        liczBialeZnaki(plik);
        liczLiczbeSlow(plik);
    }

    private static void saveToFile(String plik) throws IOException {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(plik));
            for (char a = 'a'; a <= 'z'; a++) {
                writer.write(a + " znak " + a);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }

    private static void liczLinie(String plik) throws IOException {
        BufferedReader reader = null;
        String linia = "";
        Integer linesCounter = 0;
        try {
            reader = new BufferedReader(new FileReader(plik));
            while ((linia = reader.readLine()) != null) {
                linesCounter++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
        System.out.println("Liczba linii: " + linesCounter);
    }

    private static void liczZnaki(String plik) throws IOException {
        BufferedReader reader = null;
        Integer licznikZnakow = 0;
        String line = "";
        try {
            reader = new BufferedReader(new FileReader(plik));
            while ((line = reader.readLine()) != null) {
                licznikZnakow = licznikZnakow + line.length();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
        System.out.println("liczba znaków " + licznikZnakow);
    }

    private static void liczBialeZnaki(String plik) throws IOException {
        BufferedReader reader = null;
        Integer whiteCounter = 0;
        String line = "";
        char znak = ' ';
        try {
            reader = new BufferedReader(new FileReader(plik));

                while ((line = reader.readLine()) != null) {
                    for (int i = 0; i < line.length(); i++) {
                        znak = (line.charAt(i));
                        if (znak==(' ')) {
                        whiteCounter++;
                    }
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
        System.out.println("białe znaki: " + whiteCounter);
    }

    private static void liczLiczbeSlow(String plik) throws IOException {
        BufferedReader reader = null;
        String line = "";
        String[]lineArr = {};
        Integer lineArrLength = 0;
        try{
            reader = new BufferedReader(new FileReader(plik));
            while ((line=reader.readLine())!=null) {
//                for(int i = 0; i<line.length(); i++) {
                    lineArr = line.split(" ");
                    lineArrLength = lineArrLength + lineArr.length;
//                }
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            if (reader!=null) {
                reader.close();
            }
        }
        System.out.println("liczba słów w pliku " + lineArrLength);
    }
}
/*Zadanie 4

Napisać funkcję liczZnakiSlowa, która zlicza:

liczbę linii w pliku,
liczbę znaków w pliku,
liczbę białych znaków w pliku (białe znaki to spacja, tabulator, znacznik końca wiersza),
liczbę słów w pliku.
Wynikiem funkcji jest tablica złożona z 4 liczb całkowitych po jednej dla wymienionych podpunktów*/