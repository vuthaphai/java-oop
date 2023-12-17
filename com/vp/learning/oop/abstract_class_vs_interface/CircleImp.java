package com.vp.learning.oop.abstract_class_vs_interface;

public class CircleImp implements ShapeInterface{

    double pi = 3.14;
    int radius;

    public CircleImp( int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle has been drawn ");
    }

    @Override
    public double area() {
        return (double)((pi * radius * radius));
    }
}
