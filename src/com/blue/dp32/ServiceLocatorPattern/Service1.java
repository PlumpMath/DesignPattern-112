package com.blue.dp32.ServiceLocatorPattern;

/**
 * Created by haiyuqiqi on 16/4/24.
 */
public class Service1 implements Service {
    @Override
    public String getName() {
        return "Service1";
    }

    @Override
    public void execute() {
        System.out.println("Executing Service1");
    }
}
