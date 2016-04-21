package com.blue.dp3.SingletonPattern.Register;

/**
 * Created by bluewaitor on 2016/4/19.
 */

/**
 * 登记式/静态内部类
 * 线程安全
 * 懒加载
 */
public class Singleton {

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    private Singleton(){}

    public static final Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }

}
