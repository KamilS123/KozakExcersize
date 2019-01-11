package com_kamil_excersize.misztal_edu_pl.spotkanie_10_Odczyt_Zapis.zadanie_2;

import java.io.*;

public class BufferedReaderWriter {
    public static void main(String[] args) throws IOException {
        String linia = "";
        try (
                BufferedReader fileReader = new BufferedReader(new FileReader("zadanie_1.txt"));
                BufferedWriter fileWriter = new BufferedWriter(new FileWriter("zadanie_1.txt"))
        ) {
            while((linia = fileReader.readLine()) != null) {
                System.out.println(linia);
                fileWriter.write(linia);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
