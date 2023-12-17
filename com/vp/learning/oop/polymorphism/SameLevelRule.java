package com.vp.learning.oop.polymorphism;

public class SameLevelRule {
    public void m1(String string){
        System.out.println("String version");
    }
    public void m1(StringBuffer stringBuffer){
        System.out.println("String Buffer version");
    }

    public static void main(String[] args) {
        SameLevelRule sameLevelRule = new SameLevelRule();
        sameLevelRule.m1("Name");
        sameLevelRule.m1(new StringBuffer("name"));
//        sameLevelRule.m1(null); //same leve of string

    }

}
