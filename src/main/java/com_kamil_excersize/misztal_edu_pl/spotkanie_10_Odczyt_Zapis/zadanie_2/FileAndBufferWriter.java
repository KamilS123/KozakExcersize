package com_kamil_excersize.misztal_edu_pl.spotkanie_10_Odczyt_Zapis.zadanie_2;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileAndBufferWriter {
    public static void main(String[] args) throws IOException {
        String[]line = {"one", "two", "three", "four", "five"};

        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("zadanie_1.txt"));
            for(int i = 0; i<line.length; i++) {
                bw.write(line[i]);
                bw.newLine();
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bw.close();
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
