package com.kamil.excersize.zadania_1;

import java.util.Scanner;

public class TaxCounter {
    public static void main(String[] args) {
        TaxCounter taxCounter = new TaxCounter();

        System.out.println(taxCounter.countTax());
    }
    public Double countTax() {
        Scanner in = new Scanner(System.in);
        System.out.println("Pass income: ");
        Double incomes = in.nextDouble();

        Double taxToPaid = incomes*0.18;

        if(incomes <= 85528) {
            taxToPaid = taxToPaid-556.02;
        }else if(incomes > 85528) {
            taxToPaid = 14839.02 + ((incomes - 85528)*0.32);
        }
        return taxToPaid;
    }
}
/*Napisać program obliczający należny podatek dochodowy od osób fizycznych. Program
ma pobierać od użytkownika dochód i po obliczeniu wypisywać na ekranie
należny podatek. Podatek obliczany jest wg. następujących reguł:
• do 85.528 podatek wynosi 18% podstawy minus 556,02 PLN,
• od 85.528 podatek wynosi 14.839,02 zł + 32% nadwyżki ponad 85.528,00*/