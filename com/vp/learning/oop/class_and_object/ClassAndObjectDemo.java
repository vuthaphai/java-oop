package com.vp.learning.oop.class_and_object;

public class ClassAndObjectDemo {
    public static void main(String[] args) {

        System.out.println("======Ferrari========");
        Car ferrari = new Car();
        ferrari.model = "Ferrari F430";
        ferrari.seats = 4;
        ferrari.color = "Red";
        ferrari.display();

        System.out.println("======Tesla=======");

        Car testla = new Car();
        testla.model = "Model S";
        testla.seats = 4;
        testla.color = "Black";
        testla.display();

        System.out.println("========Audi==========");

        Car audi = new Car();

        audi.model = "Audi SQ5";
        audi.seats= 4;
        audi.color = "Blue";
        audi.display();




    }
}
