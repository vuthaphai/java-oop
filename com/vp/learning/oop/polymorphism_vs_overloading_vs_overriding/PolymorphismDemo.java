package com.vp.learning.oop.polymorphism_vs_overloading_vs_overriding;

import java.util.ArrayList;
import java.util.List;

public class PolymorphismDemo {
    //Now Pet will show How Polymorphism work in Java

    public static void main(String[] args) {
        List<Pet> pets = new ArrayList<Pet>();
        pets.add(new Cat());
        pets.add(new Dog());

        //pet variable which is type of Pet behave different based
        //upon whether pet is Cat or Dog
        for(Pet pet: pets){
            pet.makeSound();
        }
    }


}

