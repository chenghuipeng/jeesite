package com.thinkgem.jeesite.builder;

public class BuiderPatternDemo {


    public static void main(String[] args) {

        MealBuilder mealBuilder = new MealBuilder();
        Meal  vegMeal = mealBuilder.prepareVeg();
        System.out.println("veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost:" + vegMeal.getCost());

        Meal  nonVegMeal = mealBuilder.prepareNonVeg();
        System.out.println("\n\n\n\nNon-veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost:"+ nonVegMeal.getCost());

        String a ;
        StringBuilder sb;
        StringBuffer sb1;




    }


}
