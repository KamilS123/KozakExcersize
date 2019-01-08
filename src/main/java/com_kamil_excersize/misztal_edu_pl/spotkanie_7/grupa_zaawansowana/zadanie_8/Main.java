package com_kamil_excersize.misztal_edu_pl.spotkanie_7.grupa_zaawansowana.zadanie_8;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista(10);
        lista.dodajElement(3);
        lista.dodajElement(3);
        lista.dodajElement(3);
        lista.dodajElement(3);
        lista.dodajElement(3);
        lista.znajdz(1);
    }
}
/*Zadanie 8. Napisać klasę Lista, której zadaniem będzie przechowywać listę liczb całkowitych. Klasa ta powinna
następujące pola prywatne:

int [] liczby; - tablica, w której przechowywane będą liczby
int pojemnosc; - maksymalna liczba elementów, możliwych do przechowywania
int rozmiar; - liczba przechowywanych elementów (liczb w tablicy ,,liczby'')
Klasa Lista powinna mieć również następujące metody:

konstruktor z parametrem określającym pojemność, który przydziela pamięć dla tablicy liczby oraz ustala wartości
 pozostałych pól klasy;
metodę dodajElement, która przyjmuje dokładnie jeden element – liczbę całkowitą, która dodawana jest do listy; w
przypadku, gdy lista jest pełna powinien zostać wyświetlony komunikat o błędzie;
metodę znajdz, której jedynym parametrem powinna być szukana liczba, natomiast wynikiem pozycja podanej liczby w
liście (licząc od 0) lub -1, gdy liczby nie ma na liście;
bezparametrową metodę pisz, która wypisuje informacje o liście, w tym jej rozmiar, pojemność oraz listę przechowywanych
 elementów;
metodę usunPierwszy, która usuwa pierwsze wystąpienie podanej jako parametr liczby, jeżeli znajduje się ona na liście,
tzn. jeżeli podana liczba występuje więcej niż jeden raz, to usuwane jest jedynie pierwsze jej wystąpienie;
metodę usunPowtorzenia, która usuwa wszystkie powtórzenia elementów na liście, tzn. po jej wykonaniu na liście nie
 powinno być żadnych powtórzonych liczb.
Przykładowo, po wykonaniu poniższego fragmentu:

public static void main(String [] args) {
    final int N = 10;
    Lista l = new Lista(N);

    for (int i = 0; i < N/2; ++i) {
        // Dzialanie n << s to przesuniecie s bitow w n z uwzglednieniem bitu znaku
        // Przyklad: 11 << 3 = 11 * 2^3 = 11 * 8 = 88
        // 11 (binarnie)  =    0000 1011
        // przesuniecie o 3    0101 1000
        l.dodajElement( (1 << i) );
    }
    l.dodajElement(2);
    l.dodajElement(8);
    l.pisz();
    l.usunPierwszy(2);
    l.pisz();
    for (int i = 0; i < N/2; ++i) {
        l.dodajElement( (1 << i) );
    }
    l.pisz();
    System.out.println("Po usunieciu powtorzen:");
    l.usunPowtorzenia();
    l.pisz();
}*/