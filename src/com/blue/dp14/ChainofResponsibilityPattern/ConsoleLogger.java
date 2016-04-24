package com.blue.dp14.ChainofResponsibilityPattern;

/**
 * Created by haiyuqiqi on 16/4/24.
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
