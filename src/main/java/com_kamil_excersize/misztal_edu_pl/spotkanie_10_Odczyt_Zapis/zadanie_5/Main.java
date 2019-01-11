package com_kamil_excersize.misztal_edu_pl.spotkanie_10_Odczyt_Zapis.zadanie_5;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String wejściowy = "zadanie_1_printWriter.txt";
        String wyjściowy = "zadanie_5_wyjsciowy.txt";
        saveToFile(wejściowy);
        findAndSaveWord(wejściowy, wyjściowy, "kamil");

    }

    private static void saveToFile(String name) throws IOException {
        BufferedWriter writer = null;
        System.out.println("Podaj tekst oddzielony nl wtedy przejdziesz do nowej linii");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] textSplitted = text.split("nl");
        try {
            writer = new BufferedWriter(new FileWriter(name));
            for (int i = 0; i < textSplitted.length; i++) {
                writer.write(textSplitted[i]);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
        System.out.println("ZAPISANO!!!");
    }

    private static void findAndSaveWord(String plikWejsciowy, String plikWyjsciowy, String szukany) throws IOException {
        BufferedReader reader = null;
        BufferedWriter writer = null;
        String line = "";
        Integer numerLinii = 0;
        try {
            writer = new BufferedWriter(new FileWriter(plikWyjsciowy));
            reader = new BufferedReader(new FileReader(plikWejsciowy));
            while ((line = reader.readLine()) != null) {
                numerLinii++;
                if (line.contains(szukany)) {
                    writer.write("nr linii " + numerLinii + " " +line);
                    writer.newLine();
                    System.out.println("znalazłem w linii " + numerLinii + " " +  line);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                reader.close();
            }
            if (writer!=null) {
                writer.close();
        }
        }
        System.out.println("ZAPISANO WYNIK DO NOWEGO PLIKU!!!!!");
    }
}
/*Proszę napisać funkcję:

void szukaj(String nazwaPlikWe, String nazwaPlikWy, String slowo),
której zadaniem jest znalezienie wszystkich wierszy w pliku, które zawierają szukane słowo.
Wszystkie wiersze, które zawierają słowo powinny zostać zapisane w pliku wynikowym wraz z nr
 wiersza (z pierwszego pliku). Nazwa pierwszego pliku zapamiętana jest w parametrze nazwaPlikWe,
  nazwa pliku wynikowego podana jest w parametrze nazwaPlikWy, natomiast szukane słowo w
  parametrze slowo.

Przykład - plik wejściowy:

Ala ma jutro egzamin z biologii.
Jan myje auto.
Eh, jutro kolejny egzamin.
Nie lubie polityki.

Jeżeli szukanym słowem byłoby "egzamin", to plik wynikowy powinien wyglądać następująco:

1: Ala ma jutro egzamin z biologii.
3: Eh, jutro kolejny egzamin.*/