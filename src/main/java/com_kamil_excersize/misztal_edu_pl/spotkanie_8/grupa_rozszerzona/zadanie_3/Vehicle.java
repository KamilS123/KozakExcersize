package com_kamil_excersize.misztal_edu_pl.spotkanie_8.grupa_rozszerzona.zadanie_3;

public class Vehicle {
    private int numberOfWheels;
    private String engine;

    public Vehicle(String engine, int numberOfWheels) {
        this.engine = engine;
        this.numberOfWheels = numberOfWheels;
    }

    public void startEngine() {
        System.out.println("Engine starts. Brum brum brum.");
    }
}

class Car extends Vehicle {
    private static final int NUMBER_OF_WHEELS = 4;

    public Car(String engine) {
        super(engine, NUMBER_OF_WHEELS);
    }

    public void startEngine() {
        super.startEngine();
        System.out.println("Force driver to fasten seat belts.");
    }

    public void refuel(double nr_liters){
        System.out.println("Refueled " + nr_liters + " units of fuel.");
    }
}

class SUV extends Car {
    private static final int NUMBER_OF_WHEEL = 4;

    public SUV(String engine) {
        super(engine);
    }

    public void startEngine() {
        super.startEngine();
        System.out.println("SUV starting");
    }

    public void refuel(double nr_litres) {
        System.out.println("Refueled " + nr_litres + " units to your SUV");
    }
}
