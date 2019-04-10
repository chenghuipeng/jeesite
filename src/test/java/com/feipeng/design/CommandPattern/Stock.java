package com.feipeng.design.CommandPattern;

/**
 * @Author: 飞蓬
 * @Description:
 * @Date:Create：in 2019/4/10 上午11:22
 */
public class Stock {

    private String  name="ABC";
    private Integer quantity=10;



    public void buy(){
        System.out.println("Stock [ Name: "+name+",Quantity: " + quantity +" ] bought");
    }
    public void sell(){
        System.out.println("Stock [ Name: "+name+",Quantity: " + quantity +" ] sold");
    }


    public static void main(String[] args) {

    }



}
