package com.vp.learning.oop.com.vp.learning.oop.method.overriding;

public class MethodOverridigDemo {
    public static void main(String[] args) {
        Parents parents = new Parents();
        parents.m1();

        Child child = new Child();
        child.m1();

        Parents parents1 = new Child();
        parents1.m1();

    }
}
