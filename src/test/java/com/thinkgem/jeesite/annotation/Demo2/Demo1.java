package com.thinkgem.jeesite.annotation.Demo2;


public class Demo1 {


    public static void main(String[] args) {

        Man m = new Man();
        Class  man = m.getClass();
        boolean is = man.isAnnotationPresent(Description.class);

        if(man.isAnnotationPresent(Description.class)){
            Description d = (Description) man.getAnnotation(Description.class);
            d.author();
            System.out.println(d.desc());
        }




    }



}
