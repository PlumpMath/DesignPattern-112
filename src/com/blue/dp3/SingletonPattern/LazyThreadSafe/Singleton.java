package com.blue.dp3.SingletonPattern.LazyThreadSafe;

/**
 * Created by bluewaitor on 2016/4/19.
 */

/**
 * 懒汉式
 * 线程不安全
 * 懒加载
 */
public class Singleton {
    private static Singleton ourInstance;
    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if(ourInstance==null){
            ourInstance = new Singleton();
        }
        return ourInstance;
    }

}
