package com_kamil_excersize.misztal_edu_pl.spotkanie_9.grupa_rozszerzona.zadanie_6;

public class MyExceprion extends Throwable {
    private int a,b;

    public MyExceprion(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public String toString() {
        return "mój wyjatek--- " + a + " " + b;
    }
/////////////////////////////////

////////////////////////////////
}
class Wyjatki {
    private static int f(int a,int b) throws MyExceprion {
        if(a/b==2) {
            throw new MyExceprion(a,b);
        }
        return a/b;
    }
    public static void main(String[] args) throws MyExceprion {


        try {
            System.out.println(f(8, 4));
        }catch (MyExceprion e) {
            System.out.println("My Exc " + e);
        }
    }
}
//tworzenie własnego wyjątku