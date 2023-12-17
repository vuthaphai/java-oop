package com.vp.learning.oop.polymorphism;

class A {

}
class B extends A {

}
public class ChildParentsOverloading {

    public void m1(A a){
        System.out.println("Parents");
    }
    public void m1(B b){
        System.out.println("Child");
    }

    public static void main(String[] args) {

        ChildParentsOverloading childParentsOverloading = new ChildParentsOverloading();
        A a = new A();
        childParentsOverloading.m1(a);
        B b = new B();
        childParentsOverloading.m1(b);

        A ab = new B();
        childParentsOverloading.m1(ab);

    }
}
