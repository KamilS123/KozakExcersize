package com_kamil_excersize.misztal_edu_pl.spotkanie_9.grupa_rozszerzona.zadanie_4;

import java.util.Scanner;

public class Rozne_Wyjatki {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(System.in);
            System.out.println("Wpisz wartość: ");
            int i0 = input.nextInt();
            int i1 = input.nextInt();
            System.out.println(i0/i1);
        }catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Złapałem arrayIndexOutOfBoundsException " + ex);
        }catch (NullPointerException e) {
            System.out.println("Złapałem NullPointerException " + e);
        }catch (ArithmeticException e) {
            System.out.println("Złapałem ArithmeticException " + e);
        }catch (Exception e) {
            System.out.println("Złapałem Exception " + e);
        }
    }
}