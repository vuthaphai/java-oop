package com.vp.learning.oop.abstract_class_vs_interface;


// Class 2
// Helper class extending Class 1
public class Rectangle extends ShapeAbstractClass{


    // Attributes of rectangle
    int length, width;

    // Constructor
    Rectangle(int length, int width, String name)
    {

        // Super keyword refers to current instance itself
        super(name);

        // this keyword refers to current instance itself
        this.length = length;
        this.width = width;
    }


    @Override
    public double area() {
        // Length * Breadth
        return (double)(length * width);
    }

    @Override
    public void draw() {
        System.out.println("Rectangle has been drawn ");
    }
}
