package com.vp.learning.oop.class_and_object;

public class InheritanceMain {
    public static void main(String[] args) {
        Car car = new Car();
        car.display();
        System.out.println(car.seats);
//        car.displayFerrari();

        Ferrari f = new Ferrari();
        f.displayFerrari();
        f.display();
        System.out.println(f.seats);

        Car cf = new Ferrari();
        System.out.println(cf.seats);
        cf.display();
//        carFer.displayFerrari();

//        Ferrari fc = new Car();

    }
}
