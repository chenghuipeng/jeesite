package com.feipeng.design.ChainPattern;

/**
 * @Author: 飞蓬
 * @Description:
 * @Date:Create：in 2019/4/10 上午10:29
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {

        System.out.println("Error Console::Logger: "+message);
    }


}
