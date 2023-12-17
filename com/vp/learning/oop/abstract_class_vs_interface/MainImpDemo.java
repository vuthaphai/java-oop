package com.vp.learning.oop.abstract_class_vs_interface;

public class MainImpDemo {
    public static void main(String[] args) {
        // Creating the Object of Rectangle class
        // and using shape interface reference.
        ShapeInterface rect = new RectangleImp(2, 3);

        System.out.println("Area of rectangle: "
                + rect.area());

        // Creating the Objects of circle class
        ShapeInterface circle = new CircleImp(2);

        System.out.println("Area of circle: "
                + circle.area());
    }
}
