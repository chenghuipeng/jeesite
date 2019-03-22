package com.thinkgem.jeesite.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxy  {



    public static void main(String[] args) {
        InvocationHandler invocationHandler  = new TestInvocationHandler();

       // Proxy.newProxyInstance()



    }


}
