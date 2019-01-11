package com_kamil_excersize.misztal_edu_pl.spotkanie_9.grupa_rozszerzona.zadanie_1;

public class Circle implements Figure{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public double getArea() {
        return Math.PI*(radius*radius);
    }

    @Override
    public String getType() {
        return "Circle";
    }

}
