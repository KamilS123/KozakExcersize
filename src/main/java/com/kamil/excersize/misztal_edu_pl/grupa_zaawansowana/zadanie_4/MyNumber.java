package com.kamil.excersize.misztal_edu_pl.grupa_zaawansowana.zadanie_4;

public class MyNumber {
    private int number;
    boolean check = false;

    public MyNumber(int number) {
        this.number = number;
    }

    private Boolean isOdd() {
        if(number%2!=0) {
            check = true;
        }else {
            check=false;
        }
        return check;
    }

    private Boolean isEven() {
        if (number%2==0) {
            check = true;
        }else {
            check = false;
        }
        return check;
    }

    private double sqrt() {
        return Math.sqrt(number);
    }

    private double pow(MyNumber myNumber) {
        return Math.pow(number,myNumber.number);
    }

    private double add(MyNumber myNumber) {
        return myNumber.number + number;
    }

    private double substract(MyNumber myNumber) {
        return myNumber.number - number;
    }

    public static void main(String[] args) {
        MyNumber myNumber1 = new MyNumber(2);
        MyNumber myNumber2 = new MyNumber(5);

        System.out.println(myNumber1.substract(myNumber2));
        System.out.println(myNumber1.add(myNumber2));
        System.out.println(myNumber1.pow(myNumber2));
        System.out.println(myNumber2.sqrt());

    }
}
