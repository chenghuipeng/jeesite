package com.feipeng.design.model18;

/**
 * @Author: 飞蓬
 * @Description:
 * @Date:Create：in 2019/4/10 下午7:53
 */
public class NullCustomer extends AbstractCustomer{




    @Override
    public String getName() {

        return "Not Available in Customer Database";

    }

    @Override
    public boolean isNil() {
        return true;
    }




}
