package com_kamil_excersize.przykladowe_zadania_1;

public class Losuje_Random_Dopoki_Zero {
    public static void main(String[] args) {
        losujDoZera();
    }

    private static void losujDoZera() {

        Integer randNumber = 0;
        Integer counter = 0;
        Integer newCountter = 0;
        int newRandNumber = 0;
        int parzysteDodatnie = 0;
        int nieparzysteUjemne = 0;

        do {
            randNumber = (int) (Math.random() * 300) - 150;
            counter++;
            System.out.println(randNumber);
            if(randNumber>0 && randNumber%2==0) {
                parzysteDodatnie = parzysteDodatnie + randNumber;
            }

        } while (randNumber != 0);

        for (int i = 0; i < counter; i++) {
            newRandNumber = (int) (Math.random() * 20) - 10;
            newCountter++;
            if (newRandNumber<0 && newRandNumber%2!=0) {

                    newRandNumber = newRandNumber*(-1);

                nieparzysteUjemne = nieparzysteUjemne + newRandNumber;
            }
            System.out.println("new:" + newRandNumber);
        }
        System.out.println("olcCounter: " + counter + " new counter " + newCountter + "\nstosunek PD/NU -> " + parzysteDodatnie/nieparzysteUjemne );
    }
}
/* Napisać program, który losuje liczby pseudolosowe z zakresu [-150, 150] dopóty, dopóki nie zostanie
wylosowana liczba 0. Następnie dokonuje dokładnie tyle samo losowań liczb pseudolosowych z zakresu [-
10, 10]. W wyniki działania programu należy wyświetlić stosunek sumy liczb parzystych dodatnich,
losowanych w pierwszej kolejności do iloczynu liczb nieparzystych ujemnych, losowanych w drugiej
kolejności.
Przykład:
Losowanie 1: 2 -42 11 124 0
Losowanie 2: -1 7 -3 -2
Wynik:
42,00000 // ( 2 + 124 ) / ( -1 * -3 ) = 126 / 3*/
