package com.feipeng.design.FlyweightPattern;

import com.google.common.collect.Maps;

import java.util.HashMap;

public class ShapeFactory {

    private static final HashMap<String, Shape> circleMap = Maps.newHashMap();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);
        if(circle==null){
            circle= new Circle(color);
            circleMap.put(color,circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }


}
