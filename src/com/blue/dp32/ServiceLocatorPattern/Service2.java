package com.blue.dp32.ServiceLocatorPattern;

/**
 * Created by haiyuqiqi on 16/4/24.
 */
public class Service2 implements Service {
    @Override
    public String getName() {
        return "Service2";
    }

    @Override
    public void execute() {
        System.out.println("Executing Service2");
    }
}
