package com.blue.dp3.SingletonPattern.HungryThreadSafe;

/**
 * Created by bluewaitor on 2016/4/19.
 */

/**
 * 饿汉式
 * 线程安全
 * 无懒加载
 */

public class Singleton {
    private static Singleton ourInstance = new Singleton();
    private Singleton() {
    }
    public static Singleton getInstance() {
        return ourInstance;
    }


}
