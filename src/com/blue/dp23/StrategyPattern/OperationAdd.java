package com.blue.dp23.StrategyPattern;

/**
 * Created by haiyuqiqi on 16/4/24.
 */
public class OperationAdd implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
