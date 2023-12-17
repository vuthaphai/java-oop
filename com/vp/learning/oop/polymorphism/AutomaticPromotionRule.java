package com.vp.learning.oop.polymorphism;




public class AutomaticPromotionRule {
/*Automatic Promotion Rule
char => int => long => float => double
byte => short => int => long => float => double
*/

    public void m1(int i){
        System.out.println("Integer argument: "+ i);
    }

    public void m1(float f){
        System.out.println("Float argument: "+ f);
    }

    public static void main(String[] args) {

        AutomaticPromotionRule automaticPromotionRule = new AutomaticPromotionRule();
        automaticPromotionRule.m1(10);
        automaticPromotionRule.m1(10f);
        automaticPromotionRule.m1(10L);
        automaticPromotionRule.m1('a');
//        automaticPromotionRule.m1(10.5);

    }


}
