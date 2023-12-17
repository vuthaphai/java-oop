package com.vp.learning.oop.polymorphism_vs_overloading_vs_overriding;

public class Cat extends Pet{
    @Override
    public void makeSound() {
        System.out.println("Meow Meow");
    }
}
