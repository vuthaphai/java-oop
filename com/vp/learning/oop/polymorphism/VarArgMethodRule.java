package com.vp.learning.oop.polymorphism;

import java.util.Arrays;

public class VarArgMethodRule {

    /*
    * access-modifier return-type method-name(datatype...}{}
    * */

    public void m1(int i){
        System.out.println("Not var arg method");
    }

    public void m1(int...i){
        System.out.println("Var arg method" + Arrays.toString(i));
    }

    public static void main(String[] args) {
        VarArgMethodRule varArgMethodRule = new VarArgMethodRule();
        varArgMethodRule.m1(10);
        varArgMethodRule.m1(10,12,40);
        varArgMethodRule.m1();

    }
}
