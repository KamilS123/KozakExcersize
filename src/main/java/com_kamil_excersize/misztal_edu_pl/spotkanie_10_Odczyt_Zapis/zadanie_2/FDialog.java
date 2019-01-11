package com_kamil_excersize.misztal_edu_pl.spotkanie_10_Odczyt_Zapis.zadanie_2;

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FDialog {
    public static void main(String[] args) throws FileNotFoundException {
        Frame a = new Frame("Okno macierzyste");
        //a.setBounds(100,20,800,800);
        //a.setVisible(true);
        //a.setVisible(false);

        FileDialog fd = new FileDialog(new Frame("okno"), "Wczytaj", FileDialog.LOAD);
        fd.setVisible(true);

        String katalog = fd.getDirectory();
        String plik = fd.getFile();

        System.out.println("wybrano plik: " + plik);
        System.out.println("w katalogu: " + katalog);
        System.out.println("sciezka " + katalog+plik);

        File file = new File(plik);

        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
    }
}
