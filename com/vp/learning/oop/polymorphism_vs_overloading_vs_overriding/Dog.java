package com.vp.learning.oop.polymorphism_vs_overloading_vs_overriding;

public class Dog extends Pet{
    @Override
    public void makeSound() {
        System.out.println("Woof Woof");
    }
}
