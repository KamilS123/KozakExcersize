package com_kamil_excersize.misztal_edu_pl.spotkanie_7.grupa_zaawansowana.zadanie_6;

public class Firma {
    public static void main(String[] args) {
        Pracownik pracownik = new Pracownik(30);
        System.out.println(pracownik.toString());


        Pracownik pracownik1 = new Pracownik("Jan");
        System.out.println(pracownik1.toString());
    }
}
/*Zadanie 6. Napisz program, który będzie się składał z dwóch klas:
Pracownik - przechowująca takie dane jak imię, nazwisko i wiek pracownika, oraz co najmniej trzy konstruktory,
 które posłużą do inicjowania obiektów z różnymi parametrami - w przypadku gdy przykładowo konstruktor przyjmuje tylko
 1 parametr, zainicjuj pozostałe pola jakimiś domyślnymi wartościami.
Firma - klasa testowa, w której utworzysz kilka obiektów klasy Pracownik i wyświetlisz dane na ekran.
Mile widziane wykorzystanie tablic oraz pętli.*/



