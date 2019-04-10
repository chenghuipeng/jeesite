package com.feipeng.design.model14;

/**
 * @Author: 飞蓬
 * @Description:
 * @Date:Create：in 2019/4/10 下午1:29
 */
public class User {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public  void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }


}
