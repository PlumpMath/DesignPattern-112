package com.blue.dp14.ChainofResponsibilityPattern;

/**
 * Created by haiyuqiqi on 16/4/24.
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
