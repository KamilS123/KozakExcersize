package com_kamil_excersize.misztal_edu_pl.spotkanie_9.grupa_rozszerzona.zadanie_1;

public class Rectangle implements Figure {
    double a;
    double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public double getPerimeter() {
        return a+a+b+b;
    }

    @Override
    public double getArea() {
        return a*b;
    }

    @Override
    public String getType() {
        return "Rectangle";
    }
}
