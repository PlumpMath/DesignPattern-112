package com.blue.dp23.StrategyPattern;

/**
 * Created by haiyuqiqi on 16/4/24.
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }
    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
