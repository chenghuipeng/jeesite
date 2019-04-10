package com.feipeng.design.ChainPattern;

/**
 * @Author: 飞蓬
 * @Description:
 * @Date:Create：in 2019/4/10 上午10:34
 */
/*****
 *
 *
     顾名思义，责任模式链为请求创建一系列接收者对象。
     此模式基于请求的类型将请求的发送方和接收方分离。
     这种模式是行为模式。
     在这种模式中，通常每个接收器包含对另一个接收器的引用。
     如果一个对象不能处理请求，则它将相同的对象传递给下一个接收者等等。
     创建不同类型的记录器。 为它们分配错误级别，并在每个记录器中设置下一个记录器。
     每个记录器中的下一个记录器表示链的一部分。
 *
 */

public class ChainPatternDemo {

    private static AbstractLogger getChainOfLoggers(){
        AbstractLogger errorLogger  = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger  = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger  = new ConsoleLogger(AbstractLogger.INFO);
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return  errorLogger;
    }


    public static void main(String[] args) {
        AbstractLogger loggerChain  = getChainOfLoggers();
        loggerChain.logMessage(AbstractLogger.INFO,"this ia an information.");
        loggerChain.logMessage(AbstractLogger.DEBUG, "this is an debug level information.");
        loggerChain.logMessage(AbstractLogger.ERROR, "this is an error information.");
    }


}








