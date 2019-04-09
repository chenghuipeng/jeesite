package com.feipeng.design.model03;

public class Rectangle extends Shape {




    public Rectangle(){
        type = "Rectangle";
    }


    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");


    }
}
