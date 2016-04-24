package com.blue.dp30.FrontControllerPattern;

/**
 * Created by haiyuqiqi on 16/4/24.
 */
public class FrontControllerPatternDemo {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }
}
