package com.vp.learning.oop.polymorphism;

public class MethodOverloading {

    public void method1(){
        System.out.println("No arguments");
    }
    public void method1(int i){
        System.out.println("Integer arguments: "+ i);
    }
    public void method1(int i, float j){
        System.out.println("1 Integer, 1 float arguments: "+ i);
    }
    public void method1(float i, int j){
        System.out.println("1 Integer, 1 float arguments: "+ i);
    }


    public static void main(String[] args) {

        MethodOverloading methodOverloading = new MethodOverloading();
        methodOverloading.method1();
        methodOverloading.method1(1,2L);
        methodOverloading.method1(3L,1);

    }

}
