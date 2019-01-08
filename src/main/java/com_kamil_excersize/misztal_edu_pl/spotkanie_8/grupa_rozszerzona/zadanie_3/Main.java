package com_kamil_excersize.misztal_edu_pl.spotkanie_8.grupa_rozszerzona.zadanie_3;

public class Main {
    public static void main(String args[]) {
        Vehicle v = new Vehicle("muscles", 2);
        Vehicle v1 = new Car("electric");
        Car c = new Car("internal combustion");

        v.startEngine();
        System.out.println();
        v1.startEngine();
        System.out.println();
//        v1.refuel(5); // blad
        ((Car)v1).refuel(5);

        System.out.println();
        c.startEngine();
        System.out.println();

        if (v1 instanceof Car) {
            Car c1 = (Car) v1;
            c1.startEngine();
            c1.refuel(7);
        }

        System.out.println();
        Vehicle v2 = c;
        System.out.println();
//         v2.refuel(5);  // blad
        ((Car)v2).refuel(10);
        System.out.println("---------------SUV----------------");

        SUV suv = new SUV("mocny");
        suv.startEngine();
        System.out.println();
        suv.refuel(30);

        System.out.println("--------SUV RZUTOWANIE-------------");
        Car car = new SUV("mocnySUV");
        (car).startEngine();
        System.out.println("---instanceof---------------");
        if(car instanceof Car) {
            car.refuel(50);
        }
    }
}
/*Uruchom i przeanalizuj kod.

 */