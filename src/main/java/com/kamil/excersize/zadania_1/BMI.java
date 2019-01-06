package com.kamil.excersize.zadania_1;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        System.out.println(countBMI());
    }
    public static String countBMI() {
        Scanner in = new Scanner(System.in);

        System.out.println("Pass weight");
        Double weight = in.nextDouble();
        System.out.println("Pass height");
        Double height = in.nextDouble();

        Double bmi = (weight/(height*2))*100;
        String bmiResult = " ";

        if(bmi >= 18.5 && bmi <= 24.9) {
            bmiResult = "Perfect weight";
        } else if(bmi<18.5) {
            bmiResult = "Underweight";
        } else {
            bmiResult = "Overweight";
        }
        return bmiResult;
    }
}
/* Napisać program, który oblicza wartość współczynnika BMI (ang. body mass
index) wg. wzoru: waga
wzrost2 . Jeżeli wynik jest w przedziale (18,5 - 24,9) to wypisuje
”waga prawidłowa”, jeżeli poniżej to ”niedowaga”, jeżeli powyżej ”nadwaga”.
*/
