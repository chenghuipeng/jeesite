package com.feipeng.design.model14;

import java.util.Date;

/**
 * @Author: 飞蓬
 * @Description:
 * @Date:Create：in 2019/4/10 下午1:28
 */
public class ChatRoom {

    public static void showMessage(User user,String message){
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }


}


