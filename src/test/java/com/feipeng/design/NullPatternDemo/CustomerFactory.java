package com.feipeng.design.NullPatternDemo;

/**
 * @Author: 飞蓬
 * @Description:
 * @Date:Create：in 2019/4/10 下午7:49
 */
public class CustomerFactory {


    public static final String[] names = {"Rob", "Joe", "Julie"};


    public static AbstractCustomer getCustomer(String name){

        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }




}
