package com_kamil_excersize.misztal_edu_pl.spotkanie_9.grupa_rozszerzona.zadanie_1;

public class Triangle implements Figure {
    private double a;
    private double b;
    private double hypotenause;

    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
        this.hypotenause = Math.sqrt(a*a + b*b);
    }

    @Override
    public double getPerimeter() {
        return a+b+hypotenause;
    }

    @Override
    public double getArea() {
        return a*b/2;
    }

    @Override
    public String getType() {
        return "Triangle";
    }
}
