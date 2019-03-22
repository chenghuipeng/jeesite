package com.thinkgem.jeesite.test;
import static java.lang.Math.*;

public class Singleton {

    public static void main(String[] args) {


        max(1,11);
    }

    private Singleton(){}
    private static  class SingletonInner{
        private static final Singleton INSTANCE = new Singleton();
    }

    public  static  Singleton getInstance(){
        return  SingletonInner.INSTANCE;
    }


}
