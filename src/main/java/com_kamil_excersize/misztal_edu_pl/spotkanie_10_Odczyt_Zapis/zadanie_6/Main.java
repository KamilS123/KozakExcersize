package com_kamil_excersize.misztal_edu_pl.spotkanie_10_Odczyt_Zapis.zadanie_6;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String plikWyjsciowy = "emerytura_wyjsciowy.txt";
        Emerytura emeryt1 = new Emerytura("Maria","Kowalska","Kobieta",78);
        Emerytura emeryt2 = new Emerytura("Maria","Kowalska","Kobieta",78);
        Emerytura emeryt3 = new Emerytura("Maria","Kowalska","Kobieta",78);
        Emerytura emeryt4 = new Emerytura("Maria","Kowalska","Kobieta",78);
        Emerytura emeryt5 = new Emerytura("Maria","Kowalska","Kobieta",78);
        saveToFile(emeryt1,plikWyjsciowy);
        saveToFile(emeryt2,plikWyjsciowy);
        saveToFile(emeryt3,plikWyjsciowy);
        saveToFile(emeryt4,plikWyjsciowy);
        saveToFile(emeryt5,plikWyjsciowy);
    }
    private static void saveToFile(Emerytura emerytura, String plikWyjściowy) throws IOException {
        BufferedWriter writer = null;
        BufferedReader reader = null;
        String line = "";
        String[]lines = {};

        try{
            reader = new BufferedReader(new FileReader(plikWyjściowy));
            writer = new BufferedWriter(new FileWriter(plikWyjściowy));

            while ((line=reader.readLine())!=null) {
                for(int i = 0; i<line.length(); i++) {
                    System.out.println(reader.readLine());
                }
            }
            writer.write(emerytura.getName() + " " + emerytura.getSurname() + " " + emerytura.getMale() + " " + emerytura.getAge());
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (writer!=null) {
                writer.close();
            }
            if (reader!=null) {
                reader.close();
            }
        }
    }
}
/*Zadanie 6

Napisać funkcję emerytura(String nazwaPliku), która wczyta z pliku o podanej nazwie dane pracowników zapisane w
 kolejnych wierszach w następujący sposób:

Imię Nazwisko Płeć Wiek
Przykład:

Tomasz Nowak M 42
Marta Ziobro K 41
Jan Kowalski M 25
Ewelina Tusk K 35
Następnie funkcja dla każdego pracownika powinna wyznaczyć ile lat pozostało do jego emerytury. Wyniki należy zapisać
w następujący sposób:

Nazwisko Imię "Lata do emerytury"
Przykład:

Nowak Tomasz 25
Kowalski Jan 42
Wyniki dla kobiet należy zapisać w pliku o nazwie "kobiety.txt", natomiast wyniki dla mężczyzn należy zapisać w pliku "mezczyzni.txt".*/