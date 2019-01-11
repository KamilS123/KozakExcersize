package com_kamil_excersize.misztal_edu_pl.spotkanie_9.grupa_rozszerzona.zadanie_3;

import com.sun.org.apache.bcel.internal.classfile.InnerClass;

class OuterClass {
    private int printInt = 90;

    public class InnerClass {
        public void accesQuoter() {
            System.out.println("drukuje prntInt " + printInt);
        }
    }

}

public class Zad3 {
    public static void main(String[] args) {
        OuterClass.InnerClass innerClass = new OuterClass().new InnerClass();
        innerClass.accesQuoter();
    }
}
/*Zadanie 3

Proszę przeczytać artykuł dotyczący klas wewnętrznych,
BufferReader następnie uruchomić funkcje accessOuter z poniższego kodu:*/