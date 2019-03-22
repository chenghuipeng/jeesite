package com.thinkgem.jeesite.builder;

import com.google.common.collect.Lists;

import java.util.List;

public class Meal {

    private List<Item> items  = Lists.newArrayList();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){

        float cost =0.0f;
        for (Item item: items){
            cost+= item.price();
        }
        return  cost;
    }

    public void showItems(){
        for (Item item : items) {
            System.out.println("Item: "+item.name());
            System.out.println("Packing: "+item.packing().pack());
            System.out.println("Price: "+item.price());
        }
    }


}














