package com.vp.learning.oop.polymorphism;

public class ChildParentsOverloadingRule {

    public void m1(String st){
        System.out.println("String version: " + st);
    }

    public void m1(Object obj){
        System.out.println("String version: " + obj);
    }

    public static void main(String[] args) {

        ChildParentsOverloadingRule chileParentsOverloadingRule = new ChildParentsOverloadingRule();
        chileParentsOverloadingRule.m1(new Object());
        chileParentsOverloadingRule.m1("String");
        chileParentsOverloadingRule.m1(null);

    }
}
