package com.blue.dp3.SingletonPattern.DCL;

/**
 * Created by bluewaitor on 2016/4/19.
 */

/**
 * 双检锁double-checked locking
 * 线程安全
 * 懒加载
 */

public class Singleton {
    private static Singleton ourInstance = new Singleton();
    private Singleton() {
    }

    public static Singleton getInstance() {
        if(ourInstance == null){
            synchronized (Singleton.class){
                if(ourInstance == null){
                    ourInstance = new Singleton();
                }
            }
        }
        return ourInstance;
    }

}
