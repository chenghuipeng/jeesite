package com.feipeng.design.InterpreterPatternDemo;

/**
 * @Author: 飞蓬
 * @Description:
 * @Date:Create：in 2019/4/10 下午5:45
 */

public class OrExpression implements  Expression {

    Expression expression1= null;
    Expression expression2 =null;

    public OrExpression(Expression expr1, Expression expr2) {
        this.expression1 =expr1;
        this.expression2 =expr2;
    }

    @Override
    public boolean interpret(String context) {
        return expression1.interpret(context) || expression2.interpret(context);
    }




}
