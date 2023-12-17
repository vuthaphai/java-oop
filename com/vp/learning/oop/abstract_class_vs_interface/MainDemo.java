package com.vp.learning.oop.abstract_class_vs_interface;


public class MainDemo {

    /*Abstract Class and Interface in Java
    * https://www.geeksforgeeks.org/difference-between-abstract-class-and-interface-in-java/
    * */

    public static void main(String[] args) {
        // Creating the Object of Rectangle class
        // and using shape class reference.
        ShapeAbstractClass shape = new Rectangle(2, 3, "Rectangle");

        System.out.println("Area of rectangle: "
                + shape.area());

        shape.moveTo(1, 2);

        System.out.println(" ");

        // Creating the Objects of circle class
        ShapeAbstractClass circle = new Circle(2, "Circle");

        System.out.println("Area of circle: "
                + circle.area());

        circle.moveTo(2, 4);
    }
}
