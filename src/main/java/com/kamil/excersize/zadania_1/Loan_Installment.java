package com.kamil.excersize.zadania_1;

import java.util.Scanner;

public class Loan_Installment {
    public static void main(String[] args) {
        System.out.println("Cost of transaction is: " + monthlyInstallment());
    }
    public static Double monthlyInstallment() {
        Scanner in = new Scanner(System.in);

        System.out.println("Pass amount: ");
        Double amount = in.nextDouble();

        System.out.println("Pass number of loans");
        Integer numberOfLoans = in.nextInt();

        Double loanCost = 0.0;

       if(amount >= 100 && amount <= 10000 && numberOfLoans >= 6 && numberOfLoans <= 48) {
            if(numberOfLoans >= 6 && numberOfLoans <= 12) {
                loanCost = amount * 0.025;
            } else if(numberOfLoans >= 13 && numberOfLoans <= 24) {
                loanCost = amount * 0.05;
            } else if(numberOfLoans >= 25 && numberOfLoans <= 48) {
                loanCost = amount * 0.1;
            }
        }
        return amount + loanCost;
    }
}
/*W sklepie ze sprzętem AGD oferowana jest sprzedaż ratalna. Napisz program
umożliwiający wyliczenie wysokości miesięcznej raty za zakupiony sprzęt. Danymi
wejściowymi dla programu są:
• cena towaru (od 100 zł do 10 tyś. zł),
• liczba rat (od 6 do 48).
Kredyt jest oprocentowany w zależności od liczby rat:
• od 6–12 wynosi 2.5% ,
• od 13–24 wynosi 5%,
• od 25–48 wynosi 10%.
Obliczona miesięczna rata powinna zawierać również odsetki. Program powinien
sprawdzać, czy podane dane mieszczą się w określonych powyżej zakresach, a w
przypadku błędu pytać prosić użytkownika ponownie o podanie danych.*/