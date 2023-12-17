package com.vp.learning.oop.abstract_class_vs_interface;

public class RectangleImp implements ShapeInterface {

    int length, width;

    // constructor
    RectangleImp(int length, int width)
    {
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle has been drawn ");
    }

    @Override
    public double area() {
        return (double)(length * width);
    }
}
