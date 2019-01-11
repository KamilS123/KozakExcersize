package com_kamil_excersize.misztal_edu_pl.spotkanie_10_Odczyt_Zapis.zadanie_1_printWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zapis_Z_Klawiatury {
    public static void main(String[] args) throws FileNotFoundException {
        saveToFile();
        readFromFile();
        /*File plik = new File("zadanie_1_printWriter.txt");
        Scanner odczyt = new Scanner(plik);
        String text = odczyt.nextLine();
        while (odczyt.hasNext()) {
            System.out.println(odczyt.nextLine());
        }

        PrintWriter writer = new PrintWriter("zadanie_1_printWriter.txt");
        for(int i = 0; i<10; i++) {
            writer.write("ala ma kota\n");
        }

        writer.close();*/
    }
    public static void saveToFile() throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst do pliku: ");
        String text = scanner.nextLine();
        File file = new File("zadanie_1_printWriter.txt");
        PrintWriter printWriter = new PrintWriter("zadanie_1_printWriter.txt");
        for(int i = 0; i<10; i++) {
            printWriter.write(text.charAt(i));
        }
        printWriter.close();
    }
    public static void readFromFile() throws FileNotFoundException {
        File file = new File("zadanie_1_printWriter.txt");
        Scanner odczyt = new Scanner(file);
        while (odczyt.hasNext()) {
            System.out.println(odczyt.nextLine());
        }
    }
}
