package com.blue.dp14.ChainofResponsibilityPattern;

/**
 * Created by haiyuqiqi on 16/4/24.
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger:" + message);
    }
}
