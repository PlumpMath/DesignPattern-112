package com.blue.dp3.SingletonPattern;

/**
 * Created by bluewaitor on 2016/4/19.
 */
public class SingleObject {
    private static SingleObject instance = new SingleObject();
    private SingleObject(){}
    public static SingleObject getInstance(){
        return instance;
    }
    public void showMessage(){
        System.out.println("Hello World!");
    }
}
